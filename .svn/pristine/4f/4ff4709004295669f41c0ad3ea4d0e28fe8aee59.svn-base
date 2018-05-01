/**
 * 批改试卷页面js
 */
$(function() {
		$("#nav-menu").children("li").eq(4).addClass("actived");
		$("#paper-timu").find(".answers").each(function() {
			var children1 = $(this).children("span").eq(0).text();
			var children2 = $(this).children("span").eq(1).text();
			if(children1 == children2) {
				$(this).children("span").eq(0).css("color","green");
			}else{
				$(this).children("span").eq(0).css("color","red");
			}
		});
		//控制左边栏遇到底部则不动
		fudong();
		function fudong(){
			var rollSet = $('#leftitem');
		    var offset = rollSet.offset();                    //获取加载出页面后浮动栏当前位置
		    var rollSetHeight=rollSet.height()+40;            //浮动栏高度（.height()不会计算上盒子模型下的padding值）
			var fheight=$('.rr:visible').height()+40; 
			if(fheight<600){
				fheight=600;
			}
			var scrollBtm = $('#top').height()+fheight-rollSetHeight; 
			if(offset.top-20>scrollBtm){ 
				rollSet.removeClass('leftitem').addClass('leftitem2').css("top",offset.top-48);
			}
		    //处理滚动页面后
		    $(window).scroll(function() {
		        var scrollTop = $(window).scrollTop()+110;
		        var fheight2=$('.rr:visible').height()+40;
		        if(fheight2<620){
		        	fheight2=620;
		        }
		        var scrollBtm2 = $('#top').height()+fheight2-rollSetHeight;
		        if (scrollTop <=scrollBtm2) {     //浮动栏处于停止移动位置上方时
		        	rollSet.removeClass('leftitem2').addClass('leftitem').css("top","");
		        } else {
		        	rollSet.removeClass('leftitem').addClass('leftitem2').css("top",$('.container').height()-rollSetHeight+90);
		        }
		    });
		 }
		
		$('#jiao').hover(function(){
			if($('#fGrade').val()==""){
				$('.nn').show();
			}
			else{
				$('.nn').hide();
			}
		});
		
		//提交成绩
		$("#submitGraBtn").click(function(){
			$.post("TeacherController/submitGrade.action",
					{
						exid:$(this).prev("input").val(),
						kGrade:$("#kGrade").val(),
						zGrade:$("#zGrade").val(),
						fGrade:$("#fGrade").val()
					},function(){
				alert("提交成绩操作成功");
				window.location.href = "TeacherController/tojudgePaper.action";
			});
		})
});

  //当浏览器进行比例缩放后
  window.onresize=function(){
	  fudong();
  }
  $(function(){
	  $('.fenshu li input').each(function(){
		 $(this).focus(function(){
			$(this).css("border","1px solid #2fbbf7"); 
		 });
		 $(this).blur(function(){
			$(this).css("border","1px solid #979797");
		 });
	  });
	  
	  //初始进入页面，显示学生客观题
	  $('.rr').hide().eq(0).show(0);
	  
	 //点击学生客观题
	  $('#ke1').click(function(){
		 $('.rr').hide().eq(0).show(); 
	  });
	  
	//点击学生主观题
	  $('#zhu1').click(function(){
		 $('.rr').hide().eq(1).show(); 
	  });
	  
	//点击答案客观题
	  $('#ke2').click(function(){
		 $('.rr').hide().eq(2).show(); 
	  });
	  
	//点击答案主观题
	  $('#zhu2').click(function(){
		 $('.rr').hide().eq(3).show(); 
	  });
	  
	//分数统计
	 $('.fenshu li').on("keyup","input[type='text']",function(){
		 var z=$("#zGrade").val();
		 var k=$("#kGrade").val();
		 if(z=="" && k==""){
			 $('#fGrade').val("");
		 }
		 else if(z==""){
			 $('#fGrade').val(k);
		 }
		 else if(k==""){
			 $('#fGrade').val(z);
		 }
		 else{
			 var num=parseInt($('#kGrade').val())+parseInt($('#zGrade').val());
			 if(num>100){
				 alert("总成绩不能大于100分！");
			 }else{
				 $('#fGrade').val(num);
			 }
		 }
	 });
	  
  });
  
