var fin2007cashflowssgmtWinEdit;
var fin2007cashflowssgmtFormEdit;
function updateFin2007cashflowssgmt(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要修改的一项！');
		return;
	}
	initFin2007cashflowssgmtFormEdit();
	fin2007cashflowssgmtWinEdit = Ext.create('Ext.Window',{
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
		items:fin2007cashflowssgmtFormEdit,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(fin2007cashflowssgmtFormEdit,'../fin2007cashflowssgmtController/updateFin2007cashflowssgmt',grid,fin2007cashflowssgmtWinEdit,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	fin2007cashflowssgmtWinEdit.show();
	
	loadFormData(fin2007cashflowssgmtFormEdit,'../fin2007cashflowssgmtController/getFin2007cashflowssgmtById?fin_2007cashflowssgmt_id='+ record.items[0].data.fin_2007cashflowssgmt_id);
}
function initFin2007cashflowssgmtFormEdit(){
	fin2007cashflowssgmtFormEdit = Ext.create('Ext.FormPanel',{
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
			name:'fin_2007cashflowssgmt_id',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'销售商品和提供劳务收到的现金',
			name:'cashreceivedfromsalesofgoodsorrendingofservices',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'收到的税费返还',
			name:'taxrefunds',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'收到其他与经营活动有关的现金',
			name:'othercashreceivedrelatingtooperatingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'经营活动现金流入小计',
			name:'totalcashinflowsfromoperatingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'购买商品、接受劳务支付的现金',
			name:'cashpaidforgoodsandservices',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'支付给职工以及为职工支付的现金',
			name:'cashpaidtoandonbehalfofemployees',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'支付的各项税费',
			name:'paymentsofalltypesoftaxes',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'支付其他与经营活动有关的现金',
			name:'othercashpaymentsfromoperatingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'经营活动现金流出小计',
			name:'totalcashoutflowsfromoperatingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'经营活动产生的现金流量净额',
			name:'netcashflowsfromoperatingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'收回投资所收到的现金',
			name:'cashreceivedfromreturnofinvestment',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'取得投资收益所收到的现金',
			name:'cashreceivedfromonvestments',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'处置固定资产无形资产和其他长期资产所收回的现金净额',
			name:'netcashrecetermassets',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'处置子公司及其他营业单位收到的现金净额',
			name:'netcashinflowsofdisposalofsubsidiariesandotherbusinessentities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'收到其他与投资活动有关的现金',
			name:'cashreceivedrelatingtootherinvestingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'投资活动现金流入小计',
			name:'totalcashinflowsfrominvestingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'购建固定资产无形资产和其他长期资产所支付的现金',
			name:'cashpaidtlongtermassents',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'投资所支付的现金',
			name:'cashpaymentsforinvestments',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'取得子公司及其他营业单位支付的现金净额',
			name:'netcashoutflowsofprocurementofsubsidiariesandotherbusinessunits',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'支付其他与投资活动有关的现金',
			name:'cashpaymentsrelatedtootherfinancingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'投资活动现金流出小计',
			name:'subtotalofcashoutflows',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'投资活动产生的现金流量净额',
			name:'netcashflowsfrominvestingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'吸收投资收到的现金',
			name:'cashreceivedfrominvestors',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'取得借款收到的现金',
			name:'cashfromborrowings',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'收到其他与筹资活动有关的现金',
			name:'othercashreceivedrelatingtofinancingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'筹资活动现金流入小计',
			name:'totalcashinflowsfromfinancingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'偿还债务所支付的现金',
			name:'cashrepaymentsfordebts',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'分配股利、利润或偿付利息所支付的现金',
			name:'cashpaymentsfstexpenses',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'支付其他与筹资活动有关的现金',
			name:'cashpaymentsrelatedtootherfinancingactivities2',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'筹资活动现金流出小计',
			name:'totalcashoutflowsfromfinancingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'筹集活动产生的现金流量净额',
			name:'netcashflowsfromfinancingactivities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'汇率变动对现金及现金等价物的影响',
			name:'effectofexchangratechangesoncash',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'现金及现金等价物净增加额',
			name:'netincreaseincashandcashequivalents',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'期初现金及现金等价物余额',
			name:'initialcashandcashequivalentsbalance',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'期末现金及现金等价物余额',
			name:'thefinalcashandcashequivalentsbalance',
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
			fieldLabel:'资产减值准备',
			name:'provisionforassetimpairment',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'固定资产折旧、油气资产折耗、生产性生物资产折旧',
			name:'depreciationoffixedassets',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'无形资产摊销',
			name:'amortisationofintangibleassets',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'长期待摊费用摊销',
			name:'amortisationoflongtermdefferedexpenses',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'待摊费用减少',
			name:'decreaseofdefferedexpenses',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'预提费用增加',
			name:'additionofaccuedexpense',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'处置固定资产无形资产和其他长期资产的损失',
			name:'lossesonditermassets',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'固定资产报废损失',
			name:'lossesonscrappingoffixedassets',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'公允价值变动损失',
			name:'profitorlossfromchangesinfairvalue',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'财务费用',
			name:'financeexpense',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'投资损失',
			name:'lossesarsingfrominvestment',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'递延所得税资产减少',
			name:'deferredincometaxassets',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'递延所得税负债增加',
			name:'deferredincometaxliabilities',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'存货的减少',
			name:'decreaseininventories',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'经营性应收项目的减少',
			name:'decreaseinoperatingreceivables',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'经营性应付项目的增加',
			name:'increaseinoperatingreceivables',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(净利润调节为经营活动现金流量科目下)其他',
			name:'others',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'经营活动产生的现金流量净额',
			name:'netcashflowsfromoperatingactivities2',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'债务转为资本',
			name:'debtstransfertocapital',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'一年内到期的可转换公司债券',
			name:'oneyeardueconvertiblebonds',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'融资租入固定资产',
			name:'financingrenttothefixedasset',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'现金的期末余额',
			name:'cashattheendofperiod',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'现金的期初余额',
			name:'cashatthebeginningoftheperiod',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'现金等价物的期末余额',
			name:'cashequivalentsattheendoftheperiod',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'现金等价物的期初余额',
			name:'cashequivalentsatthebeginningoftheperiod',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'现金及现金等价物净增加额',
			name:'netincreaseincashandcashequivalents2',
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
