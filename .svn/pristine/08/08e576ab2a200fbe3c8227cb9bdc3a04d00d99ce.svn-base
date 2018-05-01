<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>考试结果界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
	<script type="text/javascript">
  window.onload=function(){
	  document.getElementById("nav-menu").getElementsByTagName("li")[4].setAttribute("class","navLi actived");
  }
</script>
	<style type="text/css">
		/* div{
			border: 1px solid black;
		} */
	</style>

  </head>
  
  <body>
  <jsp:include page="./top.jsp"></jsp:include><!-- 引入头部 -->
  
   	<div class="container" style="min-height: 500px;">
   		<div class="row">
   			<div class="col-sm-12 text-center h2">
   				${name }试卷参考答案
   			</div>

   			<div class="col-sm-10 col-sm-offset-1 text-left h3">
				<c:forEach items="${pList }" var="exp">  			
   					<img src="/resource/image/exam_image/${mulu }/${exp}">
   				</c:forEach> 
   			</div>
   		</div>
   	</div>
   	
   	<jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
