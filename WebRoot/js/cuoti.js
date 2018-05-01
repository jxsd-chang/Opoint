$(function(){
	default_img();//进入这个页面，默认显示第一张图
	
	var show_per_page = 1;//每页显示多少张图
	var num_of_img = $(".container").find(".dd").length;//总图片数
	var num_of_pages = num_of_img / show_per_page;//总页数
//alert(num_of_img+"张图片，有" + num_of_pages);
	
/*点击首页*/
	$("#first").click(function(){
		hide_info();
		$("#container").find(".dd").eq(0).css("display","block");
		
	})
/*点击尾页*/	
	$("#last").click(function(){
		hide_info();
		$("#container").find(".dd").eq(num_of_img-1).css("display","block");
		
	})
/*下一页*/
	$("#next").click(function(){
		var page=get_info_page();
		if(page == num_of_img){
			alert("已经是最后一页了")
		}else{
			var index_next = page;
			console.log(index_next);
			hide_info();
			$("#container").find(".dd").eq(index_next).css("display","block");
		}
	});
/*上一页*/
	$("#before").click(function(){
		var page=get_info_page();
		if( page== 1){
			alert("已经是首页了")
		}else{
			
			var index_before = page-2;
			console.log(get_info_page());
			
			console.log(index_before);
			hide_info();
			$("#container").find(".dd").eq(index_before).show();
		}
	});
	
/*隐藏当前页*/
	function hide_info(){
		$("#container").find(".dd").hide();
	}
	
/*得到当前页码*/
	function  get_info_page(){
		var s;
		$("#container").find(".dd").each(function(){
			if($(this).is(":visible")){
				s=$(this).index();
			}
		})
		return s;
	}
	
/*默认显示第一张图*/	
	function default_img(){
		$("#container").children(".dd").eq(0).css("display","block");
	}
});