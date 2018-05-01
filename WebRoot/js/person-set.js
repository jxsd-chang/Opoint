 $(window).scroll(function() {
	 if($('.infox2').is(':visible')||$(".message-config3").is(':visible')){
		 $('.infox2').fadeOut(300);
		 $('.message-config3').fadeOut(300);
	 }
 });


$(function(){
	$("#showtouxiang").show();
	$("#showupdatePwd").hide();
	$(".setting li").eq(0).addClass("act");
	$(".count").each(function(){
		if($(this).html()=="0"){
			$(this).hide();
		}
	});
	
	$(".changePwd").find(".pwd").each(function(){
		$(this).focus(function(){
			$(this).css("border","1px solid #09C");
			});
		$(this).blur(function(){
			$(this).css("border","1px solid #666");
			});
		});
	
	$('#pwd2').blur(function(){
		var mi=$(this).val();
		if(/^\w{6,16}$/.test(mi)){
			$("#cuo").css("opacity","0");}
		else{
			if(mi==""){
				$("#cuo").css("opacity","0");
			}
			else{
				$("#cuo").css("opacity","1");}
		  }
		});
	
	$("#submit-btn").click(function(){
		if($("#pwd1").val()==""||$("#pwd2").val()==""||$("#pwd3").val()==""){
			alert("请填写完相关输入信息！");
		}else{
				if($("#pwd2").val()!=$("#pwd3").val()){
					alert("新密码和确认密码不相同！");
				}
				else{
					//ajax事件
					var url ="StudentController/updatePwd.action"
					$.post(url,{
						//用户账号则靠session获取
						stuId:$("#stuid").val(),
						oldpwd:$("#pwd1").val(),
						newpwd:$("#pwd2").val()
						},
						function(result){
							if($.trim(result)=="ok"){
								alert("密码修改成功！");
							}
							else if($.trim(result)=="no"){
								alert("原密码输入错误！请核对你的密码！");
								}
						});
					}
			}
		});
	//点击个人设置里的上传头像
	$("#touxiang").click(function(){
		$('.show').hide().eq(0).show();
		$(".setting li,.collect li,.info li").removeClass("act");
		$(".setting li").eq(0).addClass("act");
	});
	//点击个人设置里的修改密码
	$("#updatePwd").click(function(){
		$('.show').hide().eq(1).show();
		$(".setting li,.collect li,.info li").removeClass("act");
		$(".setting li").eq(1).addClass("act");
	});
	//点击左边个人收藏里的知识点
	$("#knowPoint").click(function(){
		$('.show').hide().eq(3).show();
		$(".setting li,.collect li,.info li").removeClass("act");
		$(".collect li").eq(1).addClass("act");
	});
	
	//点击左边个人收藏里的错题
	$("#brush").click(function(){
		$('.show').hide().eq(4).show();
		$(".setting li,.collect li,.info li").removeClass("act");
		$(".collect li").eq(2).addClass("act");
	});
	//点击左边个人收藏里的视频
	$("#video").click(function(){
		$('.show').hide().eq(2).show();
		$(".setting li,.collect li,.info li").removeClass("act");
		$(".collect li").eq(0).addClass("act");
	});
	//点击我的消息
	$("#myinfo").click(function(){
		$('.show').hide().eq(5).show();
		$(".setting li,.collect li,.info li").removeClass("act");
		$(".info li").eq(0).addClass('act');
	});
	//点击系统消息
	$("#systeminfo").click(function(){
		$('.show').hide().eq(6).show();
		$(".setting li,.collect li,.info li").removeClass("act");
		$(".info li").eq(1).addClass('act');
	});
	
	//点击视频============================================================================================
	$("#video").click(function(){
		var url = "CollectController/getVideoList.action";
		$.post(url,{stuid:$("#stuid").val()},function(data){
			$("#showVideo").text("");
			$("#showVideo").append("<center><p class='tit'>视频收藏</p></center>");
			for(var i=0;i<data.length;i++){
				$("#showVideo").append("<div class='videoUl'><a href='VideoController/tjVideo.action?vid="+data[i].vioId+"' target='_blank'>"+
						                data[i].vioItem+"</a></div>");
			}
			if($("#showVideo").find('.videoUl').length==0){
				$("#showVideo").append("<div class='empty'><div class='empty-slogon'><span>(╥╯﹏╰╥)ง</span><span>,空空如也</span></div></div>");
			}
		});
	});
	//点击知识点============================================================================================
	$("#knowPoint").click(function(){
		var url= "CollectController/getknowPointList.action";
		$.post(url,{stuid:$("#stuid").val()},function(data){
			$("#showknowPoint").text("");
			$("#showknowPoint").append("<center><p class='tit'>知识点收藏</p></center>");
			for(var i=0;i<data.length;i++){
				$("#showknowPoint").append("<div><img src='/resource/image/knowpoint_image/"+data[i].kninfoContent+"'>" +
						"<div class='divbtn'>"+
						"<input type='hidden' value='"+data[i].kninfoId+"'>"+
						"<a href='BrushTitleController/tjBrush.action?kpid="+data[i].kpId+"' class='kbtn' id='gst' target>去刷题</a>"+
						"<button class='kbtn' id='gsc'>已学会</button>"+
						"</div><div style='clear:both;'></div></div>");
			}
			if($("#showknowPoint").find('img').length==0){
				$("#showknowPoint").append("<div class='empty'><div class='empty-slogon'><span>(╥╯﹏╰╥)ง</span><span>,空空如也</span></div></div>");
			}
		});
	})
	//已学会
	$("#showknowPoint").on("click","#gsc",function(){
		  var halfdivheight=$(".message-config3").height()/2;
		  var halfdivwidth=$(".message-config3").width()/2;
	      var top = document.body.clientHeight/2 - halfdivheight;
	      var left = $(window).width()/2 - halfdivwidth;   
	      var scrollTop = $(document).scrollTop();   
	      var scrollLeft = $(document).scrollLeft(); 
	      var kninfoid = $(this).prevAll("input").val();
	      $("#isDelKnowpoint").val(kninfoid);
	      $(".message-config3").css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).show(500);
	});
	$("#yes").click(function(){
  	  	$(".message-config3").fadeOut("slow");
  	  	//重新请求页面
		$.post("CollectController/getbrushList.action",{stuid:$("#stuid").val()},function(data){
			$("#showBrush").text("");
			$("#showBrush").append("<center><p class='tit'>题目收藏</p></center>");
			for(var i=0;i<data.length;i++){
				$("#showBrush").append("<div class='kno-img-list'><img src='/resource/image/brushtitle_image/"+data[i].brushTitle+"'>"+
						               "<div class='divbtn'>" +
						               "<input type='hidden' value='"+data[i].brushId+"'>"+
						               "<a  class='kbtn' id='gsc2' >查看解析</a>"+
						               "<button class='kbtn' id='gsc'>已学会</button></div><div style='clear:both;'></div></div>");
			}
		});
		
		$.ajax({
			async: false,
			url:"CollectController/qxknowpoint.action",
			data:{kninfoid:$("#isDelKnowpoint").val()},
		})
	   //重新请求页面
	 })
	//点击题目============================================================================================
	$("#brush").click(function(){
		var url= "CollectController/getbrushList.action";
		$.post(url,{stuid:$("#stuid").val()},function(data){
			$("#showBrush").text("");
			$("#showBrush").append("<center><p class='tit'>题目收藏</p></center>");
			for(var i=0;i<data.length;i++){
				$("#showBrush").append("<div  class='kno-img-list'><img src='/resource/image/brushtitle_image/"+data[i].brushTitle+"'>"+
						               "<div class='divbtn'>" +
						               "<input type='hidden' value='"+data[i].brushId+"'>"+
						               "<a  class='kbtn' id='gsc2' >查看解析</a>"+
						               "<button class='kbtn' id='gsc'>已学会</button></div><div style='clear:both;'></div></div>");
			}
			if($("#showBrush").find('img').length==0){
				$("#showBrush").append("<div class='empty'><div class='empty-slogon'><span>(╥╯﹏╰╥)ง</span><span>,空空如也</span></div></div>");
			}
		});
	});
	

	//已学会
	$("#showBrush").on("click","#gsc",function(){
		  var halfdivheight=$(".message-config3").height()/2;
		  var halfdivwidth=$(".message-config3").width()/2;
	      var top = document.body.clientHeight/2 - halfdivheight;
	      var left = $(window).width()/2 - halfdivwidth;   
	      var scrollTop = $(document).scrollTop();   
	      var scrollLeft = $(document).scrollLeft(); 
	      var brushid = $(this).prevAll("input").val();
	      $("#isDelBrush").val(brushid);
	      $(".message-config3").css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).show(500);
		});
	$("#yes").click(function(){
    	  $.post("CollectController/qxbrush.action",{brushid:$("#isDelBrush").val()});
    	  $.post("CollectController/qxknowpoint.action",{kninfoid:$("#isDelKnowpoint").val()});
    	  $(".message-config3").fadeOut("slow");
    	  $.ajax({
    		  url:"CollectController/getbrushList.action",
    		  data:{
    			  stuid:$("#stuid").val()
    		  },
    	  	  success:function(data){
    	  		$("#showBrush").text("");
    			$("#showBrush").append("<center><p class='tit'>题目收藏</p></center>");
    			for(var i=0;i<data.length;i++){
    				$("#showBrush").append("<div class='kno-img-list'><img src='/resource/image/brushtitle_image/"+data[i].brushTitle+"'>"+
    						               "<div class='divbtn'>" +
    						               "<input type='hidden' value='"+data[i].brushId+"'>"+
    						               "<a  class='kbtn' id='gsc2' >查看解析</a>"+
    						               "<button class='kbtn' id='gsc'>已学会</button></div><div style='clear:both;'></div></div>");
    			}
    			if($("#showBrush").find('img').length==0){
    				$("#showBrush").append("<div class='empty'><div class='empty-slogon'><span>(╥╯﹏╰╥)ง</span><span>,空空如也</span></div></div>");
    			}
    	  	  }
    	  });
    	  
    	 $.ajax({
    		 url : "CollectController/getknowPointList.action",
    		 data:{
    			 stuid:$("#stuid").val()
    		 },
    		 success:function(data){
    			 $("#showknowPoint").text("");
    	  			$("#showknowPoint").append("<center><p class='tit'>知识点收藏</p></center>");
    	  			for(var i=0;i<data.length;i++){
    	  				$("#showknowPoint").append("<div><img src='/resource/image/knowpoint_image/"+data[i].kninfoContent+"'>" +
    	  						"<div class='divbtn'>"+
    	  						"<input type='hidden' value='"+data[i].kninfoId+"'>"+
    	  						"<a href='BrushTitleController/tjBrush.action?kpid="+data[i].kpId+"' class='kbtn' id='gst' target>去刷题</a>"+
    	  						"<button class='kbtn' id='gsc'>已学会</button>"+
    	  						"</div><div style='clear:both;'></div></div>");
    	  			}
    	  			if($("#showknowPoint").find('img').length==0){
    	  				$("#showknowPoint").append("<div class='empty'><div class='empty-slogon'><span>(╥╯﹏╰╥)ง</span><span>,空空如也</span></div></div>");
    				}
    		 }
    	 })
    	  
	 })
	$(".no").click(function(){
		$(".message-config3").fadeOut("slow");
	})	
	$(".close3").click(function () { 
	      $(".message-config3").fadeOut("slow");
    });
	//点击查看解析弹窗出现
	$("#showBrush").on("click","#gsc2",function(){
		  $.post("BrushTitleController/getPaper.action",{brushid:$(this).prev("input").val()},function(data){
			 $("#parse").attr("src","/resource/image/brushtitle_parse_image/"+data+"");
		  });
		  var halfdivheight=$(".message-config2").height()/2;
		  var halfdivwidth=$(".message-config2").width()/2;
	      var top = document.body.clientHeight/2 - halfdivheight;
	      var left = $(window).width()/2 - halfdivwidth;   
	      var scrollTop = $(document).scrollTop();   
	      var scrollLeft = $(document).scrollLeft();   
	      $(".message-config2").css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).show(500);
	});
	$("#close2").click(function () { 
	      $(".message-config2").fadeOut("slow");
    });
});

