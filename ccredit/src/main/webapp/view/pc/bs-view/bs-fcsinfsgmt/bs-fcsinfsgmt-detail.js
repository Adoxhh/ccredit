var bsFcsinfsgmtWinDetail;
var bsFcsinfsgmtFormDetail;
function detailBsFcsinfsgmt(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要查看明细的项！');
		return;
	}
	initBsFcsinfsgmtFormDetail();
	bsFcsinfsgmtWinDetail = Ext.create('Ext.Window',{
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
		items:bsFcsinfsgmtFormDetail,
		buttons:[{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	bsFcsinfsgmtWinDetail.show();
	
	loadFormData(bsFcsinfsgmtFormDetail,'../bsFcsinfsgmtController/getBsFcsinfsgmtById?bs_fcsinfsgmt_id='+ record.items[0].data.bs_fcsinfsgmt_id);
}
function initBsFcsinfsgmtFormDetail(){
	bsFcsinfsgmtFormDetail = Ext.create('Ext.FormPanel',{
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
		items:[
		{
			fieldLabel:'编号',
			xtype:'textfield',
			hidden:true,
			name:'bs_fcsinfsgmt_id',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'客户号',
			xtype:'textfield',
			name:'customid',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'国别代码',
			xtype:'combo',
			emptyText:'请选择',
			store:NATIONALITYCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'nationality',
			valueField:'value',
			displayField:'text',
			name:'nationality',
			anchor:'100%'
		},
		{
			fieldLabel:'登记地址',
			xtype:'textfield',
			name:'regadd',
			maxLength:80,
			anchor:'100%'
		},
		{
			fieldLabel:'登记地行政区划代码',
			xtype:'combo',
			emptyText:'请选择',
			store:ADMDIVOFREGCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'admdivofreg',
			valueField:'value',
			displayField:'text',
			name:'admdivofreg',
			anchor:'100%'
		},
		{
			fieldLabel:'成立日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'establishdate',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'营业许可证到期日',
			xtype:'datefield',
			format:'Y-m-d',
			name:'bizenddate',
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'业务范围',
			xtype:'textfield',
			name:'bizrange',
			maxLength:400,
			anchor:'100%'
		},
		{
			fieldLabel:'行业分类代码',
			xtype:'combo',
			emptyText:'请选择',
			store:ACTINVESTCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'ecoinduscate',
			valueField:'value',
			displayField:'text',
			name:'ecoinduscate',
			anchor:'100%'
		},
		{
			fieldLabel:'经济类型代码',
			xtype:'combo',
			emptyText:'请选择',
			store:ECOTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'ecotype',
			valueField:'value',
			displayField:'text',
			name:'ecotype',
			anchor:'100%'
		},
		{
			fieldLabel:'企业规模',
			xtype:'combo',
			emptyText:'请选择',
			store:ENTSCALECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'entscale',
			valueField:'value',
			displayField:'text',
			name:'entscale',
			anchor:'100%'
		},
		{
			fieldLabel:'信息更新日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'fcsinfoupdate',
			maxLength:10,
			anchor:'100%'
		},

		{
			fieldLabel:'最后一次修改日期',
			xtype:'datefield',
			format:'Y-m-d',
			name:'lastdate',
			allowBlank:false,
			maxLength:10,
			anchor:'100%'
		},
		{
			fieldLabel:'状态位',
			xtype:'combo',
			emptyText:'请选择',
			store:CHANGEFLAGCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'changeflag',
			valueField:'value',
			displayField:'text',
			name:'changeflag',
			allowBlank:false,
			anchor:'100%'
		}
		]
	});
}
