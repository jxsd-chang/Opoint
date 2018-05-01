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
    
    <title>批改试卷页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">	
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript">
	/* 预期效果：老师已经完成批改的试卷，则该列变为绿色，若没有批改则为红色 */
		$(function() {
			$("#nav-menu").children("li").eq(4).addClass("actived");
			$("#paperList").find("tr:gt(0)").each(function() {
				var state = $(this).prev("input").val();
				if(state == 0){
					
				}else{
					$(this).addClass(" success");			
				}
			});
		});
	</script>
	
  </head>
  
  <body>
  <jsp:include page="./top.jsp"></jsp:include>
  	<div class="container">
  		<div class="col-sm-12" style="min-height: 470px">
  		    <h3 style="text-align: center;">学生考试试卷列表</h3>
			<table id="paperList" class="table table-bordered table-hover" style="text-align: center;" cellpadding="10" cellspacing="0">
				<tr  style="background:linear-gradient(#f0f0f0,#ddd)">
					<td>学生姓名</td>
					<td>考试科目</td>
					<td>考试时间</td>
					<td>试卷名称</td>
					<td class="paper-state">状态</td>
				</tr>
			<c:forEach items="${examItems }" var="exVo">
				<input type="hidden" value="${exVo.exam.exState}">
				<tr>
					<td>${exVo.student.stuName}</td>
					<td>${exVo.cou_name}</td>
					<td>${exVo.exam.exTime }</td>
					<td>${exVo.pa_name}</td>
					
					<c:if test="${exVo.exam.exState==0 }">
						<td class="paper-state">
							<a href="${pageContext.request.contextPath }/TeacherController/judgePaper.action?sid=${exVo.student.stuId }&exid=${exVo.exam.exId }&pid=${exVo.exam.paId}&optAns=${exVo.exam.exOptAns}&datiAns=${exVo.exam.exDatiAns}">前往批改</a>
						</td>
					</c:if>
					<c:if test="${exVo.exam.exState==1 }">
						<td class="paper-state">
							<a href="${pageContext.request.contextPath }/TeacherController/viewjudgeResult.action?sid=${exVo.student.stuId }&exid=${exVo.exam.exId }&pid=${exVo.exam.paId}&optAns=${exVo.exam.exOptAns}&datiAns=${exVo.exam.exDatiAns}">查阅批改</a>
						</td>
					</c:if>
				</tr>
			</c:forEach>
		</table>
		<c:if test="${examItems==null }">
            <div style="width:280px;margin:20px auto;">
		     <div style="margin:30px auto;width:60px;height:60px;">
              <img src="images/empty.png" width="60" height="60"/>
             </div>
             <p style="text-align: center;font-size:20px;"><span style="color:red">*  </span>还没有学生向你提交试卷哦！</p>
		    </div>
		</c:if>  
	 </div> 
	</div>
		<jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