//头像上传
$(function(){
	var canvas = document.getElementById("container"),
	context = canvas.getContext("2d"),
	//文件服务器地址
	fileServer = "admin/fileUpload.do",
	//适配环境，随时修改事件名称
	eventName = { down: "mousedown", move: "mousemove", up: "mouseup", click: "click" };
	//////////canvas尺寸配置
	var canvasConfig = {
		width: 300,
		height: 300,
		zoom: 1,
		img: null,
		size: null,
		//图片绘制偏移，为了原图不移出框外，这个只能是负值or 0
		offset: { x: 0, y: 0 },
	}
	canvas.width = canvasConfig.width;
	canvas.height = canvasConfig.height;
	///////////设置选择工具配置
	var config = {
	//图片选择框当前大小、最大大小、最小大小
		pickerSize: 50,
		x: canvas.width / 2 - 100 / 2,
		y: canvas.height / 2 - 100 / 2
	}
	/////////////结果canvas配置
	var resCanvas = [$("#res1")[0].getContext("2d"), $("#res2")[0].getContext("2d"), $("#res3")[0].getContext("2d")];
	//结果canvas尺寸配置
	var resSize = [100, 50, 32]
	resSize.forEach(function (size, i) {
		$("#res" + (i + 1))[0].width = 100;
		$("#res" + (i + 1))[0].height = 100;
	});


	//绑定选择图片事件
	$("#fileinput").change(function () {
		var file = this.files[0],
		    URL = (window.webkitURL || window.URL),
		    url = URL.createObjectURL(file),
		    img = new Image();
			img.src = url;
			img.onload = function () {
		    canvasConfig.img = img;
		    canvasConfig.size = getFixedSize(img, canvas);
		    draw(context, img, canvasConfig.size);
		    setPicker();
		}
	});

	$(document).on(eventName.up, function (e) {
	   $("#canvasContainer").unbind(eventName.move);
	})

	//绘制canvas中的图片和蒙版
	function draw(context, img, size) {
		var pickerSize = config.pickerSize,
	    zoom = canvasConfig.zoom,
	    offset = canvasConfig.offset;
		context.clearRect(0, 0, canvas.width, canvas.height);
		context.drawImage(img, 0, 0, img.width, img.height, offset.x, offset.y, size.width * zoom, size.height * zoom);
		//绘制挖洞后的蒙版
		context.save();
		context.beginPath();
		pathRect(context, config.x, config.y, 100, 100);
		context.rect(0, 0, canvas.width, canvas.height);
		context.closePath();
		context.fillStyle = "rgba(255,255,255,0.3)";
		context.fill();
		context.restore();
		//绘制结果
		var imageData = context.getImageData(config.x, config.y, 100, 100)
		resCanvas.forEach(function (resContext, i) {
		    resContext.clearRect(0, 0, 100, 100);
		    resContext.drawImage(canvas, config.x, config.y, 100, 100, 0, 0, 100,100);
		});
	}
	//根据图片和canvas的尺寸，确定图片显示在canvas中的尺寸
	function getFixedSize(img, canvas) {
		var cancasRate = canvas.width / canvas.height,
		    imgRate = img.width / img.height, width = img.width, height = img.height;
		if (cancasRate >= imgRate && img.height > canvas.height) {
		    height = canvas.height;
		    width = imgRate * height;
		}
		else if (cancasRate < imgRate && img.width > canvas.width) {
		    width = canvas.width;
		    height = width / imgRate;
		}
		return { width: width, height: height };
		}  
});

