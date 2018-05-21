var store;
var grid;
var BSINFRECTYPECODE;
var OTHENTCERTTYPECODE;
var ASSOTYPECODE;
var CERTASSFLGCODE;
var CHANGEFLAGCODE;
Ext.onReady(function(){
	BSINFRECTYPECODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=BSINFRECTYPECODE",
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
	ASSOTYPECODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=ASSOTYPECODE",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	CERTASSFLGCODE = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=CERTASSFLGCODE",
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
			fieldLabel:'A 企业名称',
			xtype:'textfield',
			labelWidth:70,
			id:'entname',
			name:'entname',
			anchor:'50%',
			labelAlign:'top'
		},
		{
			fieldLabel:'B 企业名称',
			xtype:'textfield',
			labelWidth:70,
			id:'assoentname',
			name:'assoentname',
			anchor:'50%',
			labelAlign:'top'
		}
		]
	});
	initSearchForm('north',items,false,'left');
	store = getGridJsonStore('../bsEnicdnrltpinfController/getBsEnicdnrltpinfListByCondition',[]);
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
				header:'A客户号',
				flex:1,
				dataIndex:'customid'
			},
			{
				header:'A 企业名称',
				flex:1,
				dataIndex:'entname'
			},
			{
				header:'A 企业身份标识类型',
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
				header:'A 企业身份标识号码',
				flex:1,
				dataIndex:'entcertnum'
			},
			{
				header:'B企业客户号',
				flex:1,
				dataIndex:'bcustomid'
			},
			{
				header:'B 企业名称',
				flex:1,
				dataIndex:'assoentname'
			},
			{
				header:'B 企业身份标识类型',
				flex:1,
				dataIndex:'assoentcerttype',
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
				header:'B 企业身份标识号码',
				flex:1,
				dataIndex:'assoentcertnum'
			},
			{
				header:'关联关系类型',
				flex:1,
				dataIndex:'assotype',
				renderer:function(value) {
					var text;
					$.ajax({
					   type:"GET",
					   url:"../xtCommonController/getDictionaryText",
					   data:"value="+value+"&ckey=ASSOTYPECODE",
					   async:false,
					   success: function(result){
						   text = result;
					   }
					});
					return text;
				}
			},
			{
				header:'关联标志',
				flex:1,
				dataIndex:'assosign',
				renderer:function(value) {
					var text;
					$.ajax({
					   type:"GET",
					   url:"../xtCommonController/getDictionaryText",
					   data:"value="+value+"&ckey=CERTASSFLGCODE",
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
					addBsEnicdnrltpinf();
				}
			 },
			 {
				text:'编辑',
				tooltip:'编辑',
				minWidth:tbarBtnMinWidth,
				cls:'updateBtn',
				icon:editIcon,
				handler:function(){
					updateBsEnicdnrltpinf();
				}
			 },
			 {
				text:'删除',
				tooltip:'删除',
				minWidth:tbarBtnMinWidth,
				cls:'delBtn',
				icon:delIcon,
				handler:function(){
					delBsEnicdnrltpinf();
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
						copyBsEnicdnrltpinf();
					}
				 },
				 {
					text:'明 细',
					tooltip:'明 细',
					glyph:0xf03b,
					handler:function(){
						detailBsEnicdnrltpinf();
					}
				 },
				 '-',
				 {
					text:'导 出',
					tooltip:'导 出',
					glyph:0xf1c3,
					handler:function(){
						exportBsEnicdnrltpinf(grid,'../bsEnicdnrltpinfController/exportBsEnicdnrltpinf');
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
				detailBsEnicdnrltpinf();
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
function delBsEnicdnrltpinf(){
	var model = grid.getSelectionModel();
	if(model.selected.length == 0){
		msgTishi('请选择后在删除');
		return;
	}
	var enicdnrltpinf_id;
	for(var i = 0; i < model.selected.length; i++){
		if(null == enicdnrltpinf_id){
			enicdnrltpinf_id=model.selected.items[i].data.enicdnrltpinf_id;
		}else{
			enicdnrltpinf_id=enicdnrltpinf_id+","+model.selected.items[i].data.enicdnrltpinf_id;
		}
	}
	Ext.Msg.confirm('提示','确定删除该行数据？',function(btn){
		if(btn == 'yes'){
			var params = {enicdnrltpinf_id:enicdnrltpinf_id};
			ajaxRequest('../bsEnicdnrltpinfController/delBsEnicdnrltpinf',grid,params,'正在执行删除操作中！请稍后...');
		}
	});
}
/**复制一行并生成记录**/
function copyBsEnicdnrltpinf(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要复制的行！');
		return;
	}
	Ext.Msg.confirm('提示','确定要复制一行并生成记录？',function(btn){
		if(btn == 'yes'){
			var params = {enicdnrltpinf_id:record.items[0].data.enicdnrltpinf_id};
			ajaxRequest('../bsEnicdnrltpinfController/copyBsEnicdnrltpinf',grid,params,'正在执行复制一行并生成记录！请稍后...');
		}
	});
}
/**导出**/
function exportBsEnicdnrltpinf(grid,url){
	exportExcel(grid,url);
}
/**初始化右键**/
function initRight(){
	var contextmenu = new Ext.menu.Menu({
		id:'theContextMenu',
		items:[{
			text:'添 加',
			glyph:0xf016,
			id:'addBsEnicdnrltpinfItem',
			handler:function(){addBsEnicdnrltpinf();}
		},{
			text:'编 辑',
			glyph:0xf044,
			id:'updateBsEnicdnrltpinfItem',
			handler:function(){updateBsEnicdnrltpinf();}
		},{
			text:'删 除',
			glyph:0xf014,
			id:'delBsEnicdnrltpinfItem',
			handler:function(){delBsEnicdnrltpinf();}
		},'-',{
			text:'复制一行并生成记录',
			glyph:0xf0ea,
			id:'copyBsEnicdnrltpinfItem',
			handler:function(){copyBsEnicdnrltpinf();}
		},{
			text:'明 细',
			glyph:0xf03b,
			id:'detailBsEnicdnrltpinfItem',
			handler:function(){detailBsEnicdnrltpinf();}
		},{
			text:'导 出',
			glyph:0xf1c3,
			handler:function(){
				exportBsEnicdnrltpinf(grid,'../bsEnicdnrltpinfController/exportBsEnicdnrltpinf');
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
	initrightgridcontextmenu(grid,contextmenu,['updateBsEnicdnrltpinfItem','delBsEnicdnrltpinfItem','copyBsEnicdnrltpinfItem','detailBsEnicdnrltpinfItem']);
}
/**查询操作**/
function search(){
	initSearch(store,'../bsEnicdnrltpinfController/getBsEnicdnrltpinfListByCondition',searchForm);
}
/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}
