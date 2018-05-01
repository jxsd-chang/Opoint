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
    
    <title>解决学生提问</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/textareaAuto.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/person-right-tea.css"/>
    <script type="text/javascript">
	  $(function(){
		  $("#nav-menu").children("li").eq(4).addClass("actived");
			//点击回答提问时回答框出现
			$('.text').autoHeight();
			$(".ans").each(function(){
				$(this).click(function(){
					if($(this).parent().parent().prev(".text").css("opacity")=="1"){
						$(this).parent().parent().prev(".text").css("opacity","0");
						$(this).next('.tijiao').hide();
					}
					else{
						$(this).parent().parent().prev(".text").css("opacity","1");
						$(this).next('.tijiao').show();
					}
			   });
	        });
			//点击提交解答时回答框隐藏
			$(".tijiao").each(function(){
				$(this).click(function(){
				 $.ajax({
				 	async: false,
					url:"TeacherController/tijiaoAns.action",
					data:{askid:$(this).parent().next("input").val(),solveinfo:$(this).parent().parent().prev(".text").val()},
					success:function(data){
						if(data=="ok"){
				  			alert("提交成功")
				  	    }
					}
				 })
				  $(this).parent().parent().prev(".text").css("opacity","0");
				  $(this).hide();
			   });
	        });
			
			//点击附件按钮
			$('.fujian').each(function(){
				$(this).on("click",function(event){
					event.stopPropagation();
					var img=$(this).children('.fu');
					var halfdivheight=img.height()/2;
					var halfdivwidth=img.width()/2;
					var top = $(window).height()/2 - halfdivheight;
					var left = $(window).width()/2 - halfdivwidth;   
					var scrollTop = $(document).scrollTop();   
					var scrollLeft = $(document).scrollLeft();   
					img.css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).show(500);
				});
			});
			//点击空白处附件图片消失
			$(document).bind("click",function(event){
				var img = $('.fu');  // 设置目标区域
		        if(!img.is(event.target) && img.has(event.target).length === 0){ 
		           img.fadeOut(300);
		        }
			});
			
	  });
	</script>
  </head>
  <body>
    <jsp:include page="./top.jsp"></jsp:include>
    
   <div style="width:100%;background:#f0f0f0;">
   <div class="contain-right" style="width:1100px;">
    <p style="text-align: center;font-size:20px;font-weight:bold;letter-spacing: 3px;">解答学生提问</p>
    <!-- 我的消息功能 -->
    <div id="myInfo">
       <c:if test="${msg1 !=null }">
          <div class="noquestion">${msg1 }<br><br>
            <p class="no2">完善个人信息，让更多学生认识你！</p>
            <img src="${pageContext.request.contextPath}/images/sorry.jpg"/>
          </div>
        </c:if>
       <c:forEach items="${askvoList }"  var="askvo">
         <div>
           <textarea class="text" style="resize: none;max-height:250px;"></textarea>
           <div style="float:left;">
	       <div class="question">
	         <p class="bb"><span>学生名：${askvo.stuName }</span>
	         <!--附件按钮有附件则出现  -->
	         <span class="fujian">
	          <c:if test="${askvo.connStuTea.askPic != null }">
	          	 <img src="${pageContext.request.contextPath}/images/fujian.png" style="vertical-align: middle;"/>有附件>>
	          	 <img src="/resource/pic/ask_pic/${askvo.connStuTea.teaId }/${askvo.connStuTea.askPic}" style="display: none;" class="fu"/>
	          </c:if>
	         </span></p>
	         <p class="cc">${askvo.connStuTea.askInfo }
	         <div style="font-size: 12px;text-align: right;">提问时间：${askvo.connStuTea.askTime }</div>
	         </p>
	       </div>
	       <div style="width:100%;height:40px;">
	         <span class="ans" style="margin-right: 10%;">回答提问</span>
	         <span class="tijiao" style="margin-right: 50%;display: none;">提交解答</span>
	       </div>
	       <input type="hidden" value="${askvo.connStuTea.askId }">
	       </div>
	       <div style="clear:both;"></div>
	     </div>
       </c:forEach>

    </div>
    </div><div style="clear:both;"></div>
    </div>
  </body>
</html>
<!-- askList -->