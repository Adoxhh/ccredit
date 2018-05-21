var nodestore;
var nodegrid;

	
	nodestore = getGridJsonStore('../xmlnodeController/getXmlnodeListByCondition',[]);
	

	 // 表格实例
	nodegrid = new Ext.grid.GridPanel({
				region : 'center', // 和VIEWPORT布局模型对应，充当center区域布局
				margins : '3 3 3 3',
				autoScroll : true,
				height:700,
				frame : true,
				columnLines:true,
				selType:'cellmodel',
				//multiSelect:true,
				selType:'checkboxmodel',
				store : nodestore, // 数据存储
				stripeRows : true, // 斑马线
				columns:[
							{
								header:'编号',
								flex:1,
								dataIndex:'nodeid'
							},
							{
								header:'节点名称',
								flex:1,
								dataIndex:'nodename'
							},
							{
								header:'节点码',
								flex:1,
								dataIndex:'nodecode'
							},
							{
								header:'父节点编号',
								flex:1,
								dataIndex:'parentid'
							},
							{
								header:'排序',
								flex:1,
								dataIndex:'sortno'
							},
							{
								header:'信息段编号',
								flex:1,
								dataIndex:'segmentid'
							},
							{
								header:'备注',
								flex:1,
								dataIndex:'remark'
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
									addXmlnode();
								}
							 },
							 {
								text:'编辑',
								tooltip:'编辑',
								minWidth:tbarBtnMinWidth,
								cls:'updateBtn',
								icon:editIcon,
								handler:function(){
									updateXmlnode();
								}
							 },
							 {
								text:'删除',
								tooltip:'删除',
								minWidth:tbarBtnMinWidth,
								cls:'delBtn',
								icon:delIcon,
								handler:function(){
									delXmlnode();
								}
							 },
							 new Ext.form.TextField({
									id : 'queryParam',
									name : 'queryParam',
									emptyText : '请输入节点名称',
									enableKeyEvents : true,
									listeners : {
										specialkey : function(field, e) {
											if (e.getKey() == Ext.EventObject.ENTER) {
												search();
											}
										}
									},
									width : 130
								}),
							 {
								text:'检索',
								minWidth:tbarBtnMinWidth,
								cls:'searchBtn',
								icon:searchIcon,
								handler:function(){
									search();
								}
							 }
						],
						//bbar:getGridBBar(nodestore),
						listeners:{
							'rowdblclick':function(grid, rowIndex, e){
								detailXmlnode();
							}
						}
			});

	/**调用右键**/
	initRight();
	nodestore.on('beforeload',function(thiz, options){Ext.apply(thiz.proxy.extraParams,getParmas(nodestore));});

/**删除操作**/
function delXmlnode(){
	var model = nodegrid.getSelectionModel();
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
			ajaxRequest('../xmlnodeController/delXmlnode',nodegrid,params,'正在执行删除操作中！请稍后...');
		}
	});
}
/**复制一行并生成记录**/
function copyXmlnode(){
	var record = nodegrid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要复制的行！');
		return;
	}
	Ext.Msg.confirm('提示','确定要复制一行并生成记录？',function(btn){
		if(btn == 'yes'){
			var params = {id:record.items[0].data.id};
			ajaxRequest('../xmlnodeController/copyXmlnode',nodegrid,params,'正在执行复制一行并生成记录！请稍后...');
		}
	});
}
/**导出**/
function exportXmlnode(grid,url){
	exportExcel(grid,url);
}
/**初始化右键**/
function initRight(){
	var contextmenu = new Ext.menu.Menu({
		id:'theContextMenu',
		items:[{
			text:'添 加',
			glyph:0xf016,
			id:'addXmlnodeItem',
			handler:function(){addXmlnode();}
		},{
			text:'编 辑',
			glyph:0xf044,
			id:'updateXmlnodeItem',
			handler:function(){updateXmlnode();}
		},{
			text:'删 除',
			glyph:0xf014,
			id:'delXmlnodeItem',
			handler:function(){delXmlnode();}
		},'-',{
			text:'复制一行并生成记录',
			glyph:0xf0ea,
			id:'copyXmlnodeItem',
			handler:function(){copyXmlnode();}
		},{
			text:'明 细',
			glyph:0xf03b,
			id:'detailXmlnodeItem',
			handler:function(){detailXmlnode();}
		},{
			text:'导 出',
			glyph:0xf1c3,
			handler:function(){
				exportXmlnode(nodegrid,'../xmlnodeController/exportXmlnode');
			}
		},{
			text:'打 印',
			glyph:0xf02f,
			handler:function(){printerGrid(nodegrid);}
		},'-',{
			text:'全 选',
			glyph:0xf046,
			handler:function(){selectAll(nodegrid);}
		},{
			text:'反 选',
			glyph:0xf096,
			handler:function(){unSelectAll(nodegrid);}
		},'-',{
			text:'刷 新',
			glyph:0xf021,
			handler:function(){refreshGrid(nodegrid);}
		}]
	});
	initrightgridcontextmenu(nodegrid,contextmenu,['updateXmlnodeItem','delXmlnodeItem','copyXmlnodeItem','detailXmlnodeItem']);
}
/**查询操作**/
function search(){
	//initSearch(nodestore,'../xmlnodeController/getXmlnodeListByCondition',searchForm);
	var record = segmentgrid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择信息段');
		return;
	}
	var segmentid=record.items[0].data.id;	
	nodestore.load({
			url:'../xmlnodeController/getXmlnodeListByCondition',
			method:'post',
			params:{
				segmentid:segmentid,
				nodename:Ext.getCmp('queryParam').getValue()
			}
		});
	
	
}
/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}
