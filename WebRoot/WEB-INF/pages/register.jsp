<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="base" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册</title>
<link href="${pageContext.request.contextPath}/css/register.css" rel="stylesheet" type="text/css"/>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/register.js"></script>
<script type="text/javascript">
	var base = "${base}";
</script>
</head>
<body class="main">
  <div id="top">
   <p align="center"><span class="p1">学高数就上<a style="text-decoration: none;" href="${pageContext.request.contextPath }/index.action"><em>点通网</em></a></span></p>
  </div>
    <div class="register" style="background:url(${pageContext.request.contextPath}/images/register.jpg) center no-repeat;">
    	<div class="register_tab" style="display:none;" id="tea">
    		<div class="register_tab_0">
    			<span class="register_0">老师</span>
    			 <span class="register_1">老师说明信息</span><br/>
    			 <span style="color: red">${teaIsExit }</span><br/>
    			<span class="register_f" id="change" onclick="teacher()">我是学生</span>
  <!-- 老师注册 -->
 			<form id="teaform" action="" method="post">
 				<input id="teajus" type="hidden" name="jus" value="t"/>
 				<div class="register_tab_0_1">
 				    <input class="register_in" type="text" id="phoneTea" onkeyup="mobile()" name="usertele" placeholder="请输入电话号码" maxlength="11"/>
 			    </div>
                 <span class="wrong" id="cuo1">手机号格式不对</span>
 			    <div class="register_tab_0_11">
 				    <input class="register_in" type="password" id="mima" onkeyup="mi()" name="password" maxlength="16" placeholder="请输入您的密码"/>
 			    </div>
                 <span class="wrong" id="cuo2">密码只能由数字字母下划线组成, 不多于16位</span>
 			    <div class="register_tab_0_11">
 				    <input class="register_in" type="password" id="remima" onkeyup="remi()" name="password_0"  placeholder="请确认您的密码"/>
 			    </div>
                 <span class="wrong" id="cuo3">两次密码不一样</span>
                 <div class="yanz">
 			    <div class="register_tab_0_2">
 			    <input class="register_in_0" type="text" id="code"  name="code" placeholder="请输入验证码" maxlength="6"/>   
				</div>
                  <div class="register_g getCode" id="getCodeTea">获取验证码</div>
                  <div class="getCodeNull"></div>
                 </div>
                 <span class="wrong" id="cuo4">验证码输入错误</span>
 		        <input class="register_in_1" type="button" id="teasubmit" value="注              册"/>
 			</form>
    			<p class="register_h">注册代表您已经同意<a href="#">《点通网服务条款》</a></p>
    		</div>           
    	</div>
  <!-- 学生注册 -->        
        <div class="register_tab" id="stu">
    		<div class="register_tab_0">
    			<span class="register_0">学生</span>
               <span class="register_1">学生说明信息</span><br/>
                <span style="color: red">${stuIsExit }</span><br/>
                <span class="register_ff" id="change2" onclick="student()">我是教师</span>
    			<form id="stuform" action="${pageContext.request.contextPath }/UserController/regist.action" method="post">
    				<input id="stujus" type="hidden" name="jus" value="s"/>
    				<div class="register_tab_0_3">
    				    <input class="register_in2" type="text" id="phoneStu" onkeyup="mobile2()" name="usertele" placeholder="请输入电话号码" maxlength="11"/>
    			    </div>
                   		 <span class="wrong" id="cuo12">手机号格式不对</span>
    			    <div class="register_tab_0_33">
    				    <input class="register_in2" type="password" id="mima2" onkeyup="mi2()" name="password" maxlength="16" placeholder="请输入您的密码"/>
    			    </div>
                   		 <span class="wrong" id="cuo22">密码只能由数字字母下划线组成, 6到16位</span>
    			    <div class="register_tab_0_33">
    				    <input class="register_in2" type="password" id="remima2" onkeyup="remi2()" name="password_0" placeholder="请确认您的密码"/>
    			    </div>
                    <span class="wrong" id="cuo32">两次密码不一样</span>
                    
                    <div class="yanz">
    			    <div class="register_tab_0_4">
    			    <input class="register_in_00" type="text" id="code2" name="code" placeholder="请输入验证码" maxlength="6"/>   
    			    <span style="color: orange;font-size: medium">${yanzeng }</span>
					</div>
    		         <div class="register_g getCode" id="getCodeStu">获取验证码</div>
    		         <div class="getCodeNull"></div>
                    </div>
                    <span class="wrong" id="cuo42">验证码输入错误</span>
    		        <input class="register_in_1" type="button" id="stusubmit" value="注              册"/>
    			</form>
    			<p class="register_h">注册代表您已经同意<a href="#">《点通网服务条款》</a></p>
    		</div>           
    	</div>
    </div>
</body>
</html>