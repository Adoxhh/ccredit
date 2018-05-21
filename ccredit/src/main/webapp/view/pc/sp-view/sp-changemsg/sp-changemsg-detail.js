var spChangemsgWinDetail;
var spChangemsgFormDetail;
function detailSpChangemsg(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要查看明细的项！');
		return;
	}
	initSpChangemsgFormDetail();
	var infrectype=record.items[0].data.infrectype;
	Ext.getCmp('FieldSet2').setVisible(false);
	Ext.getCmp('FieldSet3').setVisible(false);
	if(infrectype=='411'||infrectype=='421'||infrectype=='431'||infrectype=='441'||infrectype=='511'){
		Ext.getCmp('FieldSet2').setVisible(true);
	}else{
		Ext.getCmp('FieldSet3').setVisible(true);
		Ext.getCmp('odbnescode2').setValue(record.items[0].data.odbnescode);
	}
	spChangemsgWinDetail = Ext.create('Ext.Window',{
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
		items:spChangemsgFormDetail,
		buttons:[{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	spChangemsgWinDetail.show();
	
	loadFormData(spChangemsgFormDetail,'../spChangemsgController/getSpChangemsgById?changemsg_id='+ record.items[0].data.changemsg_id);
}
function initSpChangemsgFormDetail(){
	
	var formFieldSet1 = new Ext.form.FieldSet({
		id : 'FieldSet1',
		layout : 'column',
		labelWidth : 150,
		collapsible : true, // 可折叠
		// autoHeight : true,
		height : 100,
		border : true,
		labelAlign:'left',
		title : '信息记录类型',
		items : [{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:50px;',
			items : [ {
				fieldLabel:'信息记录类型',
				xtype:'textfield',
				name:'infrectypetext',
				anchor:'90%'
			} ]
		} ]

	});
	
	var formFieldSet2 = new Ext.form.FieldSet({
		id : 'FieldSet2',
		layout : 'column',
		labelWidth : 150,
		collapsible : true, // 可折叠
		// autoHeight : true,
		height : 100,
		border : true,
		border : true,
		title : '详细信息',
		items : [{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:50px;',
			items : [ {
				fieldLabel:'原业务标识号',
				xtype:'textfield',
				name:'odbnescode',
				id:'odbnescode1',
				anchor:'90%'
			} ]
		},{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:50px;',
			items : [ 
			{
				fieldLabel:'新业务标识号',
				xtype:'textfield',
				name:'nwbnescode',
				anchor:'90%'
			} ]
		} ]

	});
	
	var formFieldSet3 = new Ext.form.FieldSet({
		id : 'FieldSet3',
		layout : 'column',
		labelWidth : 150,
		collapsible : true, // 可折叠
		// autoHeight : true,
		height : 150,
		border : true,
		hidden : true,
		title : '详细信息',
		items : [{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:50px;',
			items : [{
				fieldLabel:'待更正业务标识',
				xtype:'textfield',
				name:'odbnescode2',
				id:'odbnescode2',
				anchor:'90%'
			},
			{
				fieldLabel:'待更正段段标',
				xtype:'textfield',
				name:'mdfcsgmtcodetext',
				anchor:'90%'
			}]
		},
		{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:50px;',
			items : [{
				fieldLabel:'信息报告日期',
				xtype:'datefield',
				format:'Y-m-d',
				name:'rptdate',
				anchor:'90%'
			}]
		}]

	});
	
	var formFieldSet4 = new Ext.form.FieldSet({
		id : 'FieldSet4',
		layout : 'column',
		labelWidth : 150,
		collapsible : true, // 可折叠
		// autoHeight : true,
		height : 100,
		border : true,
		title : '其他信息',
		items : [{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:50px;',
			items : [{
				fieldLabel:'原因',
				xtype:'textfield',
				name:'reason',
				anchor:'90%'
			}]
		},
		{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:50px;',
			items : [{
				fieldLabel:'申请人',
				xtype:'textfield',
				name:'applyman',
				anchor:'90%'
			}]
		}
		]

	});
	spChangemsgFormDetail = Ext.create('Ext.FormPanel',{
		xtype:'form',
		waitMsgTarget:true,
		defaultType:'textfield',
		autoScroll:true,
		/**新方法使用开始**/
		scrollable:true,
		scrollable:'x',
		scrollable:'y',
		//**新方法使用结束**//*
		fieldDefaults:{
			labelWidth:70,
			labelAlign:'left',
			flex:1,
			readOnly:true,
			margin:'2 5 4 5'
		},
		items:[formFieldSet1,formFieldSet2,formFieldSet3,formFieldSet4]
	});
}
