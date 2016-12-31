package pkuhit.iih.mr.md;

import xap.model.BaseMasterModel;

public class MrGroupElementCustomCategory extends BaseMasterModel {







public static final   String  CODE = "MRM19.AT01";
// 父医疗记录组合元素自定义分类编码
public static final   String  PARENT_CODE = "MRM19.AT02";
// 组织机构编码
public static final   String  ORGANIZATION_CODE = "MRM19.AT03";
// 名称
public static final   String  NAME = "MRM19.AT04";
// 描述
public static final   String  DESCRIPTION = "MRM19.AT05";
// 层级
public static final   String  LEVEL = "MRM19.AT06";
// 叶节点标志
public static final   String  LEAF_FLAG = "MRM19.AT07";


//@Column(name="MR_GE_CCAT_CD") 
private  String code;

//@Column(name="PAR_MR_GE_CCAT_CD") 
private  String parentCode;

//@Column(name="ORG_CD") 
private  String organizationCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="LVL") 
private  Integer level;

@Column(name="LEAF_F") 
private  Integer leafFlag;
// 组织机构名称
//@DictionaryTag(code = "organizationCode")
private  String organizationName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.parentCode;
 }

 {
  this.parentCode = parentCode;
 }

 {
     return this.organizationCode;
 }

 {
  this.organizationCode = organizationCode;
 }

 {
     return this.name;
 }

 {
  this.name = name;
 }

 {
     return this.description;
 }

 {
  this.description = description;
 }

 {
     return this.level;
 }

 {
  this.level = level;
 }

 {
     return this.leafFlag;
 }

 {
  this.leafFlag = leafFlag;
 }

 {
     return this.organizationName;
 }

 {
  this.organizationName = organizationName;
 }

