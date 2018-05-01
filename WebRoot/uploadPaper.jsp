<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath }" var="base"></c:set>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>上传试卷</title>
	
	<!-- 引用控制层插件样式 -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/control/css/zyUpload.css" type="text/css">
	
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
	<!-- 引用核心层插件 -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/core/zyFile.js"></script>
	<!-- 引用控制层插件 -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/control/js/zyUpload.js"></script>
	<!-- 引用初始化JS -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/demo.js"></script>

  </head>
  
  <body>
    <jsp:include page="./top.jsp"></jsp:include>
  	<div>
	    <h1 style="text-align:center;">上传试卷</h1>
	    <div id="demo" class="demo"></div>   
  	</div>
    
   <jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
