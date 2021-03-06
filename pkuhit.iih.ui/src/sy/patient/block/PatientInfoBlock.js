Ext.define('iih.sy.patient.block.PatientInfoBlock',{
	extend : 'Xap.ej.block.FormBlock',
	requires: [
		   		'Xap.ej.element.field.ComboBox',
		   		'Xap.ej.element.field.Checkbox',
		   		'Xap.ej.element.field.DateField',
		   		'Xap.ej.element.field.ComboBoxGrid',
				'Xap.ej.element.form.Form'
		   	],

	alias:'widget.patientinfoblock',
	
	layout: {
		type: 'table',
		columns: 12,
		tableAttrs: {
            border: 0,
            cellpadding: 0,
            cellspacing: 1
        },
        tdAttrs: {
            valign: 'left',
            buttonAlign:'center'
        }
	},
	items: [{
				header : '创建人ID',
				name : 'crtUserId',
				field : 'textfield',
				type : 'string',
				hidden : true
			},{
				header : '创建人科室ID',
				name : 'crtDeptCd',
				field : 'textfield',
				type : 'string',
				hidden : true
			},{
				header : '最后更新人ID',
				name : 'crtDeptCd',
				field : 'textfield',
				type : 'string',
				hidden : true
			},{
				header : '最后更新人科室ID',
				name : 'lastUpdDeptCd',
				field : 'textfield',
				type : 'string',
				hidden : true
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'10 0 0 5',
		        labelWidth:70,
		        fieldLabel:'X片号',
		        width:200,
		        //id:'xpianNo',
		        name:'xpianNo'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'10 0 0 5',
		        labelWidth:60,
		        fieldLabel:'住院号<font color=red>*</font>',
		        allowBlank:false,
		        blankText : '不能为空',
		        width:230,
		        //id:'inpatientNo',
		        name:'inpatientNo'
			},{
				xtype:'xapdatefield',
				colspan: 2,
				padding:'5 0 0 5',
		        labelWidth:60,
		        fieldLabel:'入院日期<font color=red>*</font>',
		        allowBlank:false,
		        blankText : '不能为空',
		        width:186,
		        name:'admissionDate',
		        listeners: {
					change: function( v, newValue, oldValue, eOpts ) {
						var startDate = this.up('panel').down('xapdatefield[name=admissionDate]');
						startDate.setMaxValue( this.getValue( ) );
					}
				}
			},{
				xtype:'xaptextfield',
				colspan: 4,
				padding:'5 0 0 5',
		        labelWidth:100,
		        fieldLabel:'入院诊断<font color=red>*</font>',
		        allowBlank:false,
		        blankText : '不能为空',
		        width:230,
		        name:'diagnosis'
			},{
				xtype:'xaptextfield',
				colspan: 2,
				padding:'5 0 0 5',
		        labelWidth:70,
		        fieldLabel:'姓名<font color=red>*</font>',
		        allowBlank:false,
		        blankText : '不能为空',
		        width:200,
		        name:'patientName'
			},{
	        	xtype:'xapcombobox',
		        name:'sex',
	            fieldLabel:'性别<font color=red>*</font>',
	            padding:'5 0 0 5',
	            colspan: 2,
	            width:150,
	            labelWidth:50,
	            labelAlign:'right',
	            comboData : [
	    			 {"code":'1', "value":"男"},
	                 {"code":'0', "value":"女"},
	                 {"code":'-1', "value":"未知性别"}
	            ],
	            displayField: 'value',
	            valueField: 'code',
		        allowBlank:false,
		        blankText : '不能为空',
	            editable:false,
	            value:''
			},{
				xtype:'xaptextfield',
				colspan: 2,
				padding:'5 0 0 5',
		        labelWidth:40,
		        width:140,
		        name:'parentName',
		        fieldLabel:'父母名'
			},{
				xtype:'xaptextfield',
				colspan: 2,
				padding:'5 0 0 5',
		        labelWidth:60,
		        width:186,
//		        id:'age',
		        name:'age',
		        allowBlank:false,
		        blankText : '不能为空',
	            editable:false,
		        fieldLabel:'年龄<font color=red>*</font>'
			},{
				xtype:'xaptextfield',
				colspan: 4,
				padding:'5 0 0 5',
		        labelWidth:100,
		        width:230,
		        name:'nation',
		        fieldLabel:'民族'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:70,
		        fieldLabel:'胎次',
		        width:200,
		        name:'parity'
			},{
	        	xtype:'xapcombobox',
	            name:'marriage',
	            fieldLabel:'婚姻',
				padding:'5 20 0 5',
	            colspan: 3,
		        labelWidth:60,
		        //name:'marriage',
		        width:230,
	            labelAlign:'right',
	            comboData : [
	    			 {"code":'1', "value":"已婚"},
	                 {"code":'0', "value":"未婚"}
	            ],
	            displayField: 'value',
	            valueField: 'code',
	            allowBlank:true,
	            editable:false,
	            value:''
			},{
				xtype:'xaptextfield',
				colspan: 2,
				padding:'5 0 0 5',
		        labelWidth:60,
		        width:186,
		        name:'occupation',
		        labelAlign:'right',
		        fieldLabel:'职业'
			},{
				xtype:'xaptextfield',
				colspan: 4,
				padding:'5 0 0 5',
		        labelWidth:100,
		        width:230,
		        name:'education',
		        fieldLabel:'文化程度'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:70,
		        fieldLabel:'发病年龄',
		        width:200,
		        name:'onsetAge'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:60,
		        fieldLabel:'病因',
		        width:230,
		        name:'pathogeny'
			},{
				xtype:'xaptextfield',
				colspan: 2,
				padding:'5 0 0 5',
		        labelWidth:60,
		        labelAlign:'right',
		        fieldLabel:'家族史',
		        width:186,
		        name:'familyHistory'
			},{
				xtype:'xaptextfield',
				colspan: 4,
				padding:'5 0 0 5',
		        labelWidth:100,
		        fieldLabel:'供史者',
		        width:230,
		        name:'provider'
			},{
				xtype:'xaptextfield',
				colspan: 6,
				padding:'5 0 0 5',
		        labelWidth:70,
		        fieldLabel:'病史',
		        width:525,
		        name:'medicalHistory'
			},{
				xtype:'xaptextfield',
				colspan: 6,
				padding:'5 0 0 5',
		        labelWidth:60,
		        fieldLabel:'治疗史',
		        width:440,
		        name:'treatmentHistory'
			},{
				xtype:'xaptextfield',
				colspan: 12,
				padding:'5 20 0 5',
		        labelWidth:70,
		        width:1004,
		        name:'lumbarSurgeryHistory',
		        fieldLabel:'腰部手术史'
			},{
				xtype:'xaptextfield',
				colspan: 12,
				padding:'5 20 0 5',
		        labelWidth:70,
		        width:1004,
		        name:'orthopedicSurgeryHistory',
		        fieldLabel:'矫形手术史'
			},{
				xtype:'xaptextfield',
				colspan: 12,
				padding:'5 20 0 5',
		        labelWidth:70,
		        width:1004,
		        name:'adress',
		        allowBlank:false,
		        blankText : '不能为空',
		        fieldLabel:'联系地址<font color=red>*</font>'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 20 0 5',
		        labelWidth:70,
		        width:200,
		        name:'tel',
		        fieldLabel:'手机号码'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 20 0 5',
				width:230,
		        name:'otherContact',
		        labelWidth:100,
		        fieldLabel:'QQ/微信/E-mail'
			},{
				xtype:'xapcheckbox',
				colspan: 3,
				padding:'5 20 0 5',
		        labelWidth:60,
		        labelAlign:'right',
		        fieldLabel:'照相',
		        width:150,
		        name:'isPic',
		        displayField: 'isPic'
			},{
				xtype:'xapcheckbox',
				colspan: 3,
				padding:'5 20 0 5',
		        labelWidth:100,
		        labelAlign:'right',
		        fieldLabel:'录像',
		        width:150,
		        name:'isVideo',
		        displayField: 'isVideo'
			},/*{
				xtype: 'xapdisplayfield',
				fieldLabel: '',
				colspan:8,
				name:'',
				value: ''
			},*/
			{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:70,
		        fieldLabel:'体检',
		        width:200,
		        name:'physicalExam'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:60,
		        fieldLabel:'发育',
		        width:230,
		        name:'growth'
			},{
				xtype:'xaptextfield',
				colspan: 2,
				padding:'5 0 0 5',
		        labelWidth:60,
		        labelAlign:'right',
		        fieldLabel:'营养',
		        width:186,
		        name:'nutrition'
			},{
				xtype:'xaptextfield',
				colspan: 4,
				padding:'5 0 0 5',
		        labelWidth:100,
		        fieldLabel:'身高',
		        width:230,
		        name:'height'
			},
			
			{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:70,
		        fieldLabel:'体重',
		        width:200,
		        name:'weight'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:60,
		        fieldLabel:'专科检查',
		        width:230,
		        name:'specialityExam'
			},{
				xtype:'xaptextfield',
				colspan: 4,
				padding:'5 0 0 5',
		        labelWidth:60,
		        fieldLabel:'智力',
		        width:186,
		        name:'intelligence'
			},
			{
				xtype:'xapdisplayfield',
				colspan: 2,
				padding:'5 0 0 5',
		        labelWidth:60,
		        labelAlign:'right',
		        fieldLabel:'',
		        width:186,
		        name:''
			},
			{
				xtype:'xaptextfield',
				colspan: 12,
				padding:'5 0 0 5',
		        labelWidth:60,
		        labelAlign:'right',
		        fieldLabel:'X光片',
		        width:186,
		        name:'xRay',
		        hidden:true
			},
			{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:70,
		        fieldLabel:'步态',
		        width:200,
		        name:'gait',
		        hidden:true
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:60,
		        fieldLabel:'行走距离',
		        width:230,
		        name:'walkingDistance',
		        hidden:true
			},{
				xtype:'xaptextfield',
				colspan: 2,
				padding:'5 0 0 5',
		        labelWidth:80,
		        labelAlign:'right',
		        fieldLabel:'行走功能指数',
		        width:186,
		        name:'cardiacFunction',
		        hidden:true
			},{
				xtype:'xaptextfield',
				colspan: 4,
				padding:'5 0 0 5',
		        labelWidth:100,
		        fieldLabel:'疼痛部位',
		        width:230,
		        name:'pain',
		        hidden:true
			},
			
			/*
			
			
			
			
			
			
			
			{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 20 0 5',
		        labelWidth:70,
		        fieldLabel:'体检',
		        width:200,
		        name:'physicalExam'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 10 0 5',
		        labelWidth:60,
		        fieldLabel:'发育',
		        width:200,
		        name:'growth'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 20 0 5',
		        labelWidth:40,
		        fieldLabel:'营养',
		        width:200,
		        name:'nutrition'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:60,
		        fieldLabel:'身高',
		        width:200,
		        name:'height'
			},*//*{
				xtype: 'xapdisplayfield',
				fieldLabel:'',
				colspan:1,
				width:5,
				valueAlign:'left',
				name:'HighUnit',
				value: 'cm'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:50,
		        fieldLabel:'体重',
		        width:150,
		        name:'weight'
			},{
				xtype: 'xapdisplayfield',
				fieldLabel: '',
				colspan:1,
				width:10,
				valign: 'left',
				name:'',
				value: 'kg'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 20 0 5',
		        labelWidth:60,
		        fieldLabel:'专科检查',
		        width:150,
		        name:'specialityExam',
		        displayField: 'parentName'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 20 0 5',
		        labelWidth:50,
		        fieldLabel:'X光片',
		        width:140,
		        name:'xRay'
			},{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:60,
		        width:150,
		        name:'intelligence',
		        labelAlign:'right',
		        fieldLabel:'智力'
			},*/{
				xtype:'xaptextfield',
				colspan: 12,
				padding:'5 0 0 5',
		        labelWidth:70,
		        fieldLabel:'治疗方案',
		        width:1004,
		        name:'treatmentPlan',
		        hidden:true
			},/*{
	        	xtype:'xaptextfield',
	            name:'gait',
	            fieldLabel:'步态',
				padding:'5 20 0 5',
	            colspan: 2,
		        labelWidth:70,
		        width:150,
	            labelAlign:'right'
			},{
				xtype:'xaptextfield',
				colspan: 2,
				padding:'5 10 0 5',
		        labelWidth:60,
		        width:150,
		        name:'walkingDistance',
		        labelAlign:'right',
		        fieldLabel:'行走距离'
			},{
				xtype:'xaptextfield',
				colspan: 2,
				padding:'5 20 0 5',
		        labelWidth:40,
		        width:140,
		        name:'cardiacFunction',
		        fieldLabel:'行走功能指数'
			},{
				xtype:'xaptextfield',
				colspan: 2,
				padding:'5 0 0 0',
		        labelWidth:60,
		        fieldLabel:'疼痛部位',
		        width:150,
		        name:'pain'
			},{
				xtype: 'xapdisplayfield',
				fieldLabel:'',
				colspan:1,
				width:5,
				valueAlign:'left',
				name:'',
				value: ''
			},*/
			/*{
				xtype: 'xapdisplayfield',
				fieldLabel:'',
				colspan:1,
				width:5,
				valueAlign:'left',
				name:'',
				value: ''
			},*/{
				xtype:'xaptextfield',
				colspan: 3,
				padding:'5 0 0 5',
		        labelWidth:70,
		        fieldLabel:'内固定',
		        width:200,
		        name:'internalFixation',
		        hidden:true
			},{
	        	xtype:'xaptextfield',
	            name:'ring',
	            fieldLabel:'环式外固定',
				padding:'5 20 0 5',
	            colspan: 3,
		        labelWidth:70,
		        width:230,
	            labelAlign:'right',
	            hidden:true
			},{
				xtype:'xaptextfield',
				colspan: 2,
				padding:'5 0 0 5',
		        labelWidth:80,
		        width:186,
		        name:'combined',
		        labelAlign:'right',
		        fieldLabel:'组合式外固定',
		        hidden:true
			},{
				xtype:'xaptextfield',
				colspan: 4,
				padding:'5 0 0 5',
		        labelWidth:100,
		        width:230,
		        name:'otherFixation',
		        fieldLabel:'其它外固定',
		        value: '',
		        hidden:true
			},{
				xtype:'xaptextfield',
				colspan: 12,
				padding:'5 20 10 5',
		        labelWidth:70,
		        width:1004,
		        name:'otherDiseasesHistory',
		        fieldLabel:'其它疾病史',
		        displayField: 'parentName'
			},{
				xtype: 'xapdisplayfield',
				fieldLabel: '',
				colspan:4,
				width:10,
				valign: 'center',
				name:'',
				value: ''
			},{
				xtype: 'button',
				text: '保存',
				colspan: 2,
				iconCls: 'icon-save',
				action: 'save',
				buttonAlign:'center'
			},{
				xtype: 'button',
				text: '取消',
				colspan: 2,
				iconCls: 'icon-cancel',
				action: 'cancel',
				buttonAlign:'center'
			},{
				xtype: 'xapdisplayfield',
				fieldLabel: '',
				colspan:4,
				width:10,
				valign: 'center',
				name:'',
				value: '',
				hidden : true
			},{
				xtype: 'xapdisplayfield',
				fieldLabel: '',
				colspan:12,
				width:10,
				valign: 'center',
				id : 'flag',
				name:'flag',
				value: '',
				hidden : true
			},{
				xtype: 'xapdisplayfield',
				fieldLabel: '',
				colspan:12,
				width:10,
				valign: 'center',
				id:'patientId',
				name:'patientId',
				value: '',
				hidden : true
			},{
				xtype: 'xapdisplayfield',
				fieldLabel: '',
				colspan:12,
//				vertical: true,
				width:10,
				valign: 'left',
				name:'',
				value: ''
			},
			{
				xtype: 'xapdisplayfield',
				fieldLabel: '',
				colspan:12,
//				vertical: true,
				width:10,
				valign: 'left',
				name:'',
				value: ''
			}],
			setData: function(data) {
			    this.callParent(arguments);
			},
		    getData: function() {
		        this.callParent(arguments);
		    }
			
})