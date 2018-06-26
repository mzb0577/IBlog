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
			<button class="layui-btn layui-btn-primary" id="btn-Add">新增</button>
			<button class="layui-btn layui-btn-primary" id="btn-del">删除</button>
		</div>
	</div>
	<div class="table-area">
		<table class="layui-table" lay-filter="dataTable" id="dataTable"></table>
	</div>
	<div class="layui-form pop-form" form-attr="add">		
	    <div class="layui-form-item">
	    	<label class="layui-form-label">用户名称</label>
		    <div class="layui-input-block">
		      <input type="text" name="name" required lay-verify="required" placeholder="请输入标识" autocomplete="off" class="layui-input">
		    </div>
		</div>
		<div class="layui-form-item">
	    	<label class="layui-form-label">用户密码</label>
		    <div class="layui-input-block">
		      <input type="text" name="password" required lay-verify="required" placeholder="请输入名称" autocomplete="off" class="layui-input">
		    </div>
		</div>
		<div class="layui-form-item">
	    	<label class="layui-form-label">用户角色</label>
		    <div class="layui-input-block">
		      <input type="text" name="role" required lay-verify="required" placeholder="备注..." autocomplete="off" class="layui-input">
		    </div>
		</div>
		<div class="layui-form-item">
		    <div class="layui-input-block">
		      <button class="layui-btn pop-btn-ok" lay-submit>确定</button>
		      <button type="button" class="layui-btn layui-btn-primary pop-btn-cancel">取消</button>
		    </div>
		</div>
	</div>
	<script src="/js/jquery.min.js"></script>
	<script src="/layui/layui.js"></script>
	<script src="/js/admin/userManage.js"></script>
</body>
</html>