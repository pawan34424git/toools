package com.pawan.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainClass {
	public static void main(String[] args) {
		List<Employee> list =new ArrayList<>();
		
		list.add(new Employee(1, "Abc"));
		list.add(new Employee(2, "ZZ" ));
		list.add(new Employee(3, "GG" ));
		list.add(new Employee(4, null ));
		list.add(new Employee(5, "GG" ));
		list.add(new Employee(6, "HH" ));
		
		list.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o2.getFirstName() == null) {
			        return (o1.getFirstName() == null) ? 0 : -1;
			    }
			    if (o1.getFirstName() == null) {
			        return 1;
			    }
			    return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		
		
		Collections.sort(list,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o2.getFirstName() == null) {
			        return (o1.getFirstName() == null) ? 0 : -1;
			    }
			    if (o1.getFirstName() == null) {
			        return 1;
			    }
				
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		
		 Collections.sort(list);
		for (Employee employee : list) {
			System.out.println(employee.getId()+ "  ::  " +employee.getFirstName());
		}
	}
}
