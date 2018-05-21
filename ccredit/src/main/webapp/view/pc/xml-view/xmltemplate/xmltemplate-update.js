var xmltemplateWinEdit;
var xmltemplateFormEdit;
function updateXmltemplate(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要修改的一项！');
		return;
	}
	initXmltemplateFormEdit();
	var selectedInfrectype=record.items[0].data.infrectype;
	var selectedRptdatecode=record.items[0].data.rptdatecode;
	var selectedMiddletypecode=record.items[0].data.middletypecode;
	if(selectedMiddletypecode=='01'){	         
		Ext.getCmp('infreptype2').setStore(infrectypePBStore);
	}else if(selectedMiddletypecode=='02'){
		Ext.getCmp('infreptype2').setStore(infrectypeJDStore);
	}else if(selectedMiddletypecode=='03'){
		Ext.getCmp('infreptype2').setStore(infrectypeDBStore);
	}else{
		Ext.getCmp('infreptype2').setStore(infrectypeDYStore);
	}
	
	
	
	Ext.getCmp('rptdatecode2').setDisabled(false);
	if(selectedInfrectype=='110'||selectedInfrectype=='120'||selectedInfrectype=='130'||selectedInfrectype=='140'){
		Ext.getCmp('rptdatecode2').setDisabled(false);
		Ext.getCmp('rptdatecode2').setStore(rptdatecodePBStore);
	}else if(selectedInfrectype=='210'){
		Ext.getCmp('rptdatecode2').setDisabled(false);
		Ext.getCmp('rptdatecode2').setStore(rptdatecodeJDStore);
	}else if(selectedInfrectype=='220'){
		Ext.getCmp('rptdatecode2').setDisabled(false);
		Ext.getCmp('rptdatecode2').setStore(rptdatecodeSXStore);
	}else if(selectedInfrectype=='230'){
		Ext.getCmp('rptdatecode2').setDisabled(false);
		Ext.getCmp('rptdatecode2').setStore(rptdatecodeDBStore);
	}else if(selectedInfrectype=='510'){
		Ext.getCmp('rptdatecode2').setDisabled(false);
		Ext.getCmp('rptdatecode2').setStore(rptdatecodeDYStore);
	}else{
		Ext.getCmp('rptdatecode2').setDisabled(true);
	}
	
		
	xmltemplateWinEdit = Ext.create('Ext.Window',{
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
		items:xmltemplateFormEdit,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(xmltemplateFormEdit,'../xmltemplateController/updateXmltemplate',grid,xmltemplateWinEdit,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	xmltemplateWinEdit.show();
	
	loadFormData(xmltemplateFormEdit,'../xmltemplateController/getXmltemplateById?id='+ record.items[0].data.id);
}
function initXmltemplateFormEdit(){
	xmltemplateFormEdit = Ext.create('Ext.FormPanel',{
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
			name:'id',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'模板名称',
			xtype:'textfield',
			name:'templatename',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'模板code',
			xtype:'textfield',
			name:'templatecode',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'大类',
			xtype:"combo",
            store:[["1","个人"],["2","企业"]],
            emptyText:"请选择",
            mode:"local",
            triggerAction:"all",
            editable:false,
            name:'bigtypecode',
			hiddenName:'bigtypecode',
			allowBlank:false,
			anchor:'100%'
		},
		{
			fieldLabel:'中类',
			xtype:"combo",
            store:[["01","个人基本信息"],["02","个人借贷信息"],["03","个人担保信息"],["04","抵押借贷信息"]],
            emptyText:"请选择",
            mode:"local",
            triggerAction:"all",
            editable:false,
            name:'middletypecode',
			hiddenName:'middletypecode',
			allowBlank:false,
			anchor:'100%',
			listeners : { //监听该下拉列表的选择事件
	            select : function(combo, record, index) {
	            	var selected=combo.getValue();
	            	if(selected=='01'){	         
	            		Ext.getCmp('infreptype2').setStore(infrectypePBStore);
	            	}else if(selected=='02'){
	            		Ext.getCmp('infreptype2').setStore(infrectypeJDStore);
	            	}else if(selected=='03'){
	            		Ext.getCmp('infreptype2').setStore(infrectypeDBStore);
	            	}else{
	            		Ext.getCmp('infreptype2').setStore(infrectypeDYStore);
	            	}
	            	
	            }
	        }
		},
		{
			fieldLabel:'信息记录类型',
			id:'infreptype2',
			xtype:"combo",
            emptyText:"请选择",
            mode:"local",
            triggerAction:"all",
            editable:false,
            name:'infreptype',
			hiddenName:'infreptype',
			allowBlank:false,
			anchor:'100%',
			valueField : 'value',
			displayField : 'text',
			listeners : { //监听该下拉列表的选择事件
	            change : function(combo, record, index) {
	            	var selected=combo.getValue();
	            	Ext.getCmp('rptdatecode2').setDisabled(false);
	            	if(selected=='110'||selected=='120'||selected=='130'||selected=='140'){
	            		Ext.getCmp('rptdatecode2').setDisabled(false);
	            		Ext.getCmp('rptdatecode2').setStore(rptdatecodePBStore);
	            	}else if(selected=='210'){
	            		Ext.getCmp('rptdatecode2').setDisabled(false);
	            		Ext.getCmp('rptdatecode2').setStore(rptdatecodeJDStore);
	            	}else if(selected=='220'){
	            		Ext.getCmp('rptdatecode2').setDisabled(false);
	            		Ext.getCmp('rptdatecode2').setStore(rptdatecodeSXStore);
	            	}else if(selected=='230'){
	            		Ext.getCmp('rptdatecode2').setDisabled(false);
	            		Ext.getCmp('rptdatecode2').setStore(rptdatecodeDBStore);
	            	}else if(selected=='510'){
	            		Ext.getCmp('rptdatecode2').setDisabled(false);
	            		Ext.getCmp('rptdatecode2').setStore(rptdatecodeDYStore);
	            	}else{
	            		Ext.getCmp('rptdatecode2').setDisabled(true);
	            	}
	            	
	            }
	        }
		},
		{
			fieldLabel:'报告时点说明',
			xtype:"combo",
			id:'rptdatecode2',
            emptyText:"请选择",
            mode:"local",
            triggerAction:"all",
            editable:false,
            name:'rptdatecode',
			hiddenName:'rptdatecode',
			//allowBlank:false,
			valueField : 'value',
			displayField : 'text',
			anchor:'100%'
		},
		{
			fieldLabel:'状态',
			xtype:"combo",
            store:[["1","有效"],["2","无效"]],
            emptyText:"请选择",
            mode:"local",
            triggerAction:"all",
            editable:false,
            name:'status',
			hiddenName:'status',
			allowBlank:false,
			anchor:'100%'
		},
		{
			fieldLabel:'描述',
			xtype:'textfield',
			name:'description',
			maxLength:60,
			anchor:'100%'
		},
		{
			fieldLabel:'标签',
			xtype:'textfield',
			name:'tag',
			maxLength:40,
			anchor:'100%'
		}
		]
	});
}
