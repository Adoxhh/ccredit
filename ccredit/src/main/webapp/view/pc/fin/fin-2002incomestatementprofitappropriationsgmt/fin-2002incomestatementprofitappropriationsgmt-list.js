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
	store = getGridJsonStore('../fin2002incomestatementprofitappropriationsgmtController/getFin2002incomestatementprofitappropriationsgmtListByCondition',[]);
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
				header:'编号',
				flex:1,
				dataIndex:'fin_2002incomestatementprofitappropriationsgmt_id'
			},
			{
				header:'主营业务收入',
				flex:1,
				dataIndex:'mainrevenuefrevenue'
			},
			{
				header:'销售折扣与折让',
				flex:1,
				dataIndex:'discountandallowance'
			},
			{
				header:'主营业务收入净额',
				flex:1,
				dataIndex:'netamountofincomefrommainbusiness'
			},
			{
				header:'主营业务成本',
				flex:1,
				dataIndex:'mainoperatingcost'
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
					addFin2002incomestatementprofitappropriationsgmt();
				}
			 },
			 {
				text:'编辑',
				tooltip:'编辑',
				minWidth:tbarBtnMinWidth,
				cls:'updateBtn',
				icon:editIcon,
				handler:function(){
					updateFin2002incomestatementprofitappropriationsgmt();
				}
			 },
			 {
				text:'删除',
				tooltip:'删除',
				minWidth:tbarBtnMinWidth,
				cls:'delBtn',
				icon:delIcon,
				handler:function(){
					delFin2002incomestatementprofitappropriationsgmt();
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
						copyFin2002incomestatementprofitappropriationsgmt();
					}
				 },
				 {
					text:'明 细',
					tooltip:'明 细',
					glyph:0xf03b,
					handler:function(){
						detailFin2002incomestatementprofitappropriationsgmt();
					}
				 },
				 '-',
				 {
					text:'导 出',
					tooltip:'导 出',
					glyph:0xf1c3,
					handler:function(){
						exportFin2002incomestatementprofitappropriationsgmt(grid,'../fin2002incomestatementprofitappropriationsgmtController/exportFin2002incomestatementprofitappropriationsgmt');
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
				detailFin2002incomestatementprofitappropriationsgmt();
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
function delFin2002incomestatementprofitappropriationsgmt(){
	var model = grid.getSelectionModel();
	if(model.selected.length == 0){
		msgTishi('请选择后在删除');
		return;
	}
	var fin_2002incomestatementprofitappropriationsgmt_id;
	for(var i = 0; i < model.selected.length; i++){
		if(null == fin_2002incomestatementprofitappropriationsgmt_id){
			fin_2002incomestatementprofitappropriationsgmt_id=model.selected.items[i].data.fin_2002incomestatementprofitappropriationsgmt_id;
		}else{
			fin_2002incomestatementprofitappropriationsgmt_id=fin_2002incomestatementprofitappropriationsgmt_id+","+model.selected.items[i].data.fin_2002incomestatementprofitappropriationsgmt_id;
		}
	}
	Ext.Msg.confirm('提示','确定删除该行数据？',function(btn){
		if(btn == 'yes'){
			var params = {fin_2002incomestatementprofitappropriationsgmt_id:fin_2002incomestatementprofitappropriationsgmt_id};
			ajaxRequest('../fin2002incomestatementprofitappropriationsgmtController/delFin2002incomestatementprofitappropriationsgmt',grid,params,'正在执行删除操作中！请稍后...');
		}
	});
}
/**复制一行并生成记录**/
function copyFin2002incomestatementprofitappropriationsgmt(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要复制的行！');
		return;
	}
	Ext.Msg.confirm('提示','确定要复制一行并生成记录？',function(btn){
		if(btn == 'yes'){
			var params = {fin_2002incomestatementprofitappropriationsgmt_id:record.items[0].data.fin_2002incomestatementprofitappropriationsgmt_id};
			ajaxRequest('../fin2002incomestatementprofitappropriationsgmtController/copyFin2002incomestatementprofitappropriationsgmt',grid,params,'正在执行复制一行并生成记录！请稍后...');
		}
	});
}
/**导出**/
function exportFin2002incomestatementprofitappropriationsgmt(grid,url){
	exportExcel(grid,url);
}
/**初始化右键**/
function initRight(){
	var contextmenu = new Ext.menu.Menu({
		id:'theContextMenu',
		items:[{
			text:'添 加',
			glyph:0xf016,
			id:'addFin2002incomestatementprofitappropriationsgmtItem',
			handler:function(){addFin2002incomestatementprofitappropriationsgmt();}
		},{
			text:'编 辑',
			glyph:0xf044,
			id:'updateFin2002incomestatementprofitappropriationsgmtItem',
			handler:function(){updateFin2002incomestatementprofitappropriationsgmt();}
		},{
			text:'删 除',
			glyph:0xf014,
			id:'delFin2002incomestatementprofitappropriationsgmtItem',
			handler:function(){delFin2002incomestatementprofitappropriationsgmt();}
		},'-',{
			text:'复制一行并生成记录',
			glyph:0xf0ea,
			id:'copyFin2002incomestatementprofitappropriationsgmtItem',
			handler:function(){copyFin2002incomestatementprofitappropriationsgmt();}
		},{
			text:'明 细',
			glyph:0xf03b,
			id:'detailFin2002incomestatementprofitappropriationsgmtItem',
			handler:function(){detailFin2002incomestatementprofitappropriationsgmt();}
		},{
			text:'导 出',
			glyph:0xf1c3,
			handler:function(){
				exportFin2002incomestatementprofitappropriationsgmt(grid,'../fin2002incomestatementprofitappropriationsgmtController/exportFin2002incomestatementprofitappropriationsgmt');
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
	initrightgridcontextmenu(grid,contextmenu,['updateFin2002incomestatementprofitappropriationsgmtItem','delFin2002incomestatementprofitappropriationsgmtItem','copyFin2002incomestatementprofitappropriationsgmtItem','detailFin2002incomestatementprofitappropriationsgmtItem']);
}
/**查询操作**/
function search(){
	initSearch(store,'../fin2002incomestatementprofitappropriationsgmtController/getFin2002incomestatementprofitappropriationsgmtListByCondition',searchForm);
}
/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}
