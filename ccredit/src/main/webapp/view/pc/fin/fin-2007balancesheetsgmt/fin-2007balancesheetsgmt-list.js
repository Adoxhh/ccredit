var store;
var grid;
var CHANGEFLAGCODE;
Ext.onReady(function(){
	CHANGEFLAGCODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=CHANGEFLAGCODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	/**查询区域可扩展**/
	var items = Ext.create('Ext.FormPanel',{
		xtype:'form',
		maxHeight:150,
		waitMsgTarget:true,
		defaultType:'textfield',
		autoScroll:true,
		layout:'table',
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
			labelWidth:70,
			id:'customid',
			name:'customid',
			anchor:'50%',
			labelAlign:'top'
		}
		]
	});
	initSearchForm('north',items,false,'left');
	store = getGridJsonStore('../fin2007balancesheetsgmtController/getFin2007balancesheetsgmtListByCondition',[]);
	grid = Ext.create('Ext.grid.Panel',{
		region:'center',
		xtype:'panel',
		store:store,
		title:'查询结果',
		columnLines:true,
		selType:'cellmodel',
		multiSelect:true,
		selType:'checkboxmodel',
		viewConfig:{
			emptyText:'暂无数据',
			stripeRows:true
		},
		loadMask:{
			msg:'正在加载...'
		},
		columns:[
			
			{
				header:'货币资金',
				flex:1,
				dataIndex:'currencyfunds'
			},
			{
				header:'交易性金融资产',
				flex:1,
				dataIndex:'financialassetsheldfortrading'
			},
			{
				header:'应收票据',
				flex:1,
				dataIndex:'notesreceivable'
			},
			{
				header:'应收账款',
				flex:1,
				dataIndex:'accountsreceivable'
			},
			{
				header:'客户号',
				flex:1,
				dataIndex:'customid'
			},
			{
				header:'最后一次修改日期',
				flex:1,
				dataIndex:'lastdatetext'
			},
			{
				header:'状态位',
				flex:1,
				dataIndex:'changeflagtext'
			}
		],
		tbar:[
			 {
				text:'添加',
				tooltip:'添加',
				minWidth:tbarBtnMinWidth,
				cls:'addBtn',
				icon:addIcon,
				handler:function(){
					addFin2007balancesheetsgmt();
				}
			 },
			 {
				text:'编辑',
				tooltip:'编辑',
				minWidth:tbarBtnMinWidth,
				cls:'updateBtn',
				icon:editIcon,
				handler:function(){
					updateFin2007balancesheetsgmt();
				}
			 },
			 {
				text:'删除',
				tooltip:'删除',
				minWidth:tbarBtnMinWidth,
				cls:'delBtn',
				icon:delIcon,
				handler:function(){
					delFin2007balancesheetsgmt();
				}
			 },
			 {
				text:'检索',
				minWidth:tbarBtnMinWidth,
				cls:'searchBtn',
				icon:searchIcon,
				handler:function(){
					search();
				}
			 },
			 {
				text:'重置',
				tooltip:'重置',
				minWidth:tbarBtnMinWidth,
				icon:clearSearchIcon,
				handler:function(){
					searchForm.reset();
				}
			 },
			 grid_toolbar_moretext_gaps,
			 {
				 text:moretext,
				 tooltip:moretexttooltip,
				 icon:listIcon,
				 iconAlign:'left',
				 menu:[
				 {
					text:'复制一行并生成记录',
					tooltip:'复制一行并生成记录',
					glyph:0xf0ea,
					handler:function(){
						copyFin2007balancesheetsgmt();
					}
				 },
				 {
					text:'明 细',
					tooltip:'明 细',
					glyph:0xf03b,
					handler:function(){
						detailFin2007balancesheetsgmt();
					}
				 },
				 '-',
				 {
					text:'导 出',
					tooltip:'导 出',
					glyph:0xf1c3,
					handler:function(){
						exportFin2007balancesheetsgmt(grid,'../fin2007balancesheetsgmtController/exportFin2007balancesheetsgmt');
					}
				 },
				 {
					text:'打 印',
					tooltip:'打 印',
					glyph:0xf02f,
					handler:function(){
						printerGrid(grid);
					}
				 },
				 '-',
				 {
					text:'全 选',
					tooltip:'全 选',
					glyph:0xf046,
					handler:function(){selectAll(grid);}
				 },
				 {
					text:'反 选',
					tooltip:'反 选',
					glyph:0xf096,
					handler:function(){unSelectAll(grid);}
				 },
				 '-',
				 {
					text:'刷 新',
					tooltip:'刷 新',
					glyph:0xf021,
					handler:function(){
						grid.getStore().reload();
					}
				 },
				 {
					text:'检 索',
					tooltip:'检 索',
					glyph:0xf002,
					handler:function(){
						search();
					}
				 },
				 {
					text:'重 置',
					tooltip:'重 置',
					glyph:0xf014,
					handler:function(){
						searchForm.reset();
					}
				 }
				 ]
			 }
		],
		bbar:getGridBBar(store),
		listeners:{
			'rowdblclick':function(grid, rowIndex, e){
				detailFin2007balancesheetsgmt();
			}
		}
	});
	Ext.create('Ext.Viewport',{
		layout:'border',
		xtype:'viewport',
		items:[searchForm,grid]
	});
	/**调用右键**/
	initRight();
	store.on('beforeload',function(thiz, options){Ext.apply(thiz.proxy.extraParams,getParmas(store,searchForm));});
});
/**删除操作**/
function delFin2007balancesheetsgmt(){
	var model = grid.getSelectionModel();
	if(model.selected.length == 0){
		msgTishi('请选择后在删除');
		return;
	}
	var fin_2007BalanceSheetSgmt_id;
	for(var i = 0; i < model.selected.length; i++){
		if(null == fin_2007BalanceSheetSgmt_id){
			fin_2007BalanceSheetSgmt_id=model.selected.items[i].data.fin_2007BalanceSheetSgmt_id;
		}else{
			fin_2007BalanceSheetSgmt_id=fin_2007BalanceSheetSgmt_id+","+model.selected.items[i].data.fin_2007BalanceSheetSgmt_id;
		}
	}
	Ext.Msg.confirm('提示','确定删除该行数据？',function(btn){
		if(btn == 'yes'){
			var params = {fin_2007BalanceSheetSgmt_id:fin_2007BalanceSheetSgmt_id};
			ajaxRequest('../fin2007balancesheetsgmtController/delFin2007balancesheetsgmt',grid,params,'正在执行删除操作中！请稍后...');
		}
	});
}
/**复制一行并生成记录**/
function copyFin2007balancesheetsgmt(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要复制的行！');
		return;
	}
	Ext.Msg.confirm('提示','确定要复制一行并生成记录？',function(btn){
		if(btn == 'yes'){
			var params = {fin_2007BalanceSheetSgmt_id:record.items[0].data.fin_2007BalanceSheetSgmt_id};
			ajaxRequest('../fin2007balancesheetsgmtController/copyFin2007balancesheetsgmt',grid,params,'正在执行复制一行并生成记录！请稍后...');
		}
	});
}
/**导出**/
function exportFin2007balancesheetsgmt(grid,url){
	exportExcel(grid,url);
}
/**初始化右键**/
function initRight(){
	var contextmenu = new Ext.menu.Menu({
		id:'theContextMenu',
		items:[{
			text:'添 加',
			glyph:0xf016,
			id:'addFin2007balancesheetsgmtItem',
			handler:function(){addFin2007balancesheetsgmt();}
		},{
			text:'编 辑',
			glyph:0xf044,
			id:'updateFin2007balancesheetsgmtItem',
			handler:function(){updateFin2007balancesheetsgmt();}
		},{
			text:'删 除',
			glyph:0xf014,
			id:'delFin2007balancesheetsgmtItem',
			handler:function(){delFin2007balancesheetsgmt();}
		},'-',{
			text:'复制一行并生成记录',
			glyph:0xf0ea,
			id:'copyFin2007balancesheetsgmtItem',
			handler:function(){copyFin2007balancesheetsgmt();}
		},{
			text:'明 细',
			glyph:0xf03b,
			id:'detailFin2007balancesheetsgmtItem',
			handler:function(){detailFin2007balancesheetsgmt();}
		},{
			text:'导 出',
			glyph:0xf1c3,
			handler:function(){
				exportFin2007balancesheetsgmt(grid,'../fin2007balancesheetsgmtController/exportFin2007balancesheetsgmt');
			}
		},{
			text:'打 印',
			glyph:0xf02f,
			handler:function(){printerGrid(grid);}
		},'-',{
			text:'全 选',
			glyph:0xf046,
			handler:function(){selectAll(grid);}
		},{
			text:'反 选',
			glyph:0xf096,
			handler:function(){unSelectAll(grid);}
		},'-',{
			text:'刷 新',
			glyph:0xf021,
			handler:function(){refreshGrid(grid);}
		}]
	});
	initrightgridcontextmenu(grid,contextmenu,['updateFin2007balancesheetsgmtItem','delFin2007balancesheetsgmtItem','copyFin2007balancesheetsgmtItem','detailFin2007balancesheetsgmtItem']);
}
/**查询操作**/
function search(){
	initSearch(store,'../fin2007balancesheetsgmtController/getFin2007balancesheetsgmtListByCondition',searchForm);
}
/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}
