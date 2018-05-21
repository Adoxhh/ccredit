var store;
var grid;
var ENTSCALECODE;
var ECOTYPECODE;
var NATIONALITYCODE;
var ADMDIVOFREGCODE;
var CHANGEFLAGCODE;
var ACTINVESTCODE;
Ext.onReady(function(){
	ENTSCALECODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=ENTSCALECODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	ECOTYPECODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=ECOTYPECODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	NATIONALITYCODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=NATIONALITYCODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	ADMDIVOFREGCODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=ADMDIVOFREGCODE",
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
	ACTINVESTCODE = new Ext.data.Store({
		  proxy:new Ext.data.HttpProxy({ 
		   url:"../xtCommonController/getXtDataDictionary?ckey=ACTINVESTCODE",
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
			fieldLabel:'企业规模',
			xtype:'combo',
			labelWidth:70,
			emptyText:'请选择',
			store:ENTSCALECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'entscale',
			valueField:'value',
			displayField:'text',
			id:'entscale',
			name:'entscale',
			anchor:'50%',
			labelAlign:'top'
		},
		{
			fieldLabel:'经济类型代码',
			xtype:'combo',
			labelWidth:70,
			emptyText:'请选择',
			store:ECOTYPECODE,
			mode:'local',
			triggerAction:'all',
			editable:false,
			hiddenName:'ecotype',
			valueField:'value',
			displayField:'text',
			id:'ecotype',
			name:'ecotype',
			anchor:'50%',
			labelAlign:'top'
		}
		]
	});
	initSearchForm('north',items,false,'left');
	store = getGridJsonStore('../bsFcsinfsgmtController/getBsFcsinfsgmtListByCondition',[]);
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
		columns:[{
			header:'客户号',
			flex:1,
			dataIndex:'customid'
		},		         
			{
				header:'国别代码',
				flex:1,
				dataIndex:'nationality',
				renderer:function(value) {
					var text;
					$.ajax({
					   type:"GET",
					   url:"../xtCommonController/getDictionaryText",
					   data:"value="+value+"&ckey=NATIONALITYCODE",
					   async:false,
					   success: function(result){
						   text = result;
					   }
					});
					return text;
				}
			},
			{
				header:'登记地址',
				flex:1,
				dataIndex:'regadd'
			},
			{
				header:'登记地行政区划代码',
				flex:1,
				dataIndex:'admdivofreg',
				renderer:function(value) {
					var text;
					$.ajax({
					   type:"GET",
					   url:"../xtCommonController/getDictionaryText",
					   data:"value="+value+"&ckey=ADMDIVOFREGCODE",
					   async:false,
					   success: function(result){
						   text = result;
					   }
					});
					return text;
				}
			},
			{
				header:'业务范围',
				flex:1,
				dataIndex:'bizrange'
			},
			{
				header:'行业分类代码',
				flex:1,
				dataIndex:'ecoinduscate',
				renderer:function(value) {
					var text;
					$.ajax({
					   type:"GET",
					   url:"../xtCommonController/getDictionaryText",
					   data:"value="+value+"&ckey=ACTINVESTCODE",
					   async:false,
					   success: function(result){
						   text = result;
					   }
					});
					return text;
				}
			},
			{
				header:'经济类型代码',
				flex:1,
				dataIndex:'ecotype',
				renderer:function(value) {
					var text;
					$.ajax({
					   type:"GET",
					   url:"../xtCommonController/getDictionaryText",
					   data:"value="+value+"&ckey=ECOTYPECODE",
					   async:false,
					   success: function(result){
						   text = result;
					   }
					});
					return text;
				}
			},
			{
				header:'企业规模',
				flex:1,
				dataIndex:'entscale',
				renderer:function(value) {
					var text;
					$.ajax({
					   type:"GET",
					   url:"../xtCommonController/getDictionaryText",
					   data:"value="+value+"&ckey=ENTSCALECODE",
					   async:false,
					   success: function(result){
						   text = result;
					   }
					});
					return text;
				}
			},
			
		],
		tbar:[
			 {
				text:'添加',
				tooltip:'添加',
				minWidth:tbarBtnMinWidth,
				cls:'addBtn',
				icon:addIcon,
				handler:function(){
					addBsFcsinfsgmt();
				}
			 },
			 {
				text:'编辑',
				tooltip:'编辑',
				minWidth:tbarBtnMinWidth,
				cls:'updateBtn',
				icon:editIcon,
				handler:function(){
					updateBsFcsinfsgmt();
				}
			 },
			 {
				text:'删除',
				tooltip:'删除',
				minWidth:tbarBtnMinWidth,
				cls:'delBtn',
				icon:delIcon,
				handler:function(){
					delBsFcsinfsgmt();
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
						copyBsFcsinfsgmt();
					}
				 },
				 {
					text:'明 细',
					tooltip:'明 细',
					glyph:0xf03b,
					handler:function(){
						detailBsFcsinfsgmt();
					}
				 },
				 '-',
				 {
					text:'导 出',
					tooltip:'导 出',
					glyph:0xf1c3,
					handler:function(){
						exportBsFcsinfsgmt(grid,'../bsFcsinfsgmtController/exportBsFcsinfsgmt');
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
				detailBsFcsinfsgmt();
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
function delBsFcsinfsgmt(){
	var model = grid.getSelectionModel();
	if(model.selected.length == 0){
		msgTishi('请选择后在删除');
		return;
	}
	var bs_fcsinfsgmt_id;
	for(var i = 0; i < model.selected.length; i++){
		if(null == bs_fcsinfsgmt_id){
			bs_fcsinfsgmt_id=model.selected.items[i].data.bs_fcsinfsgmt_id;
		}else{
			bs_fcsinfsgmt_id=bs_fcsinfsgmt_id+","+model.selected.items[i].data.bs_fcsinfsgmt_id;
		}
	}
	Ext.Msg.confirm('提示','确定删除该行数据？',function(btn){
		if(btn == 'yes'){
			var params = {bs_fcsinfsgmt_id:bs_fcsinfsgmt_id};
			ajaxRequest('../bsFcsinfsgmtController/delBsFcsinfsgmt',grid,params,'正在执行删除操作中！请稍后...');
		}
	});
}
/**复制一行并生成记录**/
function copyBsFcsinfsgmt(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要复制的行！');
		return;
	}
	Ext.Msg.confirm('提示','确定要复制一行并生成记录？',function(btn){
		if(btn == 'yes'){
			var params = {bs_fcsinfsgmt_id:record.items[0].data.bs_fcsinfsgmt_id};
			ajaxRequest('../bsFcsinfsgmtController/copyBsFcsinfsgmt',grid,params,'正在执行复制一行并生成记录！请稍后...');
		}
	});
}
/**导出**/
function exportBsFcsinfsgmt(grid,url){
	exportExcel(grid,url);
}
/**初始化右键**/
function initRight(){
	var contextmenu = new Ext.menu.Menu({
		id:'theContextMenu',
		items:[{
			text:'添 加',
			glyph:0xf016,
			id:'addBsFcsinfsgmtItem',
			handler:function(){addBsFcsinfsgmt();}
		},{
			text:'编 辑',
			glyph:0xf044,
			id:'updateBsFcsinfsgmtItem',
			handler:function(){updateBsFcsinfsgmt();}
		},{
			text:'删 除',
			glyph:0xf014,
			id:'delBsFcsinfsgmtItem',
			handler:function(){delBsFcsinfsgmt();}
		},'-',{
			text:'复制一行并生成记录',
			glyph:0xf0ea,
			id:'copyBsFcsinfsgmtItem',
			handler:function(){copyBsFcsinfsgmt();}
		},{
			text:'明 细',
			glyph:0xf03b,
			id:'detailBsFcsinfsgmtItem',
			handler:function(){detailBsFcsinfsgmt();}
		},{
			text:'导 出',
			glyph:0xf1c3,
			handler:function(){
				exportBsFcsinfsgmt(grid,'../bsFcsinfsgmtController/exportBsFcsinfsgmt');
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
	initrightgridcontextmenu(grid,contextmenu,['updateBsFcsinfsgmtItem','delBsFcsinfsgmtItem','copyBsFcsinfsgmtItem','detailBsFcsinfsgmtItem']);
}
/**查询操作**/
function search(){
	initSearch(store,'../bsFcsinfsgmtController/getBsFcsinfsgmtListByCondition',searchForm);
}
/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}
