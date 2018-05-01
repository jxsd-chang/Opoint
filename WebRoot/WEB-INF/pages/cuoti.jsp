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
    
    <title>易错题</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/cuoti.js"></script>
	<script type="text/javascript">
		 $(function(){
			  $("#nav-menu").children("li").eq(4).addClass("actived");
			  $(".showAnswer").each(function(){
			  	/* 入出样式 */
			  	$(this).hover(function(){
				  	$(this).addClass("btn-success btn-responsive");
				  },function(){
				  	$(this).removeClass("btn-success btn-responsive");
				  });
				  /* 显示答案 */
				 $(this).click(function() {
				 	$(this).parent().next(".daan").toggle();
				 	/* 父亲的兄弟分两种，父亲的大哥用prev，父亲的弟弟用next */
				 });
			  });
	  	 });
	</script>
  </head>
  
  <body style="background:#f0f0f0">
    <jsp:include page="./top.jsp"></jsp:include>
    
    <div class="container" id="container" style="min-height: 500px;background:#ffffff;padding: 20px;">
    	<h2 style="text-align: center;">易错题</h2>
    	
    	<c:if test="${map ==null}">
    	 <div class="col-md-4 col-md-offset-4" style="margin-top:20px;">
    	   <div style="margin:20px auto;width:60px;height:60px;">
    	        <img  src="images/empty.png" style="width:60px;height:60px;"/>
    	   </div>
    	   <p style="text-align: center;font-size:20px;color: gray">还没有易错题哦~<br>先去考试测试一下吧！</p>
    	 </div>
    	</c:if>

<!-- foreach开始 -->  
<!-- 测试第一页 --><!-- Map<Map<AnyVo,List<AnyVo>>,Brush> map -->
<c:forEach items="${map }" var="entry">
    	<div class="row dd"  style="margin: 20px 0;display: none">
    		<div class="col-sm-8 col-sm-offset-2" style="min-height: 300px;">
				<img class="img-responsive" alt="" src="/resource/image/brushtitle_image/${entry.value.brushTitle }">
				<div style="border: 1px dashed #f90;">
					<input style="float: right;" type="button" class="btn showAnswer" value="显示详解">
				</div>
		<!-- 答案显示区 -->
				<div class="daan" style="min-height: 300px;display: none;border: 1px solid #f90;">
					<div>
						<p><span style="color: #f90;">【点通帮助】</span>此题涉及以下知识点：</p>
						<div style="padding-left: 2em;">
							<c:forEach items="${entry.key}" var="map" varStatus="tt">
								<p><span style="color: orange">${tt.count }.</span><a href="KninfoController/tjKnifo.action?knifoid=${map.key.id}">${map.key.title }</a></p>
							</c:forEach>
						</div>
						
						<p><span style="color: #f90;">【点通帮助】</span>此题相似知识点：</p>
						<div style="padding-left: 2em;">
							<c:forEach items="${entry.key }" var="map" varStatus="tt">
								<c:forEach items="${map.value }" var="an">
								<p><span style="color: orange">${tt.count }.</span><span><a href="${pageContext.request.contextPath }/BrushTitleController/tjBrushExam.action?brushId=${an.id}">${an.title }</a></span></p>
								</c:forEach>
							</c:forEach>
						</div>
						
						<p><span style="color: #f90;">【详细答案如下】</span>：</p>
					</div>
					<img class="img-responsive" alt="" src="/resource/image/brushtitle_parse_image/${entry.value.brushParse }">
				</div>
			</div>
    	</div>
  </c:forEach>
<!-- foreach结束 -->  
    	<!-- 分页开始 -->
    	<c:if test="${map!=null }">
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<input id="before" class="col-sm-2 col-sm-offset-1 btn btn-success" type="button" value="上一页">
				<input id="next" class="col-sm-2 col-sm-offset-6 btn btn-success" type="button" value="下一页">
			</div>
		</div>
		</c:if>
    </div>
    <jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
