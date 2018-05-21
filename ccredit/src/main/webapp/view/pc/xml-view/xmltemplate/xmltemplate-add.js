var xmltemplateWinAdd;
var xmltemplateFormAdd;
function addXmltemplate(){
	initXmltemplateFormAdd();
	xmltemplateWinAdd = Ext.create('Ext.Window',{
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
		items:xmltemplateFormAdd,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(xmltemplateFormAdd,'../xmltemplateController/addXmltemplate',grid,xmltemplateWinAdd,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	xmltemplateWinAdd.show();
	
}
function initXmltemplateFormAdd(){
	xmltemplateFormAdd = Ext.create('Ext.FormPanel',{
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
	            		Ext.getCmp('infreptype').setStore(infrectypePBStore);
	            	}else if(selected=='02'){
	            		Ext.getCmp('infreptype').setStore(infrectypeJDStore);
	            	}else if(selected=='03'){
	            		Ext.getCmp('infreptype').setStore(infrectypeDBStore);
	            	}else{
	            		Ext.getCmp('infreptype').setStore(infrectypeDYStore);
	            	}
	            	
	            }
	        }
		},
		{
			fieldLabel:'信息记录类型',
			id:'infreptype',
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
	            	Ext.getCmp('rptdatecode').setDisabled(false);
	            	if(selected=='110'||selected=='120'||selected=='130'||selected=='140'){
	            		Ext.getCmp('rptdatecode').setDisabled(false);
	            		Ext.getCmp('rptdatecode').setStore(rptdatecodePBStore);
	            	}else if(selected=='210'){
	            		Ext.getCmp('rptdatecode').setDisabled(false);
	            		Ext.getCmp('rptdatecode').setStore(rptdatecodeJDStore);
	            	}else if(selected=='220'){
	            		Ext.getCmp('rptdatecode').setDisabled(false);
	            		Ext.getCmp('rptdatecode').setStore(rptdatecodeSXStore);
	            	}else if(selected=='230'){
	            		Ext.getCmp('rptdatecode').setDisabled(false);
	            		Ext.getCmp('rptdatecode').setStore(rptdatecodeDBStore);
	            	}else if(selected=='510'){
	            		Ext.getCmp('rptdatecode').setDisabled(false);
	            		Ext.getCmp('rptdatecode').setStore(rptdatecodeDYStore);
	            	}else{
	            		Ext.getCmp('rptdatecode').setDisabled(true);
	            	}
	            	
	            }
	        }
		},
		{
			fieldLabel:'报告时点说明',
			xtype:"combo",
			id:'rptdatecode',
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
