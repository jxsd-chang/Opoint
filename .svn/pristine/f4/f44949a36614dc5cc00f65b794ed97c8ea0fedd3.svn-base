<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#loginbox").hover(function(){
		if($("#userphone").val()==""||$("#userpwd").val()==""||$("#yanzheng").val()==""){
			$(".control").show();
		}else{
			$(".control").hide();
		}
	},function(){
		    $(".control").show();
			});

	
	$("#img").click(function(){
		$(this).attr("src","${pageContext.request.contextPath }/validateCode.action?time"+new Date().getTime())
	});
});
	

</script>
</head>
<body>

 <div id="top">
   <p align="center"><span class="p1">学高数就上 <a style="text-decoration: none;" href="${pageContext.request.contextPath }/index.action"><em>点通网</em></a></span></p>
   
 </div>

<div id="slider">
   <img src="${pageContext.request.contextPath}/images/login.jpg" class="img-responsive" style="width:1600px;height:630px; position:absolute;"/>
 <div class="login-box">
   <p class="title">账号登录</p>
   	<span style="color:red;font-size: 15px;">${errmsg }</span>
  <form id="loform" action="" method="post">
	  <div class="tex-box">
	   <input name="userphone" id="userphone" type="text" maxlength="13" style="float:left;" placeholder="请输入手机号" /> 
	    <a href="${pageContext.request.contextPath }/register.action" class="box-a">注册账号</a>
	  </div>
	  <div class="tex-box">
	   <input name="userpwd" id="userpwd" type="password" placeholder="请输入密码" style="float:left;"/> 
	    <a href="${pageContext.request.contextPath }/forgetpwd.action" class="box-a">忘记密码?</a> 
	  </div>
	  <div class="tex-box">
	    <input name="vcode" id="yanzheng" type="text" placeholder="请输入验证码" maxlength="4" style="width:150px; float:left" />
	    &nbsp;&nbsp;<img id="img" src="${pageContext.request.contextPath }/validateCode.action" style="margin-top: 5px;margin-left:15px;"><br/>
	    <span style="color:red;font-size: 15px;">${codemsg }</span>
	   </div>
	  <div class="tex-box" id="loginbox" style="height:55px!important">
	    <span class="login-btn-1" style="background:#f90;" id="sbtn">学生登录</span>
	    <div class="control" style="margin-left:10px;"></div>
	    <span class="login-btn-1" style="background:#09c;margin-left:30px;" id="tbtn">老师登录</span>
	    <div class="control" style="margin-left:180px;"></div>
	  </div>
  </form>
  </div>
</div>
		
</body>
<script type="text/javascript">
$("#sbtn").click(function(){
	$("#loform").attr("action","${pageContext.request.contextPath}/UserController/login.action?jus=s");
	$("#loform").submit();
});
$("#tbtn").click(function(){
	$("#loform").attr("action","${pageContext.request.contextPath}/UserController/login.action?jus=t");
	$("#loform").submit();
});
</script>
</html>