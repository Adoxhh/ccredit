var spObjectionmsgWinEdit;
var spObjectionmsgFormEdit;
function updateSpObjectionmsg(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要修改的一项！');
		return;
	}
	initSpObjectionmsgFormEdit();
	spObjectionmsgWinEdit = Ext.create('Ext.Window',{
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
		items:spObjectionmsgFormEdit,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(spObjectionmsgFormEdit,'../spObjectionmsgController/updateSpObjectionmsg',grid,spObjectionmsgWinEdit,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	spObjectionmsgWinEdit.show();
	
	loadFormData(spObjectionmsgFormEdit,'../spObjectionmsgController/getSpObjectionmsgById?objectionmsg_id='+ record.items[0].data.objectionmsg_id);
}
function initSpObjectionmsgFormEdit(){
	spObjectionmsgFormEdit = Ext.create('Ext.FormPanel',{
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
			name:'objectionmsg_id',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'异议申请机构',
			xtype:'textfield',
			name:'applydept',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'异议发起人',
			xtype:'textfield',
			name:'regperson',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'申请主题',
			xtype:'textfield',
			name:'theme',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'异议申请时间',
			xtype:'datefield',
			format:'Y-m-d',
			name:'applytime',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'异议申请人',
			xtype:'textfield',
			name:'applyperson',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'申请人联系方式',
			xtype:'textfield',
			name:'applyphone',
			maxLength:20,
			anchor:'100%'
		},
		{
			fieldLabel:'异议事项描述',
			xtype:'textfield',
			name:'description',
			maxLength:60,
			anchor:'100%'
		},
		{
			fieldLabel:'审批人',
			xtype:'textfield',
			name:'checkperson',
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'状态',
			xtype:'combo',
			emptyText:'请选择',
			store:SENDMSGSTATUS,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'status',
			valueField:'value',
			displayField:'text',
			name:'status',
			anchor:'100%'
		},
		{
			fieldLabel:'审核结果',
			xtype:'textfield',
			name:'result',
			maxLength:4,
			anchor:'100%'
		},
		{
			fieldLabel:'审核意见',
			xtype:'textfield',
			name:'advice',
			maxLength:60,
			anchor:'100%'
		}
		]
	});
}
