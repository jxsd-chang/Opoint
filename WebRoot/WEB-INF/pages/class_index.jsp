<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理我的班级</title>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/teacher.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/person-right-tea.css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/select-teacher.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/textareaAuto.js"></script>
  	
	<script type="text/javascript">
	$(function(){
		  $("#nav-menu").children("li").eq(4).addClass("actived");
		  $(".s1").hide();
    	  $(".service").css("bottom","200px");
    	  $(".service").css("height","60px");
    	  $(".article").autoHeight();
    	  $(".xiugai-class").autoHeight();
    	  $(".chuangjian-class").autoHeight();
	  });
	</script>
  </head>
  
  <body onload="checkFile()">
     <jsp:include page="./top.jsp"></jsp:include>
     <div class="classList" id="classList">
      <span class="person">我的班级</span>
      <p id="newclass">创建新班级>></p>
      <table class="classTable" style="border-collapse:collapse;">
         <thead>
           <tr style="background:linear-gradient(#f0f0f0,#ddd);height: 50px;">
             <th>班级编号</th><th>班级名称</th><th>班级人数</th><th colspan="5">管理操作</th>
           </tr>
         </thead>
         <tbody>
         <c:if test="${claList==null }">
           <tr><td colspan="4"><img src="images/empty.png"/></td></tr>
           <tr><td colspan="4"><span style="color:red">*  </span>还没有班级哦，请点击左上角创建新班级吧！</td></tr>
         </c:if>
         <c:forEach items="${claList }" var="cla">
         	<input type="hidden" value="${cla.claId }">
			 <tr>
			   <td>${cla.claNo }</td>
			   <td>${cla.claName }</td>
			   <td>${cla.claCapacity}</td>
			   <td><span class='delCla'>删除</span></td>
			   <td><span class='changeInfo'>改信息</span></td>
			   <td><span class="see">查看学生</span></td>
			   <td><span class="fabu">发布作业</span></td>
			   <td><a class="pigai" href="${pageContext.request.contextPath }/TeacherController/getPublishByclaid.action?claid=${cla.claId}">批改作业</a></td>
			 </tr>
	    </c:forEach>
         </tbody>
      </table>
      
      <!-- 查看班级学生 -->
      <div class="stulist">
        <div class="hid" id="hid">
          <div class="rightImg">
             <img  src="${pageContext.request.contextPath }/images/chevron-thin-right.png">
          </div>
        </div>
        <p class="list2">班级学生列表</p>
        <ul class="list3">
        
        </ul>
      </div>
      
      <!--创建班级弹窗  -->
      <div class="can"></div>
      <div class="message-config" id="message-config" style="width:500px;height:auto;background:#fff;">
        <div class="message-config-head">
		   <span>创建班级信息</span>
		   <img src="${pageContext.request.contextPath }/images/wrong.gif" width="23" height="20"  class="close"/>
		</div>
	   <div class="in-line">
            <form action="${pageContext.request.contextPath }/ClagradeController/createCla.action" method="post">
             <input type="hidden" id="teaid" name="teaId" value="${teacher.teaId }"/>
             <ul>
             	<li>
                  <span style="font-size:15px;">班级编号：</span>
                  <input type="text" class="infoInput"  id="num" name="claNo"/>
                  <span style="color:red;font-size:13px;padding: 0 !important;display: none;">* 班级编号只能输入正整数</span>
               </li>         
               <li>
                  <span style="font-size:15px;">班级名称：</span>
                  <input type="text" class="infoInput" maxlength="15" id="gradeName" name="claName">
               </li>
               <li>
                  <span style="font-size:15px;">人数上限：</span>
                  <input type="text" class="infoInput" id="perNum" name="claCapacity">
                  <span style="color:red;font-size:13px;padding: 0 !important;display: none;">* 人数上限只能输入正整数</span>
               </li>
               <li>
                  <span style="font-size:15px;display: block;">班级简介：</span>
                  <textarea class="textarea chuangjian-class" name="claIntro"></textarea>
               </li>
             </ul>
             <input type="submit" class="submitBtn" value="提交保存">
            </form>
           
	    </div>
      </div>
      
      <!-- 发布作业弹窗 -->
      <div class="can"></div>
    <div class="ti">
       <span class="x"></span>
       <p class="tit">发布作业</p>
       <p class="tit2">留下课堂作业，让学生巩固所学知识</p>
     <form id="homeform" action="" enctype="multipart/form-data" method="post">
       <div class="write">
       	    <div>
                <p class="ti3"  style="float: right;margin-right: 10px;color: gray;">您正在向    <span style="font-size:14px;color: #f90;"></span>班级发布作业</p>
           		<div style="clear: both;"></div>
      		</div>
	       <p style="display: inline;margin-left: 0;">主题：</p>
	       <input type="text" name="homeTitle" style="width: 295px;height:35px;padding:0 15px;" class="main-summary" >
	       <p style="display: inline;margin-left: 0;">截止提交时间：</p>
	       <input class="timeOut" id="timeOut" name="endTime" style="margin-top: 5px;height:35px;" type="date" ><!-- 截止提交时间 -->
	       <textarea class="article" style="resize: none;" ></textarea>
       </div>
       <input type="hidden" name="teaid" value="${teacher.teaId }">
       <input type="hidden" id="claid" name="claid">
       <input type="hidden" name="homeInfo" id="homeInfo">
       <div>		
 			<input type="text" class="file_name"  readonly="readonly" placeholder="上传附件，让学生更容易理解" name="file_name" />
          	<a href="javascript:void(0);" class="input">上传附件
            	<input type="file" class="file" name="homefile">
          	</a>
		</div>
		<div class="check-tijiao" style="height: 90px;padding: 10px;position: relative;">
	       <button class="ti4" id="submithome">提交</button>
	       <span class="btnNot"></span>
        </div>
	</form>
       
    </div>
      <div class="can"></div>
      <div class="message-config" id="message-config2" style="width:500px;height:auto;background:#fff;">
        <div class="message-config-head">
		   <span>修改班级信息</span>
		   <img src="${pageContext.request.contextPath }/images/wrong.gif" width="23" height="20"  class="close"/>
		   </div>
		   <div class="in-line">
             <form action="${pageContext.request.contextPath }/ClagradeController/updateCla.action" method="post">
               <input type="hidden"  name="claId" id="graid"/>
              <ul>  
               <li>
                   <span style="font-size:15px;">班级编号：</span>
                   <input type="text" class="infoInput" id="graNo" name="claNo" value="">
                   <span style="color:red;font-size:13px;padding: 0 !important;display: none;">* 班级编号只能输入正整数</span>
                </li>         
                <li>
                   <span style="font-size:15px;">班级名称：</span>
                   <input type="text" class="infoInput gradeName" id="graName" maxlength="15"  name="claName">
                </li>
                <li>
                   <span style="font-size:15px;">人数上限：</span>
                   <input type="text" class="infoInput" id="graCount" name="claCapacity">
                   <span style="color:red;font-size:13px;padding: 0 !important;display: none;">* 人数上限只能输入正整数</span>
                </li>
                <li>
                   <span style="font-size:15px;display: block;">班级简介：</span>
                   <textarea class="textarea xiugai-class" id="graInfo" name="claIntro"></textarea>
                </li>
              </ul>
              <input type="submit" class="submitBtn" value="提交保存">
             </form>
	    </div>
      </div>
      
      <div class="message-config" id="message-config3" style="width:315px;height:180px;background:#f0f0f0;">
        <div class="message-config-head"><input type="hidden" id="cid">
		   <img src="${pageContext.request.contextPath }/images/wrong.gif" width="23" height="20"  class="close"/>		   
		   <div style="padding-top:30px;">
		     <center><span class="queren">是否确认删除该班级？</span></center>
		   <div style="width:100%;padding:40px 0px 25px 0px;">
		     <button id="yesDel" class="del">是</button><button class="del no">否</button>
		     <div style="clear:both;"></div>
		   </div>
		   </div>
		</div>
       </div>
    </div>
  </body>
</html>
