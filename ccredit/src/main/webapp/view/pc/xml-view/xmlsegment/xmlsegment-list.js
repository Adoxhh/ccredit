var segmentstore;
var segmentgrid;
var templateid;
Ext.onReady(function(){
	templateid=document.getElementById("templateid").value;
	segmentstore = getGridJsonStore('../xmlsegmentController/getXmlsegmentListByCondition?templateid='+templateid,[]);
	
    // 表格实例
	segmentgrid = new Ext.grid.GridPanel({
				region : 'west', // 和VIEWPORT布局模型对应，充当center区域布局
				margins : '3 3 3 3',
				autoScroll : true,
				height:700,
				frame : true,
				//selType:'cellmodel',
				//multiSelect:true,
				selType:'checkboxmodel',
				store : segmentstore, // 数据存储
				stripeRows : true, // 斑马线
				columns:[
							{
								header:'信息段名称 ',
								flex:1,
								dataIndex:'segmentname'
						    },
				 	       {
				 			header : 'id',
				 			dataIndex : 'id',
				 			hidden:true,
				 			flex:1    				
				 			}
						],
				tbar : [
						 {
								text:'添加',
								tooltip:'添加',
								minWidth:tbarBtnMinWidth,
								cls:'addBtn',
								icon:addIcon,
								handler:function(){
									addXmlsegment();
								}
							 },
							 {
								text:'编辑',
								tooltip:'编辑',
								minWidth:tbarBtnMinWidth,
								cls:'updateBtn',
								icon:editIcon,
								handler:function(){
									updateXmlsegment();
								}
							 },
							 {
								text:'删除',
								tooltip:'删除',
								minWidth:tbarBtnMinWidth,
								cls:'delBtn',
								icon:delIcon,
								handler:function(){
									delXmlsegment();
								}
							 }
						], // 表格工具栏
				viewConfig : {
	// 不产横向生滚动条, 各列自动扩展自动压缩, 适用于列数比较少的情况
				 forceFit : true
				},
				loadMask : {
					msg : '正在加载表格数据,请稍等...'
				}			
			});

	segmentgrid.on('rowdblclick', function(grid, rowIndex, event) {
		detailXmlsegment();
       });
	segmentgrid.on('rowclick', function(grid, rowIndex, event) {
		var record = grid.getSelectionModel().selected;
		var segmentid=record.items[0].data.id;	
		nodestore.load({
			url:'../xmlnodeController/getXmlnodeListByCondition',
			method:'post',
			params:{
				segmentid:segmentid
			}
		});
	});
	 var viewport = new Ext.Viewport({
			layout : 'border',
			items : [{
						title : '<span class="commoncss">信息段菜单</span>',
						iconCls : 'layout_contentIcon',
						tools : [{
									id : 'refresh',
									handler : function() {
										xmlsegmentstore.reload();
									}
								}],
						width : 250,
						region : 'west',
						margins : '3 3 3 3',
						items : [segmentgrid]
					}, {
						title : '<span class="commoncss">数据项</span>',
						region : 'center',
						layout : 'fit',
						border : false,
						margins : '3 3 3 3',
						items : [nodegrid]
					},
					 {						
						region : 'south',
						layout : 'fit',
						border : true,
						height:'100px',
						buttonAlign:'center',
						buttons : [{
							text:'返回',
							itemId:'close',
							region : 'center',
							handler:function(){
								window.location="../xmltemplateController/loadXmltemplate";
							}
						}]
					}]
		});
	/**调用右键**/
	initRight();
	segmentstore.on('beforeload',function(thiz, options){Ext.apply(thiz.proxy.extraParams,getParmas(segmentstore));});
});
/**删除操作**/
function delXmlsegment(){
	var model = segmentgrid.getSelectionModel();
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
			ajaxRequest('../xmlsegmentController/delXmlsegment',segmentgrid,params,'正在执行删除操作中！请稍后...');
		}
	});
}
/**复制一行并生成记录**/
function copyXmlsegment(){
	var record = segmentgrid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要复制的行！');
		return;
	}
	Ext.Msg.confirm('提示','确定要复制一行并生成记录？',function(btn){
		if(btn == 'yes'){
			var params = {id:record.items[0].data.id};
			ajaxRequest('../xmlsegmentController/copyXmlsegment',segmentgrid,params,'正在执行复制一行并生成记录！请稍后...');
		}
	});
}
/**导出**/
function exportXmlsegment(grid,url){
	exportExcel(grid,url);
}
/**初始化右键**/
function initRight(){
	var contextmenu = new Ext.menu.Menu({
		id:'theContextMenu',
		items:[{
			text:'添 加',
			glyph:0xf016,
			id:'addXmlsegmentItem',
			handler:function(){addXmlsegment();}
		},{
			text:'编 辑',
			glyph:0xf044,
			id:'updateXmlsegmentItem',
			handler:function(){updateXmlsegment();}
		},{
			text:'删 除',
			glyph:0xf014,
			id:'delXmlsegmentItem',
			handler:function(){delXmlsegment();}
		},'-',{
			text:'复制一行并生成记录',
			glyph:0xf0ea,
			id:'copyXmlsegmentItem',
			handler:function(){copyXmlsegment();}
		},{
			text:'明 细',
			glyph:0xf03b,
			id:'detailXmlsegmentItem',
			handler:function(){detailXmlsegment();}
		},{
			text:'导 出',
			glyph:0xf1c3,
			handler:function(){
				exportXmlsegment(segmentgrid,'../xmlsegmentController/exportXmlsegment');
			}
		},{
			text:'打 印',
			glyph:0xf02f,
			handler:function(){printerGrid(segmentgrid);}
		},'-',{
			text:'全 选',
			glyph:0xf046,
			handler:function(){selectAll(segmentgrid);}
		},{
			text:'反 选',
			glyph:0xf096,
			handler:function(){unSelectAll(segmentgrid);}
		},'-',{
			text:'刷 新',
			glyph:0xf021,
			handler:function(){refreshGrid(segmentgrid);}
		}]
	});
	initrightgridcontextmenu(segmentgrid,contextmenu,['updateXmlsegmentItem','delXmlsegmentItem','copyXmlsegmentItem','detailXmlsegmentItem']);
}

/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}
