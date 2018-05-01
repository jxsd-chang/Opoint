<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>结果分析</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/kaoshifenxi.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css">
	<script type="text/javascript">
		$(document).ready(function() {
			$("#nav-menu").children("li").eq(4).addClass("actived");
			/* 鼠标移入，出现隐藏的button */
			$("#keguanti").find("td").each(function(){
		      	$(this).hover(function(){
		        $(this).children(".keguan-jiexi").css("visibility","visible");
		      },function(){
		        $(this).children(".keguan-jiexi").css("visibility","hidden");
		      });
   			});
   			
   			/* 判断答案，正确的话给绿色，错误给红色 */
   			$("#keguanti").find("tr").each(function(){
   				var daan = $(this).children(".daan").text();
				var yourdaan = $(this).children(".your-daan").text();
				
				if(daan == yourdaan) {
					$(this).addClass("success");
				}else if(daan == "答案"){
					$(this).addClass("info")
				}else{
					$(this).addClass("danger")
				}
   			});
   			
   			/* 点击查看解析弹窗 */
   			$(".keguan-jiexi").click(function() {
   				$(".daan-tanchauang").show(500);
   			});
   			$("#close-daan").bind("click",function(){
   				$(".daan-tanchauang").hide(500);
   			});
		});
	</script>

  </head>
  
  <body>
    <!--引入头部-->
    <jsp:include page="./top.jsp"></jsp:include>
    
    <div class="fenxi">
    	<div class="fenxi-container">
    		<!-- 结果分析表格 -->
    		<div class="fenxi-title">
    			<p>本次考试结果分析</p>
    		</div>
			<div>
				<div class="fenxi-main">
					<table style="text-align: center;" class="fenxi-table table table-hover" border="1px" cellpadding="10" cellspacing="0" align="center">
						<caption style="font-size: 20px;padding: 5px;text-align: center;">点通网模拟试卷</caption>
						<tbody>
							<tr>
								<td>试卷名称</td>
								<td>${analyseVo.paper.paName }</td>
							</tr>
							<tr>
								<td>选择题分数</td>
								<td>${optFen }分</td>
							</tr>
							<tr>
								<td>考本张试卷次数</td>
								<td>${count }次</td>
							</tr>
							<tr>
								<td>平均分</td>
								<td>76</td>
							</tr>
							<tr>
								<td>点通点评</td>
								<td>${commen }</td>
							</tr>
						</tbody>
					</table>
					<table style="text-align: center;" id="keguanti" class="fenxi-table table table-hover" border="1px" cellpadding="10" cellspacing="0" align="center">
						<caption style="font-size: 20px;padding: 5px;text-align: center;">客观题分析</caption>
						<tr>
							<td>题号</td><td>分值</td><td class="daan">答案</td><td class="your-daan">你的答案</td><td>得分</td>
						</tr>
					<c:forEach items="${analyseVo.list }" var="optionItem" varStatus="tt">
						<tr>
							<td>${tt.count }</td><button class="keguan-jiexi">查看解析</button>
							<td>${analyseVo.listOpt[0].etimuFen }</td>
							<td class="daan">${optionItem.rightOpt }</td>
							<td class="your-daan">${optionItem.writeOpt }</td>
							<c:if test="${optionItem.rightOpt==optionItem.writeOpt }">
								<td>${analyseVo.listOpt[0].etimuFen }</td>
							</c:if>
							<c:if test="${optionItem.rightOpt!=optionItem.writeOpt }">
								<td>0</td>
							</c:if>
							
						</tr>
					</c:forEach>
					</table>
				</div>
			</div>
			<!-- 答案解析弹窗 -->
			<div class="daan-tanchauang" style="display: none;">
				<div style="width: 100%; height: 30px;">
					<img id="close-daan" style="float: right;cursor: pointer;" src="${pageContext.request.contextPath }/images/wrong.gif" width="23" height="20">
				</div>
				
				<div>
					<img alt="" src="${pageContext.request.contextPath }/images/wrong.gif">
				</div>
			</div>
			
