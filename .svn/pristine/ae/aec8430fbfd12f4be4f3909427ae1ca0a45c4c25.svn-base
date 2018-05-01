<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>点通网后台管理</title>
<!-- 导入jquery核心类库 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.2.js"></script>
<!-- 导入easyui类库 -->
<link id="easyuiTheme" rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<!-- 导入ztree类库 -->
<link rel="stylesheet" href="${pageContext.request.contextPath }/js/ztree/zTreeStyle.css" type="text/css" />
<script src="${pageContext.request.contextPath }/js/ztree/jquery.ztree.all-3.5.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>


<script type="text/javascript">


	// 初始化ztree菜单
	$(function() {
		var setting = {
			data : {
				key : {
					title : "t" // 鼠标在停留在菜单上提示
				},
				simpleData : { // 简单数据 
					enable : true
				}
			},
			callback : {
				onClick : onClick
			}
		};
		
		// 基本功能菜单加载
		$.ajax({
			url : '${pageContext.request.contextPath}/json/menu.json',
			type : 'POST',
			dataType : 'text',
			success : function(data) {
				var zNodes = eval("(" + data + ")");
				$.fn.zTree.init($("#treeMenu"), setting, zNodes);
			},
			error : function(msg) {
				alert('菜单加载异常!');
			}
		});
		
		// 页面加载后 右下角 弹出窗口
		/**************/
		window.setTimeout(function(){
			$.messager.show({
				title:"消息提示",
				msg:'欢迎登录，超级管理员！ <a href="javascript:void" onclick="top.showAbout();">联系管理员</a>',
				timeout:5000
			});
		},3000);
	
		
		$("#btnCancel").click(function(){
			$('#editPwdWindow').window('close');
		});
		
		$("#btnEp").click(function(){
			var pwd = document.getElementById("txtNewPass").value;
			var r_pwd = document.getElementById("txtRePass").value;
			if(pwd != r_pwd){
				alert("两次输入的密码不一致")
			}else{
				var url = "${pageContext.request.contextPath}/UserController/resetpwd.action";
				var admid =  "{admin.adm_id}";
				var params = {
					"password":	pwd,
					 "admid" :"1"
				};
				$.post(url,params,function(data){
					alert(data);
				})
			}
		});
	});

	function onClick(event, treeId, treeNode, clickFlag) {
		if (treeNode.click != false) {
			open(treeNode.name, treeNode.page);
		}
	}

	// 开启一个新的tab页面
	function open(text, url) {
		if ($("#tabs").tabs('exists', text)) {
			$('#tabs').tabs('select', text);
		} else {
			var content = '<div style="width:100%;height:100%;overflow:hidden;">'
					+ '<iframe src="'
					+ url
					+ '" scrolling="auto" style="width:100%;height:100%;border:0;" ></iframe></div>';

			$('#tabs').tabs('add', {
				title : text,
				content : content,
				//href : url
				closable : true
			});
		}
	}

	// 退出登录
	function logoutFun() {
		$.messager.confirm('系统提示','您确定要退出登录吗?',function(isConfirm) {
			if (isConfirm) {
				location.href = '${pageContext.request.contextPath }/UserController/adm_logout.action';
			}
		});
	}
	// 修改密码
	function editPassword() {
		$('#editPwdWindow').window('open');
	}
	// 版权信息
	function showAbout(){
		$.messager.alert("点通网","版权: 师大团队<br/> 管理员邮箱: 2822739876@qq.com <br/> QQ: 2822739876");
	}
</script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false"
		style="height:80px;padding:10px;background: linear-gradient(#9e9ef0,#e0ecff);">
		<div style="width: 330px;height: 60px;display: inline-block;">
			<p style="padding: 20px;font-size: 20px;text-align: center;">
			<span style="font-style: italic;color: #f90;font-weight: bold;font-size: 30px;">点通网</span>
			<span style="padding: 10px;">后台管理系统</span>
			</p>
			 
		</div>
		<iframe style="display: inline-block;float: right;" width="280" scrolling="no" height="25" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=34&icon=1&num=3"></iframe>
		<div id="sessionInfoDiv"
			style="float: right;margin-right: -125px;display: block;margin-top: 40px;">
			[<strong>管理员</strong>]，欢迎你<span style="color:red;font-size: 15px;">${admin.admName }</span>登录！
		</div>
		<div style="position: absolute; right: 55px; bottom: 10px; ">
			
			<a href="javascript:void(0);" class="easyui-menubutton"
				data-options="menu:'#layout_north_kzmbMenu',iconCls:'icon-cut'">系统设置</a>
		</div>
		
		<div id="layout_north_kzmbMenu" style="width: 20px; display: none;">
			<div onclick="editPassword();">修改密码</div>
			<div onclick="showAbout();">联系管理员</div>
			<div class="menu-sep"></div>
			<div onclick="logoutFun();">退出系统</div>
		</div>
	</div>
	<div data-options="region:'west',split:true,title:'菜单导航'"
		style="width:200px">
		<div class="easyui-accordion" fit="true" border="false">
			<div title="基本功能" data-options="iconCls:'icon-mini-add'" style="overflow:auto">
				<ul id="treeMenu" class="ztree"></ul>
			</div>
			<div title="系统管理" data-options="iconCls:'icon-mini-add'" style="overflow:auto">  
				<ul id="adminMenu" class="ztree"></ul>
			</div>
		</div>
	</div>
	<div data-options="region:'center'">
		<div id="tabs" fit="true" class="easyui-tabs" border="false">
			<div title="首页" id="subWarp"
				style="width:100%;height:100%;overflow:hidden">
					<img alt="" src="${pageContext.request.contextPath }/image/xixi.jpg" style="width: 100%;height:100%">
			</div>
		</div>
	</div>
	
	<!--修改密码窗口-->
    <div id="editPwdWindow" class="easyui-window" title="修改密码" collapsible="false" minimizable="false" modal="true" closed="true" resizable="false"
        maximizable="false" icon="icon-save"  style="width: 300px; height: 160px; padding: 5px;
        background: #fafafa">
        <div class="easyui-layout" fit="true">
            <div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
             <form action="" method="post" name="updatePwdForm">
                <table cellpadding=3>
                    <tr>
                        <td>新密码：</td>
                        <td><input id="txtNewPass" type="Password" class="txt01" /></td>
                    </tr>
     
                    <tr>
                        <td>确认密码：</td>
                        <td><input id="txtRePass" type="Password" class="txt01" /></td>
                    </tr>
                </table> 
              </form>
            </div>
            <div region="south" border="false" style="text-align: right; height: 30px; line-height: 30px;">
                <a id="btnEp" class="easyui-linkbutton" icon="icon-ok" href="javascript:void(0)" >确定</a> 
                <a id="btnCancel" class="easyui-linkbutton" icon="icon-cancel" href="javascript:void(0)">取消</a>
            </div>
        </div>
    </div>
</body>
</html>