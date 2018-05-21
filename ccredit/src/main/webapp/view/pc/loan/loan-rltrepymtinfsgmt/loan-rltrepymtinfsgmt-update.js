var loanRltrepymtinfsgmtWinEdit;
var loanRltrepymtinfsgmtFormEdit;
function updateLoanRltrepymtinfsgmt(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要修改的一项！');
		return;
	}
	initLoanRltrepymtinfsgmtFormEdit();
	loanRltrepymtinfsgmtWinEdit = Ext.create('Ext.Window',{
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
		items:loanRltrepymtinfsgmtFormEdit,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(loanRltrepymtinfsgmtFormEdit,'../loanRltrepymtinfsgmtController/updateLoanRltrepymtinfsgmt',grid,loanRltrepymtinfsgmtWinEdit,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	loanRltrepymtinfsgmtWinEdit.show();
	
	loadFormData(loanRltrepymtinfsgmtFormEdit,'../loanRltrepymtinfsgmtController/getLoanRltrepymtinfsgmtById?loan_rltrepymtinfsgmt_id='+ record.items[0].data.loan_rltrepymtinfsgmt_id);
}
function initLoanRltrepymtinfsgmtFormEdit(){
	loanRltrepymtinfsgmtFormEdit = Ext.create('Ext.FormPanel',{
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
			name:'loan_rltrepymtinfsgmt_id',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'责任人个数',
			xtype:'textfield',
			name:'rltrepymtnm',
			maxLength:5,
			anchor:'100%'
		},
		{
			fieldLabel:'身份类别',
			xtype:'combo',
			emptyText:'请选择',
			store:ARLPIDTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'arlpidtype',
			valueField:'value',
			displayField:'text',
			name:'arlpidtype',
			anchor:'100%'
		},
		{
			fieldLabel:'责任人名称',
			xtype:'textfield',
			name:'arlpname',
			maxLength:80,
			anchor:'100%'
		},
		{
			fieldLabel:'责任人身份标识类型',
			xtype:'combo',
			emptyText:'请选择',
			store:IDTYPECODECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'arlpcerttype',
			valueField:'value',
			displayField:'text',
			name:'arlpcerttype',
			anchor:'100%'
		},
		{
			fieldLabel:'责任人身份标识号码',
			xtype:'textfield',
			name:'arlpcertnum',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'还款责任人类型',
			xtype:'combo',
			emptyText:'请选择',
			store:ARLPTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'arlptype',
			valueField:'value',
			displayField:'text',
			name:'arlptype',
			anchor:'100%'
		},
		{
			fieldLabel:'还款责任金额',
			xtype:'textfield',
			name:'arlpamt',
			maxLength:15,
			anchor:'100%'
		},
		{
			fieldLabel:'联保标志',
			xtype:'combo',
			emptyText:'请选择',
			store:WARTYSIGNCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'wartysign',
			valueField:'value',
			displayField:'text',
			name:'wartysign',
			anchor:'100%'
		},
		{
			fieldLabel:'最高额保证合同标识码',
			xtype:'textfield',
			name:'maxguarmcc',
			maxLength:60,
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
