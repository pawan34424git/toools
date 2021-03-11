package com.pawan;

public class Employee {

	private String empName;
	private String empId;
	private static String dept;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public static String getDept() {
		return dept;
	}
	public static void setDept(String dept) {
		Employee.dept = dept;
	}
}
