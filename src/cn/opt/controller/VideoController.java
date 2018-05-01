package cn.opt.controller;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.opt.po.CustomVideo;
import cn.opt.po.Student;
import cn.opt.po.Video;
import cn.opt.service.CollectService;
import cn.opt.service.VideoService;
import cn.opt.vo.VideoItemsListVo;

@Controller
@RequestMapping("/VideoController")
public class VideoController {
	
	@Autowired
	private VideoService videoService;
	@Autowired
	private CollectService collectService;
	/**
	 * 视频列表
	 */
	@RequestMapping("/getVideoItems.action")
	public String getKpItem(Integer cid,Model model,HttpSession session){
		//设置登录
		if(session.getAttribute("student") == null && session.getAttribute("teacher") == null){
			//前去登录
			return "login";
		}else{
			List<VideoItemsListVo> videoItemsListVoList =new ArrayList<VideoItemsListVo>();
			LinkedHashSet<String> bigItems = videoService.getBigItemsByCid(cid);
			for(String bg:bigItems){
				VideoItemsListVo videoItemsListVo = new VideoItemsListVo();
				videoItemsListVo.setBigTag(bg);
				List<CustomVideo> list = videoService.getItemsByBigTag(bg);
				
				Student stu = (Student) session.getAttribute("student");
					if(stu != null){
						List<Video> list1 = collectService.getVideoList(stu.getStuId(), 1);
						//收藏了的视频vid集合
						List<Integer> scVidList = new ArrayList<Integer>();
						for(Video videoee:list1){
							scVidList.add(videoee.getVioId());
						}
						for(CustomVideo custVideo:list){
							for(Integer scid:scVidList){
								if(scid == custVideo.getVideo().getVioId()){
									custVideo.setFlag(1);
								}else{
									custVideo.setFlag(0);
								}
							}
						}
					}
				videoItemsListVo.setVioList(list);
				videoItemsListVoList.add(videoItemsListVo);
				session.setAttribute("videoItemsListVoList", videoItemsListVoList);
			}
			return "course_video";
		}
	}
	
	@RequestMapping(value="/getVideoByvioId.action")
	public String  getVideoByvioId(Integer vid,Model model){
		String video_Name = videoService.getVideoByVid(vid).getVioItem()+".mp4";
		model.addAttribute("video_Name", video_Name);
		char[] array = video_Name.toCharArray();
		StringBuffer sb = new StringBuffer();
		sb.append(array[0]).append(array[1]).append(array[2]).append(".mp4");
		model.addAttribute("video_Name", sb);
		return "course_video";
	}
	/**
	 * 推荐视频--个人中心
	 */
	@RequestMapping("/tjVideo.action")
	public String  tjVideoByvioId(Integer vid,Model model){
		String video_Name = videoService.getVideoByVid(vid).getVioItem();
		String vioitem = videoService.getVideoByVid(vid).getVioItem();
		char[] array = video_Name.toCharArray();
		StringBuffer sb = new StringBuffer();
		sb.append(array[0]).append(array[1]).append(array[2]).append(".mp4");
		model.addAttribute("video_Name", sb);
		model.addAttribute("item", vioitem);
		return "tjvideo";
	}
}
