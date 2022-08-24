package com.bytecode.collection.imp;


import java.util.TreeSet;

public class ClientApp {

	public static void main(String[] args) {
		
		
		
		// ArrayList<Employee> employees=new ArrayList<Employee>();
		
//		Comparator<Employee> comparator=(e1,e2)->{
//			  return e2.getSal()-e1.getSal();
//		};
		
		 TreeSet<Employee> employees=new TreeSet<Employee>(new MyComparator());
		 
		 employees.add(new Employee(101, "Raja", 40000, "Kanpur"));
		 employees.add(new Employee(102, "Rani", 60000, "Lucknow"));
		 employees.add(new Employee(100, "Ajay", 20000, "Delhi"));
		 employees.add(new Employee(201, "Suresh", 10000, "Hariyana"));
		 employees.add(new Employee(501, "Baba", 70000, "Banglore"));
		 
		// System.out.println(employees);
		 
		 for (Employee employee : employees) {
			
			// System.out.println(employee.getEmpid());
			 System.out.println(employee.getSal());
		 }
		 
		 

	}

}
