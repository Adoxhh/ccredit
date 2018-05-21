var bsEnctfitginfWinEdit;
var bsEnctfitginfFormEdit;
function updateBsEnctfitginf(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要修改的一项！');
		return;
	}
	initBsEnctfitginfFormEdit();
	bsEnctfitginfWinEdit = Ext.create('Ext.Window',{
		layout:'fit',
		width:800,
		height:400,
		maximizable:true,
		minimizable:true,
		animateTarget:document.body,
		plain:true,
		modal:true,
		title:'编辑信息',
		listeners:{
			minimize:function(win,opts){
				if(!win.collapse()){
					win.collapse();
				}else{
					win.expand();
				}
			}
		},
		items:bsEnctfitginfFormEdit,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(bsEnctfitginfFormEdit,'../bsEnctfitginfController/updateBsEnctfitginf',grid,bsEnctfitginfWinEdit,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	bsEnctfitginfWinEdit.show();
	
	loadFormData(bsEnctfitginfFormEdit,'../bsEnctfitginfController/getBsEnctfitginfById?enctfitginf_id='+ record.items[0].data.enctfitginf_id);
}
function initBsEnctfitginfFormEdit(){
	bsEnctfitginfFormEdit = Ext.create('Ext.FormPanel',{
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
			margin:'2 5 4 5'
		},
		items:[
		{
			fieldLabel:'主键',
			xtype:'textfield',
			hidden:true,
			name:'enctfitginf_id',
			allowBlank:false,
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
			fieldLabel:'信息记录类型',
			xtype:'combo',
			emptyText:'请选择',
			store:ASINFRECTYPECODE,
			mode:'local',
			triggerAction:'all',
			hidden:true,
			editable:false,
			hiddenName:'infrectype',
			valueField:'value',
			displayField:'text',
			name:'infrectype',
			anchor:'100%'
		},
		{
			fieldLabel:'企业名称',
			xtype:'textfield',
			name:'entname',
			maxLength:80,
			anchor:'100%'
		},
		{
			fieldLabel:'企业身份标识类型',
			xtype:'combo',
			emptyText:'请选择',
			store:OTHENTCERTTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'entcerttype',
			valueField:'value',
			displayField:'text',
			name:'entcerttype',
			anchor:'100%'
		},
		{
			fieldLabel:'企业身份标识号码',
			xtype:'textfield',
			name:'entcertnum',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'企业其他身份标识类型',
			xtype:'combo',
			emptyText:'请选择',
			store:OTHENTCERTTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'othentcerttype',
			valueField:'value',
			displayField:'text',
			name:'othentcerttype',
			anchor:'100%'
		},
		{
			fieldLabel:'企业其他身份标识号码',
			xtype:'textfield',
			name:'othentcertnum',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'身份标识关联标志',
			xtype:'combo',
			emptyText:'请选择',
			store:CERTASSFLGCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'certassflg',
			valueField:'value',
			displayField:'text',
			name:'certassflg',
			anchor:'100%'
		},
		{
			fieldLabel:'信息报告日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'rptdate',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'最后一次修改日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'lastdate',
			allowBlank:false,
			maxLength:10,
			hidden:true,
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
			hidden:true,
			allowBlank:false,
			anchor:'100%'
		}
		]
	});
}
