package pkuhit.xap.me;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "MEB07.AT01";
// 功能编码
public static final   String  FUNCTION_CODE = "MEB07.AT02";
// 服务编码
public static final   String  XAP_SERVICE_CODE = "MEB07.AT03";
// 操作类型编码
public static final   String  ACTION_TYPE_CODE = "MEB07.AT04";
// 名称
public static final   String  NAME = "MEB07.AT05";
// 描述
public static final   String  DESCRIPTION = "MEB07.AT06";
// 英文简称
public static final   String  SHORT_ENGLISH_NAME_ = "MEB07.AT07";
// 英文名称
public static final   String  ENGLISH_NAME = "MEB07.AT08";


@Column(name="FU_ACT_CD") 
private  String code;

@Column(name="FU_CD") 
private  String functionCode;

@Column(name="XSV_CD") 
private  String xapServiceCode;

@Column(name="ACT_TP_CD") 
private  String actionTypeCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="SHT_NM_EN") 
private  String shortEnglishName;

@Column(name="NM_EN") 
private  String englishName;
// 功能名称
private  String functionName;
// 服务名称
private  String xapServiceName;
// 操作类型名称
@DictionaryTag(code = "actionTypeCode")
private  String actionTypeName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.functionCode;
 }

 {
  this.functionCode = functionCode;
 }

 {
     return this.xapServiceCode;
 }

 {
  this.xapServiceCode = xapServiceCode;
 }

 {
     return this.actionTypeCode;
 }

 {
  this.actionTypeCode = actionTypeCode;
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
     return this.shortEnglishName;
 }

 {
  this.shortEnglishName = shortEnglishName;
 }

 {
     return this.englishName;
 }

 {
  this.englishName = englishName;
 }

 {
     return this.functionName;
 }

 {
  this.functionName = functionName;
 }

 {
     return this.xapServiceName;
 }

 {
  this.xapServiceName = xapServiceName;
 }

 {
     return this.actionTypeName;
 }

 {
  this.actionTypeName = actionTypeName;
 }

