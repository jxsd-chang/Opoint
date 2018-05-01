<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>刷题页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/brush_title.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common/search.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/brush_title.css">
	 <script type="text/javascript" src="${pageContext.request.contextPath }/ckeditor/ckeditor.js"></script> 
	 <script type="text/javascript">
     var base = "${base}";
     $(function(){ 
    	  $("#nav-menu").children("li").eq(3).addClass("actived");
    	  $(".s1").hide();
    	  $(".service").css("bottom","200px");
    	  $(".service").css("height","60px");
    	  
    	  $(".re").each(function(){
    	  		$(this).click(function(){
    	  			$(this).next(".answer").toggle();
    	  		})
    	  });
    	  $(".changeStyle").click(function(){
    	  	  $("#knifodiv").toggle();
    	  	  $("#videodiv").toggle();
    	  });
    	  
    	  
    	  $('.cuoti-list li').each(function() {
    	    var xuhao=$(this).children('div').children('.xuhao');
    	    var d=parseInt(xuhao.html());
    	  	if(d>3){
    	  		xuhao.parent().css("background-color","#cec8c8");
    	  		xuhao.parent().next().css("color","#8d8989");
    	  	}
    	  });
    });
    function gaoShu1(id){
    	 $("#shang").attr("href","${pageContext.request.contextPath }/BrushTitleController/toBrushTitle.action?id="+id);
     }
     function gaoShu2(id){
    	 $("#xia").attr("href","${pageContext.request.contextPath }/BrushTitleController/toBrushTitle.action?id="+id);
     }
     $(function(){
    	 CKEDITOR.replace('commInfo');
     })
    </script>
  </head>
  <body>

     <jsp:include page="./top.jsp"></jsp:include>
     <!-- 科目类别 -->
   		 <div class="allitem" id="allitem">
        <p>在线刷题</p>
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
					              	<input type="hidden" class="kpId" value="${knowpoint.kpId}">
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
<!-- 以下是中间部分  显示刷题内容-->	
   <div style="width:800px;margin-left:370px;" id="center" >
	 		<!-- 搜索框 -->
	     <div class="ser" id="ser">
	         <img id="ssimg" src="${pageContext.request.contextPath}/images/search.png"/><span>搜索</span>
	         <input type="text" class="search" name="search" id="search" placeholder="  搜索相关知识点"> 
	     </div>
	 	<div class="shuati" id="shuati" style="width:100%;">
	 		<div class="brushItems" style="width: auto;height: auto;margin-left: 5px;margin-top: 20px;position: relative;">
                <c:forEach items="${bruList }" var="bruList">
			 			<img src="/resource/image/brushtitle_image/${bruList.brushTitle}">
						<button  class='btn buttons re'>回顾一下</button>
						<div class="answer" style='display: none;'>
						<div style='width:90%;background:red;height:2px;margin:10px;'></div>
							<img src="/resource/image/brushtitle_parse_image/${bruList.brushParse }">
						<div style='width:90%;background:red;height:2px;margin:10px;'></div>
						</div>
				</c:forEach>
			</div>	 			
	 	</div>
   </div>
   <div class="success" id="suc">收藏成功</div>
<!-- 右边错题排行部分 -->
	<div class="cuoti">
	 	<div class="h4" style="background-color: orange;color: white;text-align: center;height: 50px;border-radius: 9px; line-height: 48px;margin: 0;">
	 		<img style="display: inline-block;margin-top: -5px;" alt="" src="${pageContext.request.contextPath }/images/paihangbang.png">
	 		<b>错题排行榜 </b><span class="changeStyle"><img style="cursor: pointer;margin-top: -3px;margin-left: 10px;" src="${pageContext.request.contextPath }/images/f5.png"></span>
	 	</div>
	 	<div style="width: auto;height: auto; margin-top: 20px;margin-left: 20px">
	 	<div id="knifodiv" >
			<ul class="cuoti-list">
				<c:if test="${empty knifoTitleList }">
					<li>
						<div style="text-align: center;padding: 20px;margin-top: 120px;">
							<img src="${pageContext.request.contextPath }/images/empty.png">
							<p style="color: gray;text-align: center;">暂无排行榜，前往考试，系统将为你生成专属的排行榜哦</p>
						</div>
					</li>
				</c:if>
				<c:forEach items="${knifoTitleList }" var="title" begin="0" end="9" varStatus="tt">
				<li>
					<div style="width: 25px;height: 25px;background-color: #f90;display: inline-block;border-radius: 5px;text-align: center;">
						<span class="xuhao" style="color: white;font-weight: bold;">${tt.count }</span>
					</div>
					<p><a href="${pageContext.request.contextPath }/KninfoController/tjKnifo.action?knifoid=${title.kninfoId }">${title.kninfoTitle }</a></p>
				</li>
				</c:forEach>
			</ul>
		</div>
		<div id="videodiv" style="display: none">
			<ul class="cuoti-list">
				<c:if test="${empty knifoTitleList }">
					<li>
						<div style="text-align: center;padding: 20px;margin-top: 120px;">
							<img src="${pageContext.request.contextPath }/images/empty.png">
							<p style="color: gray;text-align: center;">暂无排行榜，前往考试，系统将为你生成专属的排行榜哦</p>
						</div>
					</li>
				</c:if>
				<c:forEach items="${videoitemList }" var="title" begin="0" end="9" varStatus="tt">
				<li>
					<div style="width: 25px;height: 25px;background-color: #f90;display: inline-block;border-radius: 5px;text-align: center;">
						<span class="xuhao" style="color: white;font-weight: bold;">${tt.count }</span>
					</div>
					<p><a href="${pageContext.request.contextPath }/VideoController/tjVideo.action?vid=${title.vioId }">${title.vioItem }</a></p>
				</li>
				</c:forEach>
			</ul>
		</div>
		</div>
			 	 			
	</div> 
	
<!-- 右边笔记部分 -->	
     <input type="hidden" id="id2">
     <input type="hidden" value="${student}" id="stu">
     <input type="hidden" value="${teacher}" id="tea">
     <input type="hidden" value="${student.stuId }" id="stuid">
	 <div class="rem" id="rem">
	    <div class="tab">
           <span id="tab1">个人笔记</span>
           <span class="tab1" id="tab2">随手一记</span>
        </div>
        <!-- 显示笔记部分 -->
       	<div class="com-show" id="show">
       		<ul id="ul">
       		</ul>
       	</div>
        <!-- 填写笔记部分 -->
        <div class="com-write" id="write">
				<textarea id="commInfo" class="ckeditor"  rows="5" cols="30" 
					placeholder="每次记录一点点"></textarea>
				<input type="button"  class="submit" id="su_btn" value="提交">
        </div>
        <div class="close" id="close">
          <div class="rightImg">
             <img  src="${pageContext.request.contextPath }/images/chevron-thin-right.png">
          </div>
        </div>
	</div>
	<div class="rem2" id="rem2">
          <span>笔记区</span>
    </div>
	
  </body>
</html>
