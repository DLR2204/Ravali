package com;

public class Employee {
	
	private int empId;
	
	private String empName;
	
	private int empSal;
	
	private String emp;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmp() {
		return emp;
	}

	public void setEmp(String emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", emp=" + emp + "]";
	}

	public Employee(int empId, String empName, int empSal, String emp) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.emp = emp;
	}
	
	

}