$(function(){
	//点击查看提问解答
	$(".infoItem").each(function(){
		$(this).click(function(){
			$(this).parent().next('.qa').fadeToggle(300);
		});
	});
	
	//点击X出现删除框
	$('.infox').each(function(){
		$(this).on("click",function(event){
			event.stopPropagation();
			//获取该提问回答的ID
			$("#askId").val($(this).next("input").val());
			var halfdivheight=$('.infox2').height()/2;
			var halfdivwidth=$('.infox2').width()/2;
		    var top = document.body.clientHeight/2 - halfdivheight;
		    var left = $(window).width()/2 - halfdivwidth;   
		    var scrollTop = $(document).scrollTop();   
		    var scrollLeft = $(document).scrollLeft();   
		    $('.infox2').css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).fadeIn(300);
		});
	});
	$('.xx').click(function(){
		$('.infox2').fadeOut(300);
	});
	//确认删除按钮
	$('.xx2').click(function(){
		$.post("StudentController/delAskByaskid.action",{askid:$("#askId").val()},function(){
			$('.infox2').hide();
		})
		var halfdivheight=$(".suc").height()/2;
		var halfdivwidth=$(".suc").width()/2;
		var top =document.body.clientHeight/2 - halfdivheight;
		var left = $(window).width()/2 - halfdivwidth;   
		var scrollTop = $(document).scrollTop();   
		var scrollLeft = $(document).scrollLeft();   
		$(".suc").css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).fadeIn(300).delay(1000).fadeOut(300);
		$('.infox').each(function(){
			if($(this).next("input").val()==$("#askId").val()){
				$(this).parent('.infoItem0').next('.qa').remove();
				$(this).parent('.infoItem0').remove();
			}
		});
	});
	$(document).bind("click",function(event){
		var div=$('.infox2');
		 if(!div.is(event.target) && div.has(event.target).length === 0){ 
	           div.fadeOut(300);
	        }
	});
	//点击查看附件
	$('.fu').each(function(){
		$(this).on("click",function(event){
			event.stopPropagation();
			var img=$(this).next('img');
			var halfdivheight=img.height()/2;
			var halfdivwidth=img.width()/2;
			var top = document.body.clientHeight/2 - halfdivheight;
			var left = $(window).width()/2 - halfdivwidth;   
			var scrollTop = $(document).scrollTop();   
			var scrollLeft = $(document).scrollLeft();   
			img.css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).show(500);
		});
	});
	//点击空白处附件图片消失
	$(document).bind("click",function(event){
		var img = $('.fu2');  // 设置目标区域
        if(!img.is(event.target) && img.has(event.target).length === 0){ 
           img.fadeOut(300);
        }
	});
	
	$(".banji").each(function(){
		$(this).click(function(){
			var can=$(this).parent().parent().parent().parent().next('.can');
			var mes=can.next('.message-configg');
			$("#claid").val($(this).parent().parent().prev("input").val());
			$.post("ClagradeController/getClaByClaid.action",{claid:$("#claid").val()},function(data){
				$("#graNo").text(data.claNo);
				$("#graInfo").val(data.claIntro);
				$("#graCap").text(data.claCapacity);
			})
			tanchuang(mes,can);
		});
	});
	//弹窗关闭
	$(".close").click(function () { 
	      $(".can").fadeOut("slow");
	      $(".message-configg").fadeOut("slow");
    });
	
	//点击加入班级按钮
	$('#yes2').click(function(){
		$.post("ClagradeController/stuJoinCla.action",{sid:$("#stuid").val(),claid:$("#claid").val()},function(data){
			if(data=="no"){
				alert("你已经在该班级中");
				$(".can").fadeOut("slow");
				$(".message-configg").fadeOut("slow");
				
			}else{
				alert("成功加入该班级");
				$(".can").fadeOut("slow");
			    $(".message-configg").fadeOut("slow");
			}
		})
	});
	//点赞功能
	$(".dianzan").each(function(){
		$(this).click(function(){
			var $this = $(this);
			$.post("TeacherController/dianzan.action",{teaid:$(this).nextAll("input").val()},function(data){
				$this.hide();
				$this.next('.zan').show();
				var clone=$this.next('.zan').clone();
				var zz=$this.parent('.zz');
				clone.addClass(' zan2').appendTo(zz).animate({opacity:'0',bottom:'70px'},1000);
			})
		})
	});
	//点击红心
	$(".zan").on('click',function(){
		var zz=$(this).parent('.zz');
		$(this).clone().addClass(' zan2').appendTo(zz).animate({opacity:'0',bottom:'70px'},1000);
	});

});
//文件上传类型及大小控制
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
                }
            })
        }
	}



//封装弹窗JS函数
function tanchuang(win1,win2){
	var halfdivheight=win1.height()/2;
	var halfdivwidth=win1.width()/2;
    var top = document.body.clientHeight/2 - halfdivheight;
    var left = $(window).width()/2 - halfdivwidth;   
    var scrollTop = $(document).scrollTop();   
    var scrollLeft = $(document).scrollLeft();   
    win2.css( {position: 'absolute',top:0,left:0, width: $(document).width()
    , height: $(document).height()}).show();
    win1.css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).show(500);
}