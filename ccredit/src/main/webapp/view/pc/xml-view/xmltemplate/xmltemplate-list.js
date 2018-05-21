var store;
var grid;
var infrectypePBStore = new Ext.data.SimpleStore({
	fields : [ 'value', 'text' ],
	data : [ [ '110', '个人基本信息记录' ], [ '120', '家族关系信息记录' ],
			[ '130', '个人证件有效期信息记录' ], [ '140', '个人证件整合信息记录' ]]
});
var infrectypeJDStore = new Ext.data.SimpleStore({
	fields : [ 'value', 'text' ],
	data : [ [ '210', '个人借贷账户记录' ], [ '215', '个人借贷账户特殊事件说明记录' ],
			[ '220', '个人授信协议信息记录' ]]
});
var infrectypeDBStore = new Ext.data.SimpleStore({
	fields : [ 'value', 'text' ],
	data : [ [ '230', '个人担保账户信息记录' ]]
});
var infrectypeDYStore = new Ext.data.SimpleStore({
	fields : [ 'value', 'text' ],
	data : [ [ '510', '抵质押合同信息记录' ]]
});
var rptdatecodePBStore = new Ext.data.SimpleStore({
	fields : [ 'value', 'text' ],
	data : [ [ '10', '新增客户资料/首次上报' ], [ '20', '更新客户资料' ]]
});
var rptdatecodeJDStore = new Ext.data.SimpleStore({
	fields : [ 'value', 'text' ],
	data : [ [ '10', '新开户' ], [ '20', '账户关闭' ],
	         [ '30', '月度结算' ], [ '31', '月结日首次上报存量账户' ],
	         [ '32', '月结日账户关闭' ], [ '40', '收回逾期款项' ]]
});
var rptdatecodeSXStore = new Ext.data.SimpleStore({
	fields : [ 'value', 'text' ],
	data : [ [ '10', '授信开始' ], [ '20', '授信到期/失效' ],
	         [ '30', '额度调整' ]]
});
var rptdatecodeDBStore = new Ext.data.SimpleStore({
	fields : [ 'value', 'text' ],
	data : [ [ '10', '新开户/首次上报' ], [ '20', '账户关闭' ],
	         [ '30', '在保责任变化' ],[ '40', '五级分类认定日期' ],[ '80', '其他信息发生变化（包括抵（质）押合同信息、相关还款责任人相关信息发生变化）' ]]
});
var rptdatecodeDYStore = new Ext.data.SimpleStore({
	fields : [ 'value', 'text' ],
	data : [ [ '10', '合同生效' ], [ '20', '合同到期/失效' ],
	         [ '80', '抵（质）押物变更' ]]
});

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
			fieldLabel:'模板名称',
			xtype:'textfield',
			labelWidth:70,
			id:'templatename',
			name:'templatename',
			anchor:'50%',
			labelAlign:'top'
		},
		{
			fieldLabel:'所属中类',
			xtype:"combo",
            store:[["01","个人基本信息"],["02","个人借贷信息"],["03","个人担保信息"],["04","抵押借贷信息"]],
            emptyText:"请选择",
            mode:"local",
            triggerAction:"all",
            editable:false,
            name:'middletypecode',
			hiddenName:'middletypecode',
			allowBlank:false,
			anchor:'100%'
		}
		]
	});
	initSearchForm('north',items,false,'left');
	store = getGridJsonStore('../xmltemplateController/getXmltemplateListByCondition',[]);
 
	
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
				header:'模板名称',
				flex:1,
				dataIndex:'templatename'
			},
			{
				header:'模板码',
				flex:1,
				dataIndex:'templatecode'
			},
			{
				header:'所属大类',
				flex:1,
				dataIndex:'bigtypecode',
				renderer:function(value){
					if(value=='1')
						return '个人';
					else
						return '企业';
				}
			},
			{
				header:'所属中类',
				flex:1,
				dataIndex:'middletypecode',
				renderer:function(value){
					if(value=='01')
						return '个人基本信息';
					if(value=='02')
						return '个人借贷信息';
					if(value=='03')
						return '个人担保信息';
					else
						return '抵押借贷信息';
				}
			},
			{
				header:'信息记录类型',
				flex:1,
				dataIndex:'infreptype',
				renderer:function(value){
					if(value=='110')
						return '个人基本信息记录';
					if(value=='120')
						return '家族关系信息记录';
					if(value=='130')
						return '个人证件有效期信息记录';
					if(value=='140')
						return '个人证件整合信息记录';
					if(value=='210')
						return '个人借贷账户记录';
					if(value=='215')
						return '个人借贷账户特殊事件说明记录';
					if(value=='220')
						return '个人授信协议信息记录';
					if(value=='230')
						return '个人担保账户信息记录';
					if(value=='510')
						return '抵质押合同信息记录';
					
				}
			},
			/*{
				header:'报告时点说明',
				flex:1,
				dataIndex:'rptdatecode',
				renderer:function(value,record){
					var middletypecode=record.data['middletypecode'];
					var infreptype=record.data["infreptype"];
					if(middletypecode=='01'){
						if(rptdatecode=='10')
							 return '新增客户资料/首次上报';
						else
							 return '更新客户资料';						
					}else if(middletypecode=='02'){
						if(infreptype=='210'){
							
						}
					}else if(middletypecode=='03'){
						
					}else{
						 
					}
				}
				
			},*/
			{
				header:'状态',
				flex:1,
				dataIndex:'status',
				renderer:function(value){
					if(value=='1')
						return '有效';
					else
						return '无效';
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
					addXmltemplate();
				}
			 },
			 {
				text:'编辑',
				tooltip:'编辑',
				minWidth:tbarBtnMinWidth,
				cls:'updateBtn',
				icon:editIcon,
				handler:function(){
					updateXmltemplate();
				}
			 },
			 {
				text:'删除',
				tooltip:'删除',
				minWidth:tbarBtnMinWidth,
				cls:'delBtn',
				icon:delIcon,
				handler:function(){
					delXmltemplate();
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
			 {
					text:'模板编辑',
					tooltip:'模板编辑',
					minWidth:tbarBtnMinWidth,
					icon:editIcon,
					handler:function(){
						editTemplate();
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
						copyXmltemplate();
					}
				 },
				 {
					text:'明 细',
					tooltip:'明 细',
					glyph:0xf03b,
					handler:function(){
						detailXmltemplate();
					}
				 },
				 '-',
				 {
					text:'导 出',
					tooltip:'导 出',
					glyph:0xf1c3,
					handler:function(){
						exportXmltemplate(grid,'../xmltemplateController/exportXmltemplate');
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
				detailXmltemplate();
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

//模板编辑
 function editTemplate(){
	 var record = grid.getSelectionModel().selected;
		if(record.length == 0){
			msgTishi('请选择要修改的一项！');
			return;
		}
	 var id=record.items[0].data.id;
	 var tfromid="xmltemplateinfo";
 	 var tttTitle = "模板编辑";
 	var src = "../xmlsegmentController/loadXmlsegment";
        src+="?id="+id;
        window.location=src;
        
  /*  var dt1 = nowTimestamp();    
    var p = '<a href="javascript:;" class="active J_menuTab"    data-id="' + src + '">' +tttTitle + ' <i class="fa fa-times-circle"></i></a>';
   // $(".J_menuTab").removeClass("active");
    var n = '<iframe scrolling="auto" class="J_iframe" id="iframe' + tfromid + '"   name="iframe' + tttTitle + '" width="100%" height="100%" src="' + src + '" frameborder="0" data-id="' + src + '" seamless></iframe>';
    //$(".J_mainContent").find("iframe.J_iframe").hide().parents(".J_mainContent").append(n);
    $(".J_mainContent").append(n);
    $(".J_menuTabs .page-tabs-content").append(p);
    
    $(".J_mainContent").trigger("create"); 
    $(".J_menuTabs .page-tabs-content").trigger("create"); */
    

 }

 function nowTimestamp(){
		return new Date().getTime();
	}

/**删除操作**/
function delXmltemplate(){
	var model = grid.getSelectionModel();
	if(model.selected.length == 0){
		msgTishi('请选择后在删除');
		return;
	}
	var id;
	for(var i = 0; i < model.selected.length; i++){
		if(null == id){
			id=model.selected.items[i].data.id;
		}else{
			id=id+","+model.selected.items[i].data.id;
		}
	}
	Ext.Msg.confirm('提示','确定删除该行数据？',function(btn){
		if(btn == 'yes'){
			var params = {id:id};
			ajaxRequest('../xmltemplateController/delXmltemplate',grid,params,'正在执行删除操作中！请稍后...');
		}
	});
}
/**复制一行并生成记录**/
function copyXmltemplate(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要复制的行！');
		return;
	}
	Ext.Msg.confirm('提示','确定要复制一行并生成记录？',function(btn){
		if(btn == 'yes'){
			var params = {id:record.items[0].data.id};
			ajaxRequest('../xmltemplateController/copyXmltemplate',grid,params,'正在执行复制一行并生成记录！请稍后...');
		}
	});
}
/**导出**/
function exportXmltemplate(grid,url){
	exportExcel(grid,url);
}
/**初始化右键**/
function initRight(){
	var contextmenu = new Ext.menu.Menu({
		id:'theContextMenu',
		items:[{
			text:'添 加',
			glyph:0xf016,
			id:'addXmltemplateItem',
			handler:function(){addXmltemplate();}
		},{
			text:'编 辑',
			glyph:0xf044,
			id:'updateXmltemplateItem',
			handler:function(){updateXmltemplate();}
		},{
			text:'删 除',
			glyph:0xf014,
			id:'delXmltemplateItem',
			handler:function(){delXmltemplate();}
		},'-',{
			text:'复制一行并生成记录',
			glyph:0xf0ea,
			id:'copyXmltemplateItem',
			handler:function(){copyXmltemplate();}
		},{
			text:'明 细',
			glyph:0xf03b,
			id:'detailXmltemplateItem',
			handler:function(){detailXmltemplate();}
		},{
			text:'导 出',
			glyph:0xf1c3,
			handler:function(){
				exportXmltemplate(grid,'../xmltemplateController/exportXmltemplate');
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
	initrightgridcontextmenu(grid,contextmenu,['updateXmltemplateItem','delXmltemplateItem','copyXmltemplateItem','detailXmltemplateItem']);
}
/**查询操作**/
function search(){
	initSearch(store,'../xmltemplateController/getXmltemplateListByCondition',searchForm);
}
/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}
