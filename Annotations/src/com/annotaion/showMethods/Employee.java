package com.annotaion.showMethods;

public class Employee {

	private Integer id;
	private String fname;
	private String lname;
	private Double salary;
	
	Employee(){}

	public Employee(Integer id, String fname, String lname, Double salary) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary + "]";
	}
	
	public void Attend()
	{
		System.out.println("attends");
	}
}
