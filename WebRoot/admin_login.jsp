<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin_login2.css">
	

  </head>
  
  <body style="overflow: hidden;">
    <div class="adm-login"><!-- 大div -->
    	<div class="adm-container">
    		<div class="adm-title">
    			<h2>点通网——基于高数在线学习平台后台管理</h2>
    		</div>
    		<div class="adm-pic">
    			<div style="width: 780px;min-height: 280px;background-color: #3698BF;position: relative;margin-left: 10px;top:10px">
    				<img alt="登录后台" style="width: 760px;height: 260px;margin-left: 10px;margin-top:10px;border-radius: 15px"
    					src="${pageContext.request.contextPath }/images/adm.png">
    			</div>
    		</div>
    		<div class="adm-tip">
    			<span style="color: red">${errmsg}</span>
    		</div>
    		<div class="adm-input">
    			<div class="adm-form">
	    			<form action="${pageContext.request.contextPath }/UserController/adminlogin.action" method="post">
	    				<div class="input">
		    				<div class="input"><label>昵称:</label></div>
		    				<div class="input"><input name="adminnick" type="text" placeholder="请输入昵称(可选)"></div>
	    				</div>
	    				
	    				<div class="input" style="max-width: 230px;">
		    				<div class="input"><label>电话号码:</label></div>
		    				<div class="input"><input type="text" name="admintel"  placeholder="请输入手机号码"></div>
	    				</div>
	    				
	    				<div class="input">
		    				<div class="input"><label>密码:</label></div>
		    				<div class="input"><input type="password" name="adminpwd"  placeholder="请输入密码"></div>
	    				</div>
	    				
	    				<div class="input">
	    					<input style="border-radius: 15px;background-color: #0783C3;" type="submit" value="登录">
	    				</div>
	    			</form>
    			</div>
    		</div>
    	</div>
    	
    	<div class="adm-foot">
    		<h4 style="color: white;position: relative;">版权所有：江西师范大学点通网</h4>
    	</div>
    </div>
  </body>
</html>
