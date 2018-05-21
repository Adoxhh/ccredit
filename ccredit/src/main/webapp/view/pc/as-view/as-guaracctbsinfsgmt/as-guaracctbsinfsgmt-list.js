var store;
var grid;
var ASBUSILINESCODE;
var ASBUSIDTILLINESCODE;
var CYCODE;
var ASGUARMODECODE;
var ASOTHREPYGUARWAYCODE;
var CHANGEFLAGCODE;
Ext.onReady(function(){
	ASBUSILINESCODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=ASBUSILINESCODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	ASBUSIDTILLINESCODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=ASBUSIDTILLINESCODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	CYCODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=CYCODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	ASGUARMODECODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=ASGUARMODECODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	ASOTHREPYGUARWAYCODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=ASOTHREPYGUARWAYCODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
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
			fieldLabel:'担保业务大类',
			xtype:'combo',
			labelWidth:70,
			emptyText:'请选择',
			store:ASBUSILINESCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'busilines',
			valueField:'value',
			displayField:'text',
			id:'busilines',
			name:'busilines',
			anchor:'50%',
			labelAlign:'top'
		},
		{
			fieldLabel:'担保业务种类细分',
			xtype:'combo',
			labelWidth:70,
			emptyText:'请选择',
			store:ASBUSIDTILLINESCODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'busidtillines',
			valueField:'value',
			displayField:'text',
			id:'busidtillines',
			name:'busidtillines',
			anchor:'50%',
			labelAlign:'top'
		}
		]
	});
	initSearchForm('north',items,false,'left');
	store = getGridJsonStore('../asGuaracctbsinfsgmtController/getAsGuaracctbsinfsgmtListByCondition',[]);
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
				header:'担保业务大类',
				flex:1,
				dataIndex:'busilinestext'
			},
			{
				header:'担保业务种类细分',
				flex:1,
				dataIndex:'busidtillinestext'
			},
			{
				header:'开户日期',
				flex:1,
				dataIndex:'opendatetext'
			},
			{
				header:'担保金额',
				flex:1,
				dataIndex:'guaramt'
			},
			{
				header:'币种',
				flex:1,
				dataIndex:'cytext'
			},
			{
				header:'到期日期',
				flex:1,
				dataIndex:'duedatetext'
			},
			{
				header:'反担保方式',
				flex:1,
				dataIndex:'guarmodetext'
			},
			{
				header:'其他还款保证方式',
				flex:1,
				dataIndex:'othrepyguarwaytext'
			},
			{
				header:'保证金百分比',
				flex:1,
				dataIndex:'secdep'
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
					addAsGuaracctbsinfsgmt();
				}
			 },
			 {
				text:'编辑',
				tooltip:'编辑',
				minWidth:tbarBtnMinWidth,
				cls:'updateBtn',
				icon:editIcon,
				handler:function(){
					updateAsGuaracctbsinfsgmt();
				}
			 },
			 {
				text:'删除',
				tooltip:'删除',
				minWidth:tbarBtnMinWidth,
				cls:'delBtn',
				icon:delIcon,
				handler:function(){
					delAsGuaracctbsinfsgmt();
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
						copyAsGuaracctbsinfsgmt();
					}
				 },
				 {
					text:'明 细',
					tooltip:'明 细',
					glyph:0xf03b,
					handler:function(){
						detailAsGuaracctbsinfsgmt();
					}
				 },
				 '-',
				 {
					text:'导 出',
					tooltip:'导 出',
					glyph:0xf1c3,
					handler:function(){
						exportAsGuaracctbsinfsgmt(grid,'../asGuaracctbsinfsgmtController/exportAsGuaracctbsinfsgmt');
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
				detailAsGuaracctbsinfsgmt();
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
function delAsGuaracctbsinfsgmt(){
	var model = grid.getSelectionModel();
	if(model.selected.length == 0){
		msgTishi('请选择后在删除');
		return;
	}
	var guaracctbsinfsgmt_id;
	for(var i = 0; i < model.selected.length; i++){
		if(null == guaracctbsinfsgmt_id){
			guaracctbsinfsgmt_id=model.selected.items[i].data.guaracctbsinfsgmt_id;
		}else{
			guaracctbsinfsgmt_id=guaracctbsinfsgmt_id+","+model.selected.items[i].data.guaracctbsinfsgmt_id;
		}
	}
	Ext.Msg.confirm('提示','确定删除该行数据？',function(btn){
		if(btn == 'yes'){
			var params = {guaracctbsinfsgmt_id:guaracctbsinfsgmt_id};
			ajaxRequest('../asGuaracctbsinfsgmtController/delAsGuaracctbsinfsgmt',grid,params,'正在执行删除操作中！请稍后...');
		}
	});
}
/**复制一行并生成记录**/
function copyAsGuaracctbsinfsgmt(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要复制的行！');
		return;
	}
	Ext.Msg.confirm('提示','确定要复制一行并生成记录？',function(btn){
		if(btn == 'yes'){
			var params = {guaracctbsinfsgmt_id:record.items[0].data.guaracctbsinfsgmt_id};
			ajaxRequest('../asGuaracctbsinfsgmtController/copyAsGuaracctbsinfsgmt',grid,params,'正在执行复制一行并生成记录！请稍后...');
		}
	});
}
/**导出**/
function exportAsGuaracctbsinfsgmt(grid,url){
	exportExcel(grid,url);
}
/**初始化右键**/
function initRight(){
	var contextmenu = new Ext.menu.Menu({
		id:'theContextMenu',
		items:[{
			text:'添 加',
			glyph:0xf016,
			id:'addAsGuaracctbsinfsgmtItem',
			handler:function(){addAsGuaracctbsinfsgmt();}
		},{
			text:'编 辑',
			glyph:0xf044,
			id:'updateAsGuaracctbsinfsgmtItem',
			handler:function(){updateAsGuaracctbsinfsgmt();}
		},{
			text:'删 除',
			glyph:0xf014,
			id:'delAsGuaracctbsinfsgmtItem',
			handler:function(){delAsGuaracctbsinfsgmt();}
		},'-',{
			text:'复制一行并生成记录',
			glyph:0xf0ea,
			id:'copyAsGuaracctbsinfsgmtItem',
			handler:function(){copyAsGuaracctbsinfsgmt();}
		},{
			text:'明 细',
			glyph:0xf03b,
			id:'detailAsGuaracctbsinfsgmtItem',
			handler:function(){detailAsGuaracctbsinfsgmt();}
		},{
			text:'导 出',
			glyph:0xf1c3,
			handler:function(){
				exportAsGuaracctbsinfsgmt(grid,'../asGuaracctbsinfsgmtController/exportAsGuaracctbsinfsgmt');
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
	initrightgridcontextmenu(grid,contextmenu,['updateAsGuaracctbsinfsgmtItem','delAsGuaracctbsinfsgmtItem','copyAsGuaracctbsinfsgmtItem','detailAsGuaracctbsinfsgmtItem']);
}
/**查询操作**/
function search(){
	initSearch(store,'../asGuaracctbsinfsgmtController/getAsGuaracctbsinfsgmtListByCondition',searchForm);
}
/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}
