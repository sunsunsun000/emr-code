package pkuhit.iih.qa.old;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseBizModel;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  PK = "QAB02.AT01";
// 质控主键
public static final   String  QA_PK = "QAB02.AT02";
// 质控体系质控项目编码
public static final   String  QA_SYSTEM_ITEM_CODE = "QAB02.AT03";
// 质控目标对象编码
public static final   String  TARGET_OBJECT_CODE = "QAB02.AT04";
// 质控目标对象主键
public static final   String  TARGET_OBJECT_PK = "QAB02.AT05";
// 质控来源对象编码
public static final   String  SOURCE_OBJECT_CODE = "QAB02.AT06";
// 质控来源对象主键
public static final   String  SOURCE_OBJECT_PK = "QAB02.AT07";
// 完成标志
public static final   String  COMPLETED_FLAG = "QAB02.AT08";
// 质控截止时间
public static final   String  DEADLINE_TIME = "QAB02.AT09";
// 质控执行时间
public static final   String  EXECUTE_TIME = "QAB02.AT10";
// 质控执行人ID
public static final   String  EXECUTE_USER_ID = "QAB02.AT11";
// 质控执行科室编码
public static final   String  EXECUTE_DEPT_CODE = "QAB02.AT12";
// 缺陷标志
public static final   String  FAULT_FLAG = "QAB02.AT13";
// 缺陷数
public static final   String  FAULT_COUNT = "QAB02.AT14";

@Column(name = "QA_ITM_CD")
private String qaItmCd;

@Column(name = "REQ")
private String req;
@Column(name="QA_ITM_PK") 
private  String pk;

	return qaItmCd;
}

public void setQaItmCd(String qaItmCd) {
	this.qaItmCd = qaItmCd;
}

public String getReq() {
	return req;
}

public void setReq(String req) {
	this.req = req;
}

// 质控主键
@Column(name="QA_PK") 
private  String qaPk;

@Column(name="QA_SYS_ITM_CD") 
private  String qaSystemItemCode;

@Column(name="TAR_OBJ_CD") 
private  String targetObjectCode;

@Column(name="TAR_OBJ_PK") 
private  String targetObjectPk;

@Column(name="SRC_OBJ_CD") 
private  String sourceObjectCode;

@Column(name="SRC_OBJ_PK") 
private  String sourceObjectPk;

@Column(name="CMPL_F") 
private  Integer completedFlag;

@Column(name="DL_TIME") 
private  Date deadlineTime;

@Column(name="EXEC_TIME") 
private  Date executeTime;

@Column(name="EXEC_USER_ID") 
private  String executeUserId;

@Column(name="EXEC_DEPT_CD") 
private  String executeDeptCode;

@Column(name="FLT_F") 
private  Integer faultFlag;

@Column(name="FLT_CNT") 
private  Integer faultCount;

//扣分标准
@Column(name="ONCE_DRP_SCR") 
private  Integer onceDropScore;
// 质控执行人名称
//@DictionaryTag(code = "executeUserId")
private  String executeUserName;
// 质控执行科室名称
//@DictionaryTag(code = "executeDeptCode")
private  String executeDeptName; 

 {
     return this.pk;
 }

 {
  this.pk = pk;
 }

 {
     return this.qaPk;
 }

 {
  this.qaPk = qaPk;
 }

 {
     return this.qaSystemItemCode;
 }

 {
  this.qaSystemItemCode = qaSystemItemCode;
 }

 {
     return this.targetObjectCode;
 }

 {
  this.targetObjectCode = targetObjectCode;
 }

 {
     return this.targetObjectPk;
 }

 {
  this.targetObjectPk = targetObjectPk;
 }

 {
     return this.sourceObjectCode;
 }

 {
  this.sourceObjectCode = sourceObjectCode;
 }

 {
     return this.sourceObjectPk;
 }

 {
  this.sourceObjectPk = sourceObjectPk;
 }

 {
     return this.completedFlag;
 }

 {
  this.completedFlag = completedFlag;
 }

 {
     return this.deadlineTime;
 }

 {
  this.deadlineTime = deadlineTime;
 }

 {
     return this.executeTime;
 }

 {
  this.executeTime = executeTime;
 }

 {
     return this.executeUserId;
 }

 {
  this.executeUserId = executeUserId;
 }

 {
     return this.executeDeptCode;
 }

 {
  this.executeDeptCode = executeDeptCode;
 }

 {
     return this.faultFlag;
 }

 {
  this.faultFlag = faultFlag;
 }

 {
     return this.faultCount;
 }

 {
  this.faultCount = faultCount;
 }

 {
     return this.executeUserName;
 }

 {
  this.executeUserName = executeUserName;
 }

 {
     return this.executeDeptName;
 }

 {
  this.executeDeptName = executeDeptName;
 }

public Integer getOnceDropScore() {
	return onceDropScore;
}

public void setOnceDropScore(Integer onceDropScore) {
	this.onceDropScore = onceDropScore;
}

