var store;
var grid;
var INFRECTYPEDEL;
var OTHENTCERTTYPECODE;
var SHEETTYPECODE;
var SHEETTYPEDIVIDECODE;
var MDFCSGMTCODE1;
var SENDMSGSTATUS;
Ext.onReady(function(){
	INFRECTYPEDEL = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=INFRECTYPEDEL",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	OTHENTCERTTYPECODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=OTHENTCERTTYPECODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	SHEETTYPECODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=SHEETTYPECODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	SHEETTYPEDIVIDECODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=SHEETTYPEDIVIDECODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	MDFCSGMTCODE1 = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=MDFCSGMTCODE1",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	SENDMSGSTATUS = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:""../xtCommonController/getXtDataDictionary?ckey=SENDMSGSTATUS"",
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
			fieldLabel:'信息记录类型',
			xtype:'combo',
			labelWidth:70,
			emptyText:'请选择',
			store:INFRECTYPEDEL,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'infrectype',
			valueField:'value',
			displayField:'text',
			id:'infrectype',
			name:'infrectype',
			anchor:'50%',
			labelAlign:'top'
		}
		]
	});
	initSearchForm('north',items,false,'left');
	store = getGridJsonStore('../spDelmsgController/getSpDelmsgListByCondition',[]);
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
				header:'客户号',
				flex:1,
				dataIndex:'customid'
			},
			{
				header:'借据号',
				flex:1,
				dataIndex:'serialno'
			},
			{
				header:'信息记录类型',
				flex:1,
				dataIndex:'infrectypetext'
			},
			{
				header:'原因',
				flex:1,
				dataIndex:'reason'
			},
			{
				header:'申请人',
				flex:1,
				dataIndex:'applyman'
			},
			{
				header:'审批人',
				flex:1,
				dataIndex:'auditman'
			},
			{
				header:'状态',
				flex:1,
				dataIndex:'statustext'
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
					addSpDelmsg();
				}
			 },
			 {
				text:'编辑',
				tooltip:'编辑',
				minWidth:tbarBtnMinWidth,
				cls:'updateBtn',
				icon:editIcon,
				handler:function(){
					updateSpDelmsg();
				}
			 },
			 {
				text:'删除',
				tooltip:'删除',
				minWidth:tbarBtnMinWidth,
				cls:'delBtn',
				icon:delIcon,
				handler:function(){
					delSpDelmsg();
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
						copySpDelmsg();
					}
				 },
				 {
					text:'明 细',
					tooltip:'明 细',
					glyph:0xf03b,
					handler:function(){
						detailSpDelmsg();
					}
				 },
				 '-',
				 {
					text:'导 出',
					tooltip:'导 出',
					glyph:0xf1c3,
					handler:function(){
						exportSpDelmsg(grid,'../spDelmsgController/exportSpDelmsg');
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
				detailSpDelmsg();
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
function delSpDelmsg(){
	var model = grid.getSelectionModel();
	if(model.selected.length == 0){
		msgTishi('请选择后在删除');
		return;
	}
	var delmsg_id;
	for(var i = 0; i < model.selected.length; i++){
		if(null == delmsg_id){
			delmsg_id=model.selected.items[i].data.delmsg_id;
		}else{
			delmsg_id=delmsg_id+","+model.selected.items[i].data.delmsg_id;
		}
	}
	Ext.Msg.confirm('提示','确定删除该行数据？',function(btn){
		if(btn == 'yes'){
			var params = {delmsg_id:delmsg_id};
			ajaxRequest('../spDelmsgController/delSpDelmsg',grid,params,'正在执行删除操作中！请稍后...');
		}
	});
}
/**复制一行并生成记录**/
function copySpDelmsg(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要复制的行！');
		return;
	}
	Ext.Msg.confirm('提示','确定要复制一行并生成记录？',function(btn){
		if(btn == 'yes'){
			var params = {delmsg_id:record.items[0].data.delmsg_id};
			ajaxRequest('../spDelmsgController/copySpDelmsg',grid,params,'正在执行复制一行并生成记录！请稍后...');
		}
	});
}
/**导出**/
function exportSpDelmsg(grid,url){
	exportExcel(grid,url);
}
/**初始化右键**/
function initRight(){
	var contextmenu = new Ext.menu.Menu({
		id:'theContextMenu',
		items:[{
			text:'添 加',
			glyph:0xf016,
			id:'addSpDelmsgItem',
			handler:function(){addSpDelmsg();}
		},{
			text:'编 辑',
			glyph:0xf044,
			id:'updateSpDelmsgItem',
			handler:function(){updateSpDelmsg();}
		},{
			text:'删 除',
			glyph:0xf014,
			id:'delSpDelmsgItem',
			handler:function(){delSpDelmsg();}
		},'-',{
			text:'复制一行并生成记录',
			glyph:0xf0ea,
			id:'copySpDelmsgItem',
			handler:function(){copySpDelmsg();}
		},{
			text:'明 细',
			glyph:0xf03b,
			id:'detailSpDelmsgItem',
			handler:function(){detailSpDelmsg();}
		},{
			text:'导 出',
			glyph:0xf1c3,
			handler:function(){
				exportSpDelmsg(grid,'../spDelmsgController/exportSpDelmsg');
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
	initrightgridcontextmenu(grid,contextmenu,['updateSpDelmsgItem','delSpDelmsgItem','copySpDelmsgItem','detailSpDelmsgItem']);
}
/**查询操作**/
function search(){
	initSearch(store,'../spDelmsgController/getSpDelmsgListByCondition',searchForm);
}
/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}
