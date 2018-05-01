<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>联系我们</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/contactus.css">
	

  </head>
  
  <body>
    <!--引入头部  -->
    <jsp:include page="./top.jsp"></jsp:include>
    <!-- 结束头部 -->
    
    <!-- 主体内容 -->
    <div class="contact-us">
    
		<div class="contact-container">
			<div>
				<img style="height: 150px;width: 100%" alt="" src="${pageContext.request.contextPath }/images/contactus1.png">
			</div>
			<div class="con-address">
				<div class="address">
					<div style="margin-top: 30px;margin-left: 30px">
						<h2>联系我们</h2>
						<p><span>公司：</span>点通网</p>
						<p><span>地址：</span>江西师范大学（瑶湖校区）先骕楼X3512工作室 。</p>
					</div>
				</div>
				<div class="address-img">
					<img style="width: 500px;height:300px; " alt="" src="${pageContext.request.contextPath }/images/address.png">
					
				</div>
			</div>
			
			<div class="contact-service">
				<div class="kefu">
					<h2>客户服务</h2>
					<p><span>在线客服企鹅号</span>：1146138646 。</p>
					<p><span>服务时间</span>：8:00~23:00（周一至周五）、9:00~17:00（周六周日）。</p>
					<p><span>网站官方企鹅群</span>：572411121 。</p>
					<p><span>网站官方微信公众号</span>：成长的足记。</p>
				</div>
				
				<div class="fankui">
					<h2>反馈信息</h2>
					<form action="${pageContext.request.contextPath }/MessageController/getMessage.action" method="post">
	  						<textarea class="jianyi" name="info" rows="5" cols="50" 
	  							placeholder="在这里输入你的宝贵意见..."
	  							style="resize: vertical;"></textarea>
	  						<input type="submit" value="反馈">
	  						
	  				</form>
				</div>
			</div>
			
		</div>
    </div>
    <!-- 引入尾部 -->
   	<jsp:include page="./foot.jsp"></jsp:include> 
   	<!-- 结束尾部 -->
   </body>
</html>
