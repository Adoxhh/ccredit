var loanCosignersgmtWinDetail;
var loanCosignersgmtFormDetail;
function detailLoanCosignersgmt(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要查看明细的项！');
		return;
	}
	initLoanCosignersgmtFormDetail();
	loanCosignersgmtWinDetail = Ext.create('Ext.Window',{
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
		items:loanCosignersgmtFormDetail,
		buttons:[{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	loanCosignersgmtWinDetail.show();
	
	loadFormData(loanCosignersgmtFormDetail,'../loanCosignersgmtController/getLoanCosignersgmtById?loan_cosignersgmt_id='+ record.items[0].data.loan_cosignersgmt_id);
}
function initLoanCosignersgmtFormDetail(){
	loanCosignersgmtFormDetail = Ext.create('Ext.FormPanel',{
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
			name:'loan_cosignersgmt_id',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'联保人个数',
			xtype:'textfield',
			name:'cosignersnm',
			maxLength:5,
			anchor:'100%'
		},
		{
			fieldLabel:'联保人身份类别',
			xtype:'combo',
			emptyText:'请选择',
			store:ARLPIDTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'cosignerstype',
			valueField:'value',
			displayField:'text',
			name:'cosignerstype',
			anchor:'100%'
		},
		{
			fieldLabel:'联保人名称',
			xtype:'textfield',
			name:'cosignersname',
			maxLength:80,
			anchor:'100%'
		},
		{
			fieldLabel:'联保人身份标识类型',
			xtype:'combo',
			emptyText:'请选择',
			store:IDTYPECODECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'cosignersidtype',
			valueField:'value',
			displayField:'text',
			name:'cosignersidtype',
			anchor:'100%'
		},
		{
			fieldLabel:'联保人身份标识号码',
			xtype:'textfield',
			name:'cosignersidnum',
			maxLength:40,
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
