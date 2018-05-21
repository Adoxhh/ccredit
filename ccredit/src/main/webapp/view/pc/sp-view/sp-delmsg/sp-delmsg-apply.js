var INFRECTYPEDEL;
var OTHENTCERTTYPECODE;
var SHEETTYPECODE;
var SHEETTYPEDIVIDECODE;
var MDFCSGMTCODE1;
var MDFCSGMTCODE2;
var MDFCSGMTCODE3;
var MDFCSGMTCODE4;
var SENDMSGSTATUS;

INFRECTYPEDEL = new Ext.data.Store({
	  proxy:new Ext.data.HttpProxy({ 
	   url:"../xtCommonController/getXtDataDictionary?ckey=INFRECTYPEDEL",
	   reader:new Ext.data.JsonReader({
	    root:'items',
	    type:'json'
	   })
	  }),
	  fields:['value', 'text'],
	  autoLoad:true 
	 });
		OTHENTCERTTYPECODE = new Ext.data.Store({
	  proxy:new Ext.data.HttpProxy({ 
	   url:"../xtCommonController/getXtDataDictionary?ckey=OTHENTCERTTYPECODE",
	   reader:new Ext.data.JsonReader({
	    root:'items',
	    type:'json'
	   })
	  }),
	  fields:['value', 'text'],
	  autoLoad:true 
	 });
		SHEETTYPECODE = new Ext.data.Store({
	  proxy:new Ext.data.HttpProxy({ 
	   url:"../xtCommonController/getXtDataDictionary?ckey=SHEETTYPECODE",
	   reader:new Ext.data.JsonReader({
	    root:'items',
	    type:'json'
	   })
	  }),
	  fields:['value', 'text'],
	  autoLoad:true 
	 });
		SHEETTYPEDIVIDECODE = new Ext.data.Store({
	  proxy:new Ext.data.HttpProxy({ 
	   url:"../xtCommonController/getXtDataDictionary?ckey=SHEETTYPEDIVIDECODE",
	   reader:new Ext.data.JsonReader({
	    root:'items',
	    type:'json'
	   })
	  }),
	  fields:['value', 'text'],
	  autoLoad:true 
	 });
		MDFCSGMTCODE1 = new Ext.data.Store({
	  proxy:new Ext.data.HttpProxy({ 
	   url:"../xtCommonController/getXtDataDictionary?ckey=MDFCSGMTCODE1",
	   reader:new Ext.data.JsonReader({
	    root:'items',
	    type:'json'
	   })
	  }),
	  fields:['value', 'text'],
	  autoLoad:true 
	 });
		MDFCSGMTCODE2 = new Ext.data.Store({
			  proxy:new Ext.data.HttpProxy({ 
			   url:"../xtCommonController/getXtDataDictionary?ckey=MDFCSGMTCODE2",
			   reader:new Ext.data.JsonReader({
			    root:'items',
			    type:'json'
			   })
			  }),
			  fields:['value', 'text'],
			  autoLoad:true 
			 });
		MDFCSGMTCODE3 = new Ext.data.Store({
			  proxy:new Ext.data.HttpProxy({ 
			   url:"../xtCommonController/getXtDataDictionary?ckey=MDFCSGMTCODE3",
			   reader:new Ext.data.JsonReader({
			    root:'items',
			    type:'json'
			   })
			  }),
			  fields:['value', 'text'],
			  autoLoad:true 
			 });
		MDFCSGMTCODE4 = new Ext.data.Store({
			  proxy:new Ext.data.HttpProxy({ 
			   url:"../xtCommonController/getXtDataDictionary?ckey=MDFCSGMTCODE4",
			   reader:new Ext.data.JsonReader({
			    root:'items',
			    type:'json'
			   })
			  }),
			  fields:['value', 'text'],
			  autoLoad:true 
			 });
		SENDMSGSTATUS = new Ext.data.Store({
	  proxy:new Ext.data.HttpProxy({ 
	   url:"../xtCommonController/getXtDataDictionary?ckey=SENDMSGSTATUS",
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
				store:INFRECTYPEDEL,
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
					    formPanel.remove(Ext.getCmp('FieldSet2'),false);
					    formPanel.remove(Ext.getCmp('FieldSet3'),false);
					    formPanel.remove(Ext.getCmp('FieldSet4'),false);
					    formPanel.remove(Ext.getCmp('FieldSet5'),false);
					  /*  Ext.getCmp('FieldSet2').hide();
					    Ext.getCmp('FieldSet3').hide();
					    Ext.getCmp('FieldSet4').hide();
					    Ext.getCmp('FieldSet5').hide();*/
					    var selected = this.getValue();						   
					   if(selected=='314'){//企业基本信息删除							
							formPanel.add(Ext.getCmp('FieldSet5'));	
						}
						if(selected=='414'||selected=='424'||selected=='434'||selected=='444'||selected=='514'){//财报外整笔删除
							formPanel.add(Ext.getCmp('FieldSet2'));
							formPanel.doLayout();
						}
						if(selected=='614'||selected=='624'||selected=='634'||selected=='644'||selected=='654'){//财报整笔删除
							formPanel.add(Ext.getCmp('FieldSet4'));
							formPanel.doLayout();
						}
						if(selected=='413'){//企业借贷账户按段删除请求记录
							formPanel.add(Ext.getCmp('FieldSet3'));
							Ext.getCmp('delsgmtcode').setStore(MDFCSGMTCODE1);
						}
						
						if(selected=='423'){//企业授信协议按段删除请求记录
							formPanel.add(Ext.getCmp('FieldSet3'));
							Ext.getCmp('delsgmtcode').setStore(MDFCSGMTCODE2);
						}
						if(selected=='433'){//企业最高额保证合同按段删除请求记录
							formPanel.add(Ext.getCmp('FieldSet3'));
							Ext.getCmp('delsgmtcode').setStore(MDFCSGMTCODE3);
						}
						if(selected=='443'){//企业担保账户按段删除请求记录
							formPanel.add(Ext.getCmp('FieldSet3'));
							Ext.getCmp('delsgmtcode').setStore(MDFCSGMTCODE4);
						}
						
						//formPanel.add(Ext.getCmp('FieldSet6'));	
						formPanel.doLayout();
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
		title : '详细信息',
		items : [{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [ {
				fieldLabel:'待删除业务标识',
				xtype:'triggerfield',
				name:'delreccode',
				triggerClass : 'x-form-search-trigger',
				editable : false,
				onTriggerClick : function(e) {
					var infrectype = Ext.getCmp('infrectype').getValue();
					var reccode = new com.common.reccode(infrectype, this);

				},
				anchor:'70%'
			} ]
		}]

	});
	
	var formFieldSet3 = new Ext.form.FieldSet({
		id : 'FieldSet3',
		layout : 'column',
		labelWidth : 150,
		collapsible : true, // 可折叠
		// autoHeight : true,
		height : 150,
		border : true,
		title : '详细信息',
		items : [{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [{
				fieldLabel:'待删除业务标识',
				xtype:'triggerfield',
				name:'delreccode',
				triggerClass : 'x-form-search-trigger',
				editable : false,
				onTriggerClick : function(e) {
					var infrectype = Ext.getCmp('infrectype').getValue();
					var reccode = new com.common.reccode(infrectype, this);

				},
				anchor:'70%'
			},{
				fieldLabel:'待删除起始日期',
				xtype:'datefield',
				format:'Y-m-d',
				name:'delstartdate',
				anchor:'70%'
			}
			]
		},
		{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [{
				fieldLabel:'待删除段段标',
				xtype:'combo',
				//store:MDFCSGMTCODECODE1,
				mode:'local',
				triggerAction:'all',
				editable:false,
				hiddenName:'delsgmtcode',
				valueField:'value',
				displayField:'text',
				name:'delsgmtcode',
				id:'delsgmtcode',
				anchor:'70%'
			},{
				fieldLabel:'待删除结束日期',
				xtype:'datefield',
				format:'Y-m-d',
				name:'delenddate',
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
		height : 250,
		border : true,
		title : '详细信息',
		items : [{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [{
				fieldLabel:'企业名称',
				xtype:'textfield',
				name:'entname',
				anchor:'70%'
			},{
				fieldLabel:'企业身份标识号码',
				xtype:'textfield',
				name:'entcertnum',
				anchor:'70%'
			}
			   ]
		},
		{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [ {
				fieldLabel:'企业身份标识 类型',
				xtype:'combo',
				store:OTHENTCERTTYPECODE,
				mode:'local',
				triggerAction:'all',
				editable:false,
				hiddenName:'entcerttype',
				valueField:'value',
				displayField:'text',
				name:'entcerttype',
				anchor:'70%'
			},{
				fieldLabel:'报表年份',
				xtype:'textfield',
				name:'sheetyear',
				anchor:'70%'
			}]
		},{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [{
				fieldLabel:'报表类型',
				xtype:'combo',
				store:SHEETTYPECODE,
				mode:'local',
				triggerAction:'all',
				editable:false,
				hiddenName:'sheettype',
				valueField:'value',
				displayField:'text',
				name:'sheettype',
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
				fieldLabel:'报表类型细分',
				xtype:'combo',
				store:SHEETTYPEDIVIDECODE,
				mode:'local',
				triggerAction:'all',
				editable:false,
				hiddenName:'sheettypedivide',
				valueField:'value',
				displayField:'text',
				name:'sheettypedivide',
				anchor:'70%'
			}]
		}]

	});
	var formFieldSet5 = new Ext.form.FieldSet({
		id : 'FieldSet5',
		layout : 'column',
		labelWidth : 150,
		collapsible : true, // 可折叠
		// autoHeight : true,
		height : 150,
		border : true,
		title : '详细信息',
		items : [{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [{
				fieldLabel:'信息来源编码',
				xtype:'textfield',
				name:'infsurccode',
				anchor:'70%'
			}, {
				fieldLabel:'企业身份标识类型',
				xtype:'combo',
				store:OTHENTCERTTYPECODE,
				mode:'local',
				triggerAction:'all',
				editable:false,
				hiddenName:'entcerttype',
				valueField:'value',
				displayField:'text',
				name:'entcerttype',
				anchor:'70%'
			}
			  ]
		},
		{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [{
				fieldLabel:'企业名称',
				xtype:'textfield',
				name:'entname',
				anchor:'70%'
			} ,{
				fieldLabel:'企业身份标识号码',
				xtype:'textfield',
				name:'entcertnum',
				anchor:'70%'
			}]
		}]

	});
	
	var formFieldSet6 = new Ext.form.FieldSet({
		id : 'FieldSet6',
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
	var formPanel = new Ext.FormPanel({
		labelWidth : 100,
		labelAlign : 'right',
		hideBorders : true,
		frame : true,
		region : 'center',
		width : 600,
		bodyStyle : 'padding:5 5 0',
		items : [ formFieldSet1,formFieldSet6 ],
		autoHeight : true,
		buttonAlign : 'center',
		buttons : [ {
			text : '申请',
			iconCls : 'previewIcon',
			handler : function() {
				submitForm(formPanel,'../spDelmsgController/applySpDelmsg',null,null,false,true);
			}
		}, {
			text : '重置',
			iconCls : 'tbar_synchronizeIcon',
			handler : function() {
				formPanel.getForm().reset();
			}
		} ]

	});
	
	var viewport = new Ext.Viewport({
		layout : 'border',
		items : [ formPanel ]
	});
	
});


