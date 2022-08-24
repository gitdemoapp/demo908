package com.bytecode.collection.imp;

import java.util.Comparator;

public class MyComparator  implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		//return -(emp1.getEmpid()-emp2.getEmpid());
		
		return emp2.getSal()-emp1.getSal();
	}

}
