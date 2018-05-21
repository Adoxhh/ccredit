var fin2002incomestatementprofitappropriationsgmtWinEdit;
var fin2002incomestatementprofitappropriationsgmtFormEdit;
function updateFin2002incomestatementprofitappropriationsgmt(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要修改的一项！');
		return;
	}
	initFin2002incomestatementprofitappropriationsgmtFormEdit();
	fin2002incomestatementprofitappropriationsgmtWinEdit = Ext.create('Ext.Window',{
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
		items:fin2002incomestatementprofitappropriationsgmtFormEdit,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(fin2002incomestatementprofitappropriationsgmtFormEdit,'../fin2002incomestatementprofitappropriationsgmtController/updateFin2002incomestatementprofitappropriationsgmt',grid,fin2002incomestatementprofitappropriationsgmtWinEdit,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	fin2002incomestatementprofitappropriationsgmtWinEdit.show();
	
	loadFormData(fin2002incomestatementprofitappropriationsgmtFormEdit,'../fin2002incomestatementprofitappropriationsgmtController/getFin2002incomestatementprofitappropriationsgmtById?fin_2002incomestatementprofitappropriationsgmt_id='+ record.items[0].data.fin_2002incomestatementprofitappropriationsgmt_id);
}
function initFin2002incomestatementprofitappropriationsgmtFormEdit(){
	fin2002incomestatementprofitappropriationsgmtFormEdit = Ext.create('Ext.FormPanel',{
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
			name:'fin_2002incomestatementprofitappropriationsgmt_id',
			allowBlank:false,
			maxLength:40,
			anchor:'100%'
		},
		{
			fieldLabel:'主营业务收入',
			name:'mainrevenuefrevenue',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(主营业务收入科目下)出口产品销售收入',
			name:'salesincomeofexportgoodsproducts',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(主营业务收入科目下)进口产品销售收入',
			name:'salesincomeofimportgoodsproducts',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'销售折扣与折让',
			name:'discountandallowance',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'主营业务收入净额',
			name:'netamountofincomefrommainbusiness',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'主营业务成本',
			name:'mainoperatingcost',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(主营业务成本科目下)出口产品销售成本',
			name:'salesincomeofexportproducts',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'主营业务税金及附加',
			name:'principlebusinesstaxandextracharge',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'经营费用',
			name:'operationexpense',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'其他(业务成本)',
			name:'othersoperatingcost',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'递延收益',
			name:'deferredincome',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'代购代销收入',
			name:'incomefromsalesagency',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'其他(收入)',
			name:'otheroperatingincome',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'主营业务利润',
			name:'principlebusinessprofit',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'其他业务利润',
			name:'otherbusinessprofit',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'营业费用',
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
			name:'financialexpenses',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'其他(费用)',
			name:'othersexpenses',
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
			fieldLabel:'投资收益',
			name:'investmentincome',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'期货收益',
			name:'futuresincome',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'补贴收入',
			name:'allowanceincome',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(补贴收入科目下)补贴前亏损的企业补贴收入',
			name:'allowanceincomebeforeallowance',
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
			fieldLabel:'(营业外收入科目下)处置固定资产净收益',
			name:'netgainondisposaloffixedassets',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(营业外收入科目下)非货币性交易收益',
			name:'incomefromnoncurrencytrade',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(营业外收入科目下)出售无形资产收益',
			name:'incomefromsalesofintangibleassets',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(营业外收入科目下)罚款净收入',
			name:'incomefrompenalty',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'其他(利润)',
			name:'othersincome',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(其他科目下)用以前年度含量工资节余弥补利润',
			name:'calculatingfromthecontentsalarybefore',
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
			fieldLabel:'(营业外支出科目下)处置固定资产净损失',
			name:'lossfromdisposaloffixedassets',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(营业外支出科目下)债务重组损失',
			name:'exchangeofnonmonetaryassetsloss',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(营业外支出科目下)罚款支出',
			name:'lossoflawsuits',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(营业外支出科目下)捐赠支出',
			name:'paymentfordonation',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'其他支出',
			name:'otherpayments',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(其他支出)结转的含量工资包干节余',
			name:'balanceofcontentsalary',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'利润总额',
			name:'totalprofit',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'所得税',
			name:'incometax',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'少数股东损益',
			name:'imparimentloss',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'未确认的投资损失',
			name:'unrealizedinvestmentlosses',
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
			fieldLabel:'年初未分配利润',
			name:'profitdistributionatbeginningofperiod',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'盈余公积补亏',
			name:'compensationofsurplusreserve',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'其他调整因素',
			name:'otheradjustmentfactors',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'可供分配的利润',
			name:'profitavailablefordistribution',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'单项留用的利润',
			name:'profitreservedforasingleitem',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'补充流动资本',
			name:'supplementarycurrentcapital',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'提取法定盈余公积',
			name:'appropriationofstatutorysurplusreserves',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'提取法定公益金',
			name:'appropriationofstatutorywelfarefund',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'提取职工奖励及福利基金',
			name:'appropriationofstaffincentiveandwelfarefund',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'提取储备基金',
			name:'appropriationofreservefund',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'提取企业发展基金',
			name:'appropriationofenterpriseexpansionfund',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'利润归还投资',
			name:'profitscapitalizadon',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(可供分配的利润科目下)其他',
			name:'returnofinvestmentothers',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'可供投资者分配的利润',
			name:'profitavailableforownersdistribution',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'应付优先股股利',
			name:'preferredstockdividendspayable',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'提取任意盈余公积',
			name:'withdrawalothercommonaccumulationfund',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'应付普通股股利',
			name:'payabledividendsofcommonstock',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'转作资本的普通股股利',
			name:'transferfromordinarysharesdividendtopaidincapitalorstock',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(可供投资者分配的利润科目下)其他',
			name:'others',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'未分配利润',
			name:'unappropriatedprofit',
			maxLength:17,
			anchor:'100%'
		},
		{
			fieldLabel:'(未分配利润科目下)应由以后年度税前利润弥补的亏损',
			name:'losscompensatedbeforethetax',
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
