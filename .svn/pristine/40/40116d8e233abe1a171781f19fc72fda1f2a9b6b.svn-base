package cn.opt.serviceimpl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.VideoMapper;
import cn.opt.po.CustomVideo;
import cn.opt.po.Student;
import cn.opt.po.Video;
import cn.opt.po.VideoExample;
import cn.opt.po.VideoExample.Criteria;
import cn.opt.service.VideoService;
@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoMapper videoMapper;
	
	@Override
	public Video getVideoByVid(Integer vioid) {
		return videoMapper.selectByPrimaryKey(vioid);
	}

	@Override
	public LinkedHashSet<String> getBigItemsByCid(Integer cid) {
		LinkedHashSet<String> bigItems = new LinkedHashSet<String>();
		VideoExample example = new VideoExample();
		Criteria criteria = example.createCriteria();
		criteria.andCouIdEqualTo(cid);
		List<Video> list = videoMapper.selectByExample(example);
		for(Video video:list){
		    bigItems.add(video.getVioBigitems());
		}
		return bigItems;
	}
	
	@Override
	public List<CustomVideo> getItemsByBigTag(String btag) {
		VideoExample example = new VideoExample();
		Criteria criteria = example.createCriteria();
		criteria.andVioBigitemsEqualTo(btag);
		List<Video> list = videoMapper.selectByExample(example);
		List<CustomVideo> customVideos = new ArrayList<CustomVideo>();
		for(Video video:list){
			CustomVideo customVideo = new CustomVideo();
			customVideo.setVideo(video);
			//判断逻辑
			//默认都没收藏
			customVideo.setFlag(0);
			customVideos.add(customVideo);
		}
		return customVideos;
	}

	@Override
	public List<Video> getAllVideo() {
		VideoExample example = new VideoExample();
		return videoMapper.selectByExample(example);
	}
	
}
