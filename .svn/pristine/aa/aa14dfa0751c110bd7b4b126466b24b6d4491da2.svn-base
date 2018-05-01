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



$(function(){
	$("#Teapicture").hide();
	$("#person").show();
	
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
					var url ="TeacherController/updatePwd.action"
					$.post(url,{
						//用户账号则靠session获取
						teaId:$("#teaid").val(),
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
	
		//点击个人设置按钮
		$("#personSet").click(function(){
			$(".collect li").removeClass("act").eq(0).addClass("act");
			$("#Teapicture").hide();
			$("#person").show();
		});
		
		//点击上传头像按钮
		$("#touxiang").click(function(){
			$(".collect li").removeClass("act").eq(1).addClass("act");
			$("#Teapicture").show();
			$("#person").hide();
		});
});

//封装弹窗JS函数
function tanchuang(win1,win2){
	var halfdivheight=$(win1).height()/2;
	var halfdivwidth=$(win1).width()/2;
    var top = document.body.clientHeight/2 - halfdivheight;
    var left = $(window).width()/2 - halfdivwidth;   
    var scrollTop = $(document).scrollTop();   
    var scrollLeft = $(document).scrollLeft();   
    $(win2).css( {position: 'absolute',top:0,left:0, width: $(document).width()
    , height: $(document).height()}).show();
    $(win1).css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).show(500);
}


//头像上传
$(function(){
	var canvas = document.getElementById("container"),
	context = canvas.getContext("2d"),

	//适配环境，随时修改事件名称
	eventName = { down: "mousedown", move: "mousemove", up: "mouseup", click: "click" };
	//////////canvas尺寸配置
	var canvasConfig = {
		width: 250,
		height: 250,
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