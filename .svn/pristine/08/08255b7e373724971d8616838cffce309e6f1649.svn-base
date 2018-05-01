$(function(){
	$("#show-answer").click(function(){
		$(".mryl-answer").slideToggle("slow");
	})
	$("#btn").click(function(){
		
		var radios = document.getElementsByName("count");
		for(var i = 0; i < radios.length; i++) {
		  if (radios[i].checked==true) {
		     var value = radios[i].value;
		     $.post("ExerciseController/click.action",{count:value},function(data){
		    	 $("#exerciseItems").text("");
		    	 $("#exerciseparseItems").text("");
		    	 for(var i=0;i<data.length;i++){
		    		 $("#exerciseItems").append("<div class='timu-pic'>"+
		    				 "<img src='/resource/image/dayexercise_image/"+data[i].exerTitle+"'></div>");
		    		 $("#exerciseparseItems").append("<div class='timu-pic'>"+
		    				 "<img src='/resource/image/dayexercise_parse_image/"+data[i].exerParse+"'></div>");
		    	 }
		     })
		     $("#show-answer").show();
		     
		     //防止再次生成后直接显示答案
		     $(".mryl-answer").css("display","none")
		  }
		}
	})
})