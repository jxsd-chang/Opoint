<%@page import="javax.swing.text.TabableView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="base" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>忘记密码</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/forgetpwd.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/forgetpwd.js"></script>
<script type="text/javascript">
	var base = "${base}";
</script>
</head>
<body style="overflow-x: hidden;padding: 0;">
<div id="top">
   <p align="center"><span class="p1">学高数就上<a style="text-decoration: none;" href="${pageContext.request.contextPath }/index.action"><em>点通网</em></a></span></p>
   
</div>

<div id="slider">
   <img src="${pageContext.request.contextPath}/images/forgetpwd.jpg" style="width:1700px;height:630px; position:absolute;"/>
   <div class="box">
     <p>忘记密码</p>
     <span style="color: orange;font-size: medium">${succ }</span>
 <form action="${pageContext.request.contextPath }/UserController/forgetpwd.action" method="post">
     <div class="box1" style="margin-top:10px;">
        <span>手机号码</span>
        <input type="text" class="inputbox" id="phone" onBlur="mobile()" name="phone" placeholder="请输入手机号" maxlength="11"/>
     </div>
     <div class="wrong2" id="cuo1">手机号格式不对</div>
     <div class="box1">
        <span>手机验证码</span>
        <input type="text" class="inputbox1" id="yanzheng" name="code" maxlength="6" placeholder="请输入验证码"/>
        <input type="button" class="btn1" id="getCode" value="获取验证码">
        <div class="getCodeNull"></div>
     </div>
     <div class="wrong" style="color: red">${yanzeng}</div>
     <div class="box1">
        <span>设置新密码</span>
        <input type="password" class="inputbox" id="pwd" onBlur="mima()" name="pwd" maxlength="16" placeholder="请输入新密码"/>
     </div>
     <div class="wrong2" id="cuo2">密码只能由数字字母下划线组成,6到16位</div>
     <div class="box1" >
        <span>确认新密码</span>
        <input type="password" class="inputbox" id="repwd" onBlur="mima2()" name="repwd" maxlength="16" placeholder="请再次输入"/>
     </div>
     <div class="wrong2" id="cuo3">两次密码不一样</div>
     <div class="box1" id="tijiao" style="margin-bottom:15px;">
         <input type="submit" class="btn4" value="提交"/><div class="control" id="control"></div>
     </div>
     </form>
   </div>
</div>
</body>
</html>