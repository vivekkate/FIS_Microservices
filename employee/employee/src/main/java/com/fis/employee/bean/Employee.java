package com.fis.employee.bean;

public class Employee {

	
	int id;
	String department;
	boolean permanent;
	double sal;
	
	public Employee() {}
	
	public Employee(int id,String departmnent,Boolean permanent,double sal) {
		this.id=id;
		this.department=departmnent;
		this.permanent=this.permanent;
		this.sal=sal;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", department=" + department + ", permanent=" + permanent + ", sal=" + sal + "]";
	}
	
	
	
	
	
	
}
