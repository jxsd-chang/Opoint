<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<meta name="viewport" content="width=device-width, initial-scale=1">
    <base href="<%=basePath%>">
    
    <title>选择考试科目</title>
    
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
	  });

	</script>
	<style type="text/css">
	   .head{background:linear-gradient(#f0f0f0,#ddd);border-radius:5px;width:100%;height:70px;line-height:5em;text-align: center;}
	   .head1{font-size:18px;font-weight:bold;letter-spacing: 5px;margin-left: 90px;}
	   .head2{float:right;margin-right:50px;cursor:pointer;}
	   .head2:hover{color:red;}
	   .all{width:100%;height:auto;}
	   .exam{width:80%;margin:0 auto;overflow: hidden;}
	   .name{width:100%;height:50px;background:#fff;line-height: 50px;border-bottom:1px dashed #ddd;}
	   .nameleft{float:left;margin-left:20px;}
	   .nameright{float:right;width:350px;height:100%;}
	   .itemright{float:right;width:350px;height:100%;}
	   .itemright>span{display:inline-block;width:70px;text-align: center;}
	   .nameright span{margin-left:50px;}
	   .examItem{width:100%;float:left;}
	   .examItem ul li{width:100%;height:50px;line-height:50px;font-family: "微软雅黑";border-bottom:1px dashed #ddd;}
	   .examItem ul li a:hover{color:red;}

	</style>

  </head>
  
  <body>
  	<jsp:include page="./top.jsp"></jsp:include>
	
	
	<div class="container" style="padding-top:30px;">
	  <div class="head">
	     <span class="head1">选择考试试卷</span>
	     <a href="ExamController/exam_index.action">
	     <span class="head2">分册查看>></span></a>
	  </div>
	  
	  <div class="all">
	  
	     <div class="exam">
	        <div class="name">
	           <span class="nameleft">试卷名称:</span>
	           <div class="nameright">
	             <span>答题人数</span><span>难易程度</span><span>点击答题</span>
	           </div>
	        </div>
	        <div class="examItem" id="shang">
	             <ul style="list-style: none;">
		             <c:forEach items="${allPaperList }" var="s">
			                <li>
			                  <a href="EtimuController/chooseTea.action?pid=${s.paId }&cou_id=${s.couId}">
			                     <span class="nameleft">${s.paName }</span>
			                  </a>
			                  <div class="itemright">
			                  	<c:if test="${s.paCount==null }">
			                  		 <span style="margin-left:43px;">暂无</span>
			                  	</c:if>
			                  	<c:if test="${s.paCount!=null }">
			                     <span style="margin-left:43px;">${s.paCount }</span>
			                  	</c:if>
			                     <span style="margin-left:33px;">${s.paNandu }</span>
			                     <a href="EtimuController/chooseTea.action?pid=${s.paId }&cou_id=${s.couId}">
			                        <span style="float: right;margin-right: 30px;">进入考试</span>
			                     </a>
			                  </div>
			                </li>
		             </c:forEach>
	              </ul>
	        </div>        
	     </div>
	  </div>
	</div>
	 	
	<jsp:include page="./foot.jsp"></jsp:include>
  </body>
 
</html>
