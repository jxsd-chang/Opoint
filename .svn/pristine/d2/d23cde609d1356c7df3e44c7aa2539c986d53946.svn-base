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
	
	    //点击输入框变色
	    $(".infoInput,textarea").focus(function(){
	    	$(this).css("border","2px solid #32a7ed");
	    });
	    //失去焦点变回颜色
	    $(".infoInput,textarea").blur(function(){
	    	$(this).css("border","2px solid #b0b0b0");
	    });
	    
        //点击创建班级按钮
		$("#newclass").click(function(){
			tanchuang("#message-config",".can");
		});
		//弹窗关闭
		$(".close").click(function () { 
		      $(".can").fadeOut("slow");
		      $(".message-config").fadeOut("slow");
        });
		
		//删除
		$(".delCla").each(function(){
			
			$(this).click(function(){
				$('#cid').val($(this).parent().parent().prev("input").val());
				var halfdivheight=$("#message-config3").height()/2;
				var halfdivwidth=$("#message-config3").width()/2;
			    var top = $(window).height()/2 - halfdivheight;
			    var left = $(window).width()/2 - halfdivwidth;   
			    var scrollTop = $(document).scrollTop();   
			    var scrollLeft = $(document).scrollLeft();   
			    $("#message-config3").css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).fadeIn(300);
			});
		});
		$('.no').click(function(){
			$("#message-config3").fadeOut(300);
		});
		$('#yesDel').click(function(){
			$.post("ClagradeController/deleCla.action",{claid:$('#cid').val()},function(data){
				if(data=="ok"){
					window.location.href="ClagradeController/getAllCla.action";
				}
			});
		});
		
		//班级编号和人数上限只能输入正整数
		$("#num,#graNo").blur(function(){
			var num=$(this).val();
			var reg=/^([0-9]*)$/;
			if(reg.test(num)){
				$(this).next("span").hide();
			}
			else{
				if(num==""){
				  $(this).next("span").hide();
			    }else{
				  $(this).next("span").show();
			    }
			}	
		});
		$("#perNum,#graCount").blur(function(){
			var perNum=$(this).val();
			var reg=/^([0-9]*)$/;
			if(reg.test(perNum)){
				$(this).next("span").hide();
			}
			else{
				if(perNum==""){
				  $(this).next("span").hide();
			    }else{
				  $(this).next("span").show();
			    }
			}	
		});
		$(".infoInput").focus(function(){
			$(this).next("span").hide();
		});
		
		//点击修改按钮
		$(".changeInfo").each(function(){
			$(this).click(function(){
				$.post("ClagradeController/toupdateCla.action",{claid:$(this).parent().parent().prev("input").val()},function(data){
					$("#graid").val(data.claId);
					$("#graNo").val(data.claNo);
					$("#graName").val(data.claName);
					$("#graCount").val(data.claCapacity);
					$("#graInfo").val(data.claIntro);
				});
				tanchuang("#message-config2",".can");
			})
		})
		
		//点击查看学生
		$('.see').each(function(){
			$(this).click(function(){
				//获取当前班级号
				var id=$(this).parent().parent().prev("input").val();
				$.post("ClagradeController/getstuListByclaid.action",{claid:id},function(data){
					if(data == ""){
						$(".list3").html("<div class='non-stu-list'><img src='./images/run.png'><span class='non-stu-tishi'>一大波学生正在赶来</span></div>");
					}else{
						var content ="";
						for(var i=0;i<data.length;i++){
							var pic = data[i].stuPic;
							var name = data[i].stuName;
							var pro = data[i].stuPro;
							var grade = data[i].stuGrade;
							if(pic == null){
								pic = "images/no_title.jpg";
							}else{
								pic = "/resource/pic/tou_pic/"+pic;
							}
							if(name == null){
								name = "无名氏";
							}
							content += "<li><img src="+pic+" class='stuimg'/><div class='stu-xinxi'><span>"+name+"</span><br><span class='list4'>"+pro+"</span><span class='list5'>"+grade+"</span></div></li>";
						}
						$(".list3").html(content);
					}
				})
				$('.stulist').toggle(300);
				
			});
		});
		//关闭查看学生
		$('#hid').click(function(){
			$('.stulist').fadeOut(300);
		});
/*====点击发布作业弹框============================*/
		$('.fabu').each(function(){
			$(this).click(function(){
				var claName=$(this).parent().parent().children("td").eq(1).html();
				$('.ti3').children('span').html(claName);
				$("#claid").val($(this).parent().parent().prev("input").val());
				tanchuang(".ti",".can");
			});
		});
		//点击提交
		$(".timeOut").change(function(){
		    $(".timeOut").attr("value",$(this).val()); //赋值
		});
		$(".check-tijiao").hover(function(){
			
			if(($(".article").val() !="") && ($(".main-summary").val() !="")&& ($(".timeOut").val()!="")){
				$(".btnNot").css("display","none");
			}else{
				$(".btnNot").show();
			}
		});
		$("#submithome").click(function(){
				var homeInfo = $(this).parent().prevAll(".write").children(".article").val();
				$("#homeInfo").val(homeInfo);
				$("#homeform").attr("action","TeacherController/submitWork.action");
				$("#homeform").submit();
				alert("提交成功");
		})
		
		//关闭弹窗
		$('.x').click(function(){
			$('.can').hide();
			$('.ti').slideUp(300);
		});
		
		//点击提问框
		$(".article,.main-summary,.timeOut").click(function(){
			$(this).css("border","2px solid #0fc2f7");
		});
		
		$(".article,.main-summary,.timeOut").blur(function(){
			$(this).css("border","2px solid #c9c9c9");
		});
		
		
		
/*-===============发布作业结束========================*/	
		
		
		
		//封装弹窗JS函数
		function tanchuang(win1,win2){
			var halfdivheight=$(win1).height()/2;
			var halfdivwidth=$(win1).width()/2;
		   // var top = document.body.clientHeight/2 - halfdivheight;
			var top = $(window).height()/2 - halfdivheight;
		    var left = $(window).width()/2 - halfdivwidth;   
		    var scrollTop = $(document).scrollTop();   
		    var scrollLeft = $(document).scrollLeft();   
		    $(win2).css( {position: 'absolute',top:0,left:0, width: $(document).width()
		    , height: $(document).height()}).show();
		    $(win1).css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).fadeIn(300);
		}
});