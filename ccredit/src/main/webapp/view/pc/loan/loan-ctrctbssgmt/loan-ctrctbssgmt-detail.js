var loanCtrctbssgmtWinDetail;
var loanCtrctbssgmtFormDetail;
function detailLoanCtrctbssgmt(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要查看明细的项！');
		return;
	}
	initLoanCtrctbssgmtFormDetail();
	loanCtrctbssgmtWinDetail = Ext.create('Ext.Window',{
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
		items:loanCtrctbssgmtFormDetail,
		buttons:[{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	loanCtrctbssgmtWinDetail.show();
	
	loadFormData(loanCtrctbssgmtFormDetail,'../loanCtrctbssgmtController/getLoanCtrctbssgmtById?loan_ctrctbssgmt_id='+ record.items[0].data.loan_ctrctbssgmt_id);
}
function initLoanCtrctbssgmtFormDetail(){
	loanCtrctbssgmtFormDetail = Ext.create('Ext.FormPanel',{
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
			name:'loan_ctrctbssgmt_id',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'信息记录类型',
			xtype:'combo',
			emptyText:'请选择',
			store:INFRECTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'infrectype',
			valueField:'value',
			displayField:'text',
			name:'infrectype',
			anchor:'100%'
		},
		{
			fieldLabel:'授信协议标识码',
			xtype:'textfield',
			name:'contractcode',
			maxLength:60,
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
			store:RPTDATECODECODE2,
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
			fieldLabel:'受信人名称',
			xtype:'textfield',
			name:'name',
			maxLength:80,
			anchor:'100%'
		},
		{
			fieldLabel:'受信人身份标识类型',
			xtype:'combo',
			emptyText:'请选择',
			store:IDTYPECODECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'idtype',
			valueField:'value',
			displayField:'text',
			name:'idtype',
			anchor:'100%'
		},
		{
			fieldLabel:'受信人身份标识号码',
			xtype:'textfield',
			name:'idnum',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'业务管理机构代码',
			xtype:'textfield',
			name:'mngmtorgcode',
			maxLength:14,
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
