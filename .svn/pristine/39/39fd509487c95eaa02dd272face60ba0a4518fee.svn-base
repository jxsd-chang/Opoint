<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>分页查询所有学生</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/themes/default/easyui.css" type="text/css"></link>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/themes/icon.css" type="text/css"></link>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
  </head>
  <body>
	<table id="dg" style="width:800px"></table>
	<script type="text/javascript">
		$("#dg").datagrid({
			url : '${pageContext.request.contextPath}/StudentController?time=' + new Date().getTime(),    
		    columns : [[    
				        {field:'stuId',title:'学生编号',width:100},    
				        {field:'stuName',title:'学生姓名',width:100},    
				        {field:'stuPwd',title:'学生密码',width:100},    
				        {field:'stuSex',title:'学生性别',width:100},    
				        {field:'stuJifen',title:'学生积分',width:100},    
				        {field:'stuPro',title:'学生专业',width:100},    
		    ]],
		    fitColumns : true,
		    singleSelect : true,
		    pagination : true,
		    pageNumber : 1,
		    pageSize : 9,
		    pageList : [9],
		    fit:true
		});
	</script>
  </body>
</html>
