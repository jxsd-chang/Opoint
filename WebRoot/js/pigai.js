/**
 * 作业批改页面
 */

$(function(){
		//调用textarea自适应高度插件
		$(".ans").autoHeight();
		  $("#nav-menu").children("li").eq(4).addClass("actived");
		  $('.xuan li').on('click',function(){
			 var dex=$(this).index();
			 $('.xuan li').removeClass('aa').eq(dex).addClass('aa');
			 $('.stujiao').stop().hide(200).delay(200).eq(dex).stop().show(200);
		  });
		  $('#jiao').hover(function(){
          	if(($('.ans').val()=="") && ($(".file_name").val()=="")){
          		$('.nn').show();
          	}
          	else{
          		$('.nn').hide();
          	}
          });
		 
          //点击学生列表中的返回键。返回作业列表
          $('.return').click(function(){
        	 $('.leftcon').fadeOut(300).delay(300).eq(0).fadeIn(300);
          });
          
          //作业列表跳转学生列表
          $('.worklist li').each(function(){
        	 $(this).click(function(){
        		 $('.leftcon').fadeOut(300).delay(300).eq(1).fadeIn(300);
        		 var publishid = $(this).children(".pubid").val();
        		 var claid = $(this).children(".claid").val();
        		 $.post("TeacherController/getHomeWorkBypubid.action",{publishid:publishid,claid:claid},function(data){
        			 $(".yesSubItems").text("");
        			 $(".noSubItems").text("");
        			 for(var i=0;i<data.length;i++){
        				 if(data[i].flag==1){
        					 var stuName = data[i].student.stuName;
        					 if(stuName==""){
        						 stuName="无名氏";
        					 }
        					 var picpath = "";
        					 if(data[i].student.stuPic == null){
     	    					picpath = "images/no_title.jpg";
     	    				 }else{
     	    					picpath = "/resource/pic/tou_pic/"+data[i].student.stuPic;
     	    				 }
        					 $(".yesSubItems").append("<li><img src='"+picpath+"'>"+
					              "<span class='stu1'>"+stuName+"</span>"+
					              "<span class='stu2'>作业主题：</span>"+
					              "<p>"+data[i].publish.workTitle+"</p>" +
					              "<input type='hidden' class='winfo' value='"+data[i].publish.workInfo+"'>"+
					              "<input type='hidden' class='wpic' value='"+data[i].publish.workPic+"'>"+
					              "<input type='hidden' class='homeInfo' value='"+data[i].homework.replyworkInfo+"'>"+
					              "<input type='hidden' class='homePic' value='"+data[i].homework.replyworkPic+"'>"+
					              "<input type='hidden' class='replyTime' value='"+data[i].homework.replyworkTime+"'>"+
					              "<input type='hidden' class='replyworkId' value='"+data[i].homework.replyworkId+"'>"+
        					 "</li>");
        				 }else if(data[i].flag==0){
        					 var stuName = data[i].student.stuName;
        					 if(stuName==""){
        						 stuName="无名氏";
        					 }
        					 var picpath = "";
        					 if(data[i].student.stuPic == null){
      	    					picpath = "images/no_title.jpg";
      	    				 }else{
      	    					picpath = "/resource/pic/tou_pic/"+data[i].student.stuPic;
      	    				 }
        					 $(".noSubItems").append("<li><img src='"+picpath+"'>"+
					              "<span class='stu1'>"+stuName+"</span>"+
					              "<span class='stu2'>作业主题：</span>"+
					              "<p>"+data[i].publish.workTitle+"</p>" +
					              "<input type='hidden' class='winfo' value='"+data[i].publish.workInfo+"'>"+
					              "<input type='hidden' class='wpic' value='"+data[i].publish.workPic+"'>"+
        					 "</li>");
        				 }
        			 }
        		 })
        	 });
          });
          
          //点击学生列表中学生信息,右边出现作业信息
          $('.leftcon').on('click','.stujiao li',function(){
        	  var workInfo = $(this).children(".winfo").val();
        	  var workPic = $(this).children(".wpic").val();
        	  var claid = $('#claid').val();
        	  
        	  var fujian = "";
        	  if(workPic != "null"){
       		  fujian = "<img src='images/fujian.png' class='fu'/>"+
	            "<img src='/resource/pic/work_pic/"+claid+"/"+workPic+"' style='display: none;' class='fu2'>";
        	  }
        	  //填充到原题目中
        	  $("#yuanWindow").html(workInfo+fujian)
        	  //填充到解答题目中
        	  var replyworkId = $(this).children(".replyworkId").val();
        	  $("#replyworkId").val(replyworkId);
        	  var replyTime = $(this).children(".replyTime").val()
        	  var replyInfo = "";
        	  if($(this).children(".homeInfo").val() != null){
        		  replyInfo = $(this).children(".homeInfo").val();
        		  var replyPic = $(this).children(".homePic").val();
        		  var fujian = "";
            	  if(replyPic != "null"){
           		  fujian = "<img src='images/fujian.png' class='fu'/>"+
    	            "<img src='/resource/pic/work_pic/"+claid+"/"+replyPic+"' style='display: none;' class='fu2'><p class='date'>解答日期："+replyTime+"</p>";
            	  }
            	  $("#replyWindow").html(replyInfo+fujian)
        	  }else{
        		  //解答非空
        		  replyInfo="<img src='images/empty.png' style='margin-left: 27%;'><p style='margin-left: 18%;'>学生未提交解答</p>";
        		  $("#replyWindow").html(replyInfo)
        	  }
          })
          //点击附件
          $('.zy2').on("click",".fu",function(event){
        		event.stopPropagation();
            	var halfdivheight=parseInt($(this).next('.fu2').height());
    			var halfdivwidth=parseInt($(this).next('.fu2').width());
    			if(halfdivwidth>1000){
    				halfdivwidth=1000;
            	}
            	if(halfdivheight>500){
            		halfdivheight=500;
            	}
    		    var top = $(window).height()/2 - halfdivheight/2;
    		    var left = $(window).width()/2 - halfdivwidth/2;   
    		    var scrollTop = $(document).scrollTop();   
    		    var scrollLeft = $(document).scrollLeft(); 
    		    $(this).next('.fu2').css({position:'absolute',top:top+scrollTop,left:left+scrollLeft,}).fadeIn(300);
            });
            $(document).bind("click",function(event){
        		var div=$('.fu2');
        		 if(!div.is(event.target) && div.has(event.target).length === 0){ 
        	           div.removeAttr('style').css("display","none");
        	     }
        	});
           //点击提交批改
            $("#solveBtn").click(function(){
            	$("#solveForm").attr("action","TeacherController/solvework.action")
            	$("#solveForm").submit();
            })
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
});

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