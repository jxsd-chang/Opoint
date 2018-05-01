<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:set var="base" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>挑战竞赛题</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript">
		var base = "${base}";
$(function(){
			  $("#nav-menu").children("li").eq(4).addClass("actived");
			  /* 上一页 */
			  $("#before").click(function(){
			  	var numInfo = $("#page-num-info").val();
			  	var url = base+"/CompetitionController/yibuCompetionPage.action";
		  		var needNum = parseInt(numInfo)-1;//上一页页码
			  	if(numInfo == 1){
			  		alert("已经是第一页了");
			  	}else{
			  		$.ajax({
			  			async: false,
			  			url:url,
			  			data:{"pageNumber":needNum,"pageSize":3},
			  			success:function(data){
			  				var content = "";
				  			for(var i=0;i<data.length;i++){
				  				content += '<div class="row"><div class="col-sm-8 col-sm-offset-2" >'+
						                   '<img class="img-responsive" alt="" src="/resource/image/competion_image/'+data[i].compTitle+'"></div>'+
					                       '<input style="margin-top: 2%" type="button" class="btn showAnswer"  value="显示详解"></div>'+
			                               	'<div class="row" class="daan" style="display: none;">'+
				                         	'<div class="col-sm-8 col-sm-offset-2">'+
					                     	'<img class="img-responsive" alt="" src="/resource/image/competion_parse_image/'+data[i].compParse+'"></div></div>'
				  			}
					  			$("#comItems").html(content);
					  			$("#page-num-info").attr("value",needNum);
				  			}
			  		})
			  		fuck();
			  	}
});
			  /* 下一页 */
			  $("#next").click(function(){
			  	var numInfo = $("#page-num-info").val();//当前页码
			  	var needNum = parseInt(numInfo)+1;//下一页页码
			  	var url = base+"/CompetitionController/yibuCompetionPage.action";
			  	
			  	if(numInfo == $("#page-num-all").val()){
			  		alert("已经是最后一页了");
			  	}else{
			  	$.ajax({
			  			async: false,
			  			url:url,
			  			data:{"pageNumber":needNum,"pageSize":3},
			  			success:function(data){
			  				var content = "";
				  			for(var i=0;i<data.length;i++){
				  				content += '<div class="row"><div class="col-sm-8 col-sm-offset-2">'+
						                   '<img class="img-responsive" alt="" src="/resource/image/competion_image/'+data[i].compTitle+'"></div>'+
					                       '<input style="margin-top: 2%" type="button" class="btn showAnswer"  value="显示详解"></div>'+
			                               	'<div class="row" class="daan" style="display: none;">'+
				                         	'<div class="col-sm-8 col-sm-offset-2">'+
					                     	'<img class="img-responsive" alt="" src="/resource/image/competion_parse_image/'+data[i].compParse+'"></div></div>'
				  			}
					  			$("#comItems").html(content);
					  			$("#page-num-info").attr("value",needNum);
				  			}
			  		})	
			  		fuck();
			  	}
			  });
			  fuck();
    function  fuck(){
   		  $(".showAnswer").each(function(){
			    /* 入出样式 */
			  	$(this).hover(function(){
			  	  $(this).addClass("btn-success btn-responsive");
					  },function(){
					  	$(this).removeClass("btn-success btn-responsive");
					  });
			  	
			  	/* 点击显示/隐藏 */
			  	$(this).click(function(){
			  		$(this).parent().next(".row").toggle();
			  	});
    			});
    }
	 		
});
</script>

</head>
<body style="background:#f0f0f0">
  <jsp:include page="./top.jsp"></jsp:include>
	
	<div class="container" style="min-height: 500px;background:#ffffff;padding: 20px;">
<!-- 试题 -->
		<p style="display: none;">题号<span id="num">1</span></p>
		<h2 style="text-align: center;">挑战竞赛题</h2>
	<div id="comItems">
		<c:forEach items="${list }" var="item">
			<div class="row">
				<div class="col-sm-8 col-sm-offset-2" style="min-height: 100px;">
					<img class="img-responsive" alt="" src="/resource/image/competion_image/${item.compTitle }">
				</div>
				<input style="margin-top: 2%" type="button" class="btn showAnswer"  value="显示详解">
			</div>
			<!-- 答案显示区 -->
			<div class="row" class="daan" style="display: none;">
				<div class="col-sm-8 col-sm-offset-2" style="min-height: 100px;">
					<img class="img-responsive" alt="" src="/resource/image/competion_parse_image/${item.compParse }">
				</div>
			</div>
		</c:forEach>
 </div>
		
<!-- 按钮 -->
		<div class="row" style="margin: 20px 0;">
			<div class="col-sm-8 col-sm-offset-2">
				<input id="page-num-info" type="button" style="display: none;" value="${pageNumber+1 }"><!-- 当前页码 -->
				<input id="page-num-all" type="button" style="display: none;" value="${page }"><!-- 总页码 -->
				<div class="col-sm-2">
					<input id="before" type="button" class="btn btn-success btn-responsive" value="上一题">
				</div>
				<div class="col-sm-2" style="float: right;">
					<input id="next" type="button" class="btn btn-success btn-responsive" value="下一题">
				</div>
			</div>
		</div>
	</div>
  <jsp:include page="./foot.jsp"></jsp:include>
</body>
</html>