package com.tcl.employesystem.tclemployesystem.model;

import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empid;

	@Column(name = "empname", nullable = false)
	private String empname;

	@Column(name = "empage", nullable = false)
	private Short empage;

	@Column(name = "empgender", nullable = false)
	private Byte empgender;

	@Column(name = "empmobilenumber", nullable = false, unique = true)
	private String empmobilenumber;
	private String empalternatemobilenumber;
	private Double empsalary;

	@Column(name = "empemail", nullable = false, unique = true)
	private String empemail;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "Employee" ,fetch = FetchType.EAGER)
	private List<EmployeeAddress> employeeAddress =new  ArrayList<>();
	
	
	
	public Byte getEmpgender() {
		return empgender;
	}

	public void setEmpgender(Byte empgender) {
		this.empgender = empgender;
	}

	

	public List<EmployeeAddress> getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(List<EmployeeAddress> employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Short getEmpage() {
		return empage;
	}

	public void setEmpage(Short empage) {
		this.empage = empage;
	}

	public String getEmpmobilenumber() {
		return empmobilenumber;
	}

	public void setEmpmobilenumber(String empmobilenumber) {
		this.empmobilenumber = empmobilenumber;
	}

	public String getEmpalternatemobilenumber() {
		return empalternatemobilenumber;
	}

	public void setEmpalternatemobilenumber(String empalternatemobilenumber) {
		this.empalternatemobilenumber = empalternatemobilenumber;
	}

	public Double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(Double empsalary) {
		this.empsalary = empsalary;
	}

	public String getEmpemail() {
		return empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}



	

	public Employee(Long empid, String empname, Short empage, Byte empgender, String empmobilenumber,
			String empalternatemobilenumber, Double empsalary, String empemail, List<EmployeeAddress> employeeAddress) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empage = empage;
		this.empgender = empgender;
		this.empmobilenumber = empmobilenumber;
		this.empalternatemobilenumber = empalternatemobilenumber;
		this.empsalary = empsalary;
		this.empemail = empemail;
		this.employeeAddress = employeeAddress;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empage=" + empage + ", empgender=" + empgender
				+ ", empmobilenumber=" + empmobilenumber + ", empalternatemobilenumber=" + empalternatemobilenumber
				+ ", empsalary=" + empsalary + ", empemail=" + empemail + ", employeeAddress=" + employeeAddress + "]";
	}

		

}
