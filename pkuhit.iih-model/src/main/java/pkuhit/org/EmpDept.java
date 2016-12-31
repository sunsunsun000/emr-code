package pkuhit.org;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "ORGB06.AT01";
// 部门编码
public static final   String  DEPT_CODE = "ORGB06.AT02";
// 人员ID
public static final   String  EMPLOYEE_ID = "ORGB06.AT03";


@Column(name="EMP_DEPT_CD") 
private  String code;

@Column(name="DEPT_CD") 
private  String deptCode;*/
// 部门编码
@Column(name="WARD_DEPT_CD") 
private  String wardDeptCode;

@Column(name="EMP_ID") 
private  String employeeId;
// 部门名称
//@DictionaryTag(code = "deptCode")
@Column(name="NM") 
private  String deptName;
// 人员名称
private  String employeeName;

@Column(name = "SORT_NO")
String sortNo;


 {
     return this.code;
 }

 {
  this.code = code;
 }


	return wardDeptCode;
}

public void setWardDeptCode(String wardDeptCode) {
	this.wardDeptCode = wardDeptCode;
}

public String getEmployeeId()
 {
     return this.employeeId;
 }

 {
  this.employeeId = employeeId;
 }

 {
     return this.deptName;
 }

 {
  this.deptName = deptName;
 }

 {
     return this.employeeName;
 }

 {
  this.employeeName = employeeName;
 }

public String getSortNo() {
	return sortNo;
}

public void setSortNo(String sortNo) {
	this.sortNo = sortNo;
}

