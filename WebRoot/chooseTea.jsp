<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>个人中心-个人设置模块</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
<style type="text/css">
.contan{
  width:1000px;
  margin:0 auto;
  min-height:550px;
}
.tit{
  text-align: center;
  font-size:17px;
  letter-spacing: 3px;
  font-weight:bold;
  margin:40px;
}
.tealist{
  padding:20px 10px;
}
.tea{
  width:150px;
  height:250px;
  border:1px solid #ddd;
  border-radius: 5px;
  float:left;
  cursor:pointer;
  background:#fff;
  margin-right:45px;
  margin-bottom:25px;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
  transition:all .5s;
  -webkit-transition:all .5s; 
}
.tea:hover{
  transform:scale(1.1);
}
.tea>p{
  padding:10px;
  text-align: center;
}
.tea>p:hover{
  color:red;
}
</style>
</head>
<body style="font-family:'微软雅黑';box-sizing:border-box;">

<jsp:include page="./top.jsp"></jsp:include>

<div class="contan">
  <p class="tit">挑选一位教师批改你的试卷</p>
  <div class="tealist">
     <div class="tea">
        <img  src="${pageContext.request.contextPath }/images/boy.png" style="width:100%">
        <p>陈松老师</p>
     </div>
     <div class="tea">
        <img  src="${pageContext.request.contextPath }/images/boy.png" style="width:100%">
        <p>陈松老师</p>
     </div>
     <div class="tea">
        <img  src="${pageContext.request.contextPath }/images/boy.png" style="width:100%">
        <p>陈松老师</p>
     </div>
     <div class="tea">
        <img  src="${pageContext.request.contextPath }/images/boy.png" style="width:100%">
        <p>陈松老师</p>
     </div>
     <div class="tea">
        <img  src="${pageContext.request.contextPath }/images/boy.png" style="width:100%">
        <p>陈松老师</p>
     </div>
     <div style="clear:both"></div>  
  </div>
</div>

</body>
</html>