var xmlnodeWinAdd;
var xmlnodeFormAdd;
var segmentid;


function submitForm2(subForm,url,grids,win,isHide,isReset){
	try{
		var items;
		if(null != win){
			items = Ext.ComponentQuery.query('button',win); 
		}
		if(subForm.form.isValid()){   
			Ext.Msg.confirm('提示','确定要提交当前表单信息内容？',function(btn){
				if(btn == 'yes'){
					///////////禁用window中组件按钮
					for(var it in items){
						items[it].disable();
					}
					subForm.form.submit({                    
				        url:url,
				        timeout:600000,/**设置超时时间10十分钟**/
				        params:{ajaxform:0},
				        waitTitle:'提示',
				        actionMethods:{ 
							read:'POST' 
						},
						method:'post', 
				        waitMsg:'正在保存数据，请稍后...',                      
				        success:function(form, action){    
//				   			Ext.example.msg('提示', action.result.msg);//提示之后消失
				        	msgTishi(action.result.msg);
				      		if(isReset){
				      			subForm.form.reset();  
				      		}                       
			           		if(null != win && "" != win){
			           			if(isHide){
			           				///////////激活window中组件按钮
									for(var it in items){
										items[it].enable();
									}
			           				win.hide();  
			           			}else{
			           				win.close(); 
			           			}
			           		} 
			           		if(null != grids && "" != grids){
			           			var record = segmentgrid.getSelectionModel().selected;
			           			
			           			 segmentid=record.items[0].data.id;	
			           			grids.getStore().load({
			           					url:'../xmlnodeController/getXmlnodeListByCondition',
			           					method:'post',
			           					params:{
			           						segmentid:segmentid
			           					}
			           				});
			           		}
				      	},
				        failure:function(form, action){
				        	if( typeof(action.result.msg) != "undefined"){
//				        		Ext.example.msg('提示', action.result.msg);//提示之后消失
				        		msgTishi(action.result.msg);
				        	}
				        	///////////激活window中组件按钮
							for(var it in items){
								items[it].enable();
							}
				      	}                  
				      });  
				}
			});
		}else { 
			msgTishi('请输入必填项');
		}
	}catch(e){
    	console.info(e);
 	}
}
function addXmlnode(){
	
	var segmentrecord = segmentgrid.getSelectionModel().selected;
	if(segmentrecord.length == 0){
		msgTishi('请选择信息段');
		return;
	}
	segmentid=segmentrecord.items[0].data.id;
	initXmlnodeFormAdd();
	
	xmlnodeWinAdd = Ext.create('Ext.Window',{
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
		items:xmlnodeFormAdd,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm2(xmlnodeFormAdd,'../xmlnodeController/addXmlnode',nodegrid,xmlnodeWinAdd,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	xmlnodeWinAdd.show();
	
}
function initXmlnodeFormAdd(){
	xmlnodeFormAdd = Ext.create('Ext.FormPanel',{
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
		/*{
			fieldLabel:'编号',
			xtype:'textfield',
			name:'nodeid',
			maxLength:40,
			anchor:'100%'
		},*/
			{
			fieldLabel:'节点名称',
			xtype:'textfield',
			name:'nodename',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'节点码',
			xtype:'textfield',
			name:'nodecode',
			maxLength:60,
			anchor:'100%'
		},
		{
			fieldLabel:'父节点编号',
			xtype:'textfield',
			name:'parentid',
			maxLength:40,
			anchor:'100%'
		},
	
		{
			fieldLabel:'排序',
			xtype:'numberfield',
			name:'sortno',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'信息段编号',
			xtype:'textfield',
			name:'segmentid',
			maxLength:40,
			anchor:'100%',
			value:segmentid,
			readOnly:true
		},
		{
			fieldLabel:'备注',
			xtype:'textfield',
			name:'remark',
			maxLength:40,
			anchor:'100%'
		}
		]
	});
}
