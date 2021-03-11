package com.pawan;

@MyAnno(pawan = "AAAA")
public class Company {
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setEmpId("1212");
		emp1.setDept("10");
		Employee emp2=new Employee();
		emp2.setEmpId("4512");
		emp2.setDept("20");
		
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getDept());
		System.out.println(emp2.getEmpId());
		System.out.println(emp2.getDept());
		
	}
}
