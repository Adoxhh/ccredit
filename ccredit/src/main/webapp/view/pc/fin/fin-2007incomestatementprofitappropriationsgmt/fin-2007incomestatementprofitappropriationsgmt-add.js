var fin2007incomestatementprofitappropriationsgmtWinAdd;
var fin2007incomestatementprofitappropriationsgmtFormAdd;
function addFin2007incomestatementprofitappropriationsgmt(){
	initFin2007incomestatementprofitappropriationsgmtFormAdd();
	fin2007incomestatementprofitappropriationsgmtWinAdd = Ext.create('Ext.Window',{
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
		items:fin2007incomestatementprofitappropriationsgmtFormAdd,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(fin2007incomestatementprofitappropriationsgmtFormAdd,'../fin2007incomestatementprofitappropriationsgmtController/addFin2007incomestatementprofitappropriationsgmt',grid,fin2007incomestatementprofitappropriationsgmtWinAdd,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	fin2007incomestatementprofitappropriationsgmtWinAdd.show();
	
}
function initFin2007incomestatementprofitappropriationsgmtFormAdd(){
	fin2007incomestatementprofitappropriationsgmtFormAdd = Ext.create('Ext.FormPanel',{
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
			fieldLabel:'营业收入 ',
			name:'revenueofsales',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'营业成本',
			name:'costofsales',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'营业税金及附加',
			name:'businessandothertaxes',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'销售费用',
			name:'sellingexpenses',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'管理费用',
			name:'generalandadministrativeexpenses',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'财务费用',
			name:'financialexpense',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'资产减值损失',
			name:'impairmentlossofassets',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'公允价值变动净收益',
			name:'profitorlossarisingfromchangesinfairvalue',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'投资净收益',
			name:'investmentincome',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'对联营企业和合营企业的投资收益',
			name:'investmentincomefbaenterprise',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'营业利润',
			name:'operatingprofits',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'营业外收入',
			name:'nonoperatingincome',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'营业外支出',
			name:'nonoperatingexpenses',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'非流动资产损失(其中：非流动资产处置损失)',
			name:'noncurrentassets',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'利润总额',
			name:'profitbeforetax',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'所得税费用',
			name:'incometaxexpense',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'净利润',
			name:'netprofit',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'基本每股收益',
			name:'basicearningspershare',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'稀释每股收益',
			name:'dilutedearningspershare',
			maxLength:17,
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
