/**
 * 选择教师提问页面
 */
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
                }else {
                	$(this).parent().prev(".file_name").val(file_name);
                	
                }
            })
        }
	}


$(function(){
	$(".teacher").each(function() {
		$(this).hover(function(){
			$(this).children("h3").hide();
			$(this).children(".detail-teacher").stop().slideDown(300);
		},function(){
			$(this).children(".detail-teacher").stop().slideUp(300);
			$(this).children("h3").show();
		})
	});
	
	//点击关注
	$('.guanzhu').each(function(){
		if($(this).parent().next(".flag").val()=="1"){
			$(this).html("取消关注");
			$(this).click(function(){
				$.ajax({
					async: false,
					url:"TeacherController/qxattention.action",
					data:{sid:$("#sid").val(),tid:$(this).parent().nextAll(".summary-teacher").children(":hidden").val()},
					success:function(){
						//alert("取消成功")
						var halfdivheight=$(".success").height()/2;
						var halfdivwidth=$(".success").width()/2;
						var top = $(window).height()/2 - halfdivheight;
					    var left = $(window).width()/2 - halfdivwidth;   
					    var scrollTop = $(document).scrollTop();   
					    var scrollLeft = $(document).scrollLeft();   
					    $("#del").css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).fadeIn(300).delay(1000).fadeOut(300);
						setTimeout("window.location.href = 'TeacherController/getAllTeacher.action'",1500);
					}
				})
			});
		}else if($(this).parent().next(".flag").val()=="0"){
			$(this).html("我要关注");
			$(this).click(function(){
				$.ajax({
					async: false,
					url:"TeacherController/attention.action",
					data:{sid:$("#sid").val(),tid:$(this).parent().nextAll(".summary-teacher").children(":hidden").val()},
					success:function(){
						var halfdivheight=$(".success").height()/2;
						var halfdivwidth=$(".success").width()/2;
					    var top = $(window).height()/2 - halfdivheight;
					    var left = $(window).width()/2 - halfdivwidth;   
					    var scrollTop = $(document).scrollTop();   
					    var scrollLeft = $(document).scrollLeft();   
					    $("#suc").css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).fadeIn(300).delay(1000).fadeOut(300);
					    setTimeout("window.location.href = 'TeacherController/getAllTeacher.action'",1500);
					}
				})
			});
		}
	});
	
	//点击提问弹框
	$('.tiwen').each(function(){
		$(this).click(function(){
			tanchuang(".ti",".can");
			var teaName=$(this).parent().parent().prev('h3').html();
			$('.ti3').children('span').html(teaName);
			$("#teaid").val($(this).prev("input").val());
		});
	});
	//
	$(".check-tijiao").hover(function(){
		if(($(".article").val() !="")){
			$(".btnNot").css("display","none");
		}else{
			$(".btnNot").show();
		}
	});
	//点击提交
	$("#subbtn").click(function(){
		var tid = $(this).prev("#teaid").val();
		var askInfo = $(this).parent().prevAll(".write").children(".article").val();
		$("#askInfo").val(askInfo);
		$("#askform").attr("action","StudentController/askTea.action");
		$("#askform").submit();
		alert("提交成功");
	})
	
	//关闭弹窗
	$('.x').click(function(){
		$('.can').hide();
		$('.ti').slideUp(300);
	});
	
	//点击提问框
	$('.article').click(function(){
		$(this).css("border","2px solid #0fc2f7");
	});
	
	$('.article').blur(function(){
		$(this).css("border","2px solid #c9c9c9");
	});
});

//封装弹窗JS函数
function tanchuang(win1,win2){
	var halfdivheight=$(win1).height()/2;
	var halfdivwidth=$(win1).width()/2;
    var top = $(window).height()/2 - halfdivheight;
    var left = $(window).width()/2 - halfdivwidth;   
    var scrollTop = $(document).scrollTop();   
    var scrollLeft = $(document).scrollLeft();   
    $(win2).css( {position: 'absolute',top:0,left:0, width: $(document).width()
    , height: $(document).height()}).show();
    $(win1).css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).slideDown(300);
}