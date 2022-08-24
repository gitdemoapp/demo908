package com.bytecode.collection.imp;

public class Employee {
	
	  public Employee(int empid, String name, int sal, String address) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
		this.address = address;
	   }
	  
	private int empid;
	  private String name;
	  private int sal;
	  private String address;
	  
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
