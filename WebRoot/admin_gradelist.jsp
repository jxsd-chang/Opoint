<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考试信息列表</title>
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
		id : 'button-delete',
		text : '删除',
		iconCls : 'icon-cancel',
		handler : doDelete
	}];
	// 定义列
	var columns = [ [ {
		field : 'exId',
		checkbox : true,
	}, {
		field : 'stuName',
		title : '学生姓名',
		width : 120,
		align : 'center'
	},{
		field : 'couName',
		title : '课程名称',
		width : 120,
		align : 'center'
	}, {
		field : 'paName',
		title : '试卷名称',
		width : 250,
		align : 'center'
	}, {
		field : 'exTime',
		title : '考试提交时间',
		width : 120,
		align : 'center',
	}, {
		field : 'exGrade',
		title : '考试成绩',
		width : 160,
		align : 'center'
	} ] ];
	
	$(function(){
		// 先将body隐藏，再显示，不会出现页面刷新效果
		$("body").css({visibility:"visible"});
		
		// 考试基本信息表格
		$('#grid').datagrid( {
			iconCls : 'icon-forward',
			fit : true,
			border : false,
			singleSelect:true,
			rownumbers : true,
			striped : true,
			pageList: [10,20,30],
			pagination : true,
			toolbar : toolbar,
			url : "${pageContext.request.contextPath}/ExamController/getAllExam.action",
			idField : 'id',
			columns : columns,
			onDblClickRow : doDblClickRow
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
</body>
</html>