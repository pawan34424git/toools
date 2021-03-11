package com.pawan.compare;

public class Employee  implements Comparable<Employee>{
	private Integer id;
	private String firstName;
	
	
	
	public Employee(Integer id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	@Override
	public int compareTo(Employee o2) {
		Employee o1 = this;
		if (o2.getFirstName() == null) {
	        return (o1.getFirstName() == null) ? 0 : -1;
	    }
	    if (o1.getFirstName() == null) {
	        return 1;
	    }
	    return o2.getFirstName().compareTo(o1.getFirstName());
	}
	
}
