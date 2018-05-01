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
    
    <title>用户答案显示</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
	<script type="text/javascript">
  window.onload=function(){
	  document.getElementById("nav-menu").getElementsByTagName("li")[4].setAttribute("class","navLi actived");
  }
</script>
	<style type="text/css">
		/* div{
			border: 1px solid black;
		} */
	</style>
  </head>
  
  <body>
  <jsp:include page="./top.jsp"></jsp:include><!-- 引入头部 -->
   	<div class="container" style="min-height: 500px;">
   		<div class="row">
   			<div class="col-sm-12 text-center h2">
   				${paper.paName }试卷&nbsp;&nbsp;我的答案
   			</div>
   			
   			
  <!--选择题 -->	
  			<div class="col-sm-10 col-sm-offset-1 text-center h3">
  				<table style="text-align: center;" id="keguanti" class="fenxi-table table table-hover" border="1px" cellpadding="10" cellspacing="0" align="center">
						<caption style="font-size: 24px;padding: 5px;text-align: center;">我的客观题答案</caption>
						<tr class="info">
							<td>题号</td>
							<c:forEach items="${xuanze }" var="xz" varStatus="tt">
		   						<td>${tt.count }</td>
		   					</c:forEach>
						</tr>
						<tr>
							<td>我的答案</td>
							<c:forEach items="${xuanze }" var="xz" varStatus="tt">
		   						<td>${xz }</td>
		   					</c:forEach>
						</tr>
				</table>
  				
   			</div>
   			<div class="col-sm-10 col-sm-offset-1 text-center h3">
   				<h3 style="color: #777777">我的主观题答案</h3>
   				<c:if test="${datiImg==null }">
   					<h4 style="color: #777777">(此试卷没有上传附件)</h4>
   				</c:if>
   				<c:if test="${datiImg!=null }">
   					<c:forEach items="${datiImg }" var="img">
   					<img src="/resource/pic/exam_pic/${paper.paId }/${img}">
   				</c:forEach>
   				</c:if>
   			</div>
   		</div>
   	</div>
   	<jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>