var store;
var grid;
var CUSTOMERTYPECODE;
var OTHENTCERTTYPECODE;
var BSRPTDATECODE;
var ETPSTSCODE;
var ORGTYPECODE;
Ext.onReady(function(){
	CUSTOMERTYPECODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=CUSTOMERTYPECODE",
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
	BSRPTDATECODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=BSRPTDATECODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	ETPSTSCODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=ETPSTSCODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	ORGTYPECODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=ORGTYPECODE",
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
			fieldLabel:'企业名称',
			xtype:'textfield',
			labelWidth:70,
			id:'entname',
			name:'entname',
			anchor:'50%',
			labelAlign:'top'
		},
		{
			fieldLabel:'客户资料类型',
			xtype:'combo',
			labelWidth:70,
			emptyText:'请选择',
			store:CUSTOMERTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'customertype',
			valueField:'value',
			displayField:'text',
			id:'customertype',
			name:'customertype',
			anchor:'50%',
			labelAlign:'top'
		}
		]
	});
	initSearchForm('north',items,false,'left');
	store = getGridJsonStore('../bsBssgmtController/getBsBssgmtListByCondition',[]);
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
				header:'企业名称',
				flex:1,
				dataIndex:'entname'
			},
			{
				header:'企业身份标识类型',
				flex:1,
				dataIndex:'entcerttype',
				renderer:function(value) {
					var text;
					$.ajax({
					   type:"GET",
					   url:"../xtCommonController/getDictionaryText",
					   data:"value="+value+"&ckey=OTHENTCERTTYPECODE",
					   async:false,
					   success: function(result){
						   text = result;
					   }
					});
					return text;
				}
			},
			{
				header:'企业身份标识号码',
				flex:1,
				dataIndex:'entcertnum'
			},
			{
				header:'报告时点说明代码',
				flex:1,
				dataIndex:'rptdatecode',
				renderer:function(value) {
					var text;
					$.ajax({
					   type:"GET",
					   url:"../xtCommonController/getDictionaryText",
					   data:"value="+value+"&ckey=BSRPTDATECODE",
					   async:false,
					   success: function(result){
						   text = result;
					   }
					});
					return text;
				}
			},
			{
				header:'客户资料类型',
				flex:1,
				dataIndex:'customertype',
				renderer:function(value) {
					var text;
					$.ajax({
					   type:"GET",
					   url:"../xtCommonController/getDictionaryText",
					   data:"value="+value+"&ckey=CUSTOMERTYPECODE",
					   async:false,
					   success: function(result){
						   text = result;
					   }
					});
					return text;
				}
			},
			{
				header:'存续状态',
				flex:1,
				dataIndex:'etpsts',
				renderer:function(value) {
					var text;
					$.ajax({
					   type:"GET",
					   url:"../xtCommonController/getDictionaryText",
					   data:"value="+value+"&ckey=ETPSTSCODE",
					   async:false,
					   success: function(result){
						   text = result;
					   }
					});
					return text;
				}
			},
			{
				header:'组织机构类型',
				flex:1,
				dataIndex:'orgtype',
				renderer:function(value) {
					var text;
					$.ajax({
					   type:"GET",
					   url:"../xtCommonController/getDictionaryText",
					   data:"value="+value+"&ckey=ORGTYPECODE",
					   async:false,
					   success: function(result){
						   text = result;
					   }
					});
					return text;
				}
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
					addBsBssgmt();
				}
			 },
			 {
				text:'编辑',
				tooltip:'编辑',
				minWidth:tbarBtnMinWidth,
				cls:'updateBtn',
				icon:editIcon,
				handler:function(){
					updateBsBssgmt();
				}
			 },
			 {
				text:'删除',
				tooltip:'删除',
				minWidth:tbarBtnMinWidth,
				cls:'delBtn',
				icon:delIcon,
				handler:function(){
					delBsBssgmt();
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
						copyBsBssgmt();
					}
				 },
				 {
					text:'明 细',
					tooltip:'明 细',
					glyph:0xf03b,
					handler:function(){
						detailBsBssgmt();
					}
				 },
				 '-',
				 {
					text:'导 出',
					tooltip:'导 出',
					glyph:0xf1c3,
					handler:function(){
						exportBsBssgmt(grid,'../bsBssgmtController/exportBsBssgmt');
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
				detailBsBssgmt();
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
function delBsBssgmt(){
	var model = grid.getSelectionModel();
	if(model.selected.length == 0){
		msgTishi('请选择后在删除');
		return;
	}
	var bssgmt_id;
	for(var i = 0; i < model.selected.length; i++){
		if(null == bssgmt_id){
			bssgmt_id=model.selected.items[i].data.bssgmt_id;
		}else{
			bssgmt_id=bssgmt_id+","+model.selected.items[i].data.bssgmt_id;
		}
	}
	Ext.Msg.confirm('提示','确定删除该行数据？',function(btn){
		if(btn == 'yes'){
			var params = {bssgmt_id:bssgmt_id};
			ajaxRequest('../bsBssgmtController/delBsBssgmt',grid,params,'正在执行删除操作中！请稍后...');
		}
	});
}
/**复制一行并生成记录**/
function copyBsBssgmt(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要复制的行！');
		return;
	}
	Ext.Msg.confirm('提示','确定要复制一行并生成记录？',function(btn){
		if(btn == 'yes'){
			var params = {bssgmt_id:record.items[0].data.bssgmt_id};
			ajaxRequest('../bsBssgmtController/copyBsBssgmt',grid,params,'正在执行复制一行并生成记录！请稍后...');
		}
	});
}
/**导出**/
function exportBsBssgmt(grid,url){
	exportExcel(grid,url);
}
/**初始化右键**/
function initRight(){
	var contextmenu = new Ext.menu.Menu({
		id:'theContextMenu',
		items:[{
			text:'添 加',
			glyph:0xf016,
			id:'addBsBssgmtItem',
			handler:function(){addBsBssgmt();}
		},{
			text:'编 辑',
			glyph:0xf044,
			id:'updateBsBssgmtItem',
			handler:function(){updateBsBssgmt();}
		},{
			text:'删 除',
			glyph:0xf014,
			id:'delBsBssgmtItem',
			handler:function(){delBsBssgmt();}
		},'-',{
			text:'复制一行并生成记录',
			glyph:0xf0ea,
			id:'copyBsBssgmtItem',
			handler:function(){copyBsBssgmt();}
		},{
			text:'明 细',
			glyph:0xf03b,
			id:'detailBsBssgmtItem',
			handler:function(){detailBsBssgmt();}
		},{
			text:'导 出',
			glyph:0xf1c3,
			handler:function(){
				exportBsBssgmt(grid,'../bsBssgmtController/exportBsBssgmt');
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
	initrightgridcontextmenu(grid,contextmenu,['updateBsBssgmtItem','delBsBssgmtItem','copyBsBssgmtItem','detailBsBssgmtItem']);
}
/**查询操作**/
function search(){
	initSearch(store,'../bsBssgmtController/getBsBssgmtListByCondition',searchForm);
}
/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}
