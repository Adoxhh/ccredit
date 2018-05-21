var spChangemsgWinAdd;
var spChangemsgFormAdd;

var INFRECTYPECHG = new Ext.data.Store({
	  proxy:new Ext.data.HttpProxy({ 
	   url:"../xtCommonController/getXtDataDictionary?ckey=INFRECTYPECHG",
	   reader:new Ext.data.JsonReader({
	    root:'items',
	    type:'json'
	   })
	  }),
	  fields:['value', 'text'],
	  autoLoad:true 
	 });
	var	JDMDFCSGMTCODECODE = new Ext.data.Store({
	  proxy:new Ext.data.HttpProxy({ 
	   url:"../xtCommonController/getXtDataDictionary?ckey=MDFCSGMTCODECODE1",
	   reader:new Ext.data.JsonReader({
	    root:'items',
	    type:'json'
	   })
	  }),
	  fields:['value', 'text'],
	  autoLoad:true 
	 });
	var	SXMDFCSGMTCODECODE = new Ext.data.Store({
		  proxy:new Ext.data.HttpProxy({ 
		   url:"../xtCommonController/getXtDataDictionary?ckey=MDFCSGMTCODECODE2",
		   reader:new Ext.data.JsonReader({
		    root:'items',
		    type:'json'
		   })
		  }),
		  fields:['value', 'text'],
		  autoLoad:true 
		 });
	var	ZGEMDFCSGMTCODECODE = new Ext.data.Store({
		  proxy:new Ext.data.HttpProxy({ 
		   url:"../xtCommonController/getXtDataDictionary?ckey=MDFCSGMTCODECODE3",
		   reader:new Ext.data.JsonReader({
		    root:'items',
		    type:'json'
		   })
		  }),
		  fields:['value', 'text'],
		  autoLoad:true 
		 });
	var	ZGEMDFCSGMTCODECODE = new Ext.data.Store({
		  proxy:new Ext.data.HttpProxy({ 
		   url:"../xtCommonController/getXtDataDictionary?ckey=MDFCSGMTCODECODE3",
		   reader:new Ext.data.JsonReader({
		    root:'items',
		    type:'json'
		   })
		  }),
		  fields:['value', 'text'],
		  autoLoad:true 
		 });
	var	DBMDFCSGMTCODECODE = new Ext.data.Store({
		  proxy:new Ext.data.HttpProxy({ 
		   url:"../xtCommonController/getXtDataDictionary?ckey=MDFCSGMTCODECODE4",
		   reader:new Ext.data.JsonReader({
		    root:'items',
		    type:'json'
		   })
		  }),
		  fields:['value', 'text'],
		  autoLoad:true 
		 });
