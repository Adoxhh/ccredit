//返回r
function goback(){
	tlocation("../lcProcessController/loadLcProcess");
}
$('#defaultForm').bootstrapValidator({
	message:'此值不是有效的'
});
//保存
function updateLcProcess(){
	submitBForm('defaultForm','../lcProcessController/updateLcProcess','../lcProcessController/loadLcProcess');
}
//初始化日期选择器
$(document).ready(function(){
	datetimeInit();
});

/**初始化附件右键菜单开始 参数4为1表示拥有上传和删除功能 即新增和编辑页面使用**/
initBFileRight('xt_attachment','xt_attachment_pic',1);
/**初始化附件右键菜单结束**/

/**配置附件回显方法开始**/
var params = {xt_attachment_id:$('#xt_attachment').val(),field_name:'xt_attachment'};
ajaxBFilePathBackRequest('../xtCommonController/getAttachmentPathPP',params);
/**配置附件回显方法结束**/

InitconstantListSetV(3,'xt_constant_id','xt_constant_id_');