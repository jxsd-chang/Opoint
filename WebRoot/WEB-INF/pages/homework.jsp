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
    <title>家庭作业</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/homework.css">
    <script type="text/javascript">
        $(function(){
        	$("#nav-menu").children("li").eq(4).addClass("actived");
        	$('.zuoye li').on("click",function(){
        		$('.zuoye li').removeClass('aa').eq($(this).index()).addClass('aa');
        		$('.listdiv').hide().eq($(this).index()).show();
        	});
        }) ;  
    </script>
</head>
<body>

  <jsp:include page="./top.jsp"></jsp:include>
  
  <div class="all">
    <p class="tit">班级作业</p>
    
    <ul class="zuoye">
      <li class="aa">查看最新作业</li><li class="" style="margin-left:40px;">查看作业批改</li>
    </ul>
    
    <div class="listdiv" id="listdiv1">
    <c:if test="${empty pubList}">
    	<div style="text-align: center;color: gray;">
	    	<img alt="" src="${pageContext.request.contextPath }/images/empty.png">
	    	<p><span style="color: red">*</span>额，老师尚未布置作业，快去预习下一章节练习吧</p>
    	</div>
    </c:if>
    <c:forEach items="${pubList }" var="pub">
       <div class="homework">
         <div class="l2">
          <p class="leftitem">
             ${pub.publish.workTitle }
          </p>
          <div class="ll">
            <span class="l3 l4">${pub.claName }</span><span class="l3">${pub.teaName }</span>
          </div>
         </div>
          <div class="da">
            <img src="images/pen.png" width="30" height="30">
            <a href="${pageContext.request.contextPath }/StudentController/dohomework.action?teaId=${pub.publish.teaId}&pubId=${pub.publish.publishId}&claid=${pub.publish.claId }&pubInfo=${pub.publish.workInfo}&pubpic=${pub.publish.workPic}&pubTime=${pub.publish.publishTime}">去作答</a>
          </div>
       </div>
       </c:forEach>
       <c:if test="${pubList ==null}">
         <div style="width:280px;margin:20px auto;">
		     <div style="margin:30px auto;width:60px;height:60px;">
              <img src="images/empty.png" width="60" height="60"/>
             </div>
             <p style="text-align: center;font-size:20px;"><span style="color:red">*  </span>还没有最新的家庭作业！</p>
		 </div>
       </c:if>
    </div>
    
    <!-- 查看作业批改 -->
    <div class="listdiv" id="listdiv2" style="display: none;">
    <c:forEach items="${workVoList }" var="homeVo">
    	<c:if test="${homeVo.homework.solveworkState == 1 }">
	       <div class="homework" style="width:650px;">
	       <div class="l2">
	          <p class="leftitem">
	             ${homeVo.publish.workTitle }
	          </p>
	          <div class="ll">
                 <span class="l3 l4">${homeVo.claName }</span><span class="l3">${homeVo.teaName }</span>
               </div>
	       </div>
	          <div class="da" style="width:115px;">
	             <span class="suc">已批改</span>
	             <a href="${pageContext.request.contextPath }/StudentController/historyHomework.action?replyworkId=${homeVo.homework.replyworkId}">去查看</a>
	          </div>
	       </div>
       </c:if>
       <c:if test="${homeVo.homework.solveworkState != 1 }">
	       <div class="homework" style="width:650px;">
	          <p class="leftitem" >
	             ${homeVo.publish.workTitle }
	          </p>
	          <div class="ll">
                 <span class="l3 l4">${homeVo.claName }</span><span class="l3">${homeVo.teaName }</span>
               </div>
	          <div class="da" style="width:115px;">
	             <span class="no">未批改</span>
	          </div>
	       </div>
       </c:if>
     </c:forEach>
    </div>
  </div>
  
  <jsp:include page="./foot.jsp"></jsp:include>
</body>
</html>