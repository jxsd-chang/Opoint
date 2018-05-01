<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="base" value="${pageContext.request.contextPath }"></c:set>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查看知识点</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/showKnowPoint.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/kp.js" charset="UTF-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/common/search.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/ckeditor/ckeditor.js"></script>
    <script type="text/javascript">
     var base = "${base}";
     var stuName = "${student.stuName }";
     $(function(){ 
    	  $("#nav-menu").children("li").eq(2).addClass("actived");
    	  $(".s1").hide();
    	  $(".service").css("bottom","200px");
    	  $(".service").css("height","60px");
    })
    function gaoShu1(id){
    	 $("#shang").attr("href","${pageContext.request.contextPath }/KnowPointController/toKnowPointView.action?id="+id);
     }
     function gaoShu2(id){
    	 $("#xia").attr("href","${pageContext.request.contextPath }/KnowPointController/toKnowPointView.action?id="+id);
     }
     $(function(){
    	 CKEDITOR.replace('commInfo');
     })
   
    </script>
  </head> 	
  <body style="font-family:'微软雅黑'">
  
  <jsp:include page="./top.jsp"></jsp:include>
     <div class="allitem" id="allitem">
        <p>知识点学习</p>
        <ul class="mathtab">
           <li><a href="" onclick='gaoShu1(1)' id="shang">高等数学（上）</a></li>
           <li style="margin-left:3px;"><a href="" onclick='gaoShu2(2)' id="xia">高等数学（下）</a></li>
        </ul>
   		   <div class="firstitem" id="firstitem">
                    <ul>
	                   <c:forEach items="${courseItemsList}" var="courseItem" varStatus="t">
			             <li class="items2">
			                 <span class="icon"><img src="${pageContext.request.contextPath}/images/plus.png"/></span>
			                 <span class="icon2"><img src="${pageContext.request.contextPath}/images/minus.png"/></span>
			                 <c:if test="${courseItem.litKpList[0].couId==1}">
			                 		第${t.count}章${courseItem.bigTag}
			                 </c:if>
			                 <c:if test="${courseItem.litKpList[0].couId==2}">
			                 		第${t.count+6 }章${courseItem.bigTag}
			                 </c:if>
			             </li>
			                <ul class="items-ul">
			                   <c:forEach items="${courseItem.litKpList}" var="knowpoint" varStatus="tt">
					              <li class="items">
					               	 <input type="hidden"  value="${knowpoint.kpId}">
						         	 <span>${knowpoint.kpContent}</span>
					              </li>
			                   </c:forEach>
			                </ul>	
	                   </c:forEach>
	                </ul>                          
   		   </div>
   		   <div class="mohu">
   		   		
   		   </div>
     </div>
     <!-- 中间部分 -->
     
     <!-- 搜索框 -->
     <div class="ser" id="ser">
         <img id="ssimg" src="${pageContext.request.contextPath}/images/search.png"/><span>搜索</span>
         <input type="text" class="search" name="search" id="search" placeholder="  搜索相关知识点"> 
     </div>
     
     
     <div class="centerItem" id="centerItem">
           <!--   这里显示所有知识点的pic -->
        <c:forEach items="${knifoList }" var="knifo"> 
	        <div style='margin-top:20px;margin-bottom:40px;'>
				<div style='height:50px;width:100%;'>
					<img src='images/kp_logo.png' style='float:left;'/>
					<span class='tit'>${knifo.kninfoTitle }</span>
				</div>
			<hr size='3' class='h'><br><br>
			<img src='/resource/image/knowpoint_image/${knifo.kninfoContent }'><br>
			<input type='hidden' class='schidden' value="${knifo.kpId }"/>
			<input type='hidden' class='kninfoid' value="${knifo.kninfoId }">
			<div class='CommItems'>
			    <c:if test="${teacher!=null}">
			       <div class='collect_sc' style="display: none;" id='sc'>收藏</div>
			    </c:if>
			    <c:if test="${teacher==null}">
			       <div class='collect_sc' id='sc'>收藏</div>
			    </c:if>
				<div class='collect'  style='float:right;margin-right: 90px;'>查看评论</div>
			</div>
			</div>
		</c:forEach>  			
     </div>
     <div class="success2" id="succ2">收藏成功</div>
    
     <input type="hidden" id="id2">
     <!-- 右边部分 -->
     <input type="hidden" value="${student}" id="stu">
     <input type="hidden" value="${teacher}" id="tea">
     <input type="hidden" value="${student.stuId }" id="stuid" >
     <div class="comment" id="comment">
        <div class="tab">
           <span id="tab1">评论区</span>
           <span class="tab1" id="tab2">写评论</span>
        </div>
        <!-- 这里使用输出所有相关评论 -->
        <div id="com">
          	<!-- 这里是所有评论 -->
          	<div class="info-img">
          		<img src="${pageContext.request.contextPath}/images/for_left.png">
          		<p class="info-word1">点击左边"查看评论"按钮</p>
          		<p class="info-word2">与众多学子发表自己独特的看法</p>
          	</div>
        </div>
        <!-- 填写部分 -->
        <div class="com-write" id="write">
				<textarea  id="commInfo" class="ckeditor"  rows="5" cols="30" 
					placeholder="您的评论对其他同学都是很重要的参考" name="ck"></textarea>
				<input type="button"  class="submit" id="su_btn" value="提交">
        </div>
     </div>
     <div class="comment2" id="comment2">
          <span>评论区</span>
     </div>
 
  </body>
</html>
