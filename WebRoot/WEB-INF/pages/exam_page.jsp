<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>正在考试中</title>
	<meta charset="utf-8">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/exam.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/exam.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
	
  </head>
  <body style="background:#f0f0f0" onload="checkFile()">
<!-- 引入头部 -->
  	  <jsp:include page="./top.jsp"></jsp:include>
    <div class="container" style=" background:#fff;">
    	<h2 style="text-align: center;">${paper.paName}试卷</h2>
    <hr>
 <!-- 提交试卷表单 -->
   
    <div class="row">
    	<div class="col-sm-8 h4" style="padding:20px 20px;min-height: 500px;">
    	<!-- <form action="" method="post"> -->
    	<form action="" method="post" enctype="multipart/form-data">
    		<input type="hidden" name="exid" value=${exam.exId }>
    	  	<input type="hidden" name="paId" value=${paper.paId }>
   		    <c:forEach items="${list }" var="eti" varStatus="tt">
 <!-- 填空选择题-->
   			   <c:if test="${eti.etimuType == 1}">
	   				<div style="margin: 30px;border-bottom:1px dashed #000;" class="sel">
	   					<img src="/resource/image/exam_image/${mulu }/${eti.etimuTitle}"><br/>
	   				<!-- 	<form action="" method="post">  -->
		   					 <div style="margin-left: 50px;margin-bottom:20px;">
								<input style="margin-left: 50px;" type="radio" name="etimuAns${tt.count }" value="A"> A 
								<input style="margin-left: 50px;" type="radio" name="etimuAns${tt.count }" value="B"> B 
								<input style="margin-left: 50px;" type="radio" name="etimuAns${tt.count }" value="C"> C  
								<input style="margin-left: 50px;" type="radio" name="etimuAns${tt.count }" value="D"> D 
		 					</div>
		 				<!-- </form> -->
	   				</div>
   				</c:if>	
<!-- 填空解答题-->
	   			<c:if test="${eti.etimuType != 1}">
	   				<img alt="" src="/resource/image/exam_image/${mulu }/${eti.etimuTitle}"><br/>
	   				
<!-- 文件上传 -->	   	<div style="padding-left: 125px;">		
		   				<input type="text" class="file_name"  readonly="readonly" placeholder="请选择你的答案图片文件" name="file_name"/>
				          <a href="javascript:void(0);" class="input">
				            	浏览
				            <input type="file" class="file" name="datiPic${tt.count }">
				          </a>
			        </div>  
	   			</c:if>	
   			</c:forEach>
   		</form>
   		
   		<div style="height: 75px;margin-bottom: 30px;">
    		<div class="col-md-3 col-sm-offset-3" style="margin-top:25px;" id="sub">
    			<button id="btn" class="btn-success" style="width: 130px;height: 40px;border: 0;border-radius: 8px;">提交试卷</button>
    			<span class="btnNot" id="default"></span>
    		</div>
    	</div>
    </div>	
       <div class="col-md-4" style="border-left:1px solid #ddd;">
	      <div style="width:100%;height:40px;line-height: 40px;">
	        <p style="text-align: center;font-size: 17px;background:#f0f0f0;color:#629a01;border-radius:4px;">
	                         当前试卷信息</p>
	      </div>
	      <div style="width:100%;padding:20px 15px 10px 15px;min-height:150px;">
	        <%-- <p>所需积分：${paper.paJifen }积分</p> --%>
	        <!-- <p>试卷年份：2018 年</p> -->
	        <p>卷面总分：100 分</p><p>答题时间：100 分钟</p>
	        <p>卷面难度：${paper.paNandu }</p>
	        <!-- <p>考试描述：考察学生对于函数的理解与运用</p> -->
	      </div>
	       <p style="height:40px;text-align: center;font-size: 17px;background:#f0f0f0;
	       color:#629a01;border-radius:4px;line-height: 40px;letter-spacing: 3px;">考前须知</p>
	       <div style="width:100%;padding:20px 15px 10px 15px;height:auto;">
	         <p><img style="display: inline;margin-right: 10px;margin-left:5px;;width: 30px;height: 30px;" alt="" src="${pageContext.request.contextPath }/images/nowTime.svg"><span style="font-weight: bold;color: #d81e06">当前时间：</span><span id="show-time"></span></p>
	         <p><img style="display: inline;margin-right: 5px;width: 40px;height: 40px;" alt="" src="${pageContext.request.contextPath }/images/timeOut.svg"><span style="font-weight: bold;color: #d81e06">倒计时：</span><span id="daojishi"></span></p>
	         
	       </div>
	   </div>
    </div>
  </div>

<!-- 结尾 -->
<jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>