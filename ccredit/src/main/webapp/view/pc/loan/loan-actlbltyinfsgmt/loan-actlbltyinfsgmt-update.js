var loanActlbltyinfsgmtWinEdit;
var loanActlbltyinfsgmtFormEdit;
function updateLoanActlbltyinfsgmt(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要修改的一项！');
		return;
	}
	initLoanActlbltyinfsgmtFormEdit();
	loanActlbltyinfsgmtWinEdit = Ext.create('Ext.Window',{
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
		items:loanActlbltyinfsgmtFormEdit,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(loanActlbltyinfsgmtFormEdit,'../loanActlbltyinfsgmtController/updateLoanActlbltyinfsgmt',grid,loanActlbltyinfsgmtWinEdit,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	loanActlbltyinfsgmtWinEdit.show();
	
	loadFormData(loanActlbltyinfsgmtFormEdit,'../loanActlbltyinfsgmtController/getLoanActlbltyinfsgmtById?loan_actlbltyinfsgmt_id='+ record.items[0].data.loan_actlbltyinfsgmt_id);
}
function initLoanActlbltyinfsgmtFormEdit(){
	loanActlbltyinfsgmtFormEdit = Ext.create('Ext.FormPanel',{
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
			fieldLabel:'编号',
			xtype:'textfield',
			hidden:true,
			name:'loan_actlbltyinfsgmt_id',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'账户状态',
			xtype:'combo',
			emptyText:'请选择',
			store:ACCTSTATUSCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'acctstatus',
			valueField:'value',
			displayField:'text',
			name:'acctstatus',
			anchor:'100%'
		},
		{
			fieldLabel:'余额',
			xtype:'textfield',
			name:'acctbal',
			maxLength:15,
			anchor:'100%'
		},
		{
			fieldLabel:'余额变化日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'balchgdate',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'五级分类',
			xtype:'combo',
			emptyText:'请选择',
			store:FIVECATECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'fivecate',
			valueField:'value',
			displayField:'text',
			name:'fivecate',
			anchor:'100%'
		},
		{
			fieldLabel:'五级分类认定日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'fivecateadjdate',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'剩余还款月数',
			xtype:'textfield',
			name:'pymtprd',
			maxLength:5,
			anchor:'100%'
		},
		{
			fieldLabel:'当前逾期总额',
			xtype:'textfield',
			name:'totoverd',
			maxLength:15,
			anchor:'100%'
		},
		{
			fieldLabel:'当前逾期本金',
			xtype:'textfield',
			name:'overdprinc',
			maxLength:15,
			anchor:'100%'
		},
		{
			fieldLabel:'当前逾期天数',
			xtype:'textfield',
			name:'overddy',
			maxLength:5,
			anchor:'100%'
		},
		{
			fieldLabel:'最近一次实际还款日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'latrpydate',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'最近一次实际还款金额',
			xtype:'textfield',
			name:'latrpyamt',
			maxLength:15,
			anchor:'100%'
		},
		{
			fieldLabel:'最近一次实际归还本金',
			xtype:'textfield',
			name:'latrpypri',
			maxLength:15,
			anchor:'100%'
		},
		{
			fieldLabel:'还款形式',
			xtype:'combo',
			emptyText:'请选择',
			store:RPMTTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'rpmttype',
			valueField:'value',
			displayField:'text',
			name:'rpmttype',
			anchor:'100%'
		},
		{
			fieldLabel:'最近一次约定还款日',
			xtype:'datefield',
			format:'Y-m-d',
			name:'latagrrrpydate',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'最近一次约定还款金额',
			xtype:'textfield',
			name:'latagrrrpyamt',
			maxLength:15,
			anchor:'100%'
		},
		{
			fieldLabel:'下一次约定还款日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'nxtagrrrpydate',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'账户关闭日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'closedate',
			maxLength:10,
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
