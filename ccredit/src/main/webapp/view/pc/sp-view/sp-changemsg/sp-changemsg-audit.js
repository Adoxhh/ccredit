var store;
var grid;
var INFRECTYPECHG;
var MDFCSGMTCODECODE1;
Ext.onReady(function(){
	INFRECTYPECHG = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=INFRECTYPECHG",
   reader:new Ext.data.JsonReader({
    root:'items',
    type:'json'
   })
  }),
  fields:['value', 'text'],
  autoLoad:true 
 });
	MDFCSGMTCODECODE1 = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=MDFCSGMTCODECODE1",
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
			store:INFRECTYPECHG,
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
	store = getGridJsonStore('../spChangemsgController/getAuditSpChangemsgListByCondition',[]);
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
				header:'信息记录类型',
				flex:1,
				dataIndex:'infrectypetext'
			},
			{
				header:'业务标识',
				flex:1,
				dataIndex:'odbnescode'
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
			}
		],
		tbar:[{
			text : '查看详情',
			tooltip : '查看详情',
			minWidth : tbarBtnMinWidth,
			cls : 'detailIcon',
			icon : detailIcon,
			handler : function() {
				detailSpChangemsg();
			}
		},
		{
			text : '审批',
			tooltip : '审批',
			minWidth : tbarBtnMinWidth,
			cls : 'updateBtn',
			icon : editIcon,
			handler : function() {
				auditSpChangemsg();
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
			 }
		],
		bbar:getGridBBar(store),
		listeners:{
			'rowdblclick':function(grid, rowIndex, e){
				detailSpChangemsg();
			}
		}
	});
	Ext.create('Ext.Viewport',{
		layout:'border',
		xtype:'viewport',
		items:[searchForm,grid]
	});
	
	store.on('beforeload',function(thiz, options){Ext.apply(thiz.proxy.extraParams,getParmas(store,searchForm));});
});

//审批
function auditSpChangemsg(){
	var model = grid.getSelectionModel();
	if (model.selected.length == 0) {
		msgTishi('请选择后在删除');
		return;
	}
	if(model.selected.length > 1){
		msgTishi('只能选择一条数据');
		return;
	}
	var id=model.selected.items[0].data.changemsg_id;
	var isAgree;
	Ext.Msg.confirm('请确认', '您同意上报吗？', function(btn) {
		if (btn == 'yes') {			
			isAgree="T";  
		}else{
			isAgree="F"; 
		}
		var params = {
				id : id,
				isAgree:isAgree
			};
		ajaxRequest('../spChangemsgController/auditSpChangemsg', grid, params,
		'正在执行审批操作中！请稍后...');
	}); 
}
/**查询操作**/
function search(){
	initSearch(store,'../spChangemsgController/getAuditSpChangemsgListByCondition',searchForm);
}
/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}
