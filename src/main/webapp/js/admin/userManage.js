layui.use(['table','form','layer'], function(){
	var table = layui.table;
	var form = layui.form;
	layer = layui.layer;

	table.render({
	    elem: '#dataTable',
	    url: '/api/user/list',
	    page: true,
	    cols: [[ //表头
	      {type: 'checkbox', width:'5%'},
	      {field: 'name', title: '用户名', width:'15%'},
	      {field: 'role', title: '角色', width:'10%'},
	      {field: 'qq', title: 'QQ', width:'10%'},
	      {field: 'wechat', title: '微信', width: '10%'},
	      {field: 'e_mail', title: '邮箱', width: '10%'},
	      {field: 'create_time', title: '创建时间', width:'10%'},
	      {field: 'update_time', title: '修改时间', width: '10%'},
	      {field: 'is_disabled', title: '禁用'}
	    ]]
  	});
	//监听表格行选中
    table.on('tool(dataTable)', function(obj){
      $('table').data('seleObj',obj);
    });
});
$("#btn-Add").on("click",function(){
	$(".pop-form").attr("form-attr","add");
	layer.open({
		type: 1,
		title: '新增',
		area: ['350px', '295px'],
			  skin: 'pop-layer-title', //样式类名
			  anim: 0,
			  shade: 0.6, //遮罩透明度
			  shadeClose: true, 
			  content: $('.pop-form')
	});
})
$("#btn-del").on("click",function(){
	var seleObj = $('table').data('seleObj');
	if(!seleObj){
		alert("请先选中要删除的数据");
		return;
	}
	else{
		seleObj.del();
		$('table').removeData('seleObj');
	}
})
$(".pop-btn-ok").on("click",function(){
	var $form = $(this).parents(".pop-form");
	var formAttr = $form.attr("form-attr");	
	var name = $form.find("[name=name]").val();
	var password = $form.find("[name=password]").val();
	var role = $form.find("[name=role]").val();
	if(!name || !password || !role){
		return;
	}
	$.post("/api/user/add",{
		name:name,
		password:password,
		role:role
	},function(ret){
		if(ret.code != 0){
			alert(ret.msg);
			return;
		}
		layer.closeAll();
		layer.msg('添加成功', {icon: 6});
	})
})
$(".pop-btn-cancel").on("click",function(){	//弹出框取消
	layer.closeAll();
})