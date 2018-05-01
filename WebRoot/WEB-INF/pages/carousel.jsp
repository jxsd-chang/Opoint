<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>轮播图</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/swiper.min.css"/>
	
	
	  <style>
    html, body {
      position: relative;
      height: 100%;
    }
    body {
      color:#000;
      margin: 0;
      padding: 0;
    }
    .swiper-container {
      width: 100%;
      height: 500px;

    }
    .swiper-slide {
      text-align: center;
      font-size: 18px;
      background: #fff;

      /* Center slide text vertically */
      display: -webkit-box;
      display: -ms-flexbox;
      display: -webkit-flex;
      display: flex;
      -webkit-box-pack: center;
      -ms-flex-pack: center;
      -webkit-justify-content: center;
      justify-content: center;
      -webkit-box-align: center;
      -ms-flex-align: center;
      -webkit-align-items: center;
      align-items: center;
    }
    .swiper-pagination-bullet{
    width:15px!important;
    height:15px!important;}
  </style>
  </head>
  
  <body>
     <div class="swiper-container">
	    <div class="swiper-wrapper">
	      <div class="swiper-slide">
	        <img  style="width:100%;height:500px;" src="${pageContext.request.contextPath }/images/banner3.jpg" alt="第一张">
	      </div>
	      <div class="swiper-slide">
	        <img  style="width:100%;height:500px;" src="${pageContext.request.contextPath }/images/banner2.jpg" alt="第二张">
	      </div>
	      <div class="swiper-slide">
	        <img  style="width:100%;height:500px;" src="${pageContext.request.contextPath }/images/banner1.jpg" alt="第三张">
	      </div>
	      <div class="swiper-slide">
	        <img  style="width:100%;height:500px;" src="${pageContext.request.contextPath }/images/banner4.jpg" alt="第四张">
	      </div>
	    </div>
    <!-- Add Pagination -->
        <div class="swiper-pagination"></div>
    <!-- Add Arrows -->
        <div class="swiper-button-next"></div>
        <div class="swiper-button-prev"></div>
  </div>
  
  <script type="text/javascript" src="${pageContext.request.contextPath }/js/common/swiper.min.js"></script>
	<script type="text/javascript">
	var swiper = new Swiper('.swiper-container', {
	      spaceBetween: 5,
	      centeredSlides: true,
	      autoplay: {
	        delay: 2000,
	        disableOnInteraction: false,
	      },
	      pagination: {
	        el: '.swiper-pagination',
	        clickable: true,
	      },
	      navigation: {
	        nextEl: '.swiper-button-next',
	        prevEl: '.swiper-button-prev',
	      },
	    });
	</script>
     
  </body>
</html>
