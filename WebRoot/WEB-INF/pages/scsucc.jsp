<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>收藏知识点提示页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">


  </head>
  
  <body>
  	<jsp:include page="./top.jsp"></jsp:include>
  	<div class="container">
  		<div class="row col-sm-12">
  			<div class="col-sm-4 col-sm-offset-4">
  				<img alt="" src="${pageContext.request.contextPath }/image/collect_success.jpg">
  			</div>
  		</div>
  		<div class="row">
  			<div class="col-sm-6 col-sm-offset-3">
  				<p class="h4">
  				恭喜,成功收藏该知识点!<a title="返回知识点" href="javascript:history.go(-1);"><button class="btn btn-success" style="border: 0;border-radius: 15px">返回</button> </a>
	    		马上前往个人中心查看？<a title="个人中心" href="${pageContext.request.contextPath }/CollectController/getCollection.action"><button class="btn btn-success" style="border: 0;border-radius: 15px">go</button></a>
	    		</p>
  			</div>
  		</div>
  	</div>
	    
  </body>
</html>