Ext.onReady(function() {

	var formFieldSet1 = new Ext.form.FieldSet({
		id : 'FieldSet1',
		layout : 'column',
		labelWidth : 150,
		collapsible : true, // 可折叠
		// autoHeight : true,
		height : 100,
		border : true,
		title : '信息记录类型',
		items : [{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [ {
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
				id:'infrectype',
				anchor:'70%',
				listeners : {
				select : function() {
					Ext.getCmp('FieldSet2').setVisible(false);
					Ext.getCmp('FieldSet3').setVisible(false);
					
					Ext.getCmp('odbnescode1').setDisabled(true);
					Ext.getCmp('odbnescode2').setDisabled(true);
						var selected = this.getValue();	
						if(selected=='411'||selected=='421'||selected=='431'||selected=='441'||selected=='511'){
							Ext.getCmp('FieldSet2').setVisible(true);
							Ext.getCmp('odbnescode1').setDisabled(false);
						}else if(selected=='412'){
							Ext.getCmp('FieldSet3').setVisible(true);
							Ext.getCmp('odbnescode2').setDisabled(false);
							Ext.getCmp('mdfcsgmtcode').setStore(JDMDFCSGMTCODECODE);
						}else if(selected=='432'){
							Ext.getCmp('FieldSet3').setVisible(true);
							Ext.getCmp('odbnescode2').setDisabled(false);
							Ext.getCmp('mdfcsgmtcode').setStore(SXMDFCSGMTCODECODE);
						}else if(selected=='522'){
							Ext.getCmp('FieldSet3').setVisible(true);
							Ext.getCmp('odbnescode2').setDisabled(false);
							Ext.getCmp('mdfcsgmtcode').setStore(ZGEMDFCSGMTCODECODE);
						}else{
							Ext.getCmp('FieldSet3').setVisible(true);
							Ext.getCmp('odbnescode2').setDisabled(false);
							Ext.getCmp('mdfcsgmtcode').setStore(DBMDFCSGMTCODECODE);
						}

					}
				}
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
		hidden : true,
		title : '详细信息',
		items : [{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [ {
				fieldLabel:'原业务标识号',
				xtype:'triggerfield',
				name:'odbnescode',
				id:'odbnescode1',
				triggerClass : 'x-form-search-trigger',
				editable : false,
				onTriggerClick : function(e) {
					var infrectype = Ext.getCmp('infrectype').getValue();
					var reccode = new com.common.reccode(infrectype, this);

				},
				anchor:'70%'
			} ]
		},{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [ 
			{
				fieldLabel:'新业务标识号',
				xtype:'textfield',
				name:'nwbnescode',
				anchor:'70%'
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
			style : 'margin-left:100px;',
			items : [{
				fieldLabel:'待更正业务标识',
				xtype:'triggerfield',
				name:'odbnescode',
				id:'odbnescode2',
				triggerClass : 'x-form-search-trigger',
				editable : false,
				onTriggerClick : function(e) {
					var infrectype = Ext.getCmp('infrectype').getValue();
					var reccode = new com.common.reccode(infrectype, this);

				},
				anchor:'70%'
			},
			{
				fieldLabel:'待更正段段标',
				xtype:'combo',
				//store:MDFCSGMTCODECODE1,
				mode:'local',
				triggerAction:'all',
				editable:false,
				hiddenName:'mdfcsgmtcode',
				valueField:'value',
				displayField:'text',
				name:'mdfcsgmtcode',
				id:'mdfcsgmtcode',
				anchor:'70%'
			}]
		},
		{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [{
				fieldLabel:'信息报告日期',
				xtype:'datefield',
				format:'Y-m-d',
				name:'rptdate',
				anchor:'70%'
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
			style : 'margin-left:100px;',
			items : [{
				fieldLabel:'原因',
				xtype:'textfield',
				name:'reason',
				anchor:'70%'
			}]
		},
		{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [{
				fieldLabel:'申请人',
				xtype:'textfield',
				name:'applyman',
				anchor:'70%',
				value : sys_pt_user_name,
				readOnly : true
			}]
		}
		]

	});
	
	// 查看changemsgForm
	var viewChangemsgFormPanel = new Ext.FormPanel({
		labelWidth : 100,
		labelAlign : 'right',
		hideBorders : true,
		frame : true,
		region : 'center',
		width : 600,
		bodyStyle : 'padding:5 5 0',
		items : [ formFieldSet1, formFieldSet2, formFieldSet3, formFieldSet4 ],
		autoHeight : true,
		buttonAlign : 'center',
		buttons : [ {
			text : '申请',
			iconCls : 'previewIcon',
			handler : function() {
				submitForm(viewChangemsgFormPanel,'../spChangemsgController/applySpChangemsg',null,null,false,true);
			}
		}, {
			text : '重置',
			iconCls : 'tbar_synchronizeIcon',
			handler : function() {
				viewChangemsgFormPanel.getForm().reset();
			}
		} ]

	});

	var viewport = new Ext.Viewport({
		layout : 'border',
		items : [ viewChangemsgFormPanel ]
	});
	
});


