<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title></title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/top.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/top.js"></script>
</head>
<body>

<div class="div0_top" style="display:none;" id="empty"></div>
<div class="div0_top" id="top">
  <div class="div1_top" id="logo" >
	 <span class="top_1">
		 <a href="${pageContext.request.contextPath }/index.action" style="color: #f90;">点|通|网</a>
     </span>
  	
		
 <!-- 导航条 -->
	<div class="top-nav">	
		<ul class="nav-menu" id="nav-menu">
			<li class="navLi"><a href="${pageContext.request.contextPath }/index.action" class="ttt">首页</a></li>
			<li class="navLi"><a href="${pageContext.request.contextPath }/CourseController/getAllCou.action" class="ttt">课程视频</a></li>
			<li class="navLi"><a href="${pageContext.request.contextPath }/KnowPointController/toKnowPointView.action?id=1" class="ttt">知识点</a></li></li>
			<li class="navLi"><a href="${pageContext.request.contextPath }/BrushTitleController/toBrushTitle.action?id=1" class="ttt">在线刷题</a></li></li>
			<li class="navLi">
				<c:if test="${student==null && teacher==null}">
					<a href="${pageContext.request.contextPath }/login.action" class="ttt">考试测试</a>
				</c:if>
				<c:if test="${student!=null&&teacher==null}">
					<a href="${pageContext.request.contextPath }/PaperController/toExamPage.action" class="ttt">考试测试</a>
				</c:if>
				
				<c:if test="${teacher!=null&&student==null}">
					<a href="${pageContext.request.contextPath }/TeacherController/toTeaFunPage.action" class="ttt">老师功能</a>
				</c:if>
			</li>
		</ul>
	</div>
	
	
	 <!-- 登录 -->
		<div class="top_right" id="topRight">
			<p>
				<c:if test="${student != null || teacher != null }">
				  <a class="distant" href="${pageContext.request.contextPath }/UserController/exitUser.action">退出</a>
				 
				  <c:if test="${student != null}">
				 	  <a class="login" href="${pageContext.request.contextPath }/UserController/singleCenter.action">个人中心</a>	
				  		<span>${student.stuTel}</span>
				  </c:if>
				   <c:if test="${teacher != null}">
				   	 <a class="login" href="${pageContext.request.contextPath }/UserController/singleCenterTea.action">个人中心</a>	
				  		<span>${teacher.teaTel }</span>
				  </c:if>
				  <span class="user">${msg}</span>
				</c:if>
				<c:if test="${student == null && teacher == null }">
				  <a href="${pageContext.request.contextPath }/register.action" class="distant">注册</a>
				  <a href="${pageContext.request.contextPath }/login.action" class="login">登录</a>
				</c:if>
            </p>
		</div> 
	</div>
</div> 
	
	
<div class="service">
 <div class="s1">
  <a href="http://wpa.qq.com/msgrd?v=3&uin=1146138656&site=qq&menu=yes" target="_blank" style="text-decoration: none">
    <i class="icon1" style="background-position: -58px -2px">
      <em>在线咨询</em>
    </i>
  </a>
 </div>
 <div class="s1">
  <a href="call_us.action" target="_blank" style="text-decoration: none">
  <i class="icon1" style="background-position: -2px -2px">
   <em>意见反馈</em>
  </i>
  </a>
 </div>
 <div class="s2" id="gotop"  onclick="gotop();">
  <i class="icon1" style="background-position: -30px -2px"></i>
 </div>
</div>
</body>
