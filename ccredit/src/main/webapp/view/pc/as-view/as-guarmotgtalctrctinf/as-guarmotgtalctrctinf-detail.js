var asGuarmotgtalctrctinfWinDetail;
var asGuarmotgtalctrctinfFormDetail;
function detailAsGuarmotgtalctrctinf(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要查看明细的项！');
		return;
	}
	initAsGuarmotgtalctrctinfFormDetail();
	asGuarmotgtalctrctinfWinDetail = Ext.create('Ext.Window',{
		layout:'fit',
		width:800,
		height:400,
		maximizable:true,
		minimizable:true,
		animateTarget:document.body,
		plain:true,
		modal:true,
		title:'明细信息',
		listeners:{
			minimize:function(win,opts){
				if(!win.collapse()){
					win.collapse();
				}else{
					win.expand();
				}
			}
		},
		items:asGuarmotgtalctrctinfFormDetail,
		buttons:[{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	asGuarmotgtalctrctinfWinDetail.show();
	
	loadFormData(asGuarmotgtalctrctinfFormDetail,'../asGuarmotgtalctrctinfController/getAsGuarmotgtalctrctinfById?guarmotgtalctrctinf_id='+ record.items[0].data.guarmotgtalctrctinf_id);
}
function initAsGuarmotgtalctrctinfFormDetail(){
	asGuarmotgtalctrctinfFormDetail = Ext.create('Ext.FormPanel',{
		xtype:'form',
		waitMsgTarget:true,
		defaultType:'textfield',
		autoScroll:true,
		/**新方法使用开始**/
		scrollable:true,
		scrollable:'x',
		scrollable:'y',
		/**新方法使用结束**/
		fieldDefaults:{
			labelWidth:70,
			labelAlign:'left',
			flex:1,
			readOnly:true,
			margin:'2 5 4 5'
		},
		items:[
		{
			fieldLabel:'主键',
			xtype:'textfield',
			hidden:true,
			name:'guarmotgtalctrctinf_id',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'借据号',
			xtype:'textfield',
			name:'serialno',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'客户号',
			xtype:'textfield',
			name:'customid',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'抵(质)押合同标识号',
			xtype:'textfield',
			name:'ccc',
			maxLength:60,
			anchor:'100%'
		},
		{
			fieldLabel:'最后一次修改日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'lastdate',
			allowBlank:false,
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'状态位',
			xtype:'combo',
			emptyText:'请选择',
			store:CHANGEFLAGCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'changeflag',
			valueField:'value',
			displayField:'text',
			name:'changeflag',
			allowBlank:false,
			anchor:'100%'
		}
		]
	});
}
