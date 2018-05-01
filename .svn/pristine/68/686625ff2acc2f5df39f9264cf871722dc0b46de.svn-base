<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<meta name="viewport" content="width=device-width,initial-scale=1.0" />
    <base href="<%=basePath%>">
    
    <title>全部课程</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<script type="text/javascript">
  window.onload=function(){
	  document.getElementById("nav-menu").getElementsByTagName("li")[1].setAttribute("class","navLi actived");
  }
</script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
	
	<style type="text/css">
		.jugao{
			margin-top: 20px;
		}
		.item{
			color: black;
			font-size:20;
		}
	   .container{
	      
	      margin-bottom:25px;
	   }
	   .row{
	      margin-top:5px;
	      margin-bottom:5px;
	   }
	   #gaoshu:hover{
	   transform:scale(1.1);
	   transition:.6s ease;}
	   .ke:hover{
	   color:red;}
	</style>

  </head>
  
  <body>
  <jsp:include page="./top.jsp"></jsp:include>
  
   	<div class="container" style="width:1000px;">

<c:forEach items="${couList }" var="cou_low">
   		<div class="row" >
   			<hr><!-- 高数图片 -->
   			<a href="${pageContext.request.contextPath }/VideoController/getVideoItems.action?cid=${cou_low.couId}" style="text-decoration: none;">
   			<div class="col-md-3" id="gaoshu" style="margin-left:50px;cursor:pointer;">
   					<img src="${pageContext.request.contextPath }/images/${cou_low.couImgname}" 
	   				width="210px" height="255px">
   			</div>
   			</a>
   			<div class="col-md-7 col-sm-offset-1 h4"><!-- 右边相关文字 -->
   				<span style="color: white;background-color: pink;">${cou_low.couLable1 }</span>&nbsp;&nbsp;
   				<span style="color: white;background-color: #82e0f5;">${cou_low.couLable2 }</span>&nbsp;&nbsp;
   				<span style="color: white;background: orange;">${cou_low.couLable3 }</span>&nbsp;&nbsp;
   				<span style="color: white;background-color: #e3c2fb;">${cou_low.couLable4 }</span>&nbsp;&nbsp;
   				<br><br>
   				<span class="h4"><b>课程信息：</b></span>
   				<a href="${pageContext.request.contextPath }/VideoController/getVideoItems.action?cid=${cou_low.couId}" style="text-decoration: none;">
   				<span class="h4 ke">${ cou_low.couName}</span>
   				</a><br><br>
   				
   				<span class="h4"><b>适合人群：</b></span>
   				<span class="h4">${cou_low.couPerson }</span><br><br>
   				
   				<div class="">
   				  <span class="h4"><b>课程简介：</b></span>
   				  <p style="text-indent: 2em;line-height: 25px;">${cou_low.couSummary }<a href="${pageContext.request.contextPath }/VideoController/getVideoItems.action?cid=${cou_low.couId}" style="text-decoration: none;">
   				<span style="color: #F90">马上去学>></span>
   				</a></p>
   			    </div>
   			</div>
   			
   		</div>
 </c:forEach>  		
   	</div>
   	
   	<jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
