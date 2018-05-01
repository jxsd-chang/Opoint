<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>温馨提示</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">


  </head>
  
  <body>
<!-- 头 -->
  	<jsp:include page="./top.jsp"></jsp:include>
  	<div class="container">
	<h1 style="text-align: center;"><img style="display: inline;width: 210px;height: 35px;" src="${pageContext.request.contextPath }/images/bus2.png"><span style="color: #ff8181">${error }</span><img style="display: inline;width: 210px;height: 35px;" src="${pageContext.request.contextPath }/images/bus1.png"></h1>
  		<div class="row col-sm-12" style="margin-top: 20px;margin-bottom: 20px;">
  			<div class="col-sm-10 col-sm-offset-1">
  				<img class="img-responsive" style="border-radius: 12px 12px 12px" alt="" src="${pageContext.request.contextPath }/images/error.png">
  			</div>
  		</div>
  		
  		<div class="col-sm-4 col-sm-offset-4">
  			<p>
  			<a title="返回" href="javascript:history.go(-1);"><button class="btn" style="background-color: #f90;color: white;border: 0;border-radius: 15px;width: 100%;height: 50px;letter-spacing: 0.6em;font-size: 16px;">返回上一级</button> </a>
  		 			</p>
  		</div>
  	</div>	
  </body>
</html>
