
function teacher(){
	$("#tea").slideUp(400);
	$("#stu").delay(400).slideDown(400);}
	
function student(){
	$("#stu").slideUp(400);
	$("#tea").delay(400).slideDown(400);}

$(function(){ 
	
	$("input").focus(function(){
		$(this).parents("div").next("span").removeClass("wrong1").addClass("wrong");
	});
});	
function mobile(){
	var phone=$("#phoneTea").val();
	var reg=/^[1][3,4,5,7,8][0-9]{9}$/;
	if(reg.test(phone)){
		$("#cuo1").removeClass("wrong1").addClass("wrong");}
	else{
		if(phone==""){
			$("#cuo1").removeClass("wrong1").addClass("wrong");
		}
		else{
		$("#cuo1").removeClass("wrong").addClass("wrong1");}
	  }
	}

function mobile2(){
	var phone=$("#phoneStu").val();
	var reg=/^[1][3,4,5,7,8][0-9]{9}$/;
	if(reg.test(phone)){
		$("#cuo12").removeClass("wrong1").addClass("wrong");}
	else{
		if(phone==""){
			$("#cuo12").removeClass("wrong1").addClass("wrong");
		}
		else{
		$("#cuo12").removeClass("wrong").addClass("wrong1");}
	  }
	}

function mi(){
	var mi=$("#mima").val();
	if(/^\w{6,16}$/.test(mi)){
		$("#cuo2").removeClass("wrong1").addClass("wrong");}
	else{
		if(mi==""){
			$("#cuo2").removeClass("wrong1").addClass("wrong");
		}
		else{
		$("#cuo2").removeClass("wrong").addClass("wrong1");}
	  }
	}

function mi2(){
	var mi=$("#mima2").val();
	if(/^\w{6,16}$/.test(mi)){
		$("#cuo22").removeClass("wrong1").addClass("wrong");}
	else{
		if(mi==""){
			$("#cuo22").removeClass("wrong1").addClass("wrong");
		}
		else{
		$("#cuo22").removeClass("wrong").addClass("wrong1");}
	  }
	}

function remi(){
	var mi=$("#mima").val();
	var remi=$("#remima").val();
	if(mi==remi){
		$("#cuo3").removeClass("wrong1").addClass("wrong");}
	else{
		if(remi==""){
			$("#cuo3").removeClass("wrong1").addClass("wrong");
		}
		else{
		$("#cuo3").removeClass("wrong").addClass("wrong1");}
	  }
	}

function remi2(){
	var mi=$("#mima2").val();
	var remi=$("#remima2").val();
	if(mi==remi){
		$("#cuo32").removeClass("wrong1").addClass("wrong");}
	else{
		if(remi==""){
			$("#cuo32").removeClass("wrong1").addClass("wrong");
		}
		else{
		$("#cuo32").removeClass("wrong").addClass("wrong1");}
	  }
	}
$(function(){
	$("#teasubmit").click(function(){
		if($("#cuo1").hasClass("wrong1")||$("#cuo2").hasClass("wrong1")||$("#cuo3").hasClass("wrong1")||$("#cuo4").hasClass("wrong1")){
			alert("输入信息错误！请重新输入！");
		}else{
			var phone=$("#phoneTea").val();
			var mi=$("#mima").val();
			var remi=$("#remima").val();
			var code=$("#code").val();
			if(phone==""||mi==""||remi==""||code==""){
				alert("注册信息不能为空！");
			}else{
				var url = base+"/UserController/regist.action";
				$("#teaform").attr("action",url);
				$("#teaform").submit();
			}
		}
	})
	
	$("#stusubmit").click(function(){
		if($("#cuo12").hasClass("wrong1")||$("#cuo22").hasClass("wrong1")||$("#cuo32").hasClass("wrong1")||$("#cuo42").hasClass("wrong1")){
			 alert("输入信息错误！请重新输入！");
		}else{
			var phone=$("#phoneStu").val();
			var mi=$("#mima2").val();
			var remi=$("#remima2").val();
			var code=$("#code2").val();
			if(phone==""||mi==""||remi==""||code==""){
				alert("注册信息不能为空！");
			}else{
				var url = base+"/UserController/regist.action";
				$("#stuform").attr("action",url);
				$("#stuform").submit();
			}
		}
	})
})

	/**/


$(function(){

	//发送验证码
	$("#getCodeStu").click(function(){
		if($("#phoneStu").val() == ""){
			alert("请先输入手机号");
		}else if($("#cuo12").hasClass("wrong1")){
			alert("请输入正确的手机号！");
		}else{
			$.post("UserController/MessYanZheng.action",{"phone":$("#phoneStu").val()},function(){
				var wait=59;
				var t=setInterval(function(){
					time("#getCodeStu");
				}, 1000);
				function time(id){
					if(wait==0){
						$(".getCodeNull").hide();
						$(id).html("获取验证码");
						wait=60;
						clearInterval(t);
					}
					else{
						$(".getCodeNull").show();
						$(id).html(wait+"秒后重试");
						--wait;
					}
				}
		    }) 
		}
	  });
	

	//发送验证码
	$("#getCodeTea").click(function(){
		if($("#phoneTea").val() == ""){
			alert("请先输入手机号");
		}
		else if($("#cuo1").hasClass("wrong1")){
			alert("请输入正确的手机号！");
		}else{
			$.post("UserController/MessYanZheng.action",{"phone":$("#phoneTea").val()},function(){
				var wait=59;
				var t=setInterval(function(){
					time("#getCodeTea");
				}, 1000);
				function time(id){
					if(wait==0){
						$(".getCodeNull").hide();
						$(id).html("获取验证码");
						wait=60;
						clearInterval(t);
					}
					else{
						$(".getCodeNull").show();
						$(id).html(wait+"秒后重试");
						--wait;
					}
				}
			})
		}
	});
});


