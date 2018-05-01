<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML >
<html>
  <head>
    <base href="<%=basePath%>">
    <title>完成家庭作业</title>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/homework.css">
    <script type="text/javascript">
        $(function(){
        	$("#nav-menu").children("li").eq(4).addClass("actived");
            $('.zy2 img').on("click",function(){
            	var halfdivheight=parseInt($(this).height());
    			var halfdivwidth=parseInt($(this).width());
            	if(halfdivwidth>1000){
            		halfdivwidth=1000;
            	}
            	if(halfdivheight>500){
            		halfdivheight=500;
            	}
            	
    		    var top = $(window).height()/2 - halfdivheight/2;
    		    var left = $(window).width()/2 - halfdivwidth/2;   
    		    var scrollTop = $(document).scrollTop();   
    		    var scrollLeft = $(document).scrollLeft(); 
    		    $(this).css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).fadeIn(300);
            });
            $(document).bind("click",function(event){
        		var div=$('.zy2 img');
        		 if(!div.is(event.target) && div.has(event.target).length === 0){ 
        	           div.removeAttr('style');
        	     }
        	});
            
            $('#hehe').hover(function(){
            	if(($('.ans').val()=="") && ($(".file_name").val()=="")){
            		$('.nn').show();
            	}
            	else{
            		$('.nn').hide();
            	}
            },function(){});
            
        });
        function checkFile() {
    		var files = document.getElementsByClassName("file");
            for(var  i=0;i<files.length;i++){
                files[i].addEventListener('change',function () {
                    var file_name=this.value;//文件名
                    var size=this.files[0];
                    var file_size=(size.size/1024/1024).toFixed(2);//文件大小
                    if(!/\.(|jpg|jpeg|png|JPG|PNG)$/.test(file_name)){
                        alert("图片类型必须是jpeg,jpg,png中的一种")
                        this.value="";
                        return false;
                    }else if(file_size > 2){
                        alert("文件大小需要小于2M,请压缩后重新上传！")
                        this.value="";
                        return false;
                    }else {
                    	$(this).parent().prev(".file_name").val(file_name);
                    }
                })
            }
    	}
    </script>
</head>
<body onload="checkFile()">
  <jsp:include page="./top.jsp"></jsp:include>
  
  <div class="work">
    <!-- 左边作业信息 -->
    <div class="zy">
      <p class="title">作业描述</p>
      <div class="zy2">
      	${pubInfo }
      <p class="date">作业发布日期：${pubTime }</p>
      </div>
      <p class="title">附件信息</p>
      <div class="zy2">
      	<c:if test="${empty pubpic }">
      		无附件
      	</c:if>
      	<c:if test="${!empty pubpic }">
      		<img  src="/resource/pic/work_pic/${claid }/${pubpic }">
      	</c:if>
      </div>
    </div>
    <!-- 右边回答框 -->
    <!-- 这里作业解答和附件 其二选一即可 -->
    <div class="hd">
       <form action="${pageContext.request.contextPath }/StudentController/replywork.action" enctype="multipart/form-data" method="post">
       	<input type="hidden" name="claid" value="${claid }">
       	<input type="hidden" name="teaid" value="${teaId }">
       	<input type="hidden" name="pubId" value="${pubId }">
       	<input type="hidden" name="stuid" value="${student.stuId }">
	       <p class="title">作业解答</p>
	       <textarea class="ans" name="replyInfo"></textarea>
	       <p class="title">上传附件</p>
	       <div class="chuan">		
	 		  <input type="text" class="file_name"  readonly="readonly" placeholder="表述不清可上传附件" name="file_name" />
	          <a href="javascript:void(0);" class="input">上传附件
	            <input type="file" class="file" name="homeworkfile">
	          </a>
			</div>
			<div id="hehe" style="position: relative;">
			<div class="nn"></div>
			<input type="submit" class="jiao" value="提交解答">
			</div>
		</form>
    </div>
    
    <div style="clear: both"></div>
  </div>
  
  <jsp:include page="./foot.jsp"></jsp:include>
</body>
</html>