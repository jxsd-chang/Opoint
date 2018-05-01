package cn.opt.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import cn.opt.po.Brush;
import cn.opt.po.Etimu;
import cn.opt.po.Exam;
import cn.opt.po.Kninfo;
import cn.opt.po.Knowpoint;
import cn.opt.po.Paper;
import cn.opt.po.Rank;
import cn.opt.po.Student;
import cn.opt.po.Video;
import cn.opt.service.BrushService;
import cn.opt.service.EtimuService;
import cn.opt.service.ExamService;
import cn.opt.service.KninfoService;
import cn.opt.service.KnowPointService;
import cn.opt.service.PaperService;
import cn.opt.service.RankService;
import cn.opt.service.TeacherService;
import cn.opt.service.VideoService;
import cn.opt.utils.ListUtils;
import cn.opt.vo.AnyVo;
import cn.opt.vo.ExamAnalyseVo;
import cn.opt.vo.OptionItem;

@Controller
@RequestMapping("/EtimuController")
public class EtimuController {

	@Autowired
	private EtimuService etimuService;
	@Autowired
	private PaperService paperService;
	@Autowired
	private ExamService examService;
	@Autowired
	private KninfoService kninfoService;
	@Autowired
	private VideoService videoService;
	@Autowired
	private BrushService brushService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private KnowPointService knowPointService;
	@Autowired
	private RankService rankService;
	
	@RequestMapping("/chooseTea.action")
	public String choose(Integer pid,Integer cou_id,Model model){
		model.addAttribute("pid", pid);
		model.addAttribute("cou_id", cou_id);
		model.addAttribute("teaList", teacherService.getAllTeacher());
		return "chooseTea";
	}
	
	@RequestMapping("/toExamPage.action")
	public String toExamPage(Integer pid,Integer cou_id,Integer tid,Model model,HttpSession session){
		/**
		 * 给tid改这张试卷
		 */
		Exam ex = new Exam();
		ex.setTeaId(tid);
		Integer couId = paperService.getPaperById(pid).getCouId();
		Student stu = (Student)session.getAttribute("student");
		if(stu != null){
			ex.setStuId(stu.getStuId());
		}else{
			return "login";
		}
		ex.setCouId(couId);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
		String format = dateFormat.format(new Date());
		ex.setExTime(format);
		ex.setPaId(pid);
		ex.setExState(0);
		String flag_eid = UUID.randomUUID().toString().substring(0,4);
		ex.setExId(flag_eid);
		examService.addRecord(ex);
		List<Etimu> list = etimuService.getAllTiMu(pid);
		List<Etimu> optList = etimuService.getOptAnswer(pid, list.get(0).getEtimuType());
		String mulu = "paper"+pid;
		model.addAttribute("size", optList.size());
		model.addAttribute("paper", paperService.getPaperById(pid));
		model.addAttribute("etype", list.get(0).getEtimuType());
		model.addAttribute("mulu", mulu);
		model.addAttribute("list", list);
		model.addAttribute("exam", ex);
		return "exam_page";
	}
	
	/**
	 * 计算处理试题结果给出分数
	 * @throws Exception 
	 */
	@RequestMapping("/cacluResult.action")
	public String getExamResult(String exid,Integer paId,Model model,HttpServletRequest request) throws Exception{
		ExamAnalyseVo analyseVo = new ExamAnalyseVo();
		Paper paper = paperService.getPaperById(paId);
		//试卷选择题
		List<Etimu> listOpt = etimuService.getOptAnswer(paId,1);
		//试卷选择题正确答案
		List<String> rightOpt = new ArrayList<String>();
		for(Etimu eti:listOpt){
			rightOpt.add(eti.getEtimuAns());
		}
		//试卷选择题填写答案
		List<String> writeOpt = new LinkedList<String>();
		List<OptionItem> optionItemlist = new LinkedList<OptionItem>();
		Map map1 = request.getParameterMap();
		TreeMap treemap = new TreeMap(map1);  
		Set<Entry<String,String>> entrySet =treemap.entrySet();
		for(Entry<String,String> en:entrySet){
			if(en.getKey().startsWith("etimuAns")){
				String key = en.getKey();
				String answer = ((String[]) map1.get(key))[0];
				writeOpt.add(answer);
			}
		}
		for(int i=0;i<rightOpt.size();i++){
			OptionItem optionItem= new OptionItem();
			optionItem.setRightOpt(rightOpt.get(i));
			optionItem.setWriteOpt(writeOpt.get(i));
			
			Kninfo kninfo = new Kninfo();
			Integer kninfoId = listOpt.get(i).getKninfoId();
			kninfo.setKninfoId(kninfoId);
			kninfo.setKninfoTitle(kninfoService.getKninfoByKninfoId(kninfoId).getKninfoTitle());
			optionItem.setKninfo(kninfo);
			
			Video video = new Video();
			Integer vioId = listOpt.get(i).getVioId();
			video.setVioId(vioId);
			video.setVioItem(videoService.getVideoByVid(vioId).getVioItem());
			optionItem.setVideo(video);
			
			Brush brush = new Brush();
			Integer brushId = listOpt.get(i).getBrushId();
			brush.setBrushId(brushId);
			brush.setBrushTitle(brushService.getBrushBybrushId(brushId).getBrushTitle());
			optionItem.setBrush(brush);
			optionItemlist.add(optionItem);
		}
		analyseVo.setPaper(paper);
		analyseVo.setListOpt(listOpt);
		analyseVo.setList(optionItemlist);
		int item = 0;
		//计算选择题分数
		for(int i=0;i<rightOpt.size();i++){
			if(rightOpt.get(i).equals(writeOpt.get(i))){
				item++;
			}
		}
		int optFen = item*(listOpt.get(0).getEtimuFen());
		
		Integer paCount = paperService.getPaperById(paId).getPaCount();
		if(paCount==null){
			paperService.updatePa(paId,1);
		}else{
			paCount = paCount+1;
			paperService.updatePa(paId,paCount);
		}
		String commen="";
		int flag = listOpt.get(0).getEtimuFen();
		if(optFen == rightOpt.size()*flag){
			commen = "恭喜你，满分";
		}else if(optFen>3*flag && optFen<rightOpt.size()*flag){
			commen = "一般般，中等成绩";
		}else {
			commen = "成绩不合格，再接再离";
		}
		/*生成一条考试记录开始-------------------------------------*/
		Exam ex = examService.getExamByExid(exid);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<writeOpt.size();i++){
			if(i == writeOpt.size()-1){
				sb.append(writeOpt.get(i));
			}else{
				sb.append(writeOpt.get(i)).append("-");
			}
		}
		ex.setExOptAns(sb.toString());
		
