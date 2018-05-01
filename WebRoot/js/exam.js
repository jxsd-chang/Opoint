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
	$("#nav-menu").children("li").eq(4).addClass("actived");

//      提交试卷
	  $("#sub").hover(function(){
		var name=$('input:radio').attr('name').substring(-1,8); 
		var num=$('.sel').length;
		var emptyNum=0;
        for(var i=1;i<=num;i++){
        	if($('input:radio[name='+name+i+']:checked').val()==null){
        		emptyNum++;
        	}
        }if(emptyNum>0){
			$("#default").show();
		}else{
			$("#default").hide();
		}
	},function(){
		$("#default").show();
	});
     
     $("#btn").click(function(){
    	 $("form").attr("action","EtimuController/cacluResult.action");
		 $("form").submit(); 
     });
     
});




/* ======================显示当前时间=============== */
function showTime(){
    nowtime=new Date();
    year=nowtime.getFullYear();
    month=nowtime.getMonth()+1;
    date=nowtime.getDate();
    document.getElementById("show-time").innerText=year+"年"+month+"月"+date+" "+nowtime.toLocaleTimeString();
}
setInterval("showTime()",1000);//每过一秒调用该函数

/* =====================倒计时=================== */	
var hour=1,min=40,sec=0;//定义总时间，100分钟
var idt=setInterval("daojishi()",1000);

var format=function(str) {//格式化数字
	if(parseInt(str)<10){
		return "0" + str;
	}else{
		return str;
	}
}
function daojishi(){//倒计时实现
	sec--;
	if(sec <= 0 &&(hour >0 || min > 0)){
		min--;
		sec=59;
	}
	if(min<0 && hour>0){
		hour--;
		min=59;
	}

	document.getElementById("daojishi").innerText=format(hour) + ":" + format(min)+ ":" + format(sec);
	if(parseInt(hour)==0 && parseInt(min)==5 && parseInt(sec)==1){
		alert("时间还剩5分钟，请注意时间哦！时间到了系统将自动提交试卷");
	}if(parseInt(hour)==0&&parseInt(min)==0&&parseInt(sec)==0){
		window.clearInterval(idt);
		$("form").attr("action","EtimuController/cacluResult.action");
		$("form").submit(); 
	}
}
	