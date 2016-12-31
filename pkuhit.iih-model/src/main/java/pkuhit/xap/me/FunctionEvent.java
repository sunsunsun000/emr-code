package pkuhit.xap.me;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "MEB08.AT01";
// 功能元素编码
public static final   String  FUNCTION_ELEMENT_CODE = "MEB08.AT02";
// 功能操作编码
public static final   String  FUNCTION_ACTION_CODE = "MEB08.AT03";
// 事件类型编码
public static final   String  EVENT_TYPE_CODE = "MEB08.AT04";


@Column(name="FU_EV_CD") 
private  String code;

@Column(name="FU_EL_CD") 
private  String functionElementCode;

@Column(name="FU_ACT_CD") 
private  String functionActionCode;

@Column(name="EV_TP_CD") 
private  String eventTypeCode;
// 功能元素名称
private  String functionElementName;
// 功能操作名称
private  String functionActionName;
// 事件类型名称
@DictionaryTag(code = "eventTypeCode")
private  String eventTypeName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.functionElementCode;
 }

 {
  this.functionElementCode = functionElementCode;
 }

 {
     return this.functionActionCode;
 }

 {
  this.functionActionCode = functionActionCode;
 }

 {
     return this.eventTypeCode;
 }

 {
  this.eventTypeCode = eventTypeCode;
 }

 {
     return this.functionElementName;
 }

 {
  this.functionElementName = functionElementName;
 }

 {
     return this.functionActionName;
 }

 {
  this.functionActionName = functionActionName;
 }

 {
     return this.eventTypeName;
 }

 {
  this.eventTypeName = eventTypeName;
 }

