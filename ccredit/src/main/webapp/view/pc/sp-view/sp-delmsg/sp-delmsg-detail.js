var spDelmsgWinDetail;
var spDelmsgFormDetail;
var formFieldSet1;
var formFieldSet2;
var formFieldSet3;
function detailSpDelmsg(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要查看明细的项！');
		return;
	}

	formFieldSet1 = new Ext.form.FieldSet({
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
			style : 'margin-left:50px;',
			items : [ {
				fieldLabel:'信息记录类型',
				xtype:'textfield',
				name:'infrectypetext',
				anchor:'90%'
			} ]
		} ]

	});
	var infrectype=record.items[0].data.infrectype;
	   if(infrectype=='314'){//企业基本信息删除							
		   formFieldSet2 = new Ext.form.FieldSet({
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
					style : 'margin-left:50px;',
					items : [{
						fieldLabel:'信息来源编码',
						xtype:'textfield',
						name:'infsurccode',
						anchor:'90%'
					}, {
						fieldLabel:'企业身份标识类型',
						xtype:'textfield',
						name:'entcerttypetext',
						anchor:'90%'
					}
					  ]
				},
				{
					xtype : 'container',
					columnWidth : .5,
					// 0.50
					layout : 'anchor',
					style : 'margin-left:50px;',
					items : [{
						fieldLabel:'企业名称',
						xtype:'textfield',
						name:'entname',
						anchor:'90%'
					} ,{
						fieldLabel:'企业身份标识号码',
						xtype:'textfield',
						name:'entcertnum',
						anchor:'90%'
					}]
				}]

			});
			
		}else if(infrectype=='414'||infrectype=='424'||infrectype=='434'||infrectype=='444'||infrectype=='514'){//财报外整笔删除
			formFieldSet2 = new Ext.form.FieldSet({
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
					style : 'margin-left:50px;',
					items : [ {
						fieldLabel:'待删除业务标识',
						xtype:'textfield',
						name:'delreccode',
						anchor:'90%'
					} ]
				}]

			});
		}else if(infrectype=='614'||infrectype=='624'||infrectype=='634'||infrectype=='644'||infrectype=='654'){//财报整笔删除
			formFieldSet2 = new Ext.form.FieldSet({
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
					style : 'margin-left:50px;',
					items : [{
						fieldLabel:'企业名称',
						xtype:'textfield',
						name:'entname',
						anchor:'90%'
					},{
						fieldLabel:'企业身份标识号码',
						xtype:'textfield',
						name:'entcertnum',
						anchor:'90%'
					}
					   ]
				},
				{
					xtype : 'container',
					columnWidth : .5,
					// 0.50
					layout : 'anchor',
					style : 'margin-left:50px;',
					items : [ {
						fieldLabel:'企业身份标识类型',
						xtype:'textfield',
						name:'entcerttypetext',
						anchor:'90%'
					},{
						fieldLabel:'报表年份',
						xtype:'textfield',
						name:'sheetyear',
						anchor:'90%'
					}]
				},{
					xtype : 'container',
					columnWidth : .5,
					// 0.50
					layout : 'anchor',
					style : 'margin-left:50px;',
					items : [{
						fieldLabel:'报表类型',
						xtype:'textfield',
						name:'sheettypetext',
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
						fieldLabel:'报表类型细分',
						xtype:'textfield',
						name:'sheettypedividetext',
						anchor:'90%'
					}]
				}]
			});
		}else{
			formFieldSet2 = new Ext.form.FieldSet({
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
					style : 'margin-left:50px;',
					items : [{
						fieldLabel:'待删除业务标识',
						xtype:'textfield',
						name:'delreccode',
						anchor:'90%'
					},{
						fieldLabel:'待删除起始日期',
						xtype:'datefield',
						format:'Y-m-d',
						name:'delstartdate',
						anchor:'90%'
					}
					]
				},
				{
					xtype : 'container',
					columnWidth : .5,
					// 0.50
					layout : 'anchor',
					style : 'margin-left:50px;',
					items : [{
						fieldLabel:'待删除段段标',
						xtype:'textfield',
						name:'delsgmtcodetext',
						id:'delsgmtcode',
						anchor:'90%'
					},{
						fieldLabel:'待删除结束日期',
						xtype:'datefield',
						format:'Y-m-d',
						name:'delenddate',
						anchor:'90%'
					}]
				}]

			});
		}
		formFieldSet3 = new Ext.form.FieldSet({
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
		spDelmsgFormDetail = Ext.create('Ext.FormPanel',{
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
			items:[formFieldSet1,formFieldSet2,formFieldSet3]
		});
	spDelmsgWinDetail = Ext.create('Ext.Window',{
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
		items:spDelmsgFormDetail,
		buttons:[{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	spDelmsgWinDetail.show();
	
	loadFormData(spDelmsgFormDetail,'../spDelmsgController/getSpDelmsgById?delmsg_id='+ record.items[0].data.delmsg_id);
}

