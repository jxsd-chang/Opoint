<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>个人中心-个人设置模块</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/person-set-tea.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/person-right-tea.css"/>
</head>
<body onload="checkFile()" style="font-family:'微软雅黑';box-sizing:border-box;">

  <jsp:include page="./top.jsp"></jsp:include>
  
  <jsp:include page="./person-top-tea.jsp"></jsp:include>


  <div style="width:100%;background:#f7f7f7cc;">
    <div style="margin:0 auto;width:1100px;background:#fff;">
       
       <!-- 左边部分 -->
       <div class="leftChoose">
         <h3>教师功能</h3>
         <ul class="collect">
		    <li id="personSet" class="act">密码修改</li>
		    <li id="touxiang">上传头像</li>
	     </ul>
       </div>
       
       <!-- 右边部分 -->
    <div class="contain-right2">
    <div id="person">
     <div class="changePwd">
        <div class="tip">
         <p>密码修改</p><br>
         <hr size="3">
        </div>
        <div class="pwdinput">
          <span>原密码：</span>
          <input type="password" class="pwd" name="oldpwd" maxlength="16" id="pwd1">
        </div>
        <div class="pwdinput">
          <span>新密码：</span>
          <input type="password" class="pwd" name="newpwd" maxlength="16" id="pwd2">
        </div>
         <div class="wrong" id="cuo">密码只能由数字字母下划线组成,6到16位</div>
        <div class="pwdinput" style="margin-top:15px;">
          <span style="margin-left:15px">确认密码：</span>
          <input type="password" class="pwd" name="repwd" maxlength="18" id="pwd3">
        </div>
        <div class="pwdinput">
           <input type="button" class="submit-btn" id="submit-btn" value="确认修改">
        </div>
        <div style="clear:both;"></div>
     </div>     
    </div>
    
    <!-- 头像上传 -->
    <div id="Teapicture">
       <p style="text-align: center;font-size:20px;letter-spacing: 3px;font-weight:bold;">上传个人头像</p>
	   <div class="changePic">
	   <div>
	     <canvas id="res1" style="display:none"></canvas>
	     <canvas id="res2" style="display:none"></canvas>
	     <canvas id="res3" style="display:none"></canvas>       
	   </div>
	    <span class="fileinput">
		  <span>选择本地照片</span>
		  <form action="${pageContext.request.contextPath }/TeacherController/uploadPic.action" method="post" enctype="multipart/form-data">
			  <input type="file" class="file" name="teaPic" id="fileinput"/>
		      <button class="save">确认保存</button>
	      </form>
	    </span>
	    
	   <div id="canvasContainer">
	      <canvas id="container" style="float:left;margin-top:20px;"></canvas>
	   </div>    
	   </div> 
	   <p style="text-align: center;"><span style="color:red;">*</span>为了头像显示效果，请勿上传长宽比例相差太大的图片</p>
    </div>
    
    
    </div>
    <div style="clear:both;"></div> 
    </div>
  </div>

</body>
</html>
