<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/person-top.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/textareaAuto.js"></script>
</head>
<body>
  <div class="contant">
      <div class="contant-in">
         <div class="picture">
            <div class="pic">
                <c:if test="${teacher.teaPic==null }">
           	 <img src="${pageContext.request.contextPath }/images/no_title.jpg" width="100" height="100" style="margin-top: 5px;border-radius:50%;" />
           </c:if>
           
            <c:if test="${teacher.teaPic!=null }">
           	 <img src="/resource/pic/tou_pic/${teacher.teaPic }" width="100" height="100" style="margin-top: 5px;border-radius:50%;" />
           </c:if>
            </div>
            <div class="stuName">
                <span class="name">${teacher.teaName}</span>&nbsp;&nbsp;老师
                <p style="margin-top:10px;">
                <span style="color:#fff;">${teacher.teaSex}</span><span style="margin-left:20px;">|</span>
                <span class="change" id="change">完善信息</span></p>
            </div>
         </div>
         <div class="achievement">
			<ul>
				<c:if test="${empty claCount}">
					<li><span>0</span><br>班级数</li>
				</c:if>
			   <c:if test="${!empty claCount}">
					<li><span>${claCount }</span><br>班级数</li>
				</c:if>
				<c:if test="${empty sumCount}">
					<li><span>0</span><br>学生人数</li>
				</c:if>
				<c:if test="${!empty sumCount}">
			        <li><span>${sumCount }</span><br>学生人数</li>
			    </c:if>
			    <c:if test="${empty teacher.teaQucount}">
					<li><span>0</span><br>解答数</li>
				</c:if>
				<c:if test="${!empty teacher.teaQucount}">
			        <li><span>${teacher.teaQucount }</span><br>解答数</li>
			    </c:if>
			    <c:if test="${empty teacher.teaAtten}">
					<li><span>0</span><br>心怡值</li>
				</c:if>
				<c:if test="${!empty teacher.teaAtten }">
			        <li><span>${teacher.teaAtten }</span><br>心怡值</li>
			    </c:if>
			</ul>
         </div>
      </div>
   </div>
   
    <!-- 控制完善信息弹窗弹出、关闭 -->
     <script>
	    $(function(){
			$("#change").click(function () {
			  var halfdivheight=$(".message-config").height()/2;
			  var halfdivwidth=$(".message-config").width()/2;
		      var top = document.body.clientHeight/2 - halfdivheight;
		      var left = $(window).width()/2 - halfdivwidth;   
		      var scrollTop = $(document).scrollTop();   
		      var scrollLeft = $(document).scrollLeft();   
		      $(".can").css( {position: 'absolute',top:0,left:0, width: $(document).width()
	          , height: $(document).height()}).show();
		      $(".message-config").css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).show(500);
            });
			
			$("#tet").autoHeight();
			
			$(".in-line").find(".infoInput").each(function(){
		        $(this).focus(function(){
			    $(this).css("border","1px solid #09C");
			    });
		    $(this).blur(function(){
			    $(this).css("border","1px solid #666");
			    });
		    });
			$('#phone').keyup(function(){
				var phone=$(this).val();
				var reg=/^[1][3,4,5,7,8][0-9]{9}$/;
				if(reg.test(phone)){
					$('.cc').hide();
				}
				else{
					$('.cc').show();
				}
			});
			 var s=$("#sex").val();
	         if(s.indexOf("男")>=0){
		        $("#nan").attr("checked","checked");
	           }
	         else if(s.indexOf("女")>=0){
		            $("#nv").attr("checked","checked");
	                }
	           else if(s==""){}
			
			$("#close").click(function () { 
		      $(".can").fadeOut("slow");
		      $(".message-config").fadeOut("slow");
            });
			
			$('.submit,.nn').hover(function(){
				if($('.cc').is(":visible")){
					$('.nn').show();
				}
				else{
					$('.nn').hide();
				}
			});
		});
   </script>
        <!-- 完善信息弹窗 -->
      <div class="can"></div>
      <div class="message-config">
        <div class="message-config-head">
		   <span>完善信息</span>
		   <img src="${pageContext.request.contextPath }/images/wrong.gif" width="23" height="20"  id="close"/></div>
		   <div class="in-line">
             <form action="${pageContext.request.contextPath }/TeacherController/updateTea.action" method="post">
             <input type="hidden" id="teaid" name="teaId" value="${teacher.teaId }">
              <input type="hidden"  name="teaPic" value="${teacher.teaPic }">
              <ul>
                <li>
                   <p>姓名：</p>
                   <input type="text" class="infoInput" maxlength="10" name="teaName" value="${teacher.teaName }" style="width:170px;">
                </li>
                <li style="position: relative;">
                   <p>账号：</p>
                   <input type="text" id="phone" class="infoInput" maxlength="11" name="teaTel" value="${teacher.teaTel }" style="width:170px;">
                   <span class="cc">请输入正确格式手机号!</span>
                </li>
                <li style="height:40px;">
                   <p>性别：</p><input type="hidden" id="sex" value="${teacher.teaSex }">
                   <input type="radio" style="margin-left:10px;margin-top: 15px;" name="teaSex" value='男' id="nan" />&nbsp;&nbsp;男&nbsp;&nbsp;<input type="radio" name="teaSex" value='女' id="nv"/>&nbsp;&nbsp;女
                </li>
                <li style="min-height:140px;">
                   <p style="margin-bottom: 10px;">个人简介：</p>
                   <textarea id="tet" name="teaSummy" style="width:260px;min-height:100px;max-height:250px;margin-left:50px;resize: none;"></textarea>
                </li>
              </ul>
              <input type="submit" class="submit" value="提交保存">
              <div class="nn"></div>
             </form>
           </div>
      </div>
</body>
</html>