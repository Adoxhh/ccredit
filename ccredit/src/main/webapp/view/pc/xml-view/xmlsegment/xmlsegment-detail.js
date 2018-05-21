var xmlsegmentWinDetail;
var xmlsegmentFormDetail;
function detailXmlsegment(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要查看明细的项！');
		return;
	}
	initXmlsegmentFormDetail();
	xmlsegmentWinDetail = Ext.create('Ext.Window',{
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
		items:xmlsegmentFormDetail,
		buttons:[{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	xmlsegmentWinDetail.show();
	
	loadFormData(xmlsegmentFormDetail,'../xmlsegmentController/getXmlsegmentById?id='+ record.items[0].data.id);
}
function initXmlsegmentFormDetail(){
	xmlsegmentFormDetail = Ext.create('Ext.FormPanel',{
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
			fieldLabel:'编号',
			xtype:'textfield',
			hidden:true,
			name:'id',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'信息段名称 ',
			xtype:'textfield',
			name:'segmentname',
			maxLength:50,
			anchor:'100%'
		},
		{
			fieldLabel:'信息段code',
			xtype:'textfield',
			name:'segmentcode',
			maxLength:50,
			anchor:'100%'
		},
		{
			fieldLabel:'表名',
			xtype:'textfield',
			name:'tablename',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'模板编号',
			xtype:'textfield',
			name:'templateid',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'属性',
			xtype:"combo",
            store:[["1","选报"],["2","必报"]],
            emptyText:"请选择",
            mode:"local",
            triggerAction:"all",
            editable:false,
            name:'property',
			hiddenName:'property',
			allowBlank:false,
			anchor:'100%'
		},
		{
			fieldLabel:'顺序',
			xtype:'numberfield',
			value:'0',
			name:'sortno',
			maxLength:10,
			anchor:'100%'
		}
		]
	});
}
