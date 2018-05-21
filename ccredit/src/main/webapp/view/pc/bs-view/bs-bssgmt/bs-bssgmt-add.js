var bsBssgmtWinAdd;
var bsBssgmtFormAdd;
function addBsBssgmt(){
	initBsBssgmtFormAdd();
	bsBssgmtWinAdd = Ext.create('Ext.Window',{
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
		items:bsBssgmtFormAdd,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(bsBssgmtFormAdd,'../bsBssgmtController/addBsBssgmt',grid,bsBssgmtWinAdd,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	bsBssgmtWinAdd.show();
	
}
function initBsBssgmtFormAdd(){
	bsBssgmtFormAdd = Ext.create('Ext.FormPanel',{
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
			fieldLabel:'信息报告日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'rptdate',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'报告时点说明代码',
			xtype:'combo',
			emptyText:'请选择',
			store:BSRPTDATECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'rptdatecode',
			valueField:'value',
			displayField:'text',
			name:'rptdatecode',
			anchor:'100%'
		},
		{
			fieldLabel:'信息来源编码',
			xtype:'textfield',
			name:'infsurccode',
			maxLength:20,
			anchor:'100%'
		},
		{
			fieldLabel:'客户资料维护机构代码',
			xtype:'textfield',
			name:'cimoc',
			maxLength:14,
			anchor:'100%'
		},
		{
			fieldLabel:'客户资料类型',
			xtype:'combo',
			emptyText:'请选择',
			store:CUSTOMERTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'customertype',
			valueField:'value',
			displayField:'text',
			name:'customertype',
			anchor:'100%'
		},
		{
			fieldLabel:'存续状态',
			xtype:'combo',
			emptyText:'请选择',
			store:ETPSTSCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'etpsts',
			valueField:'value',
			displayField:'text',
			name:'etpsts',
			anchor:'100%'
		},
		{
			fieldLabel:'组织机构类型',
			xtype:'combo',
			emptyText:'请选择',
			store:ORGTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'orgtype',
			valueField:'value',
			displayField:'text',
			name:'orgtype',
			anchor:'100%'
		}
		]
	});
}
