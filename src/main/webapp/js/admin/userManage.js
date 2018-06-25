layui.use(['table','form','layer'], function(){
	var table = layui.table;
	var form = layui.form;
	layer = layui.layer;

	//监听表格行选中
    table.on('tool(dataTable)', function(obj){
      $('table').data('seleObj',obj);
    });
});
$("#btn-newAdd").on("click",function(){
	layer.open({
		type: 1,
		title: '新增',
		area: ['350px', '295px'],
			  skin: 'gs-layer-title', //样式类名
			  anim: 0,
			  shade: 0.6, //遮罩透明度
			  shadeClose: true, 
			  content: $('#pop_newAdd')
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
$(".gs-form .gs-btn-cancel").on("click",function(){
	layer.close(layer.index);
})