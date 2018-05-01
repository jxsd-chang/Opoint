/**
 * 首页JS代码
 */
window.onresize=function(){
	  fudong();

	  }

$(function(){

	  fudong();
	  
	  
	  $("#submenu").hover(
			  function(){
				  $(this).children("ul").slideDown(400).stop();
			  },
			  function(){
				  $(this).children("ul").slideUp(400);
			  });
	  $("#submenu2").hover(
			  function(){
				  $(".submenu-li").show(400);
				  $(this).fadeOut(400);
			  });

  });

//导航栏浮动
function fudong(){
	var rollSet = $('#top');
    var offset = rollSet.offset();                     //获取加载出页面后浮动栏当前位置
	var scrollTop = $(window).scrollTop();            //滚动条滚动了的高度
	var fheight = $("#top").height()    //想要停止位置距顶部的距离

	if(offset.top<fheight){  
		rollSet.removeClass('div0_top2').addClass('div0_top');}
	else{
		$("#empty").show();
		rollSet.removeClass('div0_top').addClass('div0_top2');
	}
	
    //处理滚动页面后
    $(window).scroll(function() {
        var scrollTop = $(window).scrollTop();
        if (scrollTop >0) {     //浮动栏处于停止移动位置下方时
			   $("#empty").show();
                rollSet.removeClass('div0_top').addClass('div0_top2');
        } else {
			 $("#empty").hide();
            rollSet.removeClass('div0_top2').addClass('div0_top');
        }
        //如果弹窗式菜单已出现。滚动页面使其消失
        $("#menu2").fadeOut(400);
      //当滚动高度大于200px时“回到顶部”按钮出现
    	if(scrollTop>200){
    		$("#gotop").fadeIn(500);}
    		else{
    			$("#gotop").fadeOut(500);}
    });    
 }

function gotop(){
	 $('html,body').animate({scrollTop:0},500);}


