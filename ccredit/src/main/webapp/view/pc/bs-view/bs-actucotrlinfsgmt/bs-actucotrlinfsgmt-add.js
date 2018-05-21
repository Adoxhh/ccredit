var bsActucotrlinfsgmtWinAdd;
var bsActucotrlinfsgmtFormAdd;
function addBsActucotrlinfsgmt(){
	initBsActucotrlinfsgmtFormAdd();
	bsActucotrlinfsgmtWinAdd = Ext.create('Ext.Window',{
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
		items:bsActucotrlinfsgmtFormAdd,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(bsActucotrlinfsgmtFormAdd,'../bsActucotrlinfsgmtController/addBsActucotrlinfsgmt',grid,bsActucotrlinfsgmtWinAdd,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	bsActucotrlinfsgmtWinAdd.show();
	
}
function initBsActucotrlinfsgmtFormAdd(){
	bsActucotrlinfsgmtFormAdd = Ext.create('Ext.FormPanel',{
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
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'实际控制人身份类别',
			xtype:'combo',
			emptyText:'请选择',
			store:ARLPIDTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'actucotrlidtype1',
			valueField:'value',
			displayField:'text',
			name:'actucotrlidtype1',
			anchor:'100%',
			listeners : { //监听该下拉列表的选择事件
	            select : function(combo, record, index) {
	            	var selected=combo.getValue();
	            	if(selected=='1'){	         
	            		Ext.getCmp('actucotrlidtype2').setStore(IDTYPECODE);
	            	}
	            	if(selected=='2'){
	            		Ext.getCmp('actucotrlidtype2').setStore(OTHENTCERTTYPECODE);
	            	}
	            	
	            }
	        }
		},
		{
			fieldLabel:'实际控制人名称',
			xtype:'textfield',
			name:'actucotrlname',
			maxLength:80,
			anchor:'100%'
		},
		{
			fieldLabel:'实际控制人身份标识类型',
			xtype:'combo',
			emptyText:'请选择',
			//store:OTHENTCERTTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'actucotrlidtype2',
			valueField:'value',
			displayField:'text',
			name:'actucotrlidtype2',
			id:'actucotrlidtype2',
			anchor:'100%'
		},
		{
			fieldLabel:'实际控制人身份标识号码',
			xtype:'textfield',
			name:'actucotrlidnum',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'信息更新日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'actucotrlinfoupdate',
			maxLength:10,
			anchor:'100%'
		}
		]
	});
}