		/*生成一条考试记录结束-------------------------------------*/
		 //试卷提交开始=====================================================
		StringBuffer buffer = new StringBuffer();
		String fName = request.getParameter("file_name");
		/**
		 * 拿到每一个的题目附件name
		 */
		System.out.println(fName+"多文件上传的这个");
		if(fName.length()>0){
			if (request instanceof MultipartHttpServletRequest) {
				MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
				// 获取上传的文件
				Map<String, MultipartFile> fileMap = multipartHttpServletRequest.getFileMap();
				for(Map.Entry<String, MultipartFile> entry : fileMap.entrySet()){
					// 对文件进处理
					String originalFilename = entry.getValue().getOriginalFilename();
					String random = UUID.randomUUID().toString().substring(0,2);
					String fileName = random+originalFilename.substring(originalFilename.lastIndexOf("."));
					File file = new File("F:\\OpointResource\\pic\\exam_pic\\"+paId+"\\");
					if( !file.isDirectory()){
						file.mkdir();
					}
					String filePath = file.getAbsolutePath();
					File file1 = new File(filePath+"\\"+fileName);
					entry.getValue().transferTo(file1);
					buffer.append(fileName).append("-");
				}
				//插入到数据库
				ex.setExDatiAns(buffer.toString());
			}
		}
	    examService.updateExam(exid, ex);
	   //试卷提交结束=====================================================
	   //错题分析排行榜
	    for(OptionItem items:optionItemlist){
	    	if(!items.getRightOpt().equals(items.getWriteOpt())){
	    		Rank rank = new Rank();
	    		rank.setRankKninfoid(items.getKninfo().getKninfoId());
	    		rank.setRankVideoid(items.getVideo().getVioId());
	    		rank.setRankBrushid(items.getBrush().getBrushId());
	    		//插入一条记录
	    		rankService.addRank(rank);
	    	}
	    }
	   //
	    model.addAttribute("exid", ex.getExId());
		model.addAttribute("analyseVo", analyseVo);
		model.addAttribute("optFen", optFen);
		model.addAttribute("count",paperService.getPaperById(paId).getPaCount());
		model.addAttribute("commen",commen);
		return "exam_fenshu";
	}
	/**
	 * 正确答案解析页面
	 */
	@RequestMapping("/showRiparse.action")
	public String showRi(Integer pid,Model model){
		List<Etimu> list = etimuService.getAllTiMu(pid);
		List<String> parseList = new ArrayList<String>();
		for(Etimu eti:list){
			if(eti.getEtimuExp() != null){
				parseList.add(eti.getEtimuExp());
			}
		}
		model.addAttribute("name", paperService.getPaperById(pid).getPaName());
		model.addAttribute("pList", parseList);
		String mulu = "paper"+pid+"_parse";
		model.addAttribute("mulu", mulu);
		return "exam_parse";
	}
	/**
	 * 得到全部易错题
	 */
	@RequestMapping("/geteasyWrong.action")
	public String easyWrong(Model model){
		Map<Map<AnyVo,List<AnyVo>>,Brush> map = new HashMap<Map<AnyVo,List<AnyVo>>, Brush>();
		List<Brush> brushWrongList = new ArrayList<Brush>();
		List<Integer> list = rankService.getEasyWrongBrushs();
		//对Integer去重
		List<Integer> listPlus = new ArrayList<Integer>();
		for(Integer ii:list){
			if(!listPlus.contains(ii)){
				listPlus.add(ii);
			}
		}
		if(listPlus!=null){
			for(Integer bid:listPlus){
				brushWrongList.add(brushService.getBrushBybrushId(bid));
			}
		}
		for(Brush bru:brushWrongList){
			Map<AnyVo,List<AnyVo>> mapinner = new HashMap<AnyVo, List<AnyVo>>();
			//主要知识点
			Knowpoint knowpoint = knowPointService.getKnowPointBykpid(bru.getKpId());
			AnyVo anyVo = new AnyVo();
			anyVo.setId(knowpoint.getKpId());
			anyVo.setTitle(knowpoint.getKpContent());
			//扩展相似知识点
			List<AnyVo> strList = new ArrayList<AnyVo>();
			List<Kninfo> list2 = kninfoService.getKninfoByKpId(bru.getKpId());
			for(Kninfo kn:list2){
				AnyVo anyVo1 = new AnyVo();
				anyVo1.setId(kn.getKninfoId());
				anyVo1.setTitle(kn.getKninfoTitle());
				strList.add(anyVo1);
			}
			mapinner.put(anyVo, ListUtils.getRepeat(strList));
			map.put(mapinner, bru);
		}
		model.addAttribute("map", map);
		return "cuoti";
	}
}