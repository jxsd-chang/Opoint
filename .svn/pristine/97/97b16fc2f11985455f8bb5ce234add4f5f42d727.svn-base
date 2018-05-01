<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>选择老师提问</title>
    
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/select-teacher.css">
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/ask_teacher.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/textareaAuto.js"></script>
  	<script type="text/javascript">
  		$(function(){
  			$(".article").autoHeight();
  		});
  	</script>
  </head>
  
  <body onload="checkFile()">
  	<!-- 引头 -->
  	<jsp:include page="./top.jsp"></jsp:include>
  	
    <div class="select-body">
    <!-- 主体内容 -->
    	<div class="select-container">
    		<h1>向心怡的老师提问吧</h1>
    		<!-- 选择 -->
    		<div class="guide">
				<span>请选择：</span>
				<form style="display: inline;" action="${pageContext.request.contextPath }/TeacherController/sortTeaList.action" method="post">
				<input class="choose1" checked="checked" type="radio" name="opt" value="1" >根据回答数量排名
				<input class="choose2" type="radio" name="opt" value="2">根据心怡值排名
				<input type="submit" id="btn" class="guidebtn" value="确定"></input>
				<span style="color: red;">****</span>默认您关注的老师排序在前
			</form>
			</div>
			
			<!-- 老师列表 -->
			<div class="tea-list">
			<input type="hidden" id="sid" value="${student.stuId }">
			<c:forEach items="${attenVos }" var="vo">
				<div class="teacher">
					<c:if test="${vo.teacher.teaPic!=null}">
						<img  src="/resource/pic/tou_pic/${vo.teacher.teaPic }">
					</c:if>
					<c:if test="${vo.teacher.teaPic==null && vo.teacher.teaSex=='男'}">
						<img  src="${pageContext.request.contextPath }/images/boy.png">
					</c:if>
					<c:if test="${vo.teacher.teaPic==null && vo.teacher.teaSex=='女'}">
						<img  src="${pageContext.request.contextPath }/images/girl.png">
					</c:if>
					<h3>${vo.teacher.teaName }老师</h3>
					<div class="detail-teacher">
						<h4>${vo.teacher.teaName }老师<span class="guanzhu"></span></h4>
						<input class="flag" type="hidden" value="${vo.flag}">
						<div class="summary-teacher">
							<p class="jianjie">
							  <span style="font-weight:bold">简介：</span>
							  <span style="font-size:14px;line-height: 26px;">${vo.teacher.teaSummy }</span>
							</p>
							<c:if test="${vo.teacher.teaQucount ==null}">
								<p style="font-size:13px;"><span style="font-weight:bold;font-size:14px;">解答数:</span>暂时没有</p>
							</c:if>
							<c:if test="${vo.teacher.teaQucount !=null}">
								<p style="font-size:13px;"><span style="font-weight:bold;font-size:14px;">解答数:</span>${vo.teacher.teaQucount }</p>
							</c:if>
							<c:if test="${vo.teacher.teaAtten ==null}">
								<p style="font-size:13px;"><span style="font-weight:bold;font-size:14px;">心怡值：</span>暂时没有</p>
							</c:if>
							<c:if test="${vo.teacher.teaAtten != null}">
								<p style="font-size:13px;"><span style="font-weight:bold;font-size:14px;">心怡值：</span>${vo.teacher.teaAtten}</p>
							</c:if>
							<input type="hidden" value="${vo.teacher.teaId }">
							<input type="button" class="tiwen" value="向我提问吧">
						</div>
					</div>
				</div>
			</c:forEach>					
		    <div class="success" id="suc">成功关注</div>
		    <div class="success" id="del">已取消关注</div>
			<div style="clear: both;"></div>
			</div>
			
    	</div>
    	
    </div>
    <div style="clear: both;"></div>
    
    <!-- 提问弹窗 -->
    <div class="can"></div>
    <div class="ti">
       <span class="x"></span>
       <p class="tit">写下你的问题</p>
       <p class="tit2">描述精准的问题让老师更明白你的困惑</p>
     <form id="askform" action="" enctype="multipart/form-data" method="post">
       <div class="write">
         <p style="display: inline;">问题描述：</p>
         <p class="ti3">您正在向    <span style="font-size:14px;color: #f90;"></span>  提问</p>
         <textarea class="article" style="resize: none;"></textarea>
       </div>
        <input type="hidden" id="teaid" name="tid">
       <input type="hidden" name="askInfo" id="askInfo">
       <div>		
 			<input type="text" class="file_name"  readonly="readonly" placeholder="表述不清可上传附件" name="file_name" />
          	<a href="javascript:void(0);" class="input">
            	上传附件
            <input type="file" class="file" name="askfile">
          </a>
		</div>
      <div class="check-tijiao" style="height: 90px;padding: 10px;position: relative;">
	       <button class="ti4" id="subbtn">提交</button>
	       <span class="btnNot"></span>
       </div>
       <!-- <button class="ti4" id="subbtn">提交</button> -->
	</form>
    </div>
    <!-- 结尾 -->
    <jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
