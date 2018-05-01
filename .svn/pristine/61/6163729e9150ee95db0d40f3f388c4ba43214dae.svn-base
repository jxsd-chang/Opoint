<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生成绩单</title>
    <base href="<%=basePath%>">
    <title>完成家庭作业</title>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/common/echarts.common.min.js"></script>
    <script type="text/javascript" src="js/reportCard.js"></script>
    <style type="text/css">
    .all{width:1000px;min-height:600px;margin:20px auto;}
    .tit{text-align:center;font-size:22px;letter-spacing:3px;width:500px;border-radius:5px;margin:20px auto;
         background:linear-gradient(#f0f0f0,#ddd,#f0f0f0);height:40px;line-height: 40px;}
    .paper{width:300px;height:500px;float:left;overflow:auto;border-radius:5px;border:1px solid #ddd;}
    .paper>p{position: relative;text-align: center;background:linear-gradient(#f0f0f0,#ddd,#f0f0f0);height:35px;line-height:35px;}
    .paper>p>span{position: absolute;right:10px;font-size: 13px;}
    .pap{width:95%;margin:15px auto;}
    .pap>li{padding:10px;border-top:1px solid #ddd;height:45px;cursor: pointer;line-height: 25px;}
    .pap>li>p{overflow: hidden;text-overflow: ellipsis;white-space: nowrap;display: inline-block;width: 155px;}
    .pap>li>span{float:right;font-size:13px;color:#8b8b8b;}
    .pap>li:hover >p{z-index:9;width:272px;box-shadow: 3px 3px 10px 3px #ddd;height: 30px;padding-left: 1px;background:#fff;position: absolute;}
    .tu{width:640px;height:400px;margin-top:50px;margin-right: 25px;}
    .paName{text-align:center;margin-top: 36px;font-size:21px;letter-spacing: 3px;}
    </style>
</head>
<body>
    <jsp:include page="./top.jsp"></jsp:include>
    
    <div class="all">
       <p class="tit">我的成绩单</p>
       
       <!-- 左边考试试卷栏 -->
       <div class="paper">
       	  <p>已考试卷列表<span>总次数:${examCounts }</span></p>
       	  <ul class="pap">
       	    <c:forEach items="${map }" var="entry">
	       	    <li>
	       	      <p>${entry.key.pa_name }</p><span>已考次数：${entry.value }次</span>
	       	      <input type="hidden" value="${entry.key.exam.paId }">
	       	    </li>
		     </c:forEach>
       	  </ul>
       </div>
       
       <div style="float:right;">
       <p class="paName"></p>
       <!-- 右边图表 -->
       <div class="tu" id="main">
       </div>
       <p id="tishi" style="text-align: center;margin-top:20px;display: none;"><span style="color:red;">*  </span>如果没有显示测试的成绩，则为教师还未批改该次试卷！</p>
       </div>
       <div style="clear:both"></div>
    </div>    
    <jsp:include page="./foot.jsp"></jsp:include>
</body>
</html>