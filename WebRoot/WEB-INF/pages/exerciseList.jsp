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
    
    <title>点通网随机练习</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/mryl.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/exercise.js"></script>
	<script type="text/javascript">
	$(function(){
		  $("#nav-menu").children("li").eq(4).addClass("actived");
	  });

	</script>
	<style type="text/css">
		.choose-timu{
			margin-left: 10px;
		}
		#btn{
			margin-left: 10px;
		}
	</style>
  </head>
  
  <body>
    <jsp:include page="./top.jsp"></jsp:include>
    <div class="mryl">
    	<div class="mryl-container">
    		<div class="mryl-left">
    			<div class="mryl-list">
    				<h1>《高等数学》随机练习-点通网</h1>
    				<div class="guide">
    					
    						<span>多少道：</span>
    						<input class="choose-timu" type="radio" name="count" value="2">2道
    						<input class="choose-timu" type="radio" name="count" value="4">4道
    						<input class="choose-timu" type="radio" name="count" value="6">6道
    						<input class="choose-timu" type="radio" name="count" value="8">8道
    						<input type="button" id="btn" class="tiji" value="生成题集"/>
    					
    				</div>
    				<!-- 题目列表 -->
    			<div id="exerciseItems"></div>
    				<!-- 展示答案区域 -->
    				<p id="show-answer" class="show-answer">
    				              点我查看答案
    				</p>
    				<div style="display: none;" class="mryl-answer">
    			<div id="exerciseparseItems"></div>
    				</div>
    		</div>
    		
    	</div>
    	
    	<!-- 右边 -->
    		<div class="mryl-right">
    			<ul>
    				<li class="mryl-r-1">
    					<div>
    						<h3 style="padding: 10px 0;font: !important;text-align: center;">注意事项</h3>
    						<div style="border-top: 1px gray dashed;">
    							<p style="padding: 5px 20px;"><span style="color:red">*</span> 本练习根据题数随机生成</p>
    							<p style="padding: 5px 20px;"><span style="color:red">* </span>本练习由点通网独家提供</p>
    						</div>
    					</div>
    				</li>
    				<li class="mryl-r-2">
    					<div>
    						<h3 style="padding: 10px 0;text-align: center;">练习说明</h3>
    						<div style="border-top: 1px gray dashed;">
    							<p style="padding: 5px 15px;font-size:14px;"><span style="color:red">* </span>该练习由用户自主完成，不提供评分</p>
    							<p style="padding: 5px 15px;font-size:14px;"><span style="color:red">* </span>该练习不限时间，请认真完成</p>
    							<p style="padding: 5px 15px;font-size:14px;"><span style="color:red">* </span>用户完成后可自主查看答案</p>
    						</div>
    					</div>
    				</li>
    			</ul>
    		</div>
    </div>
    </div>
    <div style="clear: both;"></div>
    <jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
