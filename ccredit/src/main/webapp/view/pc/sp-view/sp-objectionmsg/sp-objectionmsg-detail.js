var spObjectionmsgWinDetail;
var spObjectionmsgFormDetail;
function detailSpObjectionmsg(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要查看明细的项！');
		return;
	}
	initSpObjectionmsgFormDetail();
	spObjectionmsgWinDetail = Ext.create('Ext.Window',{
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
		items:spObjectionmsgFormDetail,
		buttons:[{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	spObjectionmsgWinDetail.show();
	
	loadFormData(spObjectionmsgFormDetail,'../spObjectionmsgController/getSpObjectionmsgById?objectionmsg_id='+ record.items[0].data.objectionmsg_id);
}
function initSpObjectionmsgFormDetail(){
	var formFieldSet = new Ext.form.FieldSet({
		id : 'FieldSet',
		layout : 'column',
		labelWidth : 150,
		collapsible : true, // 可折叠
		// autoHeight : true,
		height : 400,
		border : true,
		title : '异议申请信息',
		items : [{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:50px;',
			items : [{
				fieldLabel:'申请主题',
				xtype:'textfield',
				name:'theme',
				anchor:'90%'
			},{
				fieldLabel:'异议申请机构',
				xtype:'textfield',
				name:'applydept',
				anchor:'90%'
			}]
		},
		{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:50px;',
			items : [{
				fieldLabel:'异议申请人',
				xtype:'textfield',
				name:'applyperson',
				anchor:'90%'
			},
			{
				fieldLabel:'申请人联系方式',
				xtype:'textfield',
				name:'applyphone',
				anchor:'90%'
			}]
		},{
			xtype : 'container',
			columnWidth : 1,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:50px;',
			items : [{
				fieldLabel:'异议事项描述',
				xtype:'textarea',
				name:'description',
				anchor:'95%'
			}]
		}
		]

	});
	spObjectionmsgFormDetail = Ext.create('Ext.FormPanel',{
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
		items:[formFieldSet]
	});
}
