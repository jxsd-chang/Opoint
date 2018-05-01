<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理我的班级</title>
	<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="js/textareaAuto.js"></script>
	<script type="text/javascript" src="js/pigai.js"></script>
	<link rel="stylesheet" type="text/css" href="css/pigai.css">

  </head>
  
  <body onload="checkFile()">
     <jsp:include page="./top.jsp"></jsp:include>
     
     <div class="hh">班级名称：${clagrade.claName }</div>
     
     <div class="allcon">
       
       <!-- 作业列表 -->
     <div class="leftcon bac">
          <p>作业列表</p>
          <c:if test="${allClaPubList == null }">
	          <div class="emp">
	            <img src="images/empty.png"/>
	            <p>没有新的作业列表，您可以前去<a href="ClagradeController/getAllCla.action">发布作业</a></p>
	          </div>
		   </c:if>
		   <c:if test="${allClaPubList != null }">
           <ul class="worklist">
           		<c:forEach items="${allClaPubList }" var="publish">
		            <li>
		              <p>${publish.workTitle}</p>
		              <span>截止日期：${publish.publishEndtime}</span>
		              <span>发布日期：${publish.publishTime}</span>
		              <input type="hidden" class="pubid" value="${publish.publishId }">
		              <input type="hidden" class="claid" value="${publish.claId }">
		            </li>
	            </c:forEach>
          </ul>
          </c:if>
     </div>
     
       <!-- 左边栏 -->
       <div class="leftcon" style="display: none;">
          <p><span class="return">返回</span>学生列表</p>
          <ul class="xuan">
            <li class="aa">已交</li><li class="">未交</li>
          </ul>
           <!-- 已交列表 -->
          <ul class="stujiao yesSubItems" >
            
          </ul>
          <!-- 未交列表 -->
          <ul class="stujiao noSubItems"  style="display: none;" >
            
          </ul>
       </div>
       
       <!-- 右边部分 -->
       <input type="hidden" id="claid" value="${clagrade.claId }">
       <div class="zuoye">
         <div class="zy">   
	        <!-- 原题目 -->
	        <p class="title">原题目</p>
	        <div class="zy2" style="font-size:13px;" id="yuanWindow">
	        
	        </div>
	        <!-- 学生的解答 -->
	        <p class="title">学生解答</p>
	        <div class="zy2" style="font-size:13px;" id="replyWindow">
	        
	        </div>
	      </div>
	      
	     <div class="hd">
		  <form id="solveForm" action="" method="post" enctype="multipart/form-data">
		  		<input type="hidden"  name="claid" value="${clagrade.claId }">
		  		<input type="hidden" name="replyworkId" id="replyworkId">
		        <p class="title">作业批改</p>
		       		 <textarea class="ans" name="sovleInfo" style="max-height:400px;"></textarea>
		        <p class="title">上传附件</p>
		        <div class="chuan">		
		 		   <input type="text" class="file_name"  readonly="readonly" placeholder="表述不清可上传附件" name="file_name" />
		           <a href="javascript:void(0);" class="input">上传附件
		             <input type="file" class="file" name="homeworkfile">
		           </a>
				</div>
				<div id="jiao">
					<input type="button" class="jiao" value="提交批改" id="solveBtn">
					<div class="nn"></div>
				</div>
			</form>
        </div>
      </div>
    </div>
</body>
</html>