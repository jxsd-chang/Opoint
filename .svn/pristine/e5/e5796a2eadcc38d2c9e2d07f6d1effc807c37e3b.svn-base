<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!-- <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> -->
<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>视频学习</title>
    
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/course_video.js"></script>
	<script type="text/javascript">
  $(function(){
	  $("#nav-menu").children("li").eq(1).addClass("actived");
  });
</script>
	<style type="text/css">
		#xuhao{
			color: FF6F01;
			font-size: x-large;
		}
		.btnn{
		   visibility:hidden;
		   float:right;
		   width:120px;
		   height:30px;
		   position:relative;
		   margin-top:-37px;
		  }
		  .bgcolor ul li{
			 overflow:hidden;
			 height: 45px;
		 }
		 .btnn a{
		   background-color:orange;
		   color:white;
		   display:block;
		   padding:4px 5px;
		   border-radius: 4px;
		   float:left;
		   margin-top:2px;
		 }
		  #img1{float:right;}
		  .lihover{ background-color:rgba(253,238,202,1) }
	</style>
  </head>
  <body>
  	<jsp:include page="./top.jsp"></jsp:include>
  	<input type="hidden" id="stuid" value="${student.stuId }"/>
  	 <input type="hidden" value="${student}" id="stu">
     <input type="hidden" value="${teacher}" id="tea">
    <div class="container" style="margin-bottom:30px;width:1300px;">
    	<hr>
    	<div class="row">
	    	<div style="position:fixed;">
	    	  <h1 style="color:orange;margin-left:280px;margin-bottom:35px;font-weight:bold;">点&nbsp;通&nbsp;视&nbsp;频</h1>
	    	</div>
			<div class="col-sm-8">
				<video  poster="${pageContext.request.contextPath }/images/sp_index.png" id="video" controls="controls" width="100%" height="500px;">
				 	<source id="media" src="/resource/video/${video_Name }" type="video/mp4"></source>
			 	</video>
			</div>
			
<span id="span"></span>
<!-- 遍历该课程所有目录 -->
			<div class="col-sm-4" style="height: 500px;overflow:scroll;overflow-x: hidden;">
				<table style="width: 100%" class="table-hover table-striped">
					<tr>
					<td>
						<div class="bgcolor" style="width: 100%;">
					<c:forEach items="${videoItemsListVoList}" var="videoItem" varStatus="t">
						<ul style="list-style: none;">
								<span class="h3" style="margin:10px auto;display:block;text-align:center;color:#000;">${videoItem.bigTag}</span>
							<c:forEach items="${videoItem.vioList}" var="customvideo" >
								<li style="cursor:pointer;">
								      <img src="${pageContext.request.contextPath }/images/radio.png" style="float:left;margin-left:10px;margin-top:12px;"/>
								   <a href="${pageContext.request.contextPath }/VideoController/getVideoByvioId.action?vid=${customvideo.video.vioId}"  class="mulu_a" style="text-decoration: none;font-size: 16px;margin-top: 10px;margin-left: 15px;color: black;line-height:2.5;">
								   		${customvideo.video.vioItem}
								   </a>
								   <input type="hidden" value="${customvideo.video.vioId }"/>
								</li>
								<div class="btnn">
								   <!-- 该input判断用户对此视频是否已经点过收藏 -->
								   <input type="hidden" class="option" value="${customvideo.flag}">
								   <a href="${pageContext.request.contextPath }/VideoController/getVideoByvioId.action?vid=${customvideo.video.vioId}">开始学习</a>
								   <img class="no" src="${pageContext.request.contextPath }/images/collection.png" style="float:right;margin-right:10px;width:30px;height:30px;" />
								   <img class="yes" src="${pageContext.request.contextPath }/images/collection_new.png" style="float:right;margin-right:10px;width:30px;height:30px;display: none;" />
								</div>
							</c:forEach>
						</ul>				
				 	</c:forEach>
						</div>
					</td>
					</tr>
				</table>
		   </div>
		</div>	
	</div>
	<!-- 结尾 -->
	<jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