<!-- 视频推荐 -->
			<div class="fenxi-tuijian">
				<div class="tuijian-title"><p>点通智能推荐视频</p></div>
				<div class="fenxi-kno">
					<div class="kno-img">
						<img alt="" src="${pageContext.request.contextPath }/images/tj_video.png">
					</div>
					<div class="kno-list">
						<p>你对以下<span style="color: red">视频</span>可能还存在盲区，赶快前去加深学习吧!</p>
						<ul class="tj-list">
							<c:forEach items="${analyseVo.list }" var="optionItem">
								<c:if test="${optionItem.rightOpt!=optionItem.writeOpt }">
									<li>
										您对<span style="color: orange">
												<a href="${pageContext.request.contextPath }/VideoController/tjVideo.action?vid=${optionItem.video.vioId }">
													${optionItem.video.vioItem }
												</a>
											</span>"概念不是很清晰
									</li>
								</c:if>
							</c:forEach>
						</ul>
					</div>
				</div>
				<div style="clear: both;"></div>
<!-- 知识点推荐 -->
				
				<div class="tuijian-title"><p>点通智能推荐知识点</p></div>
				<div class="fenxi-kno">
					<div class="kno-img">
						<img alt="" src="${pageContext.request.contextPath }/images/kno.png">
					</div>
					<div class="kno-list">
						<p>你对以下<span style="color: red">知识点</span>可能还存在盲区，赶快前去加深学习吧!</p>
						<ul class="tj-list">
						<c:forEach items="${analyseVo.list }" var="optionItem">
							<c:if test="${optionItem.rightOpt!=optionItem.writeOpt }">
								<li>
									您对"<span style="color: orange">
											<a href="${pageContext.request.contextPath }/KninfoController/tjKnifo.action?knifoid=${optionItem.kninfo.kninfoId }">	
												${optionItem.kninfo.kninfoTitle }
											</a>
										</span>"概念不是很清晰
								</li>
							</c:if>
						</c:forEach>
						</ul>
					</div>
				</div>
				<div style="clear: both;"></div>
<!-- 刷题推荐 -->
					<div class="tuijian-title"><p>点通智能推荐刷题</p></div>
					<div class="fenxi-kno">
						<div class="kno-img"><img  src="${pageContext.request.contextPath }/images/wrongList.png"></div>
						<div class="kno-list">
							<p>不断<span style="color: red">刷错题</span>才是巩固和总结知识的最好方式</p>
							<ul class="tj-list">
								
								<c:forEach items="${analyseVo.list }" var="optionItem">
								<c:if test="${optionItem.rightOpt!=optionItem.writeOpt }">
									<li>
										您对"<span style="color: orange">
												<a href="${pageContext.request.contextPath }/BrushTitleController/tjBrushExam.action?brushId=${optionItem.brush.brushId }">	
													${optionItem.kninfo.kninfoTitle }
												</a>
											</span>"概念不是很清晰
									</li>
								</c:if>
							</c:forEach>
							</ul>
						</div>
					</div>
				<div style="clear: both;"></div>
			
			<div>
				<div class="jiexi-title">
    				<p><a href="${pageContext.request.contextPath }/ExamController/showMyparse.action?exid=${exid}&pid=${analyseVo.paper.paId }">查看我的答案>></a></p>
    			</div>
			</div>
			<div style="margin: 40px 0 80px 0;">
				<div class="jiexi-title">
    				<p><a href="${pageContext.request.contextPath }/EtimuController/showRiparse.action?pid=${analyseVo.paper.paId }">查看正确解析>></a></p>
    			</div>
			</div>
    	</div>
    </div>
    </div>

	<div style="clear: both;"></div>
    <!-- 引入尾部 -->
    <jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
