<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>选择老师提问</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/select-teacher.css">

	<script type="text/javascript">
		$(document).ready(function() {
		
			$(".teacher").each(function() {
				
				$(this).hover(function(){
					$(this).children().eq(1).hide();
					$(this).children().eq(2).slideDown(300);
				},function(){
					$(this).children().eq(2).slideUp(300);
					$(this).children().eq(1).show();
				})
			});
		});
	</script>
  </head>
  
  <body>
  	<!-- 引头 -->
  	<jsp:include page="./top.jsp"></jsp:include>
  	
    <div class="select-body">
    <!-- 主体内容 -->
    	<div class="select-container">
    		<h1>向心怡的老师提问吧</h1>
    		<!-- 选择 -->
    		<div class="guide">
				<span>请选择：</span>
				<input class="choose1" checked="checked" type="radio" name="select" value="1" >根据回答数量排名
				<input class="choose2" type="radio" name="select" value="2">根据心怡值排名
				<button id="btn">确定</button>
			</div>
			
			<!-- 老师列表 -->
			<div class="tea-list">
				<div class="teacher">
					<img alt="" src="${pageContext.request.contextPath }/images/msb.jpg">
					
					<h3>马士兵老师</h3>
					<div class="detail-teacher">
						<h4>马士兵老师</h4>
						<div class="summary-teacher">
							<p style="text-indent: 2em">
								<span>简介：</span><span>马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼</span>
							</p>
							
							<p>
								<span>回答问题数：</span>***
							</p>
							
							<p>
								<span>心怡值：</span>***
							</p>
							
							<input type="button" value="向我提问吧" name="">
						</div>
					</div>
				</div>
				<div class="teacher">
					<img alt="" src="${pageContext.request.contextPath }/images/men.png">
					<h3>马士兵老师</h3>
					<div class="detail-teacher">
						<h4>马士兵老师</h4>
						<div class="summary-teacher">
							<p style="text-indent: 2em">
								<span>简介：</span>马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼
							</p>
							
							<p>
								<span>回答问题数：</span>***
							</p>
							
							<p>
								<span>心怡值：</span>***
							</p>
							
							<input type="button" value="向我提问吧" name="">
						</div>
					</div>
				</div>
				<div class="teacher">
					<img alt="" src="${pageContext.request.contextPath }/images/woman.png">
					<h3>马士兵老师</h3>
					<div class="detail-teacher">
						<h4>马士兵老师</h4>
						<div class="summary-teacher">
							<p style="text-indent: 2em">
								<span>简介：</span>马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼
							</p>
							
							<p>
								<span>回答问题数：</span>***
							</p>
							
							<p>
								<span>心怡值：</span>***
							</p>
							
							<input type="button" value="向我提问吧" name="">
						</div>
					</div>
				</div>
				<div class="teacher">
					<img alt="" src="${pageContext.request.contextPath }/images/msb.jpg">
					<h3>马士兵老师</h3>
					<div class="detail-teacher">
						<h4>马士兵老师</h4>
						<div class="summary-teacher">
							<p style="text-indent: 2em">
								<span>简介：</span>马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼
							</p>
							
							<p>
								<span>回答问题数：</span>***
							</p>
							
							<p>
								<span>心怡值：</span>***
							</p>
							
							<input type="button" value="向我提问吧" name="">
						</div>
					</div>
				</div>
				<div class="teacher">
					<img alt="" src="${pageContext.request.contextPath }/images/msb.jpg">
					<h3>马士兵老师</h3>
					<div class="detail-teacher">
						<h4>马士兵老师</h4>
						<div class="summary-teacher">
							<p style="text-indent: 2em">
								<span>简介：</span>马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼
							</p>
							
							<p>
								<span>回答问题数：</span>***
							</p>
							
							<p>
								<span>心怡值：</span>***
							</p>
							
							<input type="button" value="向我提问吧" name="">
						</div>
					</div>
				</div>
				<div class="teacher">
					<img alt="" src="${pageContext.request.contextPath }/images/msb.jpg">
					<h3>马士兵老师</h3>
					<div class="detail-teacher">
						<h4>马士兵老师</h4>
						<div class="summary-teacher">
							<p style="text-indent: 2em">
								<span>简介：</span>马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼
							</p>
							
							<p>
								<span>回答问题数：</span>***
							</p>
							
							<p>
								<span>心怡值：</span>***
							</p>
							
							<input type="button" value="向我提问吧" name="">
						</div>
					</div>
				</div>
				<div class="teacher">
					<img alt="" src="${pageContext.request.contextPath }/images/msb.jpg">
					<h3>马士兵老师</h3>
					<div class="detail-teacher">
						<h4>马士兵老师</h4>
						<div class="summary-teacher">
							<p style="text-indent: 2em">
								<span>简介：</span>马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼
							</p>
							
							<p>
								<span>回答问题数：</span>***
							</p>
							
							<p>
								<span>心怡值：</span>***
							</p>
							
							<input type="button" value="向我提问吧" name="">
						</div>
					</div>
				</div>
				<div class="teacher">
					<img alt="" src="${pageContext.request.contextPath }/images/msb.jpg">
					<h3>马士兵老师</h3>
					<div class="detail-teacher">
						<h4>马士兵老师</h4>
						<div class="summary-teacher">
							<p style="text-indent: 2em">
								<span>简介：</span>马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼马老师很牛逼
							</p>
							
							<p>
								<span>回答问题数：</span>***
							</p>
							
							<p>
								<span>心怡值：</span>***
							</p>
							
							<input type="button" value="向我提问吧" name="">
						</div>
					</div>
				</div>
				
				
				<div style="clear: both;"></div>
			</div>
			
    	</div>
    </div>
    
    <!-- 结尾 -->
    <jsp:include page="./foot.jsp"></jsp:include>
  </body>
</html>
