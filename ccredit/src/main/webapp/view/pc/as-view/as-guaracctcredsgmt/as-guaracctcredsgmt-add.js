var asGuaracctcredsgmtWinAdd;
var asGuaracctcredsgmtFormAdd;
function addAsGuaracctcredsgmt(){
	initAsGuaracctcredsgmtFormAdd();
	asGuaracctcredsgmtWinAdd = Ext.create('Ext.Window',{
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
		items:asGuaracctcredsgmtFormAdd,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(asGuaracctcredsgmtFormAdd,'../asGuaracctcredsgmtController/addAsGuaracctcredsgmt',grid,asGuaracctcredsgmtWinAdd,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	asGuaracctcredsgmtWinAdd.show();
	
}
function initAsGuaracctcredsgmtFormAdd(){
	asGuaracctcredsgmtFormAdd = Ext.create('Ext.FormPanel',{
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
			fieldLabel:'授信协议标识码',
			xtype:'textfield',
			name:'mcc',
			maxLength:60,
			anchor:'100%'
		}
		]
	});
}
