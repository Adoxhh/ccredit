var solrSortWinEdit;
var solrSortFormEdit;
function updateSolrSort(){
	var record = grid.getSelectionModel().selected;
	if(record.length == 0){
		msgTishi('请选择要修改的一项！');
		return;
	}
	initSolrSortFormEdit();
	solrSortWinEdit = Ext.create('Ext.Window',{
		layout:'fit',
		width:800,
		height:400,
		maximizable:true,
		minimizable:true,
		animateTarget:document.body,
		plain:true,
		modal:true,
		title:'编辑信息',
		listeners:{
			minimize:function(win,opts){
				if(!win.collapse()){
					win.collapse();
				}else{
					win.expand();
				}
			}
		},
		items:solrSortFormEdit,
		buttons:[{
			text:'保存',
			itemId:'save',
			handler:function(button){
				submitForm(solrSortFormEdit,'../solrSortController/updateSolrSort',grid,solrSortWinEdit,false,true);
			}
		},{
			text:'关闭',
			itemId:'close',
			handler:function(button){
				button.up('window').close();
			}
		}]
	});
	solrSortWinEdit.show();
	
	loadFormData(solrSortFormEdit,'../solrSortController/getSolrSortById?solr_sort_id='+ record.items[0].data.solr_sort_id);
}
function initSolrSortFormEdit(){
	solrSortFormEdit = Ext.create('Ext.FormPanel',{
		xtype:'form',
		waitMsgTarget:true,
		defaultType:'textfield',
		autoScroll:true,
		fieldDefaults:{
			labelWidth:70,
			labelAlign:'left',
			flex:1,
			margin:'2 5 4 5'
		},
		items:[
		{
			fieldLabel:'主键',
			xtype:'textfield',
			hidden:true,
			name:'solr_sort_id',
			allowBlank:false,
			maxLength:32,
			anchor:'100%'
		},
		{
			fieldLabel:'排序名称',
			xtype:'textfield',
			name:'solr_sort_name',
			maxLength:200,
			anchor:'100%'
		},
		{
			fieldLabel:'排序code',
			xtype:'textfield',
			name:'solr_sort_code',
			maxLength:255,
			anchor:'100%'
		},
		{
			fieldLabel:'选用权重',
			xtype:'numberfield',
			value:'0',
			name:'solr_sort_useboost',
			maxLength:3,
			anchor:'100%'
		},
		{
			fieldLabel:'索引编号',
			xtype:'textfield',
			name:'solr_index_id',
			allowBlank:false,
			maxLength:32,
			hidden:true,
			anchor:'100%'
		},
		{
			fieldLabel:'创建时间',
			xtype:'datefield',
			format:'Y-m-d H:i:s',
			name:'solr_sort_ctime',
			maxLength:19,
			anchor:'100%'
		},
		{
			fieldLabel:'修改时间',
			xtype:'datefield',
			format:'Y-m-d H:i:s',
			name:'solr_sort_mtime',
			maxLength:19,
			anchor:'100%'
		},
		{
			fieldLabel:'操&nbsp;&nbsp;作&nbsp;&nbsp;人',
			xtype:'textfield',
			name:'xt_userinfo_realName',
			maxLength:32,
			anchor:'100%'
		}
		]
	});
}
