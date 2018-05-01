<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>选择考试类型</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/selectType.css">
	<script type="text/javascript">
  window.onload=function(){
	  document.getElementById("nav-menu").getElementsByTagName("li")[4].setAttribute("class","navLi actived");
  }
</script>
  </head>
  
  <body >
    <jsp:include page="./top.jsp"></jsp:include>
    
    <div class="select-container">
    	<ul>
    		<li>
    			<div style="background-image: url('images/mnks.png');width: 90px;height: 90px;float: left;margin-right: 35px;"></div>
    			<a target="blank" href="ExamController/exam_index.action">
	    			<div class="select-text">
	    				<h3>模拟考试</h3>
	    				<p>总结考试技巧，锻炼考试心理，正确评估自己，找到自己所学盲点，及时补救。</p>
	    			</div>
    			</a>
    		</li>
    		
    		<li>
    			<div style="background-image: url('images/grade.png');width: 90px;height: 90px;float: left;margin-right: 35px;"></div>
				<a target="blank" href="${pageContext.request.contextPath }/ExamController/showGradeList.action">
	    			<div class="select-text">
	    				<h3>成绩单</h3>
	    				<p>查看自己的模拟考试成绩，直观图表动态显示，及时分析原因，成绩提高可以看得到。</p>
	    			</div>
    			</a>
    		</li>
    		
    		<li style="padding-left: 10px;">
    			<div style="background-image: url('images/ask.png');width: 64px;height: 64px;float: left;margin-right: 50px;margin-top: 10px;"></div>
				<a target="blank" href="${pageContext.request.contextPath }/TeacherController/getAllTeacher.action">
	    			<div class="select-text">
	    				<h3>点我提问</h3>
	    				<p>优质名师加盟点通网，你的问题，在这里都能得到解决。</p>
	    			</div>
	    		</a>
    		</li>
    		
    		<li>
    			<div style="background-image: url('images/mryl.png');width: 90px;height: 90px;float: left;margin-right: 35px;"></div>
				<a target="blank" href="everydayExercise.action">
	    			<div class="select-text">
	    				<h3>随机练习</h3>
	    				<p>学而不练则罔，练而不学则怠，每日随机一小练，成绩提高一大步。</p>
	    			</div>
	    		</a>
    		</li>
    		<li class="yicuoti">
    			<div style="background-image: url('images/yct.png');width: 90px;height: 90px;float: left;margin-right: 35px;"></div>
				<a target="blank" href="cuoti.action">
	    			<div class="select-text">
	    				<h3>易错题</h3>
	    				<p>错题才是每次考试的价值所在，会学习的人都善于总结错题，不在一道错题上跌倒多次。</p>
	    			</div>
    			</a>
    		</li>
    		
    		<li class="zuoye">
    			<div style="background-image: url('images/icon-paper.png');width: 90px;height: 90px;float: left;margin-right: 35px;"></div>
				<a target="blank" href="StudentController/getHomeWorks.action">
	    			<div class="select-text">
	    				<h3>班级作业</h3>
	    				<p>作业是最好的巩固，认真完成老师布置的作业，成功近在眼前。</p>
	    			</div>
	    		</a>
    			</a>
    		</li>
    		
    		<li class="yingjifen">
    			<div style="background-image: url('images/tzyjf.png');width: 90px;height: 90px;float: left;margin-right: 35px;"></div>
				<a target="blank" href="CompetitionController/enterCompetionPage.action?pageNumber=1&pageSize=3">
	    			<div class="select-text">
	    				<h3>挑战竞赛题</h3>
	    				<p>想要更近一步，快来挑战赢积分吧，精选竞赛试题，提高思维，还可以赢取积分。</p>
	    			</div>
    			</a>
    		</li>
    		<li>
	    			<div style="background-image: url('images/zjlx.png');width: 90px;height: 90px;float: left;margin-right: 35px;"></div>
	    			<a target="blank" href="enjoystory.action">
		    			<div class="select-text">
		    				<h3>趣味故事</h3>
		    				<p>创设故事情境，通过有趣的故事吸引注意力，专注力提升。激发数学学习动机，引导学生发现生活中的高数。放松思维，开心一刻，让学生精神愉悦。</p>
		    			</div>
	    			</a>
	    	</li>
	    	
    		<div style="clear:both"></div>
    	</ul>
    </div>
    
    <jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
