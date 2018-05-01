<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>推荐视频</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/course_video.js"></script>

  </head>
  
  <body>
<!-- 引入头部 -->
  	<jsp:include page="./top.jsp"></jsp:include>
  	<div class="container-fluid" style="background: #f0f0f0;">
  	<div class="container">
<!-- 推荐标语 -->
  	 		<div class="col-sm-12" style="text-align: center;font-size: 22px;letter-spacing: 5px;margin:20px;font-weight:bold;">
  	 			${item }
  	 		</div>
<!-- 视频 -->
    	<div class="row">
    		<div class="col-md-12" style="margin-top: 10px;">
				<video  poster="${pageContext.request.contextPath }/image/sp_index.png" id="video" controls="controls" width="100%" height="500px;">
				 	<source id="media" src="/resource/video/${video_Name }" type="video/mp4"></source>
			 	</video>
			</div>
		</div>	
	</div>
	</div>
		<!-- 给个返回按钮 -->
  </body>
</html>
