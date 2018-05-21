var solrEntityWinEdit;
var solrEntityFormEdit;
function updateSolrEntity(id){
	initSolrEntityFormEdit();
	reGetWidthAndHeight();
	solrEntityWinEdit = Ext.create('Ext.window.Window',{
		width:clientWidth,                    
		height:clientHeight, 
		maximized:true,
		maximizable:true,
		autoScroll:true,
		scrollable:true,
		scrollable:'x',
		scrollable:'y',
		animateTarget:document.body,
		plain:true,
		modal:true,
		title:'编辑实体',
		headerPosition:'left',
		items:solrEntityFormEdit,
		buttons:[{
			text:'保存',
			handler:function(button){
				if(getSolrIndexSqlJSON() == false){
					return;
				}
				if(getSolrIndexSqlFiledJSON() == false){
					return;
				}
				var params = {solrIndexSqlJSON:encodeURI(getSolrIndexSqlJSON()),solrIndexSqlFiledJSON:encodeURI(getSolrIndexSqlFiledJSON())}
				submitFormIncludeParams(solrEntityFormEdit,'../solrEntityController/updateSolrEntity',grid,solrEntityWinEdit,false,true,params);
			}
		},{
			text:'关闭',
			handler:function(button){
				solrEntityWinEdit.close();
			}
		}]
	});
	solrEntityWinEdit.show();
	solr_index_sql_store.load({params:{solr_entity_id:id}});
	solr_index_sql_filed_store.load({params:{solr_entity_id:id}});
	loadFormData(solrEntityFormEdit,'../solrEntityController/getSolrEntityById?solr_entity_id='+ id);
}
function initSolrEntityFormEdit(){
	initSolrIndexGrid();
	initSolrIndexSqlGrid();
	initSolrIndexSqlFiledGrid();
	solrEntityFormEdit = Ext.create('Ext.FormPanel',{
		waitMsgTarget:true,
		defaultType:'textfield',
		fieldDefaults:{
			labelWidth:70,
			labelAlign:'left',
			flex:1,
			margin:'2 5 4 5'
		},
		title:'实体配置',  
		items:[{
			fieldLabel:'文档编号',
			xtype:'textfield',
			name:'solr_document_id',
			id:'solr_document_id',
			allowBlank:false,
			maxLength:200,
			hidden:true,
			width:400
		},
		{
			fieldLabel:'转&nbsp;换&nbsp;&nbsp;器',
			xtype:'textfield',
			name:'solr_entity_transformer',
			id:'solr_entity_transformer',
			maxLength:200,
			hidden:true,
			width:400
		},
		{
			fieldLabel:'实体编号',
			xtype:'textfield',
			hidden:true,
			name:'solr_entity_id',
			allowBlank:false,
			maxLength:200,
			width:400
		},
		{
			fieldLabel:'父级编号',
			xtype:'textfield',
			hidden:true,
			name:'solr_entity_pid',
			allowBlank:false,
			maxLength:200,
			labelAlign:'top',
			width:400
		},
		{
			fieldLabel:'实体名称',
			xtype:'textfield',
			name:'solr_entity_name',
			allowBlank:false,
			maxLength:200,
			width:400
		},
		{
			layout:"column",
			baseCls:'x-plain',
			xtype:'panel',
			items:[{
				//columnWidth:.2,
				fieldLabel:'转&nbsp;换&nbsp;&nbsp;器',
				xtype:'textareafield',
				name:'solr_entity_transformer_text',
				id:'solr_entity_transformer_text',
				readOnly:true,
				maxLength:200,
				width:400
		    },
		    {
		   	 xtype:'button',
		   	 cls:'addBtn',
			 icon:addIcon,
             tooltip:'选择格式转换器',
             margin:'3 0 0 0',
			 handler:function(button){
				initSolrTransformer();
		 	 }
		    },
		 	{
		   	 xtype:'button',
             tooltip:'清空选择',
             cls:'delBtn',
			 icon:delIcon,
             margin:'3 0 0 5',
			 handler:function(button){
				Ext.getCmp('solr_entity_transformer').setValue("");
				Ext.getCmp('solr_entity_transformer_text').setValue("");
			 }
		 	}]
		},
		{
			fieldLabel:'备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注',
			xtype:'textareafield',
			id:'solr_entity_text',
			name:'solr_entity_text',
			maxLength:32,
			width:800
		},
		{
			fieldLabel:'创建时间',
			xtype:'textfield',
			readOnly:true,
			name:'solr_entity_ctime',
			width:400
		},
		{
			fieldLabel:'修改时间',
			xtype:'textfield',
			readOnly:true,
			name:'solr_entity_mtime',
			width:400
		},
		{
			fieldLabel:'操&nbsp;&nbsp;作&nbsp;人',
			xtype:'textfield',
			readOnly:true,
			name:'xt_userinfo_realName',
			width:400
		}
		]
	});
	solrEntityFormEdit.add(solr_index_sql_filed_grid);
	solrEntityFormEdit.add(solr_index_sql_grid);
}
