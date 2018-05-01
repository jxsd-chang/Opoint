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
    <title>挑战竞赛题</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript">
		 $(function(){
			  $("#nav-menu").children("li").eq(4).addClass("actived");
			  	/* 第一个和最后一个都无法点击 */
			  var num = $("#num").text();
			  console.log(num);
			  if(num == "1"){
			  	$("#before").attr("disabled","disabled");	
			  }
			  if(num == "100"){
			  	$("#next").attr("disabled","disabled");
			  }
			  /* 入出样式 */
			  $("#showAnswer").hover(function(){
			  	$(this).addClass("btn-success btn-responsive");
			  },function(){
			  	$(this).removeClass("btn-success btn-responsive");
			  });
			  $("#showAnswer").click(function(){
			  	$("#daan").toggle();
			  });
			  /* 上一题 */
			  $("#before").click(function(){
			  	
			  });
			  /* 下一题 */
			  $("#next").click(function(){
			  	
			  });
		  });
		</script>

</head>
<body style="background:#f0f0f0">
  <jsp:include page="./top.jsp"></jsp:include>
	
	<div class="container" style="min-height: 500px;background:#ffffff;padding: 20px;">
<!-- 试题 -->
		<p style="display: none;">题号<span id="num">1</span></p>
		<h2 style="text-align: center;">挑战竞赛题</h2>
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2" style="min-height: 300px;">
				<img class="img-responsive" alt="" src="${pageContext.request.contextPath }/images/test.png">
			</div>
		</div>
<!-- 按钮 -->
		<div class="row" style="margin: 20px 0;">
			<div class="col-sm-8 col-sm-offset-2">
				<div class="col-sm-2">
					<input id="before" type="button" class="btn btn-success btn-responsive" value="上一题">
				</div>
				
				<div class="col-sm-2 col-sm-offset-3">
					<input type="button" class="btn" id="showAnswer" value="显示详解">
				</div> 
				
				<div class="col-sm-2" style="float: right;">
					<input id="next" type="button" class="btn btn-success btn-responsive" value="下一题">
				</div>
			</div>
		</div>
<!-- 答案显示区 -->
		<div class="row" id="daan" style="display: none;">
			<div class="col-sm-8 col-sm-offset-2" style="min-height: 300px;">
				<img class="img-responsive" alt="" src="${pageContext.request.contextPath }/images/test.png">
			</div>
		</div>
	</div>
  <jsp:include page="./foot.jsp"></jsp:include>
</body>
</html>