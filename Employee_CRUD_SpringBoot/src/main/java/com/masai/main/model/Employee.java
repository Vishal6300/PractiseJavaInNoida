package com.masai.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer EmpId;
	private String EmpName;
	private Integer Salary;
	private String address;
	
	public Integer getEmpId() {
		return EmpId;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(String empName, Integer salary, String address) {
		super();
		EmpName = empName;
		Salary = salary;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", Salary=" + Salary + ", address=" + address + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
