var bsIdsgmtWinAdd;
var bsIdsgmtFormAdd;
function addBsIdsgmt(){
	initBsIdsgmtFormAdd();
	bsIdsgmtWinAdd = Ext.create('Ext.Window',{
		layout:'fit',
		width:800,
		height:400,
		maximizable:true,
		minimizable:true,
		animateTarget:document.body,
		plain:true,
		modal:true,
		title:'添加信息',
		listeners:{
			minimize:function(win,opts){
				if(!win.collapse()){
					win.collapse();
				}else{
					win.expand();
				}
			}
		},
		items:bsIdsgmtFormAdd,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(bsIdsgmtFormAdd,'../bsIdsgmtController/addBsIdsgmt',grid,bsIdsgmtWinAdd,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	bsIdsgmtWinAdd.show();
	
}
function initBsIdsgmtFormAdd(){
	bsIdsgmtFormAdd = Ext.create('Ext.FormPanel',{
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
					fieldLabel:'客户号',
					xtype:'textfield',
					name:'customid',
					allowBlank:false,
					maxLength:40,
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
			hiddenName:'othentcerttype',
			valueField:'value',
			displayField:'text',
			name:'othentcerttype',
			anchor:'100%'
		},
		{
			fieldLabel:'企业身份标识号码',
			xtype:'textfield',
			name:'othentcertnum',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'信息更新日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'idinfoupdate',
			maxLength:10,
			anchor:'100%'
		}


		]
	});
}
