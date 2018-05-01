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
</head>
<body>

  <div class="contant">
      <div class="contant-in">
         <div class="picture">
            <div class="pic">
           <c:if test="${student.stuPic==null }">
           	 <img src="${pageContext.request.contextPath }/images/no_title.jpg" width="100" height="100" style="margin-top: 5px;border-radius:50%;" />
           </c:if>
           
            <c:if test="${student.stuPic!=null }">
           	 <img src="/resource/pic/tou_pic/${student.stuPic }" width="100" height="100" style="margin-top: 5px;border-radius:50%;" />
           </c:if>
               
            </div>
            <div class="stuName">
                <span class="name">${student.stuName }</span>
                <p style="margin-top:10px;">
                <span style="color:#fff;">${student.stuSex}</span><span style="margin-left:20px;">|</span>
                <span class="change" id="change">完善信息</span></p>
            </div>
         </div>
         <div class="achievement">
			<ul>
			   <li><span>${claCounts }</span><br>班级数</li>
			   <c:if test="${student.stuQuecount ==null}">
			  	   <li><span>0</span><br>提问数</li>
			   </c:if>
			   <c:if test="${student.stuQuecount != null}">
			   	   <li><span>${student.stuQuecount }</span><br>提问数</li>
			   </c:if>
			   
			   <li><span>${attenCounts }</span><br>关注老师</li>
			   <li><span>${examCounts }</span><br>考试次数</li>
			</ul>
         </div>
      </div>
   </div>
    <!-- 控制完善信息弹窗弹出、关闭 -->
     <script>
	    $(function(){
			$("#change").click(function () {
			  var halfdivheight=$(".message-config0").height()/2;
			  var halfdivwidth=$(".message-config0").width()/2;
		      var top = document.body.clientHeight/2 - halfdivheight;
		      var left = $(window).width()/2 - halfdivwidth;   
		      var scrollTop = $(document).scrollTop();   
		      var scrollLeft = $(document).scrollLeft();   
		      $(".can").css( {position: 'absolute',top:0,left:0, width: $(document).width()
	          , height: $(document).height()}).show();
		      $(".message-config0").css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).show(500);
            });
			
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
		      $(".message-config0").fadeOut("slow");
            });
		});
   </script>
        
        <!-- 完善信息弹窗 -->
      <div class="can"></div>
      <div class="message-config0">
        <div class="message-config-head">
		   <span>完善信息</span>
		   <img src="${pageContext.request.contextPath }/images/wrong.gif" width="23" height="20"  id="close"/>
		   <div class="in-line0">
             <form action="${pageContext.request.contextPath }/StudentController/updateStu.action" method="post">
             <input type="hidden" id="stuid" name="stuId" value="${student.stuId }">
             <input type="hidden"  name="stuPic" value="${student.stuPic }">
              <ul>
                <li>
                   <p>姓名：</p>
                   <input type="text" class="infoInput0" maxlength="10" name="stuName" value="${student.stuName }" style="width:150px;">
                </li>
                <li>
                   <p>账号：</p>
                   <input type="text" id="phone" maxlength="11" class="infoInput0" name="stuTel" value="${student.stuTel }" style="width:150px;">
                   <span class="cc">请输入正确格式手机号!</span>
                </li>
                <li>
                   <p>性别：</p><input type="hidden" id="sex" value="${student.stuSex }">
                   <input type="radio" style="margin-left:10px;margin-top: 15px;" name="stuSex" value='男' id="nan" />&nbsp;&nbsp;男&nbsp;&nbsp;<input type="radio" name="stuSex" value='女' id="nv"/>&nbsp;&nbsp;女
                </li>
                <li>
                   <p>学院：</p>
                   <input type="text" maxlength="10" class="infoInput0" name="stuPro" value="${student.stuPro }" style="width:150px;">
                </li>
                <li>
                
                   <p>年级：</p>
                   <select name="stuGrade" class="infoInput0" style="width:85px;">
                   		<option value="${student.stuGrade }" style="checked:checked">${student.stuGrade }</option>
                   		<option value="大一">大一</option>
                   		<option value="大二">大二</option>
                   		<option value="大三">大三</option>
                   		<option value="大四">大四</option>
                   </select>
                </li>
                <li>
                   <p>专业：</p>
                   <input type="text" maxlength="10" class="infoInput" name="major" value="软件技术" style="width:150px;">
                </li>
              </ul>
              <input type="submit" style="background:#f90;" class="submit" value="提交保存">
             </form>
           </div>
	    </div>
      </div>
</body>
</html>