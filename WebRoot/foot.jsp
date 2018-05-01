<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>网站底部</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
		.foot{
			min-height: 200px;
			background: linear-gradient(#38383d,gray);
		}
		.foot-logo .logo{
			font-size: 36px;
			color:white;
			font-weight: bolder;
			font-style: inherit;
			margin-left: 10px;
			
		}
		.foot p{
			color: #f90;
			padding: 0;
			font-size: 24px;
			/* margin-left:60px;
			padding-top: 20px; */
			margin-top: 15px;
		}
		.foot ul li{
		    width: 100%;
			list-style: none;
			padding: 2.5px;
			margin-right: 5px;
		}
		.foot ul li a{
			color: white;
			font-size: 14px;
			text-decoration: none;
		}
		.foot .foot-link{
			width: 180px;
			min-height: 100px;
			border-left: 1px #4D4D4D solid;
			
			text-align: center;
		}
		.foot .copy-right{
			text-align: center;
			line-height: 50px;
			color: white;
			font-size: 16px;
			margin-top: 30px;
			
		}
		.foot ul{
			
			/* margin-top: 50px; */
		}
	</style>
	
	</head>
	<body>
		
		<div class="foot" style="width:100%;min-width: 1200px;">
			<div style="margin: 0 auto; width:1200px;height:150px;padding-top: 20px">
				<div class="foot-logo" style="float: left;/* position: relative; */width: 200px;height: 150px">
					<div class="logo">
						<a href="${pageContext.request.contextPath }/index.action" style="color: #f90;text-decoration: none;">点|通|网</a>
		     		</div>
		     		<div style="/* position: absolute; *//* margin-top: 50px; */">
		     			<img alt="添加了解" src="${pageContext.request.contextPath }/images/wechat.jpg" style="width: 100px;height: 100px;margin-left: 25px;margin-top: 10px;">
		     		</div>
				</div>
				<div class="foot-link" style="float: right;/* position: relative; */width: 190px;height: 150px">
					<p>关注我们</p>
					<ul>
						<li><a href="#">新浪微博</a></li>
	   					<li><a href="#">官方微信</a></li>
					</ul>
				</div>
				<div class="foot-link" style="float: right;/* position: relative; */width: 190px;height: 150px">
					<p>关于我们</p>
					<ul>
						<li><a href="#">网站简介</a></li>
<!-- ================团队介绍===================== -->
	   					<li><a href="${pageContext.request.contextPath }/about_us.jsp">团队介绍</a></li>
	   					
	   					<li><a href="http://wpa.qq.com/msgrd?v=3&uin=1146138656&site=qq&menu=yes">联系我们</a></li>
	   					<li><a href="#">行业大会</a></li>
					</ul>
				</div>
				<div class="foot-link" style="float: right;/* position: relative; */width: 190px;height: 150px">
					<p>服务支持</p>
					<ul>
						<li><a href="#">支付方式</a></li>
<!-- ================意见反馈===================== -->
	   					<li><a href="call_us.action" target="blank">意见反馈</a></li>
					</ul>
				</div>
				<div class="foot-link" style="float: right;/* position: relative; */width: 190px;height: 150px">
					<p>帮助中心</p>
					<ul>
						<li><a href="#">学生帮助</a></li>
	   					<li><a href="register.action" target="blank">注册登录</a></li>
	   					<li><a href="#">网站地图</a></li>
	   					<li><a href="#">网站条款</a></li>
					</ul>
				</div>
				<div class="foot-link" style="float: right;/* position: relative; */width: 190px;height: 150px">
					<p>友情链接</p>
					<ul>
						<li><a target="blank" href="http://www.jxnu.edu.cn/">江西师范大学</a></li>
	   					<li><a target="blank" href="http://www.chinaedu.edu.cn/">中国教育信息网</a></li>
	   					<li><a target="blank" href="http://jwc.jxnu.edu.cn/">江西师范大学教务在线</a></li>
					</ul>
				</div>
			</div>
			
			<div class="copy-right">
	    		<span>© 2017-2018</span>
	    		<span> | </span>
	    		<span>ICP备案编号：赣洪备************</span>
	    		<span> | </span>
	    		<span>版权所有：软件学院X3512工作室</span>
    		</div>
    		
		</div>
	</body>
</html>
