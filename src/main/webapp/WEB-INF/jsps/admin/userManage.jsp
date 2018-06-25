<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>用户管理</title>
	<link rel="stylesheet" href="/layui/css/layui.css">
	<link rel="stylesheet" href="/css/admin/format.css">
</head>
<body>
	<div class="func-area">
		<div class="search-group">
			<div class="search-input">
				<input type="text" name="title" placeholder="请输入查找内容" class="layui-input">
			</div>
			<button class="layui-btn layui-btn-normal">查询</button>
		</div>
		<div class="btn-group">
			<button class="layui-btn layui-btn-primary" id="btn-newAdd">新增</button>
			<button class="layui-btn layui-btn-primary" id="btn-del">删除</button>
		</div>
	</div>
	<div class="table-area">
		<table class="layui-table" lay-data="{url:'', page:true}" lay-filter="dataTable">
			<thead>
				<tr>
					<th lay-data="{field:'id',width:80,event:'checked'}"></th>
					<th lay-data="{field:'username',width:150,event:'checked'}">用户名称</th>
					<th lay-data="{field:'role',width:'20%',event:'checked'}">角色</th>
					<th lay-data="{field:'',event:'checked'}">操作</th>
				</tr>	    
			</thead>
			<tbody>
				<tr>
					<td></td>
					<td>makit</td>
					<td>滚梨园</td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="layui-form gs-form" id="pop_newAdd">		
	    <div class="layui-form-item">
	    	<label class="layui-form-label">用户名称</label>
		    <div class="layui-input-block">
		      <input type="text" name="categoryId" required  lay-verify="required" placeholder="请输入标识" autocomplete="off" class="layui-input">
		    </div>
		</div>
		<div class="layui-form-item">
	    	<label class="layui-form-label">用户密码</label>
		    <div class="layui-input-block">
		      <input type="text" name="categoryName" required  lay-verify="required" placeholder="请输入名称" autocomplete="off" class="layui-input">
		    </div>
		</div>
		<div class="layui-form-item">
	    	<label class="layui-form-label">用户角色</label>
		    <div class="layui-input-block">
		      <input type="text" name="remark" required  lay-verify="required" placeholder="备注..." autocomplete="off" class="layui-input">
		    </div>
		</div>
		<div class="layui-form-item">
		    <div class="layui-input-block">
		      <button class="layui-btn" lay-submit lay-filter="formDemo">确定</button>
		      <button type="button" class="layui-btn layui-btn-primary gs-btn-cancel" id="btn">取消</button>
		    </div>
		</div>
	</div>
	<div class="layui-form gs-form" id="pop_edit">		
	    <div class="layui-form-item">
	    	<label class="layui-form-label">用户名称</label>
		    <div class="layui-input-block">
		      <input type="text" name="categoryId" required  lay-verify="required" placeholder="请输入标识" autocomplete="off" class="layui-input">
		    </div>
		</div>
		<div class="layui-form-item">
	    	<label class="layui-form-label">用户密码</label>
		    <div class="layui-input-block">
		      <input type="text" name="categoryName" required  lay-verify="required" placeholder="请输入名称" autocomplete="off" class="layui-input">
		    </div>
		</div>
		<div class="layui-form-item">
	    	<label class="layui-form-label">用户角色</label>
		    <div class="layui-input-block">
		      <input type="text" name="remark" required  lay-verify="required" placeholder="备注..." autocomplete="off" class="layui-input">
		    </div>
		</div>
		<div class="layui-form-item">
		    <div class="layui-input-block">
		      <button class="layui-btn" lay-submit lay-filter="formDemo">确定</button>
		      <button type="button" class="layui-btn layui-btn-primary gs-btn-cancel">取消</button>
		    </div>
		</div>
	</div>
	<script src="/js/jquery.min.js"></script>
	<script src="/layui/layui.js"></script>
	<script src="/js/admin/userManage.js"></script>
</body>
</html>