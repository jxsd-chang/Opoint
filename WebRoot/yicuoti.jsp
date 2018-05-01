<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    
    <div class="container" style="min-height: 500px;background:#ffffff;padding: 20px;">
    	<h2 style="text-align: center;">易错题</h2>

<!-- foreach开始 -->    	
    	<div class="row"  style="margin: 20px 0">
    		<div class="col-sm-8 col-sm-offset-2" style="min-height: 300px;">
				<img class="img-responsive" alt="" src="${pageContext.request.contextPath }/images/test-yicuo.png">
				<div style="border: 1px dashed #f90;">
					<p style="display: inline-block;margin-top: 5px;"><span style="color: #f90;">【温馨提示】</span>：已有<span style="color: red">8888</span>人做错此题,仔细点哦！</p>
					<input style="float: right;" type="button" class="btn showAnswer" value="显示详解">
				</div>
		<!-- 答案显示区 -->
				<div class="daan" style="min-height: 300px;display: none;border: 1px solid #f90;">
					<div>
						<p><span style="color: #f90;">【点通帮助】</span>此题涉及以下知识点：</p>
						<div style="padding-left: 2em;">
							<p><span>1.</span>函数的相关知识</p>
							<p><span>1.</span>函数的相关知识</p>
							<p><span>1.</span>函数的相关知识</p>
						</div>
						<p><span style="color: #f90;">【详细答案如下】</span>：</p>
					</div>
					<img class="img-responsive" alt="" src="${pageContext.request.contextPath }/images/test.png">
				</div>
			</div>
    	</div>
<!-- foreach结束 -->  
  	
    	<!-- 分页开始 -->
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<input class="col-sm-2 btn btn-success" type="button" value="首页">
				<input class="col-sm-2 col-sm-offset-1 btn btn-success" type="button" value="上一页">
				<input class="col-sm-2 col-sm-offset-1 btn btn-success" type="button" value="下一页">
				<input class="col-sm-2 col-sm-offset-1 btn btn-success" type="button" value="尾页">
			</div>
		</div>
		
		
    </div>
    
    <jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
