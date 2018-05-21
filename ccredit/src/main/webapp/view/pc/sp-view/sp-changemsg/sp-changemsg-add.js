var spChangemsgWinAdd;
var spChangemsgFormAdd;
function addSpChangemsg(){
	initSpChangemsgFormAdd();
	spChangemsgWinAdd = Ext.create('Ext.Window',{
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
		items:spChangemsgFormAdd,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(spChangemsgFormAdd,'../spChangemsgController/addSpChangemsg',grid,spChangemsgWinAdd,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	spChangemsgWinAdd.show();
	
}
function initSpChangemsgFormAdd(){
	spChangemsgFormAdd = Ext.create('Ext.FormPanel',{
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
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'借据号',
			xtype:'textfield',
			name:'serialno',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'信息记录类型',
			xtype:'combo',
			emptyText:'请选择',
			store:INFRECTYPECHG,
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
			fieldLabel:'原业务标识号/待更正业务标识',
			xtype:'textfield',
			name:'odbnescode',
			maxLength:60,
			anchor:'100%'
		},
		{
			fieldLabel:'新业务标识号',
			xtype:'textfield',
			name:'nwbnescode',
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
			fieldLabel:'待更正段段标',
			xtype:'combo',
			emptyText:'请选择',
			store:MDFCSGMTCODECODE1,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'mdfcsgmtcode',
			valueField:'value',
			displayField:'text',
			name:'mdfcsgmtcode',
			anchor:'100%'
		},
		{
			fieldLabel:'原因',
			xtype:'textfield',
			name:'reason',
			maxLength:80,
			anchor:'100%'
		},
		{
			fieldLabel:'申请人',
			xtype:'textfield',
			name:'applyman',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'审批人',
			xtype:'textfield',
			name:'auditman',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'生成时间',
			xtype:'datefield',
			format:'Y-m-d',
			name:'credittime',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'报送时间',
			xtype:'datefield',
			format:'Y-m-d',
			name:'sendtime',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'xml的id',
			xtype:'textfield',
			name:'xml',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'xml文件名',
			xtype:'textfield',
			name:'filename',
			maxLength:80,
			anchor:'100%'
		}
		]
	});
}
