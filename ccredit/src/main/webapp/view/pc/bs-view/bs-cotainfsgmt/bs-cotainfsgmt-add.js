var bsCotainfsgmtWinAdd;
var bsCotainfsgmtFormAdd;
function addBsCotainfsgmt(){
	initBsCotainfsgmtFormAdd();
	bsCotainfsgmtWinAdd = Ext.create('Ext.Window',{
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
		items:bsCotainfsgmtFormAdd,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(bsCotainfsgmtFormAdd,'../bsCotainfsgmtController/addBsCotainfsgmt',grid,bsCotainfsgmtWinAdd,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	bsCotainfsgmtWinAdd.show();
	
}
function initBsCotainfsgmtFormAdd(){
	bsCotainfsgmtFormAdd = Ext.create('Ext.FormPanel',{
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
			fieldLabel:'联系地址行政区划代码',
			xtype:'combo',
			emptyText:'请选择',
			store:ADMDIVOFREGCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'conadddistrictcode',
			valueField:'value',
			displayField:'text',
			name:'conadddistrictcode',
			anchor:'100%'
		},
		{
			fieldLabel:'联系地址',
			xtype:'textfield',
			name:'conadd',
			maxLength:80,
			anchor:'100%'
		},
		{
			fieldLabel:'联系电话',
			xtype:'textfield',
			name:'conphone',
			maxLength:25,
			anchor:'100%'
		},
		{
			fieldLabel:'财务部门联系电话',
			xtype:'textfield',
			name:'finconphone',
			maxLength:25,
			anchor:'100%'
		},
		{
			fieldLabel:'信息更新日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'cotainfoupdate',
			maxLength:10,
			anchor:'100%'
		}
		]
	});
}
