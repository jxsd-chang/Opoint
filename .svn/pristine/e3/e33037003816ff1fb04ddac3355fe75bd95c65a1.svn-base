$(window).resize(function(){
		  flod();
});
function flod(){
	var minwidth=$("#allitem").width()+$("#center").width()+350;
	var truewidth=$(window).width();
	if(truewidth<minwidth){
		    $(".cuoti").hide();
		    $("#rem").hide(400);
	}
	else{
		$(".cuoti").show();
	}
}
$(function(){ 
	    flod();
	    
	    if($("#stu").val()=="" && $("#tea").val()==""){    
	    	$("#rem2").show();
	    }
	    else{
	    	$("#rem2").hide();
	    }
	
	    $("#nav-menu").children("li").eq(3).addClass("actived");
	    $(".s1").hide();
  	    $(".service").css("bottom","200px");
  	    $(".service").css("height","60px");
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
    /* ==============================================================================*/
	  $(".items").each(function(){
		  $(this).children("span").click(function(){
			  var url ="BrushTitleController/getBrushByKpid.action";
			  var params = {
					kpid : $(this).prev(".kpId").val()
			  }
			  $.post(url,params,function(data){
				  $(".brushItems").text("");
				  for(var i=0;i<data.length;i++){
					  $(".brushItems").append("<img src='/resource/image/brushtitle_image/"+data[i].brushTitle+"'>"+
						"<div style='width: 100%;margin-bottom: 30px;'>"+
						"<button id='btn' class='btn buttons'>点通一下</button>"+
						"<input type='hidden' class='schidden' value='"+data[i].brushId+"'/>"+
						" <button id='scyx' class='btn buttons col'>收藏一下</button>"+
						"<button id='jlyx' class='btn buttons remember'>记录一下</button></div>"+
						" <div id='answer' class='answer' style='display: none;'>"+
						"<div style='width:90%;background:red;height:2px;margin:10px;'></div>"+
						"<img  src='/resource/image/brushtitle_parse_image/"+data[i].brushParse+"'>"+
						"<div style='width:90%;background:red;height:2px;margin:10px;'></div></div>"
					  );
				  }
				  if($('#tea').val()!=""){
					  $('.remember').hide();
					  $('.col').hide();
				  }
				  $('html,body').animate({scrollTop:0},400);
			  });
		  });
	  });
	  $(".brushItems").on("click","#btn",function(e){
		  $(this).parent().next(".answer").toggle();
	  });
	    
	  $(".brushItems").on("click","#scyx",function(e){
	    if($("#stu").val()=="" && $("#tea").val()==""){
			alert("收藏前请先登录");
		}else if($("#stu").val() != ""){
    		   var url ="CollectController/scbrush.action";
			   var params = {
				    stuid:$("#stuid").val(),
					brushid :$(this).prev(".schidden").val()
			   }
			   var $sc = $(this);
			   $.post(url,params,function(data){
				    $('#suc').html(data);
				    var halfdivheight=$(".success").height()/2;
					var halfdivwidth=$(".success").width()/2;
				    var top = $(window).height()/2 - halfdivheight;
				    var left = $(window).width()/2 - halfdivwidth;   
				    var scrollTop = $(document).scrollTop();   
				    var scrollLeft = $(document).scrollLeft();   
				    $("#suc").css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).fadeIn(300).delay(1000).fadeOut(300);
			   });
		}
	  });  
	  /*==================================================================*/
	  $(".brushItems").on("click","#jlyx",function(e){
		  if($("#stu").val()!=""){
			  $("#id2").val($(this).prevAll(".schidden").val())
			  $("#write").hide();
		    	$("#com").show();
		    	$(this).removeClass("tab1");
		    	$("#tab2").addClass("tab1");
		    	/*==========================================*/
		    	$.post(base+"NoteController/showNote.action",{brushid:$("#id2").val()},function(data){
		    		$("#ul").text("");
		    		/*无笔记时的显示情况*/
		    		if( data.length==0){
		    			$("#ul").append("<div class='null-img'><img src='images/biji.png'><p class='null-tishi'>暂无笔记，快来记录自己的做题心得吧</p></div>")
		    		}else{
		    			for(var i=0;i<data.length;i++){
		    				/*显示笔记*/
		    				$("#ul").append("<li><p>"+data[i].noteInfo+"<span>"+data[i].noteTime+"</span></p></li>");
		    			}
		    		}
		    	});
		  }
	  });
	  
	  //提交笔记
	  $("#su_btn").click(function(){
		  var url = "NoteController/writeNote.action";
		  var content = CKEDITOR.instances.commInfo.getData(); 
		  if(content!=""){
			  	var params = {
				     brushId : $("#id2").val(),
				     "noteInfo" : content
				  };
				  $.post(url,params,function(data){
					  alert(data);
				  });
		  }else{
			  alert("输入内容不能为空！");
		  }
		  
	  });
	  
	  /*==================================================================*/
	  //控制记笔记弹窗出现   
	    $("#shuati").on("click",".remember",function(){
	    	if($("#stu").val()=="" && $("#tea").val()==""){
	    	  alert("请先登录后查看笔记！");
	    	}
	    	else if($("#stu").val()!=""){
	    		if($("#rem").is(":hidden")){
	    		$("#rem").show().animate({width: '320px'}, 400);
	    		
	    		$("#write").hide();
		    	$("#com").show();
		    	$("#tab1").removeClass("tab1");
		    	$("#tab2").addClass("tab1");
		    	/*==========================================*/
		    	$.post(base+"NoteController/showNote.action",{brushid:$("#id2").val()},function(data){
		    		$("#ul").text("");
		    		/*无笔记时的显示情况*/
		    		if( data.length==0){
		    			$("#ul").append("<div class='null-img'><img src='images/biji.png'><p class='null-tishi'>暂无笔记，快来记录自己的做题心得吧</p></div>")
		    		}else{
		    			
		    			for(var i=0;i<data.length;i++){
		    				$("#show").show();
		    				$("#ul").append("<li>"+data[i].noteInfo+"<span class='showtime'>"+data[i].noteTime+"</span><div style='clear:both'></div></li>");
		    			}
		    		}
		    	});
	    		}
	    		else{
	    			$("#rem").hide(400);
	    		}
	    	}
	    });
	    $("#rem2").click(function(){
	    	if($("#stu").val()=="" && $("#tea").val()==""){
		    	  alert("请先登录后查看笔记！");
		    }
		    
	    });
	  //控制笔记弹窗关闭
	    $("#close").click(function(){
	    	$("#rem").hide(400);
	    });
	    $("#tab1").click(function(){
	    	$("#write").hide();
	    	$("#com").show();
	    	$(this).removeClass("tab1");
	    	$("#tab2").addClass("tab1");
	    	/*==========================================*/
	    	$.post(base+"NoteController/showNote.action",{brushid:$("#id2").val()},function(data){
	    		$("#ul").text("");
	    		/*无笔记时的显示情况*/
	    		if( data.length==0){
	    			$("#show").show();
	    			$("#ul").append("<div class='null-img'><img src='images/biji.png'><p class='null-tishi'>暂无笔记，快来记录自己的做题心得吧</p></div>")
	    		}else{
	    			for(var i=0;i<data.length;i++){
	    				$("#show").show();
	    				$("#ul").append("<li>"+data[i].noteInfo+"<span class='showtime'>"+data[i].noteTime+"</span><div style='clear:both'></div></li>");
	    			}
	    		}
	    	});
	    	
	    });
	    
	    $("#tab2").click(function(){
	      	$("#com").hide();
	      	$("#write").show();
	      	$(this).removeClass("tab1");
	      	$("#tab1").addClass("tab1");
	      	$("#show").hide();
	    });
});