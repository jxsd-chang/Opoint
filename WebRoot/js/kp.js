$(window).resize(function(){
		  flod();
});
$(function(){ 
	    $("#allitem").css({'bottom':10,'top':100});
	    $("#context").css("width",$(window).width()).css("min-height",$("#allitem").height());
	    $('.items2').children(".icon").show();
	    $('.items2').eq(0).children(".icon").hide();
	    $('.items2').eq(0).children(".icon2").show();
	    $(".items").hide();
	    $(".items2").show();
	    $(".items-ul").eq(0).children(".items").show();
	    $(".items-ul").eq(0).children(".items").eq(0).click();
	    $(".items2").each(function(){
	    	$(this).click(function(){
	    		var num=$(this).index()/2;
	    		if($(".items-ul").eq(num).children(".items").is(":visible")){
	    			$(".items-ul").eq(num).children(".items").slideUp(400);
	    			$(this).children(".icon2").hide();
	    			$(this).children(".icon").show();
	    		}
	    		else{
	    			$(".items-ul").eq(num).children(".items").slideDown(400);
	    			$(this).children(".icon2").show();
	    			$(this).children(".icon").hide();
	    		}
	    	});
	    });

	   
	    $("#tab1").click(function(){
	    	var kninfoId = $("#id2").val();
	    	$("#write").hide();
	    	$("#com").show();
	    	$(this).removeClass("tab1");
	    	$("#tab2").addClass("tab1");
	    	//这里是点击选项卡触发
	      	var url = base + "/CommentController/showComm.action";
	    	params = {
	    		knifoid : kninfoId
	    	}
	    	$.post(url,params,function(data){	
	    		$("#com").text("");
	    		if(data.length == 0){
	    			$("#com").append("<div class='null-comment-img'><img src='images/pinglun.png' style='margin-left: 87px;'><p class='null-comment-word'><span>(ಥ_ಥ)</span>还没评论，你的评论也许会给他人起到拨云见日的效果哦<span>(*˘︶˘*)</span></p></div>");
	    		}else{
	    			
	    			for(var i = data.length-1; i >= 0; i--){
	    				var commName = data[i].comm_Name;
	    				var picpath = "";
	    				if(data[i].user_pic == null){
	    					picpath = "images/no_title.jpg";
	    				}else{
	    					picpath = "/resource/pic/tou_pic/"+data[i].user_pic;
	    				}
	    				var commTime = data[i].comment.commTime;
	    				var commInfo = data[i].comment.commInfo;
	    				$("#com").append("<div class='com'><div class='userinfo'>" +
	    						"<img src='"+picpath+"' width='40' height='40'/>"+
	    						"<div class='user2'>"+
	    						"<span class='com-name'>"+commName+"</span>"+
	    						"<span class='com-time' style='margin-left:20px;'>"+data[i].stu_pro+"</span><br>"+
	    						"<span class='com-time'>"+commTime+"</span>"+
	    						"</div></div>"+commInfo+"</div>");
	    			}
	    		}
	    	});
	    });
        $("#tab2").click(function(){
        	//清空输入框
        	if($("#id2").val() == ""){
        		alert("请先点击查看评论按钮！");
        	}else{
        		$("#com").hide();
        		$("#write").show();
        		$(this).removeClass("tab1");
        		$("#tab1").addClass("tab1");
        	}
	    });
       /* 提交*/
        $("#su_btn").click(function(){
    		var url = base + "/CommentController/pubComm.action";
    		var content = CKEDITOR.instances.commInfo.getData(); 
            if(content!=""){
            	params = {
           			 "knifoid":$("#id2").val(),
           			 "commInfo":content
           		};
           		$.post(url,params,function(data){
           			if(data == "err"){
           				alert("你还未登录,前去登录");
           				window.location.href=base+"/login.action";
           			}
           			alert(data);
           		});
            }
            else{
            	alert("输入内容不能为空！");
            }
        });
        
        if($("#stu").val()=="" && $("#tea").val()==""){
        	flod();
        }
        else{
        	flod();
        }
        
        $("#comment2").click(function(){
        	if($("#stu").val()=="" && $("#tea").val()==""){
            		alert("请登录后查看评论区！");
            }
        	else{
        		$("#comment").toggle();
        	}	
        });
});
/* ---------------------------------------------------------------------  */     
/*查看全部评论*/

