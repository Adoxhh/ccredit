


Ext.onReady(function() {


	var formFieldSet = new Ext.form.FieldSet({
		id : 'FieldSet',
		layout : 'column',
		labelWidth : 150,
		collapsible : true, // 可折叠
		// autoHeight : true,
		height : 400,
		border : true,
		title : '异议申请信息',
		items : [{
			xtype : 'container',
			columnWidth : .5,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [{
				fieldLabel:'申请主题',
				xtype:'textfield',
				name:'theme',
				anchor:'70%'
			},{
				fieldLabel:'异议申请机构',
				xtype:'textfield',
				name:'applydept',
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
				fieldLabel:'异议申请人',
				xtype:'textfield',
				name:'applyperson',
				anchor:'70%'
			},
			{
				fieldLabel:'申请人联系方式',
				xtype:'textfield',
				name:'applyphone',
				anchor:'70%'
			}]
		},{
			xtype : 'container',
			columnWidth : 1,
			// 0.50
			layout : 'anchor',
			style : 'margin-left:100px;',
			items : [{
				fieldLabel:'异议事项描述',
				xtype:'textarea',
				name:'description',
				anchor:'86%'
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
		items : [ formFieldSet],
		autoHeight : true,
		buttonAlign : 'center',
		buttons : [ {
			text : '申请',
			iconCls : 'previewIcon',
			handler : function() {
				submitForm(formPanel,'../spObjectionmsgController/applySpObjectionmsg',null,null,false,true);
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


