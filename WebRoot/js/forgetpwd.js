$(function(){
	$("#tijiao").hover(function(){
		if($("#phone").val()==""||$("#yanzheng").val()==""||$("#pwd").val()==""||$("#repwd").val()==""
			||$("#cuo1").hasClass("wrong")||$("#cuo2").hasClass("wrong")||$("#cuo3").hasClass("wrong")){
		mobile();mima();mima2();
		$("#control").show();}
		else{
			mobile();
			mima();
			mima2();
			if($("#cuo1").hasClass("wrong")||$("#cuo2").hasClass("wrong")||$("#cuo3").hasClass("wrong")){
				$("#control").show();
			}
			else{
				$("#control").hide();
			}}
		}),function(){
			$("#control").show();}
	});

$(function(){ 
	
	$(".inputbox").focus(function(){
		$(this).parents("div").next("div").removeClass("wrong").addClass("wrong2");
	});
});	

function mobile(){
	var phone=$("#phone").val();
	var reg=/^[1][3,4,5,7,8][0-9]{9}$/;
	if(reg.test(phone)){
		$("#cuo1").removeClass("wrong").addClass("wrong2");}
	else{
		if(phone==""){
			$("#cuo1").removeClass("wrong").addClass("wrong2");
		}
		else{
		  $("#cuo1").removeClass("wrong2").addClass("wrong");}
	   }
	}

function mima(){
	var mi=$("#pwd").val();
	if(/^\w{6,16}$/.test(mi)){
		$("#cuo2").removeClass("wrong").addClass("wrong2");}
	else{
		if(mi==""){
			$("#cuo2").removeClass("wrong").addClass("wrong2");
		}
		else{
			$("#cuo2").removeClass("wrong2").addClass("wrong");
		}
		}
	}

function mima2(){
	var mi=$("#pwd").val();
	var remi=$("#repwd").val();
	if(mi==remi){
		$("#cuo3").removeClass("wrong").addClass("wrong2");}
	else{
	    if(remi==""){
	    	$("#cuo3").removeClass("wrong").addClass("wrong2");
	    }
	    else{
	    	$("#cuo3").removeClass("wrong2").addClass("wrong");
	    }
		}
	}

/*==============================================*/
$(function(){
	//发送验证码
	$("#getCode").click(function(){
		if($("#phone").val() == ""){
			alert("请先输入手机号");
		}else{
			var url = base+"/UserController/MessYanZheng.action";
			$.post(url,{"phone":$("#phone").val()},function(){
				var wait=59;
				var t=setInterval(function(){
					time("#getCode");
				}, 1000);
				function time(id){
					if(wait==0){
						$(".getCodeNull").hide();
						$(id).val("获取验证码");
						wait=60;
						clearInterval(t);
					}
					else{
						$(".getCodeNull").show();
						$(id).val(wait+"秒后重试");
						--wait;
					}
				}
			})
		}
	});
});
