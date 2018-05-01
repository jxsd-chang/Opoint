<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>趣味故事</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		*{margin:0;padding:0;list-style-type:none;}
		a, img{border:0;}
		body{font:12px/180% Arial, Helvetica, sans-serif, "新宋体";color:#333;}
		a{text-decoration:none;color:#333;-webkit-transition:color .2s;-moz-transition:color .2s;-o-transition:color .2s;-ms-transition:color .2s;transition:color .2s;}
		a:hover{text-decoration:underline;color:#ff7d8e;}
		a:focus{outline:none;}
		
		/* brand-list */
		.brand-list{width:1200px;margin:0 auto;}
		.brand-list .item{position:absolute;width:370px;background:url(images/132.gif) no-repeat center center;top:0;left:40%;-webkit-transition:all 0.3s;-moz-transition:all 0.3s;-o-transition:all 0.3s;-ms-transition:all 0.3s;transition:all 0.3s;}
		.brand-list .additem{width:370px;border:none;}
		.brand-list .item h3{font-size:42px;color:#666;font-family:arial;font-size:18px;font-weight:800;line-height:.8;margin-bottom:20px;}
		.brand-list .item p{margin-bottom:15px;}
		.boxgrid{width:370px;height:227px;overflow:hidden;position:relative;}
		.boxgridq{width:370px;height:488px;overflow:hidden;position:relative;}
		.item .boxgrid h3{margin:10px 0px 10px 0px;color:#FFF;font:24pt 微软雅黑, sans-serif;letter-spacing:-1px;font-weight:bold;text-align:center;}
		.boxgrid img{position:absolute;top:0;left:0;border:0;}
		.boxgrid p{color:#afafaf;font-weight:bold;text-align:center;}	
		.boxgrid p a{text-decoration:none;color:#FFF;font-family:微软雅黑;font-size:12px;}
		.boxcaption{float:left;position:absolute;background:url(images/28.png);height:200px;width:100%;}
		.boxcaptiona{float:left;position:absolute;background:url(images/28.png);height:200px;width:100%;}
		.caption .boxcaption{top:165px;left:0px;}
		.captiona .boxcaptiona{top:427px;left:0px;}
		.math-story ::AFTER{
			position: absolute;
			content: "";
			width: 110px;
			height: 7px;
			background-color: #ea2d2d;
			bottom: 50px;
			left: 50%;
			margin-left: -80px;
		}
	</style>

  </head>
  
<body>

<jsp:include page="./top.jsp"></jsp:include>
<div style="width:1200px;position:relative;height: 70px;margin: 0 auto;">
	<p class="math-story" style="text-align: center;padding-top: 30px;font-size: 30px">高数趣味故事</p>
	
</div>
<div style="width:1200px;position:relative;margin:0 auto;top: 15px">
	<div class="brand-list" id="brand-waterfall">
		<!-- 循环字母模块 item -->
		<div class="item">
			<div class="boxgrid caption">
				<a href="#">
					<img style="width: 370px;height: 227px;" src="images/xin.jpg"/>
				</a>
				<div class="cover boxcaption">
					<h3>1111 </h3>
					<p><a href="#">高等数学公式的唯美表现>></a></p>
				</div>
			</div>
		</div>
		
		<div class="item">
			<div class="boxgrid captiona boxgridq">
			
				<a href="es_gaosi.action">
				    <img style="width: 370px;height: 488px;" src="images/gaosi.JPEG"/>
				</a>
				<div class="cover boxcaptiona">
					<h3>数学王子--高斯</h3>
					<p>一把圆规，一把直尺，如何画出正十七边行呢？<a href="es_gaosi.action">前往揭秘>>></a></p>
				</div>
			</div>
		</div> 
		
		<div class="item">
			<div class="boxgrid caption">
				<img src="images/middle3.jpg"/>
				<div class="cover boxcaption">
					<h3>333 </h3>
					<p><a href="#">点通网点通网点通网点通网点通网</a></p>
				</div>
			</div>
		</div>
		
		<div class="item">
			<div class="boxgrid caption">
				<img src="images/middle4.jpg"/>
				<div class="cover boxcaption">
					<h3>444 </h3>
					<p><a href="#">点通网点通网点通网点通网点通网</a></p>
				</div>
			</div>
		</div>
		
		<div class="item">
			<div class="boxgrid captiona boxgridq">
				<img src="images/middle5.jpg"/>
				<div class="cover boxcaptiona">
					<h3>555 </h3>
					<p><a href="#">点通网点通网点通网点通网点通网</a></p>
				</div>
			</div>
		</div>
	
		<div class="item">
			<div class="boxgrid captiona boxgridq">
				<img src="images/middle6.jpg"/>
				<div class="cover boxcaptiona">
					<h3>666 </h3>
					<p><a href="#">点通网点通网点通网点通网点通网</a></p>
				</div>
			</div>
		</div>
		
		<div class="item">
			<div class="boxgrid caption">
				<img src="images/middle1.jpg"/>
				<div class="cover boxcaption">
					<h3>777 </h3>
					<p><a href="#">点通网点通网点通网点通网点通网</a></p>
				</div>
			</div>
		</div>
		
		<div class="item">
			<div class="boxgrid captiona boxgridq">
				<img src="images/middle1.jpg"/>
				<div class="cover boxcaptiona">
					<h3>888 </h3>
					<p><a href="#">点通网点通网点通网点通网点通网</a></p>
				</div>
			</div>
		</div>
		
		<div class="item">
			<div class="boxgrid caption">
				<img src="images/middle1.jpg"/>
				<div class="cover boxcaption">
					<h3>999 </h3>
					<p><a href="#">点通网点通网点通网点通网点通网</a></p>
				</div>
			</div>
		</div>
		
		<div class="item">
			<div class="boxgrid captiona boxgridq">
				<img src="images/middle1.jpg"/>
				<div class="cover boxcaptiona">
					<h3>1010 </h3>
					<p><a href="#">点通网点通网点通网点通网点通网</a></p>
				</div>
			</div>
		</div>
		
	</div>
</div>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){

	//Caption Sliding (Partially Hidden to Visible)
	$('.boxgrid.caption').hover(function(){
		$(".cover", this).stop().animate({top:'120px'},{queue:false,duration:160});
	}, function() {
		$(".cover", this).stop().animate({top:'165px'},{queue:false,duration:160});
	});
	$('.boxgrid.captiona').hover(function(){
		$(".cover", this).stop().animate({top:'378px'},{queue:false,duration:160});
	}, function() {
		$(".cover", this).stop().animate({top:'427px'},{queue:false,duration:160});
	});
	
});
</script>

<script type="text/javascript">
$(function(){
	$('#brand-waterfall').waterfall();
});

// 瀑布流插件
// pannysp
;(function ($) {
    $.fn.waterfall = function(options) {
        var df = {
            item: '.item',
            margin: 30,
            addfooter: true
        };
        options = $.extend(df, options);
        return this.each(function() {
            var $box = $(this), pos = [],
            _box_width = $box.width(),
            $items = $box.find(options.item),
            _owidth = $items.eq(0).outerWidth() + options.margin,
            _oheight = $items.eq(0).outerHeight() + options.margin,
            _num = Math.floor(_box_width/_owidth);

            (function() {
                var i = 0;
                for (; i < _num; i++) {
                    pos.push([i*_owidth,0]);
                } 
            })();

            $items.each(function() {
                var _this = $(this),
                _temp = 0,
                _height = _this.outerHeight() + options.margin;

                _this.hover(function() {
                    _this.addClass('hover');
                },function() {
                    _this.removeClass('hover');
                });

                for (var j = 0; j < _num; j++) {
                    if(pos[j][1] < pos[_temp][1]){
                        //暂存top值最小那列的index
                        _temp = j;
                    }
                }
                this.style.cssText = 'left:'+pos[_temp][0]+'px; top:'+pos[_temp][1]+'px;';
                //插入后，更新下该列的top值
                pos[_temp][1] = pos[_temp][1] + _height;
            });

            // 计算top值最大的赋给外围div
            (function() {
                var i = 0, tops = [];
                for (; i < _num; i++) {
                    tops.push(pos[i][1]);
                }
                tops.sort(function(a,b) {
                    return a-b;
                });
                $box.height(tops[_num-1]);

                //增加尾部填充div
                if(options.addfooter){
                    addfooter(tops[_num-1]);
                }

            })();

            function addfooter(max) {
                var addfooter = document.createElement('div');
                addfooter.className = 'item additem';
                for (var i = 0; i < _num; i++) {
                    if(max != pos[i][1]){
                        var clone = addfooter.cloneNode(),
                        _height = max - pos[i][1] - options.margin;
                        clone.style.cssText = 'left:'+pos[i][0]+'px; top:'+pos[i][1]+'px; height:'+_height+'px;';
                        $box[0].appendChild(clone);
                    }
                }
            }

        });
    }
})(jQuery);
</script>
	<jsp:include page="./foot.jsp"></jsp:include>
</body>
</html>
