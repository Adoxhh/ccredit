Ext.namespace("com.common.reccode");

com.common.reccode= function(infrectype,reccodeField){ 
	var  store = getGridJsonStore('../spChangemsgController/getRecCode?infrectype='+infrectype,[]);
	var	grid = Ext.create('Ext.grid.Panel',{
			region:'center',
			xtype:'panel',
			store:store,
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
					header:'业务标识',
					flex:1,
					dataIndex:'code'
				},
				{
					header:'名称',
					flex:1,
					dataIndex:'name'
				},
				{
					header:'身份标识类型',
					flex:1,
					dataIndex:'idtype'
				},
				{
					header:'身份标识号码',
					flex:1,
					dataIndex:'idnum'
			   }
			],
			tbar:[
				 {
					text:'选择',
					tooltip:'选择',
					cls:'addBtn',
					icon:addIcon,
					handler:function(){
						selectSpChangemsg();
					}
				 }
			],
			bbar:getGridBBar(store),
			listeners:{
				'rowdblclick':function(grid, rowIndex, e){
				    var record = grid.getSelectionModel().getLastSelected();
			        if(reccodeField!= undefined && reccodeField!=''){
			        	reccodeField.setValue(record.get('code'));
			        }
			        reccodeWindow.close();
				}
			}
		});

function selectSpChangemsg(){
	 var record = grid.getSelectionModel().getLastSelected();
     if(reccodeField!= undefined && reccodeField!=''){
     	reccodeField.setValue(record.get('code'));
     }
     reccodeWindow.close();
}
var reccodeWindow = new Ext.Window({
		layout : 'fit',
		width : 1000,   
		autoHeight : true,
		resizable : false,
		autoScroll:true,
		draggable : true,
		closeAction : 'hide',
		modal : true,
		title : '<span class="commoncss">选择业务标识</span>',
		collapsible : true,
		titleCollapse : true,
		maximizable : false,
		buttonAlign : 'right',
		border : false,
		animCollapse : true,
		items:grid,
		animateTarget : Ext.getBody(),
		buttons : [ {
			text : '关闭',
			icon:clearSearchIcon,
			handler : function() {
				reccodeWindow.hide();
			}
		}],
		constrainHeader:true
	});

   reccodeWindow.show();

}