var xtMenuinfoWinAdd;
var xtMenuinfoFormAdd;
function addXtMenuinfo(){
	initXtMenuinfoFormAdd();
	xtMenuinfoWinAdd =  Ext.create('Ext.Window',{                   
		layout:'fit',                    
		width:800,                    
		height:410, 
		maximizable:true,
		minimizable:true,
		animateTarget:document.body,            
		plain:true,   
		modal:true,                 
		title:'添加菜单',                    
		items:xtMenuinfoFormAdd,        
		listeners:{
			minimize:function(win,opts){
				if(!win.collapse()){
					win.collapse();
				}else{
					win.expand();
				}
			}
		},            
		buttons:[{  
		            text:'保存',  
		            itemId:'save',  
		            handler:function(button){  
		            	submitForm(xtMenuinfoFormAdd,"../xtMenuinfoController/addXtMenuinfo",grid,xtMenuinfoWinAdd,false,true);
		            }  
		        },{  
		            text:'关闭',  
		            itemId:'close',  
		            handler:function(button){  
		                button.up('window').close();  
		            }  
		        }]                
	});
	xtMenuinfoWinAdd.show(); 
}

function initXtMenuinfoFormAdd(){
	/**另一种写法级联即将使用**/
	/**var pcombo = Ext.create("Ext.ux.comboboxtree", {  
        fieldLabel:'上级菜单',
		name:'xt_Menuinfo.xt_menuinfo_parentId',
		anchor:'60%',
	  	allowBlank:false,
	    valueField:'id', 
	    displayField:'text',
	    minPickerHeight:200,
		storeUrl:'../xtMenuinfoController/getXtMenuinfoTree',  
        cascade:'child',//级联方式:1.child子级联;2.parent,父级联,3,both全部级联  
        checkModel:'single',//当json数据为不带checked的数据时只配置为single,带checked配置为double为单选,不配置为多选  
        rootId:'0',  
        rootText:'一级菜单',  
        treeNodeParameter:''
    });  **/
	xtMenuinfoFormAdd = Ext.create('Ext.FormPanel',{
		waitMsgTarget:true,
		defaultType:'textfield',
		fieldDefaults:{
	        labelWidth:70,
	        labelAlign:"left",
	        flex:1,
	        margin:'4 5 4 5'
	    },
		items:[{
				fieldLabel:'菜单标题',
				name:'xt_menuinfo_title',
				anchor:'60%',
			  	allowBlank:false
			  },{
				xtype:'treepicker',
				fieldLabel:'上级菜单',
				displayField:'text',
				anchor:'60%',
				hiddenName:'xt_menuinfo_parentId',
				name:'xt_menuinfo_parentId',
				minPickerHeight:200,
				maxHeight:200,
				editable:false,
				rootVisible:true,
				store:Ext.create('Ext.data.TreeStore',{
					fields:['id','text'],
					root:{
						text:'一级菜单',
						id:'0',
						expanded:true
					},
					proxy:{
						type:'ajax',
						url:'../xtMenuinfoController/getXtMenuinfoTree',
						reader:{
							type:'json'
						}
					}
				})
			  },{  
			    fieldLabel:"下级菜单",
	            name:"xt_menuinfo_leaf",
	            hiddenName:'xt_menuinfo_leaf',
	            xtype:"combo",
	            anchor:'60%',
	            store:[["-1","请选择"],["0","是"],["1","否"]],
	            emptyText:"请选择",
	            mode:"local",
	            triggerAction:"all",
	            editable:false
	          },/*{
				fieldLabel:'菜单图标',
			   	xtype:'textfield',
			   	hidden:true,
			   	id:'xt_menuinfo_images',
			   	name:'xt_menuinfo_images',
			   	itemId:'xt_menuinfo_images',
			   	allowBlank:true
			  },{
				layout:"table",
				border:false,
				xtype:'form',
				anchor:'50%',
				items:[{
						xtype:'label',
				        text:'菜单图标:',
				        margin:'0 0 0 5'
					   },
					   {
						xtype:'button',
						text:'选择图标',
						margin:'0 0 0 10',
						id:'selectBtn',
						handler:function(){ 
							img_select(); 
			            } 
				}]
		     },*/{
		   		fieldLabel:'字体图标',
			   	anchor:'60%',
			   	name:'xt_menuinfo_iconCls'
		     },{  
			    fieldLabel:"平台菜单",
	            name:"xt_menuinfo_sys",
	            hiddenName:'xt_menuinfo_sys',
	            xtype:"combo",
	            anchor:'60%',
	            store:[["1","是"],["0","否"]],
	            emptyText:"请选择",
	            mode:"local",
	            triggerAction:"all",
	            value:'0',
	            editable:false
	          },{
			   	fieldLabel:'URL&nbsp;地址',
			   	anchor:'100%',
			   	name:'xt_menuinfo_url'
		     },{	
		    	fieldLabel:'排序编号',
			   	anchor:'40%',
			   	xtype:'numberfield',
			   	name:'xt_menuinfo_sort'
		     },{
		     	fieldLabel:"菜单状态",
	            name:"xt_menuinfo_status",
	            hiddenName:'xt_menuinfo_status',
	            xtype:"combo",
	            anchor:'60%',
	            store:[["1","禁用"],["0","可用"]],
	            emptyText:"请选择",
	            mode:"local",
	            triggerAction:"all",
	            value:'0',
	            editable:false
		     }]		
		 });
}