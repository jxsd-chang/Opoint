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
    <title>完成家庭作业</title>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/homework.css">
    <script type="text/javascript">
        $(function(){
        
        	$("#nav-menu").children("li").eq(4).addClass("actived");
        	$('.fu').on("click",function(event){
        		event.stopPropagation();
        		var halfdivheight=parseInt($(this).next('.fu2').height());
    			var halfdivwidth=parseInt($(this).next('.fu2').width());
        		if(halfdivheight>500){
        			halfdivheight=500;
            	}
            	if(halfdivwidth>1000){
            		halfdivwidth=1000;
            	}
            	
    		    var top = $(window).height()/2 - halfdivheight/2;
    		    var left = $(window).width()/2 - halfdivwidth/2;   
    		    var scrollTop = $(document).scrollTop();   
    		    var scrollLeft = $(document).scrollLeft(); 
    		    $(this).next('.fu2').css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).fadeIn(300);
            });
            $(document).bind("click",function(event){
        		var div=$('.fu2');
        		 if(!div.is(event.target) && div.has(event.target).length === 0){ 
        	           div.removeAttr('style').css("display","none");
        	        }
        	});
            
            $('.fu3').on("click",function(){
                var halfdivheight=parseInt($(this).height());
    			var halfdivwidth=parseInt($(this).width());
    			
            	if(halfdivheight>500){
        			halfdivheight=500;
            	}
            	if(halfdivwidth>1000){
            		halfdivwidth=1000;
            	}
    		    var top = $(window).height()/2 - halfdivheight/2;
    		    var left = $(window).width()/2 - halfdivwidth/2;  
    		    var scrollTop = $(document).scrollTop();   
    		    var scrollLeft = $(document).scrollLeft(); 
    		    $(this).css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).fadeIn(300);
            });
             $(document).bind("click",function(event){
        		 var div=$('.fu3');
        		 if(!div.is(event.target) && div.has(event.target).length === 0){ 
        	           div.removeAttr('style').css("max-width","300px");
        	        }
        	}); 
        }) ;  
    </script>
</head>
<body>
  <jsp:include page="./top.jsp"></jsp:include>
  
  <div class="contan">
      
      <div class="zy">   
        <!-- 原题目 -->
        <p class="title">原题目</p>
        <div class="zy2" style="font-size:13px;">
         <c:if test="${homeworkVo.publish.workPic == null }">
         	${homeworkVo.publish.workInfo}
         </c:if>
         <c:if test="${homeworkVo.publish.workPic != null }">
         	${homeworkVo.publish.workInfo}
         	 <img src="images/fujian.png" class="fu"/>
         	 <img alt="" src="/resource/pic/work_pic/${homeworkVo.publish.claId}/${homeworkVo.publish.workPic}" style="display: none;z-index:9;" class="fu2">
         </c:if>
          <p class="date">发布日期：${homeworkVo.publish.publishTime}</p>
        </div>
        <!-- 自己的解答 -->
        <p class="title">我的解答</p>
        <div class="zy2" style="font-size:13px;">
          <c:if test="${empty homeworkVo.homework.replyworkPic}">
         	 ${homeworkVo.homework.replyworkInfo}
         </c:if>
         <c:if test="${homeworkVo.homework.replyworkPic != null }">
         	 ${homeworkVo.homework.replyworkInfo}
	          <img src="images/fujian.png" class="fu"/>
	          <img alt="" src="/resource/pic/work_pic/${homeworkVo.homework.replyworkClaid}/${homeworkVo.homework.replyworkPic}" style="display: none;z-index:9;" class="fu2">
         </c:if>
          <p class="date">解答日期：${homeworkVo.homework.replyworkTime}</p>
        </div>
      </div>
      
      <!-- 教师的批改 -->
      <div class="hd">
        <p class="title">教师批改</p>
        <div class="zy2">
              ${homeworkVo.homework.solveworkInfo}
        <p class="date">批改日期： ${homeworkVo.homework.solveworkTime}</p>
        </div>
        <p class="title">附件信息</p>
        <div class="zy2">
        <c:if test="${empty homeworkVo.homework.solveworkPic}">
        	<img src="images/empty.png" style="margin-left:110px;"><br>
        	<span style="margin-left:142px;">无附件</span>
        </c:if>
         <c:if test="${homeworkVo.homework.solveworkPic != null}">
          <img alt="" class="fu3" style="max-width:300px;" src="/resource/pic/work_pic/reply/${homeworkVo.homework.solveworkPic}">
        </c:if>
        </div>
      </div>
  </div>
</body>
</html>