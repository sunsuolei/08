<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../easyui/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="../easyui/themes/icon.css">   
<script type="text/javascript" src="../easyui/jquery.min.js"></script>   
<script type="text/javascript" src="../easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../easyui/locale/easyui-lang-zh_CN.js"></script> 
<script type="text/javascript">
	$(function(){
		init();
	})

	function init(){
		$('#dg').datagrid({    
		    url:'../getYg.action',    
		    fitColumns:true,
		    singleSelect:true,
		    pagination:true,
		    toolbar:"#dd",
		    queryParams:{
		    	min_ruzhi:$("#min_ruzhi").val(),
		    	max_ruzhi:$("#max_ruzhi").val()
		    }
		});
	}
</script> 
</head>
<body>
	<table id="dg" class="easyui-datagrid" >   
	    <thead>   
	        <tr>   
	            <th data-options="field:'yid',width:100">编码</th>   
	            <th data-options="field:'yname',width:100">名称</th> 
	            <th data-options="field:'roleId',width:100">角色</th> 
	            <th data-options="field:'ruzhi',width:100">入职日期</th>  
	            <!-- <th data-options="field:'caozuo',width:100,formatter:formattercaozuo">价格</th> -->   
	        </tr>   
	    </thead>   
	</table>
	
	<div id="dd" class="easyui-dialog" data-options="closed:true,resizable:true,modal:true">   
      <form id="ff" method="post">   
	        <label for="name">入职日期:</label>   
	        <input class="easyui-validatebox" type="text" id="min_ruzhi" />  ~ <input class="easyui-validatebox" type="text" id="max_ruzhi" />   
	  	<a id="btn" href="javascript:void(0)" class="easyui-linkbutton" onclick="init()" data-options="iconCls:'icon-search'">搜索</a>  
	  </form> 
	</div>  
</body>
</html>