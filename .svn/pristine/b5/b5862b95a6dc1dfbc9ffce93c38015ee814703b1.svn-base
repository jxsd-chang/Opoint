$(function(){
	$(".mulu_a").mouseout(function(){
       $(this).css("color","black")
    })
    $(".mulu_a").mouseover(function(){
       $(this).css("color","05BC00")//进去颜色
    })
    $(".bgcolor").mouseover(function(){
    	$(".collection").show();
    });
	$(".bgcolor").mouseout(function(){
		$(".collection").hide();
	});
			
	/*===========================================*/
    $(".bgcolor").find("li").each(function(){
      $(this).hover(function(){
        $(this).addClass("lihover");
        $(this).next(".btnn").css("visibility","visible");
      },function(){
        $(this).removeClass("lihover");
        $(this).next(".btnn").css("visibility","hidden");
      });
   });

   
   $(".btnn").each(function(){
	   $(this).hover(function(){
           $(this).prev("li").addClass("lihover");
           $(this).css("visibility","visible");
        },function(){
        	$(this).css("visibility","hidden");
        	$(this).prev("li").removeClass("lihover");
        });
        $(this).children(".no").click(function(){
        	if($("#stu").val()=="" && $("#tea").val()==""){
	    		alert("请先登录");
			}else if($("#stu").val()!=""){
				 $.post("CollectController/scvideo.action",{stuid:$("#stuid").val(),vid:$(this).parent().prev("li").children("input").val()},function(){
	            	   alert("收藏成功");
	             })
	             //设置1
	           $(this).siblings("input").val("1"); 
               $(this).hide();
               $(this).next(".yes").show(); 
			}
              
         });
         $(this).children(".yes").click(function(){
        	 //没有登陆不能取消收藏
        	 if($("#stu").val()=="" && $("#tea").val()==""){
 	    		alert("请先登录");
 			}else{
	           $.post("CollectController/qxvideo.action",{vid:$(this).parent().prev("li").children("input").val()},function(){
	        	   alert("已取消收藏");
	           })
	           $(this).hide();
	           $(this).prev(".no").show(); 
 			}
         });
         
   });
});
$(function(){
	$(".btnn").each(function(){
		var flag = $(this).children("input:hidden").val();
         if(flag == "1"){
        	 $(this).children(".no").hide();
        	 $(this).children(".yes").show();
         }else if(flag=="0"){
        	 $(this).children(".no").show();
        	 $(this).children(".yes").hide();
         }
	});
})
