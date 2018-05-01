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
	   .choose{width:80%;margin:0 auto;height:70px;padding-top:20px;border-bottom:1px solid #ddd;}
	   .choose ul{list-style: none;width:425px;height:50px;margin:0 auto;}
	   .choose ul li{width:200px;height:50px;float:left;margin-left:10px;background:#f0f0f0;font-family:"微软雅黑";
	          color:#000;text-align: center;line-height: 55px;letter-spacing: 3px;font-size:17px;cursor:pointer;}
	   .active{background:#fff!important;color:#74c409!important;border:1px solid #ddd;border-bottom:none;}
	   .exam{width:80%;margin:0 auto;min-height:500px;}
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
	<script type="text/javascript">
	   $(function(){
		   $('.choose li').on("click",function(){
			   var i=$(this).index();
			   $('.choose li').removeClass('active').eq(i).addClass('active');
			   $('.examItem').stop().slideUp(200).delay(200).eq(i).slideDown(200);
		   })
	   })
	</script>
  </head>
  
  <body>
  	<jsp:include page="./top.jsp"></jsp:include>
	
	<div class="container" style="padding-top:30px;">
	  <div class="head">
	     <span class="head1">选择考试试卷</span>
	     <a href="ExamController/exam_index2.action">
	     <span class="head2">查看全部>></span></a>
	  </div>
	  
	  <div class="all">
	     <div class="choose">
	        <ul>
	          <li class="active">高等数学（上）</li><li>高等数学（下）</li>
	        </ul>
	     </div>
	     <div class="exam">
	        <div class="name">
	           <span class="nameleft">试卷名称:</span>
	           <div class="nameright">
	             <span>答题人数</span><span>难易程度</span><span>点击答题</span>
	           </div>
	        </div>
	        <div class="examItem" >
	             <ul style="list-style: none;">
		             <c:forEach items="${paList_s }" var="s">
			                <li>
			                  <a href="EtimuController/chooseTea.action?pid=${s.paId }&cou_id=1">
			                     <span class="nameleft">${s.paName }</span>
			                  </a>
			                  <div class="itemright">
			                  	<c:if test="${s.paCount==null }">
			                  		<span style="margin-left:43px;">暂无</span>
			                  	</c:if>
			                  	<c:if test="${s.paCount!=null }">
			                      <span style="margin-left:43px;">${s.paCount}人</span>
			                  	</c:if>
			                     <span style="margin-left:33px;">${s.paNandu }</span>
			                     <a href="EtimuController/chooseTea.action?pid=${s.paId }&cou_id=1">
			                        <span style="float: right;margin-right: 30px;">进入考试</span>
			                     </a>
			                  </div>
			                </li>
		             </c:forEach>
	              </ul>
	        </div>
	        
	        <div class="examItem" style="display: none;">
	          <ul style="list-style: none;">
	              <c:forEach items="${paList_x }" var="x">
		                <li>
		                  <a href="EtimuController/chooseTea.action?pid=${x.paId }&cou_id=2">
		                     <span class="nameleft">${x.paName }</span>
		                  </a>
		                  <div class="itemright">
		                  	<c:if test="${x.paCount==null }">
		                  		<span style="margin-left:43px;">暂无</span>
		                  	</c:if>
		                  	<c:if test="${x.paCount!=null }">
		                     <span style="margin-left:43px;">${x.paCount}人</span>
		                  	</c:if>
		                     <span style="margin-left:33px;">${x.paNandu }</span>
		                     <a href="EtimuController/chooseTea.action?pid=${x.paId }&cou_id=2">
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
