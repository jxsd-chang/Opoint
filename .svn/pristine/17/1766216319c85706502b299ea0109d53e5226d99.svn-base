$(function(){
	    $("#ser").click(function(){
	    	$("#ser span").hide();
			$("#search").show();
			$("#ser img").animate({"margin-top":"18px"},300);
		});
	    $("#search").blur(function(){
	    	if($(this).val()==""){
	    		$("#ser span").show();
	    		$("#search").hide();
	    		$("#ser img").animate({"margin-top":"0px"},300);
	    	}
	    });
	    $(document).on("click",function(){
	    	if($("#search").val()==""){
	    		$("#ser span").show();
	    		$("#search").hide();
	    		$("#ser img").animate({"margin-top":"0px"},300);
	    	}
	    });
	    $("#ser").on("click", function(e){
	        e.stopPropagation();
	    });
	    $("#ssimg").click(function(){
	    	if($("#search").val()==""){
	    		$("#ser span").show();
	    		$("#search").hide();
	    		$("#ser img").css({"float":"none","margin-right":"0px"})
	    	}
	    	search();
	    })
	    
       $("#search").keydown(function(e) {  
           if (e.keyCode == 13) {  
        	   search();
           }  
       }); 
	    function search(){
	    	if($("#search").val()!=""){
	    		var ss_con = $("#search").val();
	    		$.ajax({
	    			async:false, 
	    			url:"KnowPointController/searchKp.action",
	    			data:{ss_con:ss_con},
	    			success:function(data){
	    				$("#firstitem").hide();
		    			$(".mohu").empty();
		    			$(".mohu").append("<h3 style='margin:20px 0px 15px 30px'>关于此次搜索的内容:</h3>")
		    			for(var i=0;i<data.length;i++){
		    				var inputValue = $("#search").val();
		    				var content = data[i].kpContent;
		    			    var reg = new RegExp("(" + inputValue + ")", "g");  
		    			    var new_con = content.replace(reg, "<font color=red>$1</font>");  
		    				$(".mohu").append("<input type='hidden' value='"+data[i].kpId+"'>" +
		    						"<ul><li class='items' id='serspan' style='margin-left:50px;'><span>"+new_con+"<span></li></ul>");
		    			}
	    			}
	    		})
	    		//查询知识点
		    	$(".mohu").on("click","#serspan",function(){
		    		var url ="KninfoController/getKninfoByKpId.action";
					var params = {
						kpId : $(this).parent().prev("input").val(),
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
									"<div class='collect'  style='float: right;margin-right: 90px;'>查看评论</div>"+
									" </div></div>"
							);
						}
					});
		    	})
		    	//查询刷题
		    	$(".mohu").on("click","#serspan",function(){
		    		var url ="BrushTitleController/getBrushByKpid.action";
					  var params = {
							kpid : $(this).parent().prev("input").val(),
					  }
					  $.post(url,params,function(data){
						  $(".brushItems").text("");
						  for(var i=0;i<data.length;i++){
							  $(".brushItems").append("<img src='/resource/image/brushtitle_image/"+data[i].brushTitle+"'>"+
								"<div style='width: 100%;margin-bottom: 30px;'>"+
								"<button id='btn' class='btn buttons'>点通一下</button>"+
								"<input type='hidden' class='schidden' value='"+data[i].brushId+"'/>"+
								" <button id='scyx' class='btn buttons'>收藏一下</button>"+
								"<button id='jlyx' class='btn buttons remember'>记录一下</button></div>"+
								" <div id='answer' class='answer' style='display: none;'>"+
								"<div style='width:90%;background:red;height:2px;margin:10px;'></div>"+
								"<img  src='/resource/image/brushtitle_parse_image/"+data[i].brushParse+"'>"+
								"<div style='width:90%;background:red;height:2px;margin:10px;'></div></div>"
							  );
						  }
					  });
		    	});
	    	}
	    }
})