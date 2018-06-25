<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>iBlog后台管理</title>
  <link rel="stylesheet" href="/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">iBlog 后台管理系统</div>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          admin
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">修改密码</a></dd>
          <dd><a href="">退出</a></dd>
        </dl>
      </li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item">
          <a class="" href="javascript:;">博客管理</a>
          <!-- <dl class="layui-nav-child">
            <dd><a href="javascript:;">列表一</a></dd>
          </dl> -->
        </li>
        <li class="layui-nav-item"><a href="/admin/userManage">用户管理</a></li>
        <li class="layui-nav-item"><a href="javascript:;">分类管理</a></li>
        <li class="layui-nav-item"><a href="javascript:;">评论管理</a></li>
        <li class="layui-nav-item"><a href="javascript:;">访问记录</a></li>
        <li class="layui-nav-item"><a href="javascript:;">异常日志</a></li>
      </ul>
    </div>
  </div>

  <div class="layui-body">
    <div class="cur-page" style="height: 30px;"></div>
    <iframe src="" width="100%" height="100%" id="ifr-body"></iframe>
  </div>
</div>
<script src="/js/jquery.min.js"></script>
<script src="/layui/layui.js"></script>
<script>
    layui.use('element', function(){
      var element = layui.element;
      
    });
    $('.layui-nav-tree a').on("click",function(){
      var path = $(this).attr('href');
      $('#ifr-body').attr('src',path);
      $(this).parents(".layui-nav-item").addClass("layui-this").siblings().removeClass("layui-this");
      return false;
    }).first().click();
</script>
</body>
</html>