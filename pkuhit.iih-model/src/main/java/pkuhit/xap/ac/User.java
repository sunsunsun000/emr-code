package pkuhit.xap.ac;


import xap.model.BaseMasterModel;
import xap.sv.annotation.Column;
import xap.sv.annotation.DictionaryTag;








 public static final String   OBJ_CD  = "ORGB04";
public static final   String  NAME = "XAPM12.AT08";
// 姓名拼音
public static final   String  NAME_SPELL = "XAPM12.AT09";
// 性别编码
public static final   String  SEX_CODE = "XAPM12.AT10";
// 电子邮箱
public static final   String  EMAIL = "XAPM12.AT11";
// 职称编码
public static final   String  JOB_TITLE_CODE = "XAPM12.AT12";
// 移动电话
public static final   String  MOBILE_NO = "XAPM12.AT13";
// 固定电话
public static final   String  TEL_NO = "XAPM12.AT14";
// 组织机构编码
public static final   String  ORGANIZATION_CODE = "XAPM12.AT15";
// 用户ID
public static final   String  ID = "XAPM12.AT01";
// 人员ID
public static final   String  EMPLOYEE_ID = "XAPM12.AT02";
// 用户状态编码
public static final   String  STATUS_CODE = "XAPM12.AT03";
// 密码
public static final   String  PASSWORD = "XAPM12.AT04";
// 签名图片
public static final   String  SIGN_PICTURE = "XAPM12.AT05";

// 用户状态名称
@DictionaryTag(code = "statusCode", objCd ="XAPM01")
private  String statusName;

@Column(name="NM") 
private  String name;

@Column(name="NM_SPELL") 
private  String nameSpell;

@Column(name="SEX_CD") 
private  String sexCode;

@Column(name="EMAIL") 
private  String email;

@Column(name="JOB_TITLE_CD") 
private  String jobTitleCode;

@Column(name="MOBILE_NO") 
private  String mobileNo;

@Column(name="TEL_NO") 
private  String telNo;

@Column(name="ORG_CD") 
private  String organizationCode;

// 性别名称
@DictionaryTag(code = "sexCode",  objCd = "MDM05")
private  String sexName;

// 职称名称
@DictionaryTag(code = "jobTitleCode")
private  String jobTitleName;

// 组织机构名称
@DictionaryTag(code = "organizationCode" ,objCd="ORGB01")
private  String organizationName;

@Column(name="USER_ID") 
private  String id;

@Column(name="EMP_ID") 
private  String employeeId;

@Column(name="USER_STA_CD") 
private  String statusCode;

//审签等级编码
@Column(name="SIGN_LVL_CD") 
private  String signLevelCode;

//审签等级名称
@DictionaryTag(code = "signLevelCode", objCd ="MRM02")
private  String signLevelName;

@Column(name="PWD") 
private  String password;

//密码
@Column(name="IEMR_PWD") 
private  String iemrPassword;

@Column(name="SIGN_PIC") 
private  String signPicture;
// 人员名称
private  String employeeName;
//是否使用CA  1：使用，0：不使用
private  String useCa;
//是否使用图片签名1：使用，0：不使用
private  String usePicSign;

//cis中是否使用ca
private  String isUseCa;

/**
 * 用户具有角色的业务科室名称，如果有多个通过','分割。
 */
private String serviceDepartName;

@Column(name = "LOGIN_NM")
private String loginName;

@Column(name = "XAP_USER_PK")
private String xapUserPk;

private  List<WardDeptModel> wardDeptList;
private List<UserRole> userRoleList;

@Column(name = "DCT_NS_F")
private Short dctNsF;

 {
     return this.statusName;
 }

	return isUseCa;
}

public void setIsUseCa(String isUseCa) {
	this.isUseCa = isUseCa;
}

public String getUsePicSign() {
	return usePicSign;
}

public void setUsePicSign(String usePicSign) {
	this.usePicSign = usePicSign;
}

public  void  setStatusName(String statusName)
 {
  this.statusName = statusName;
 }

 {
     return this.name;
 }

 {
  this.name = name;
 }

 {
     return this.nameSpell;
 }

 {
  this.nameSpell = nameSpell;
 }

 {
     return this.sexCode;
 }

 {
  this.sexCode = sexCode;
 }

 {
     return this.email;
 }

 {
  this.email = email;
 }

 {
     return this.jobTitleCode;
 }

 {
  this.jobTitleCode = jobTitleCode;
 }

 {
     return this.mobileNo;
 }

 {
  this.mobileNo = mobileNo;
 }

 {
     return this.telNo;
 }

 {
  this.telNo = telNo;
 }

 {
     return this.organizationCode;
 }

 {
  this.organizationCode = organizationCode;
 }

 {
     return this.sexName;
 }

 {
  this.sexName = sexName;
 }

 {
     return this.jobTitleName;
 }

 {
  this.jobTitleName = jobTitleName;
 }

 {
     return this.organizationName;
 }

 {
  this.organizationName = organizationName;
 }

 {
     return this.id;
 }

 {
  this.id = id;
 }

 {
     return this.employeeId;
 }

 {
  this.employeeId = employeeId;
 }

 {
     return this.statusCode;
 }

 {
  this.statusCode = statusCode;
 }

 {
     return this.password;
 }

 {
  this.password = password;
 }

	return signPicture;
}

public void setSignPicture(String signPicture) {
	this.signPicture = signPicture;
}

public String getEmployeeName()
 {
     return this.employeeName;
 }

 {
  this.employeeName = employeeName;
 }

/**
 * @return the userRoleList
 */
public List<UserRole> getUserRoleList() {
	return userRoleList;
}

/**
 * @param userRoleList the userRoleList to set
 */
public void setUserRoleList(List<UserRole> userRoleList) {
	this.userRoleList = userRoleList;
}

/**
 * @return the serviceDepartName
 */
public String getServiceDepartName() {
	return serviceDepartName;
}

/**
 * @param serviceDepartName the serviceDepartName to set
 */
public void setServiceDepartName(String serviceDepartName) {
	this.serviceDepartName = serviceDepartName;
}


public String getSignLevelCode() {

	return signLevelCode;
}


public void setSignLevelCode(String signLevelCode) {

	this.signLevelCode = signLevelCode;
}


public String getSignLevelName() {

	return signLevelName;
}


public void setSignLevelName(String signLevelName) {

	this.signLevelName = signLevelName;
}

public String getLoginName() {
	return loginName;
}

public void setLoginName(String loginName) {
	this.loginName = loginName;
}

public String getXapUserPk() {
	return xapUserPk;
}

public void setXapUserPk(String xapUserPk) {
	this.xapUserPk = xapUserPk;
}

public List<WardDeptModel> getWardDeptList() {
	return wardDeptList;
}

public void setWardDeptList(List<WardDeptModel> wardDeptList) {
	this.wardDeptList = wardDeptList;
}


public String getUseCa() {

	return useCa;
}


public void setUseCa(String useCa) {

	this.useCa = useCa;
}

public String getIemrPassword()
{
    return iemrPassword;
}

public void setIemrPassword(String iemrPassword)
{
    this.iemrPassword = iemrPassword;
}

public Short getDctNsF()
{
    return dctNsF;
}

public void setDctNsF(Short dctNsF)
{
    this.dctNsF = dctNsF;
}

}