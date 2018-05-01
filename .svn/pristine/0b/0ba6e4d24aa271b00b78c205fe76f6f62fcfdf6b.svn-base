<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>help</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
	<style type="text/css">
	   li{list-style:none;margin-top:20px;}
	</style>
    <script type="text/javascript">
        window.onload=function(){
            var aLi=document.getElementsByTagName("li");
            var oDiv1=document.getElementById("div1");
            var oDiv2=document.getElementById("div2");
            var oDiv3=document.getElementById("div3");
            for(var i=0;i<aLi.length;i++){
               aLi[i].onm=function(){
                  aLi[i].style.color="red";
               }
            }
            aLi[0].onclick=function(){
                oDiv1.style.display="block";
                oDiv2.style.display="none";
                oDiv3.style.display="none";
            }
            aLi[1].onclick=function(){
                oDiv2.style.display="block";
                oDiv1.style.display="none";
                oDiv3.style.display="none";
            }
            aLi[2].onclick=function(){
                oDiv3.style.display="block";
                oDiv1.style.display="none";
                oDiv2.style.display="none";
            }
        }
    </script>
 </head>
  <body>
<!-- 引入头部 -->
  	<jsp:include page="./top.jsp"></jsp:include>
  	<div class="container">
<!-- 点通帮助中心 -->
  		<div class="row col-sm-12">
  			<div class="col-sm-4">
				<img width="350px" alt="" src="${pageContext.request.contextPath }/image/help_new.png">
  			</div>
  		</div>
  		
  		<div class="row" style="margin-top: 50px">
  			<hr>
  			<div class="col-sm-2"  style="height: 500px;border-radius: 25px;border: 1px solid #8AC007;box-shadow: 10px 10px 5px #888888;">
  		       <ul>		
  				<li style="margin-top:40px; font-size: large;"><button class="btn btn-success" style="border: 0;border-radius: 10px">常见问题</button></li>
  				<li style="margin-top:30px; font-size: large;"><button class="btn btn-success" style="border: 0;border-radius: 10px">用户手册</button></li>
  				<li style="margin-top:30px; font-size: large;"><button class="btn btn-success" style="border: 0;border-radius: 10px">联系客服</button></li>
  			   </ul>	
  			</div>
  			<div id="div1" class="col-sm-9 col-sm-offset-1"  style="display:block;height: 500px;border-radius: 25px;border: 1px solid #8AC007;box-shadow: 10px 10px 5px #888888;">
  				<ul>
  				   <li><font style="font-size:18px;color:red;">我怎样才能登录点通网</font></li>
  				   <font>答:您可以注册点通网账号，注册成功后登录至点通网。</font>
  				   <li><font style="font-size:18px;color:red;">为什么用电脑访问点通网视频无法播放?</font></li>
  				   <font>答:当您使用电脑访问点通网时：</font><br>
                        <font style="margin-left:40px;"> −  支持浏览器Chrome 10.0+、FireFox4.0+、IE7.0+版本；</font><br>
                        <font style="margin-left:40px;"> −  必须安装flash10+版本</font>
                  </li>
                  <li><font style="font-size:18px;color:red;">使用点通网有什么好处</font></li>
                  <font>点通网拥有课程视频,在线测试,知识点梳理三大板块,能够帮你全面梳理知识体系,逐个扫清学习障碍,搞定考试,易错点,重难点,助你快速提分.</font>
  				</ul>
  			</div>
  			<div id="div2" class="col-sm-9 col-sm-offset-1"  style="display: none;  height: 500px;border-radius: 25px;border: 1px solid #8AC007;box-shadow: 10px 10px 5px #888888;">
  				<ul>
  				   <li><font style="font-size:18px;color:red;">系统登录</font></li>
  				   <font>在您打开点通网系统后，将会在导航栏右上角出现登录两字，您点击登录两字,系统将跳转至登录页面。当然，您要是在系统登录前还没有注册过，就需要先点击【注册】进行注册；您要是已经成功注册为合法用户就可以直接登录并使用该系统。</font>
  				   <li><font style="font-size:18px;color:red;">用户注册</font></li>
  				   <font>点击登录页面的【注册】按钮将进入新用户注册界面。您可以根据您的需要选择用户类型进行注册。请准确填写相关个人信息，您在使用新用户注册功能时，请仔细阅读服务条款，在阅读完并同意明细条款的内容后再进行注册。
                  </font>
                  <li><font style="font-size:18px;color:red;">修改用户资料</font></li>
                  <font>在您点击【个人中心】菜单后，进入资料修改页面，对您个人的部分资料进行修改提交后系统将会接受您新的个人资料。
                 </font>
                  <li><font style="font-size:18px;color:red;">密码修改</font></li>
                  <font>在您点击【个人中心】选项后，可进入“密码修改”页面，输入旧密码和新密码提交后，系统将会更新您新的登录密码。</font>
  				</ul>
  			</div>
  			<div id="div3" class="col-sm-9 col-sm-offset-1"  style="display: none; height: 500px;border-radius: 25px;border: 1px solid #8AC007;box-shadow: 10px 10px 5px #888888;">
  				 <li style="margin-left:40px;"><font style="font-size:18px;color:red;">客服热线</font></li>
  				 <font style="margin-left:40px;">4008-123-123</font>
  			</div>
  		</div>
  	</div>
  
  </body>
</html>