$(function(){
	$(".items").each(function(){
		var kpId = $(this).children("input").val();
		$(this).children("span").click(function(){
			var url = base+"/KninfoController/getKninfoByKpId.action";
			var params = {
				kpId : 	kpId
			};
			$.post(url,params,function(data){
				$("#centerItem").text("");
				for(var i=0;i<data.length;i++){
					$("#centerItem").append("<div style='margin-top:20px;margin-bottom:40px;'>"+
							" <div style='height:50px;width:100%;'>"+
							"<img src='images/kp_logo.png' style='float:left;'/>"+
							"<span class='tit'>"+data[i].kninfoTitle+"</span></div>"+
							" <hr size='3' class='h'><br><br>"+
							"<img src='/resource/image/knowpoint_image/"+data[i].kninfoContent+"'><br>"+
							"<input type='hidden' class='schidden' value='"+data[i].kpId+"'/>"+
							"<input type='hidden' class='kninfoid' value='"+data[i].kninfoId+"'>"+
							"<div class='CommItems'>"+
							"<div class='collect_sc' id='sc'>收藏</div>"+
							"<div class='collect'  style='float:right;margin-right: 90px;'>查看评论</div></div></div>"
					);
				}
				if($('#tea').val()!=""){
					$('.collect_sc').hide();
				}
				$('html,body').animate({scrollTop:0},400);
			});
		});
	});
})
/*-----------------------------------------------------------------*/
/*$(function(){
			var url = base+"/KninfoController/getKninfoByKpId.action";
			var params = {
				kpId : 1
			};
			$.post(url,params,function(data){
				$("#centerItem").text("");
				for(var i=0;i<data.length;i++){
					$("#centerItem").append("<div style='margin-top:20px;margin-bottom:40px;'>"+
							" <div style='height:50px;width:100%;'>"+
							"<img src='images/kp_logo.png' style='float:left;'/>"+
							"<span class='tit'>"+data[i].kninfoTitle+"</span></div>"+
							" <hr size='3' class='h'><br><br>"+
							"<img src='/resource/image/knowpoint_image/"+data[i].kninfoContent+"'><br>"+
							"<input type='hidden' class='schidden' value='"+data[i].kpId+"'/>"+
							"<button class='collect_sc' id='sc'>收藏</button>"+
							"<input type='hidden' class='kninfoid' value='"+data[i].kninfoId+"'>"+
							"<div class='CommItems'>"+
							"<button class='collect'  style='float: right;margin-right: 90px;margin-top: -30px;'>查看评论</button>"+
							" </div></div>"
					);
				}
			});
})*/
/*===============================================================*/
$(function(){
		$("#centerItem").on("click",".collect",function(e){
			
			//发送ajax请求得到所有评论
			if($("#stu").val()=="" && $("#tea").val()==""){
	    		alert("请登录后查看评论区！");
			}
			else{
			$(".info-img").hide();
			var kninfoId =$(this).parent(".CommItems").prev("input:hidden").val();
		    $("#id2").val(kninfoId);
			$("#write").hide();
	    	$("#com").show();
	    	$("#tab2").addClass("tab1");
	    	$("#tab1").removeClass("tab1");
	    	var url = base + "/CommentController/showComm.action";
	    	params = {
	    		knifoid : kninfoId
	    	}
	    	$.post(url,params,function(data){
	    		$("#com").text("");
	    		if(data.length == 0){
	    			$("#com").append("<div class='null-comment-img'><img src='images/pinglun.png' style='margin-left: 87px;'><p class='null-comment-word'><span>(ಥ_ಥ)</span>还没评论，你的评论也许会给他人起到拨云见日的效果哦<span>(*˘︶˘*)</span></p></div>");
	    		}else{
	    			for(var i = data.length-1; i >= 0; i--){
	    				var commName = data[i].comm_Name;
	    				var commTime = data[i].comment.commTime;
	    				var commInfo = data[i].comment.commInfo;
	    				var picpath = "";
	    				if(data[i].user_pic == null){
	    					picpath = "images/no_title.jpg";
	    				}else{
	    					picpath = "/resource/pic/tou_pic/"+data[i].user_pic;
	    				}
	    				$("#com").append("<div class='com'><div class='userinfo'>" +
	    						"<img src='"+picpath+"' width='40' height='40'/>"+
	    						"<div class='user2'>"+
	    						"<span class='com-name'>"+commName+"</span>"+
	    						"<span class='com-time' style='margin-left:20px;'>"+data[i].stu_pro+"</span><br>"+
	    						"<span class='com-time'>"+commTime+"</span>"+
	    						"</div></div>"+commInfo+"</div>");
	    			}
	    		}
	    	  });
			}
		});
		/*========================================*/
		
		$(".collect").click(function(){
			//发送ajax请求得到所有评论
			if($("#stu").val()=="" && $("#tea").val()==""){
	    		alert("请登录后查看评论区！");
			}
			else{
			var kninfoId =$(".kninfoid").val();
		    $("#id2").val(kninfoId);
			$("#write").hide();
	    	$("#com").show();
	    	$("#tab2").addClass("tab1");
	    	$("#tab1").removeClass("tab1");
	    	var url = base + "/CommentController/showComm.action";
	    	params = {
	    		knifoid : kninfoId
	    	}
	    	
	    	$.post(url,params,function(data){
	    		$("#com").text("");
	    		if(data.length == 0){
	    			$("#com").append("<div class='null-comment-img'><img src='images/pinglun.png' style='margin-left: 87px;'><p class='null-comment-word'><span>(ಥ_ಥ)</span>还没评论，你的评论也许会给他人起到拨云见日的效果哦<span>(*˘︶˘*)</span></p></div>");
	    		}else{
	    			
	    			for(var i = data.length-1; i >= 0; i--){
	    				var commUser = data[i].stuName;
	    				var commTime = data[i].comment.commTime;
	    				var commInfo = data[i].comment.commInfo;
	    				var picpath = "";
	    				if(data[i].user_pic == null){
	    					picpath = "images/no_title.jpg";
	    				}else{
	    					picpath = "/resource/pic/tou_pic/"+data[i].user_pic;
	    				}
	    				$("#com").append("<div class='com'><div class='userinfo'>" +
	    						"<img src='"+picpath+"' width='40' height='40'/>"+
	    						"<div class='user2'>"+
	    						"<span class='com-name'>"+commName+"</span>"+
	    						"<span class='com-time' style='margin-left:20px;'>"+data[i].stu_pro+"</span><br>"+
	    						"<span class='com-time'>"+commTime+"</span>"+
	    						"</div></div>"+commInfo+"</div>");
	    			}
	    		}
	    	  });
			}
		});
		
		
		
		
});
/*===============================================================*/
$(function(){
	$(".centerItem").on("click",".collect_sc",function(){
		if($("#stu").val()=="" && $("#tea").val()==""){
			alert("收藏前请先登录");
		}else if($("#stu").val()!=""){
			var url = base+"/CollectController/scknowpoint.action";
			var params={
				stuid:$("#stuid").val(),
				kninfoid:$(this).parent().prev(".kninfoid").val()
			}
			$.post(url,params,function(data){
					$('#succ2').html(data);
				    var halfdivheight=$("#succ2").height()/2;
					var halfdivwidth=$("#succ2").width()/2;
				    var top = document.body.clientHeight/2 - halfdivheight;
				    var left = $(window).width()/2 - halfdivwidth;   
				    var scrollTop = $(document).scrollTop();   
				    var scrollLeft = $(document).scrollLeft();
				    $("#succ2").css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).fadeIn(300).delay(1000).fadeOut(300);
			});
		}
	});
})

function flod(){
	var minwidth=$("#allitem").width()+$("#centerItem").width()+350;
	var truewidth=$(window).width();
	if(truewidth<minwidth){
		    $("#comment").hide();
			$("#comment2").show();
	}
	else{
		if($("#stu").val()=="" && $("#tea").val()==""){
			$("#comment").hide();
			$("#comment2").show();
		}
		else{
			 $("#comment2").hide();
			 $("#comment").show();
		}
	}
}
