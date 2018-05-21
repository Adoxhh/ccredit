var store;
var grid;
var SENDMSGSTATUS;
Ext.onReady(function(){
	SENDMSGSTATUS = new Ext.data.Store({
  proxy:new Ext.data.HttpProxy({ 
   url:"../xtCommonController/getXtDataDictionary?ckey=SENDMSGSTATUS",
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
			fieldLabel:'异议申请人',
			xtype:'textfield',
			labelWidth:70,
			id:'applyperson',
			name:'applyperson',
			anchor:'50%',
			labelAlign:'top'
		}
		]
	});
	initSearchForm('north',items,false,'left');
	store = getGridJsonStore('../spObjectionmsgController/getAuditSpObjectionmsgListByCondition',[]);
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
				header:'异议申请机构',
				flex:1,
				dataIndex:'applydept'
			},
			{
				header:'异议发起人',
				flex:1,
				dataIndex:'regperson'
			},
			{
				header:'申请主题',
				flex:1,
				dataIndex:'theme'
			},
			{
				header:'异议申请时间',
				flex:1,
				dataIndex:'applytimetext'
			},
			{
				header:'异议申请人',
				flex:1,
				dataIndex:'applyperson'
			},
			{
				header:'申请人联系方式',
				flex:1,
				dataIndex:'applyphone'
			},
			{
				header:'异议事项描述',
				flex:1,
				dataIndex:'description'
			},
			{
				header:'状态',
				flex:1,
				dataIndex:'statustext'
			}
		],
		tbar:[{
			text : '查看详情',
			tooltip : '查看详情',
			minWidth : tbarBtnMinWidth,
			cls : 'detailIcon',
			icon : detailIcon,
			handler : function() {
				detailSpObjectionmsg();
			}
		},
		{
			text : '审批',
			tooltip : '审批',
			minWidth : tbarBtnMinWidth,
			cls : 'updateBtn',
			icon : editIcon,
			handler : function() {
				auditSpObjectionmsg();
			}
		},

			 {
				text:'删除',
				tooltip:'删除',
				minWidth:tbarBtnMinWidth,
				cls:'delBtn',
				icon:delIcon,
				handler:function(){
					delSpObjectionmsg();
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
				detailSpObjectionmsg();
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
function auditSpObjectionmsg(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要审批的项！');
		return;
	}else if(record.length > 1){
		msgTishi('只能选择一项进行审批！');
		return;
	}

 	var selected=record.items[0].data.objectionmsg_id
	var isAgree;
	Ext.Msg.confirm('请确认', '您同意上报吗？', function(btn) {
		if (btn == 'yes') {			
			isAgree="T";  
		}else{
			isAgree="F"; 
		}
		var params = {
				id : selected,
				isAgree:isAgree
			};
		ajaxRequest('../spObjectionmsgController/auditSpObjectionmsg', grid, params,
		'正在执行审批操作中！请稍后...');
	}); 
}
/**查询操作**/
function search(){
	initSearch(store,'../spObjectionmsgController/getAuditSpObjectionmsgListByCondition',searchForm);
}
/**日期格式化**/
function dateformat(data){
	if(null != data){
		var date = new Date(data.time);
		return date.format("yyyy-MM-dd");
	}
	return "";
}
