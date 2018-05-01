<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表</title>
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
	function doEdit(){
		$('#updateStu').window("open");
		alert("xx");
		$('#updateStu').window("close");
		
	}
	
	function doView(){
		alert("查看...");
	}
	
	function doDelete(){
		
		alert("删除...");
	}
	//工具栏
	var toolbar = [ {
		id : 'button-view',	
		text : '查询',
		iconCls : 'icon-search',
		handler : doView
	}, {
		id : 'button-edit',
		text : '修改',
		iconCls : 'icon-edit',
		handler : doEdit
	}, {
		id : 'button-delete',
		text : '删除',
		iconCls : 'icon-cancel',
		handler : doDelete
	}];
	// 定义列
	var columns = [ [ {
		field : 'stuId',
		checkbox : true,
	},{
		field : 'stuName',
		title : '学生姓名',
		width : 120,
		align : 'center'
	}, {
		field : 'stuSex',
		title : '学生性别',
		width : 120,
		align : 'center'
	}, {
		field : 'stuTel',
		title : '学生电话',
		width : 120,
		align : 'center'
	}, {
		field : 'stuGrade',
		title : '学生年级',
		width : 120,
		align : 'center',
	}, {
		field : 'stuPro',
		title : '学生学院',
		width : 160,
		align : 'center'
	}, {
		field : 'stuJifen',
		title : '学生积分',
		width : 200,
		align : 'center',
	} ] ];
	
	$(function(){
		// 先将body隐藏，再显示，不会出现页面刷新效果
		$("body").css({visibility:"visible"});
		
		// 学生基本信息表格
		$('#grid').datagrid( {
			iconCls : 'icon-forward',
			fit : true,
			border : false,
			striped:true,
			rownumbers : true,
			striped : true,
			pageSize:10,
			pageList: [10,20,30],
			pagination : true,
			toolbar : toolbar,
			url : "${pageContext.request.contextPath}/StudentController/getAllStu1.action",
			idField : 'id',
			columns : columns,
			onDblClickRow : doDblClickRow
		});
		
		// 修改一个学生的功能
		$('#updateStu').window({
            title: '修改信息',
            width: 400,
            modal: true,
            shadow: true,
            closed: true,
            height: 200,
            resizable:false
        });
		
	});
	
	function doDblClickRow(){
		alert("双击表格数据...");
	}
	
		
</script>	
</head>
<body class="easyui-layout" style="visibility:hidden;">
    <div region="center" border="false">
    	<table id="grid"></table>
	</div>
	<div class="easyui-window" title="修改学生信息" id="updateStu" collapsible="false" minimizable="false" maximizable="false" style="top:100px;left:200px">
		<div region="north" style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true" >保存修改</a>
			</div>
		</div>
		<div region="center" style="overflow:auto;padding:5px;" border="false">
			<form>
				<table class="table-edit" width="80%" align="center">
					
					<caption class="title">学生基本信息</caption>
					<tr>
						<td>学生电话</td>
						<td><input type="text" class="easyui-numberbox"/></td>
					</tr>
					
					<tr>
						<td>学生积分</td>
						<td><input type="text" class="easyui-numberbox" /></td>
					</tr>
					</table>
			</form>
		</div>
	</div>
</body>
</html>