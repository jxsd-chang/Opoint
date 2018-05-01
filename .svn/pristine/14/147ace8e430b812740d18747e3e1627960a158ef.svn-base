<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>功能管理</title>
    
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
    			<div style="background-image: url('images/judge-papers.png');width: 90px;height: 90px;float: left;margin-right: 35px;"></div>
    			<a target="blank" href="TeacherController/tojudgePaper.action">
	    			<div class="select-text">
	    				<h3>批改试卷</h3>
	    				<p>总结考试技巧，锻炼考试心理，正确评估自己，找到自己所学盲点，及时补救。</p>
	    			</div>
    			</a>
    		</li>
    		<li>
    			<div style="background-image: url('images/solve-problems.png');width: 90px;height: 90px;float: left;margin-right: 35px;"></div>
				<a target="blank" href="TeacherController/solveProblem.action">
	    			<div class="select-text">
	    				<h3>解决提问</h3>
	    				<p>历年考研真题，了解命题趋势，练习手感状态，熟悉出题人套路，对自己所学进行摸底。</p>
	    			</div>
	    		</a>
    		</li>
    		<li>
    			<div style="background-image: url('images/class-manager.png');width: 90px;height: 90px;float: left;margin-right: 35px;"></div>
				<a target="blank" href="ClagradeController/getAllCla.action">
	    			<div class="select-text">
	    				<h3>我的班级</h3>
	    				<p>学而不练则罔，练而不学则怠，每日随机一小练，成绩提高一大步。</p>
	    			</div>
	    		</a>
    		</li>
    		<li class="yicuoti">
    			<div style="background-image: url('images/upload-file.png');width: 90px;height: 90px;float: left;margin-right: 35px;"></div>
				<a target="blank" href="TeacherController/sendResource.action">
	    			<div class="select-text">
	    				<h3>上传试卷</h3>
	    				<p>错题才是每次考试的价值所在，会学习的人都善于总结错题，不在一道错题上跌倒多次。</p>
	    			</div>
    			</a>
    		</li>
    		
    	</ul>
    </div>
    
    <jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
