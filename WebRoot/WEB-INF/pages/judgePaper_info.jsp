<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>批改试卷-评分页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/judge.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/judgepage.js"></script>
  </head>
  
  <body>
  	<jsp:include page="./top.jsp"></jsp:include>
  	<div class="container" style="min-height:600px;">
  	  <div class="row">
  	    <!-- 左边栏 -->
  		 <div class="leftitem" id="leftitem">
  		   <div class="leftstu">
  		     <div class="leftstu1">
  		     	<c:if test="${studentExam.stuPic==null }">
  		     		<img src="${pageContext.request.contextPath }/images/no_title.jpg"/>
  		     	</c:if>
  		     	<c:if test="${studentExam.stuPic!=null }">
  		     		<img src="/resource/pic/tou_pic/${studentExam.stuPic }"/>
  		     	</c:if>
  		     </div>
  		     <div class="leftstu2">
  		       <ul>
  		       <c:if test="${studentExam.stuName==null }">
  		       		<li><span style="font-weight:bold">姓名：</span>无名氏</li>
  		       </c:if>
  		       <c:if test="${studentExam.stuName!=null }">
  		       		<li><span style="font-weight:bold">姓名：</span>${studentExam.stuName }</li>
  		       </c:if>
  		       <li><span style="font-weight:bold">年级：</span>${studentExam.stuGrade }</li>
  		       <li><span style="font-weight:bold">学院：</span>${studentExam.stuPro }</li>
  		       <li><span style="font-weight:bold">交卷时间：</span>${extime }</li>
  		       </ul>
  		     </div><div style="clear:both"></div>
  		   </div>
  		   <div class="leftstu" style="margin-top:30px;">
  		     <div class="leftstu3">学生答案</div>
			 <div class="leftstu4">
			   <span class="leftstu5" id="ke1">客观题</span>
			   <span class="leftstu5" id="zhu1">主观题</span>
			 </div>
  		     <div class="leftstu3">标准答案</div>
  		     <div class="leftstu4">
			   <span class="leftstu5" id="ke2">客观题</span>
			   <span class="leftstu5" id="zhu2">主观题</span>
			 </div>
  		   </div>
  		   <div class="leftstu" style="margin-top:30px;">
  		  <%--   <form action="${pageContext.request.contextPath }/TeacherController/submitGrade.action"> --%>
	  		      <ul class="fenshu">
	  		        <li>
	  		                                  客观题分数：<input type="text"   name="kGrade" maxlength="2" id="kGrade" value="${opts }" onkeyup="value=value.replace(/[^\d]/g,'')">
	  		        </li>
	  		        <li>
		  		                         主观题分数：<input type="text" name="zGrade" maxlength="2" id="zGrade" value="${datis }" onkeyup="value=value.replace(/[^\d]/g,'')">
	  		        </li>
	  		        <li>
	  		                                  考试总分数：<input type="text" name="fGrade" maxlength="3" id="fGrade" value="${total }" readonly="readonly">
	  		        </li>
	  		      </ul>
	  		      <div id="jiao" style="position: relative;">
	  		      <input type="hidden" name="exid" value="${exid }">
	  		      <input type="submit" class="fenshu2" id="submitGraBtn" value="提交分数">
	  		      <div class="nn"></div>
	  		      </div>
  		     <!--  </form> -->
  		   </div>
  		 </div>
  		 
  		<div id="paper-timu" class="col-sm-8 col-sm-offset-3"> 
  		
  		<!-- 学生客观题 -->
  		<div class="rr" id="r1">
  			 <div style="margin: 10px;">
			 <c:forEach items="${etimuVoList }" var="etiVo" varStatus="tt">
   			   <c:if test="${etiVo.etimu.etimuType == 1}">
	   				   <div style="border-bottom: 1px dashed #333;margin-bottom: 10px;">
	   					<img src="/resource/image/exam_image/${mulu }/${etiVo.etimu.etimuTitle}">
	   					<p class="answers">
			   				我的答案:[<span>${etiVo.opt_ans}</span>]
		   				</p>
	   				   </div>
   				</c:if>	
   			</c:forEach>
   			</div><div style="clear:both"></div>
  		</div>
  		
  		<!-- 学生主观题 -->
  		<div class="rr" id="r2">
  			<div style="margin: 10px;border-bottom:1px dashed #000;">
		 	<c:forEach items="${etimuVoList }" var="etiVo" varStatus="tt">
	   			<c:if test="${etiVo.etimu.etimuType != 1}">
	   			    <div style="border-bottom: 1px dashed #333;margin-bottom: 10px;">
	   				  <img alt="" src="/resource/image/exam_image/${mulu }/${etiVo.etimu.etimuTitle}">
                    </div>
                    <div style="border-bottom: 1px dashed #333;margin-bottom: 10px;">
	   				  <img alt="" src="/resource/pic/exam_pic/${pid }/${etiVo.dati_ans}">
	   				</div>
	   			</c:if>	
   			</c:forEach>
   			</div><div style="clear:both"></div>
  		</div>
  		
  		<!-- 答案客观题 -->
  		<div class="rr" id="r3">
  			<div style="margin: 10px;border-bottom:1px dashed #000;">
			 <c:forEach items="${etimuVoList }" var="etiVo" varStatus="tt">
   			   <c:if test="${etiVo.etimu.etimuType == 1}">
	   				    <div style="border-bottom: 1px dashed #333;margin-bottom: 10px;">
	   					<img src="/resource/image/exam_image/${mulu }/${etiVo.etimu.etimuTitle}">
		   				<p class="answers">
			   			        标准答案:[<span style="color: green;">${etiVo.etimu.etimuAns }</span>]
		   				</p>
		   				</div>
   				</c:if>	
   			</c:forEach>
   			</div><div style="clear:both"></div>
  		</div>
  		
  		<!-- 答案主观题 -->
  		<div class="rr" id="r4">
  			<c:forEach items="${datiParList }" var="parse">
  			   <div style="border-bottom: 1px dashed #333;margin-bottom: 10px;">
  				<img alt="" src="/resource/image/exam_image/${muluparse }/${parse}">
  				</div>
  			</c:forEach>
  		</div>
   		</div>
   	  </div> 	 
   	</div>
   	<jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
