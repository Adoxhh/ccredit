var xmlnodeWinEdit;
var xmlnodeFormEdit;
function updateXmlnode(){
	var record = nodegrid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要修改的一项！');
		return;
	}
	initXmlnodeFormEdit();
	xmlnodeWinEdit = Ext.create('Ext.Window',{
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
		items:xmlnodeFormEdit,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm2(xmlnodeFormEdit,'../xmlnodeController/updateXmlnode',nodegrid,xmlnodeWinEdit,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	xmlnodeWinEdit.show();
	
	loadFormData(xmlnodeFormEdit,'../xmlnodeController/getXmlnodeById?id='+ record.items[0].data.id);
}
function initXmlnodeFormEdit(){
	xmlnodeFormEdit = Ext.create('Ext.FormPanel',{
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
			name:'id',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'编号',
			xtype:'textfield',
			name:'nodeid',
			maxLength:40,
			anchor:'100%',
			readOnly:true
		},
		{
			fieldLabel:'节点名称',
			xtype:'textfield',
			name:'nodename',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'节点码',
			xtype:'textfield',
			name:'nodecode',
			maxLength:60,
			anchor:'100%'
		},
		{
			fieldLabel:'父节点编号',
			xtype:'textfield',
			name:'parentid',
			maxLength:40,
			anchor:'100%'
		},
		
		{
			fieldLabel:'排序',
			xtype:'numberfield',
			value:'0',
			name:'sortno',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'信息段编号',
			xtype:'textfield',
			name:'segmentid',
			maxLength:40,
			anchor:'100%',
			readOnly:true
		},
		{
			fieldLabel:'备注',
			xtype:'textfield',
			name:'remark',
			maxLength:40,
			anchor:'100%'
		}
		]
	});
}
