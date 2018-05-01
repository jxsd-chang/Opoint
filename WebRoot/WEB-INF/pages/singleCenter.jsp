<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>个人中心-个人设置模块</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/person-set.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/person-right1.css"/>

	<script type="text/javascript">
		$(function() {
			$(".dianzan").each(function() {
				$(this).hover(function(){ //鼠标移入移出图片变换
					$(this).attr("src","images/zan-red.png");
				},function(){
					$(this).attr("src","images/zan-gray.png");
				});
				
				
			});
		});
	</script>

</head>
<body onload="checkFile()" style="font-family:'微软雅黑';box-sizing:border-box;">

<jsp:include page="./top.jsp"></jsp:include>


  <jsp:include page="./person-top.jsp"></jsp:include>
  
  
   <!-- 个人中心主体部分 -->
<div style="width:100%;background:#f7f7f7cc;">
  <div style="margin:0 auto;width:1100px;background:#fff;">

   <!-- 左边部分 -->
   <div class="leftChoose">
      <h3>个人设置</h3>
	      <ul class="setting">
			<li id="touxiang">上传头像</li>
			<li id="updatePwd">修改密码</li>
		  </ul>
      <h3>个人收藏</h3>
	      <ul class="collect">
			<li id="video">视频</li>
			<li id="knowPoint">知识点</li>
			<li id="brush">题目</li>
		  </ul>
      <h3>个人消息</h3>
	      <ul class="info">
			<li id="myinfo">我的消息<span class="count" id="count1">${myMesCount }</span></li>
			<li id="systeminfo">系统消息<span class="count" id="count2">${sysMesCount }</span></li>
		  </ul>
   </div>  

  
  <div class="contain-right">
  	<!-- 个人上传头像-->
  <div id="showtouxiang" class="show">
  	<p style="text-align: center;font-size:20px;letter-spacing: 3px;font-weight:bold;">上传个人头像</p>
	   <div class="changePic">
	   <div>
	     <canvas id="res1" style="display:none"></canvas>
	     <canvas id="res2" style="display:none"></canvas>
	     <canvas id="res3" style="display:none"></canvas>       
	   </div>
	    <span class="fileinput">
		  <span>选择本地照片</span>
		  <form action="${pageContext.request.contextPath }/StudentController/uploadPic.action" method="post" enctype="multipart/form-data">
			  <input type="file" name="stuPic" class="file" id="fileinput"/>
		      <button class="save">确认保存</button>
	      </form>
	    </span>
	    
	   <div id="canvasContainer">
	      <canvas id="container" style="float:left;margin-top:20px;"></canvas>
	   </div>
	   </div>
	   <p style="text-align: center;"><span style="color:red;">*</span>为了头像显示效果，请勿上传长宽比例相差太大的图片</p> 		
  </div>
  
   
  	<!-- 个人修改密码-->
    <div id="showupdatePwd" class="show">
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
    
     <input id="stuid" type="hidden" value="${student.stuId }"/>
     <!-- 个人收藏视频 -->
    <div id="showVideo" class="show" style="display:none;">
      
    </div>
    
    <!-- 个人收藏知识点 -->
    <div id="showknowPoint" class="show"  style="display:none;">
     
    </div>
   
    <!-- 个人收藏题目 -->
    <div id="showBrush" class="show" style="display:none;">

    </div>

    <!-- 我的消息-->
    <div id="showmyinfo" class="show"  style="display:none;">
    	<p style="text-align: center;font-size:20px;letter-spacing: 3px;font-weight:bold;">查看老师回复</p>
    	<!-- 这里开始遍历 -->
    	<c:if test="${empty teaRepList }">
    		<div style="margin-top: 220px;padding-left:344px;">
		    	<img src="${pageContext.request.contextPath }/images/box2.png">
		    		<div style="color: gray;margin-left: -40px;">
    					<span>(╥╯﹏╰╥)ง</span>
    					<span>,空空如也</span>
		    		</div>
		    </div>
    		
    	</c:if>
    	<c:if test="${teaRepList !=null }">
    	<c:forEach items="${teaRepList }" var="reply" varStatus="tt">
    	   <div class="infoItem0">
	    	<div class="infoItem">
	    	 	 ${tt.count }、<span>${reply.connStuTea.askInfo }</span>
	    	</div>
	    	<div class="infox"></div>
	    	<input type="hidden" value="${reply.connStuTea.askId }"/>
	    	<div style="clear:both"></div>
	    	</div>
	    	<div class="qa">
		    	<div class="que">
		    	  <p style="font-size:14px;">完整提问：</p>
		    	  <p class="q1">${reply.connStuTea.askInfo }</p>
		    	  <c:if test="${reply.connStuTea.askPic!=null }">
			    	  <img src="${pageContext.request.contextPath}/images/fujian.png" class="fu"/>
				      <img src="/resource/pic/ask_pic/${reply.connStuTea.teaId }/${reply.connStuTea.askPic }" style="display: none;z-index:9;" class="fu2"/>
			      </c:if>
		    	</div>
		    	<div class="ans">
		    	  <p style="font-size:14px;">解答如下：</p>
		    	  <p class="a1">${reply.connStuTea.solveInfo }</p>
		    	  <p class="a2">回答教师：${reply.teaName } <span style="font-style: italic;">${reply.connStuTea.solveTime }</span></p>
		    	  
		    	  <!-- 点赞，即学生端若觉得老师回答得好，就点赞一下 -->
		    	  <div class="a2 zz" style="margin-top: 0px;position: relative;">
		    	  	<div style="display: inline-block;margin-top: -25px;"><span>觉得老师回答得不错？心动一下<span>(*^ω^*)</span></span></div>
		    	  	<img style="cursor: pointer;width: 25px;height: 25px;" class="dianzan" alt="赞" src="${pageContext.request.contextPath}/images/zan-gray.png"> 
		    	  	<img alt="已赞" class="zan" src="${pageContext.request.contextPath}/images/zan-red.png">
		    	  	<input type="hidden" value="${reply.connStuTea.teaId}">
		    	  </div>
		    	</div>
		    	<div style="clear:both"></div>
	    	</div>
    	</c:forEach>
    	</c:if>
    	<div class="infox2"><!-- JS中380行 -->
    	  <div class="xx" style="margin-right: 10px;"></div>
    	  <input type="hidden" id="askId">
    	  <p>是否确认删除该条记录？</p>
    	  <div class="xx2">确认删除</div>
    	</div>
    </div>
    <div class="suc">删除成功</div>
    <!-- 系统消息 -->
    <div id="showsysteminfo" class="show"  style="display:none;">
    	<p style="text-align: center;font-size:20px;letter-spacing: 3px;font-weight:bold;">查看系统消息</p>
    	<div class="i2">
    	   <img class="i3" src="${pageContext.request.contextPath }/images/kefu.png"><br>点通客服推荐
    	</div>
    	<div class="information">
    		
		    		<c:if test="${empty clagradeItems}">
		    			<div style="margin-top: 125px;padding-left:230px;">
		    				<img src="${pageContext.request.contextPath }/images/box2.png">
		    					<div style="color: gray;margin-left: -40px;">
			    					<span>(╥╯﹏╰╥)ง</span>
			    					<span>,空空如也</span>
		    					</div>
		    			</div>
		    		</c:if>
	    			<c:if test="${clagradeItems !=null }">
	    			<c:forEach items="${clagradeItems }" var="vo">
			    	   <div class="ii">
			    	     <p><span style="font-size:18px;">${vo.teacher.teaName }</span> 老师：</p>
			    	     <c:if test="${vo.claList == null }">
			    	     	<span class="i0">你关注的该老师还没有创建班级</span>
			    	     </c:if>
			    	     <c:if test="${vo.claList !=null }">
			    	     	<c:forEach items="${vo.claList }" var="cla">
					    	     <input type="hidden" value="${cla.claId }"/>
					    	     <ul>
					    	     	<li style="width:40%;">班级名称：${cla.claName }</li>
					    	     	<li style="text-align: right;">人数：20/${cla.claCapacity }</li>
					    	     	<li style="text-align: right;"><span class="banji">加入班级</span></li>
					    	     </ul>
			    	    	 </c:forEach>
			    	     </c:if>
			    	     <div style="clear:both;"></div>
			    	   </div> 
	    	 </c:forEach> 
	    	 </c:if>
	    	
    	</div>
    	<!-- JS在400行 -->
    	<div class="can"></div>
		      <div class="message-configg">
		        <div class="message-config-head">
				   <span>高等数学上册培优班</span>
				   <img src="${pageContext.request.contextPath }/images/wrong.gif" width="23" height="20"  class="close"/>
				   </div>
				   <div class="in-line2">
		              <input type="hidden" id="teaid" name="teaId" value="${teacher.teaId }"/>
		               <input type="hidden" id="claid" name="claId" />
		              <ul style="height:230px;">  
		                <li>
		              		    班级编号：<span style="font-size:15px;" id="graNo"></span>
		                </li>         
		                <li>
		                                                        班级人数：<span style="font-size:15px;" id="graCap"></span>
		                </li>
		                <li style="width:100%;height:150px;">
		                	   班级简介：<span style="font-size:15px;display: block;" ></span>
		                   <textarea readonly="readonly" class="textarea" style="margin-left:20px;text-indent: 2em" cols="40" rows="4" name="classinfo" id="graInfo"></textarea>
		                </li>
		              </ul>
                      <div class="yes" id="yes2">确认加入</div>
		           </div>
			   
		      </div>
    </div>
    
    
  </div>
  <div class="message-config2">
        <div class="message-config-head">
		   <img src="${pageContext.request.contextPath }/images/wrong.gif" width="23" height="20"  id="close2"/>		   
		   <img id="parse" src=''>
		</div>
  </div>
  <!-- 是否确认删除框 -->
  <input id="isDelBrush" type="hidden" />
  <input id="isDelKnowpoint" type="hidden" />
  <div class="message-config3">
        <div class="message-config-head">
		   <img src="${pageContext.request.contextPath }/images/wrong.gif" width="23" height="20"  class="close3"/>		   
		   <div style="padding-top:30px;">
		     <center>是否确认删除？</center>
		   <div style="width:100%;padding:40px 0px 25px 0px;">
		     <button id="yes" class="del">是</button><button  class="del no">否</button>
		   </div>
		   </div>
		</div>
  </div>  
 <div style="clear:both"></div>
</div>
 
 <jsp:include page="./foot.jsp"></jsp:include>
</div> 
</body>

</html>
