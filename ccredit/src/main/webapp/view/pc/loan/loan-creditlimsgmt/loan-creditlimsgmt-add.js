var loanCreditlimsgmtWinAdd;
var loanCreditlimsgmtFormAdd;
function addLoanCreditlimsgmt(){
	initLoanCreditlimsgmtFormAdd();
	loanCreditlimsgmtWinAdd = Ext.create('Ext.Window',{
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
		items:loanCreditlimsgmtFormAdd,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(loanCreditlimsgmtFormAdd,'../loanCreditlimsgmtController/addLoanCreditlimsgmt',grid,loanCreditlimsgmtWinAdd,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	loanCreditlimsgmtWinAdd.show();
	
}
function initLoanCreditlimsgmtFormAdd(){
	loanCreditlimsgmtFormAdd = Ext.create('Ext.FormPanel',{
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
			fieldLabel:'授信额度类型',
			xtype:'combo',
			emptyText:'请选择',
			store:CREDITLIMTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'creditlimtype',
			valueField:'value',
			displayField:'text',
			name:'creditlimtype',
			anchor:'100%'
		},
		{
			fieldLabel:'额度循环标志',
			xtype:'combo',
			emptyText:'请选择',
			store:LIMLOOPFLGCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'limloopflg',
			valueField:'value',
			displayField:'text',
			name:'limloopflg',
			anchor:'100%'
		},
		{
			fieldLabel:'授信额度',
			xtype:'textfield',
			name:'creditlim',
			maxLength:15,
			anchor:'100%'
		},
		{
			fieldLabel:'币种',
			xtype:'combo',
			emptyText:'请选择',
			store:CYCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'cy',
			valueField:'value',
			displayField:'text',
			name:'cy',
			anchor:'100%'
		},
		{
			fieldLabel:'额度生效日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'coneffdate',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'额度到期日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'conexpdate',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'额度状态',
			xtype:'combo',
			emptyText:'请选择',
			store:CONSTATUSCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'constatus',
			valueField:'value',
			displayField:'text',
			name:'constatus',
			anchor:'100%'
		},
		{
			fieldLabel:'借据号',
			xtype:'textfield',
			name:'serialno',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'客户号',
			xtype:'textfield',
			name:'customid',
			allowBlank:false,
			maxLength:40,
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
