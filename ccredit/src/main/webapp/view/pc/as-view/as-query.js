var store;
var grid; 
Ext.onReady(function(){
	 
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
			fieldLabel:'借据号',
			xtype:'textfield',
			labelWidth:70,
			id:'serialno',
			name:'serialno',
			anchor:'50%',
			labelAlign:'top'
		},
		{
			fieldLabel:'账户标识码',
			xtype:'textfield',
			labelWidth:70,
			id:'acctcode',
			name:'acctcode',
			anchor:'50%',
			labelAlign:'top'
		}
		]
	});
	initSearchForm('north',items,false,'left');
	store = getGridJsonStore('../asGuaracctbssgmtController/getAsGuaracctbssgmtListByCondition',[]);
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
				header:'借据号',
				flex:1,
				dataIndex:'serialno'
			},
			{
				header:'客户号',
				flex:1,
				dataIndex:'customid'
			},
			{
				header:'账户类型',
				flex:1,
				dataIndex:'accttypetext'
			},
			{
				header:'账户标识码',
				flex:1,
				dataIndex:'acctcode'
			},
			{
				header:'债务人名称',
				flex:1,
				dataIndex:'name'
			},
			{
				header:'债务人身份标识类型',
				flex:1,
				dataIndex:'idtypetext'
			},
			{
				header:'债务人身份标识号码',
				flex:1,
				dataIndex:'idnum'
			}
		],
		tbar:[
			  
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
			 {
				text:'明细信息',
				tooltip:'明细信息',
				minWidth : tbarBtnMinWidth,
				cls : 'detailIcon',
				icon : detailIcon,
				handler:function(){
					detailAsGuaracctbssgmt();
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
					text:'明 细',
					tooltip:'明 细',
					glyph:0xf03b,
					handler:function(){
						detailAsGuaracctbssgmt();
					}
				 },
				 '-',
				 {
					text:'导 出',
					tooltip:'导 出',
					glyph:0xf1c3,
					handler:function(){
						exportAsGuaracctbssgmt(grid,'../asGuaracctbssgmtController/exportAsGuaracctbssgmt');
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
				detailAsGuaracctbssgmt();
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
/**导出**/
function exportAsGuaracctbssgmt(grid,url){
	exportExcel(grid,url);
}
/**初始化右键**/
function initRight(){
	var contextmenu = new Ext.menu.Menu({
		id:'theContextMenu',
		items:[ {
			text:'明 细',
			glyph:0xf03b,
			id:'detailAsGuaracctbssgmtItem',
			handler:function(){detailAsGuaracctbssgmt();}
		},{
			text:'导 出',
			glyph:0xf1c3,
			handler:function(){
				exportAsGuaracctbssgmt(grid,'../asGuaracctbssgmtController/exportAsGuaracctbssgmt');
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
	initrightgridcontextmenu(grid,contextmenu,['updateAsGuaracctbssgmtItem','delAsGuaracctbssgmtItem','copyAsGuaracctbssgmtItem','detailAsGuaracctbssgmtItem']);
}
/**查询操作**/
function search(){
	initSearch(store,'../asGuaracctbssgmtController/getAsGuaracctbssgmtListByCondition',searchForm);
}
/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}

/**查看明细信息*/ 
function detailAsGuaracctbssgmt() {
	var record = grid.getSelectionModel().getLastSelected();
	var record2 = grid.getSelectionModel().selected;
	if(record2.length == 0){
		msgTishi('请选择要查看明细的项！');
		return;
	}
	var serialno = record.get("serialno");
	var src = "../asGuaracctbsinfsgmtController/asToPDF?serialno="+serialno;
    window.location=src;
}
