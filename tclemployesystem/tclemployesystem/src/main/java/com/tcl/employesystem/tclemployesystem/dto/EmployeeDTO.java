package com.tcl.employesystem.tclemployesystem.dto;

import java.util.ArrayList;
import java.util.List;



import com.tcl.employesystem.tclemployesystem.model.EmployeeAddress;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


public class EmployeeDTO {
	

	
	private Long empid;
	
	@Size(min = 5, message = "title is too short")
	@Size(max = 50, message = "title is too big")
	@NotBlank(message = " enter valide empname")
	private String empname;
	
	@Digits(integer = 200, fraction = 0, message = "code should be number and no larger than 200")
	@NotBlank(message = " enter valide empage")
	private Short empage;
	
	@Min(value = 18, message = "Age should not be less than 18")
	@Max(value = 100, message = "Age should not be greater than 100")
	@NotBlank(message = " enter valide empgender")
	private char empgender;
	
    //@Range(min = 10,max= 10, message = "phone_no should be exact 10 characters." )
	@NotBlank(message = " enter valide empname")
	private String empmobilenumber;
    
   // @Range(min = 10,max= 10, message = "phone_no should be exact 10 characters." )
	@NotBlank(message = " enter valide empalternatemobilenumber")
	private String empalternatemobilenumber;
    
	private Double empsalary;
	
	@Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	@NotEmpty(message = "Email cannot be empty")
	@NotBlank(message = " enter valide empemail")
	private String empemail;

	private List<EmployeeAddress> employeeAddress =new  ArrayList<>();

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

	public char getEmpgender() {
		return empgender;
	}

	public void setEmpgender(char empgender) {
		this.empgender = empgender;
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

	public List<EmployeeAddress> getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(List<EmployeeAddress> employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public EmployeeDTO(Long empid,
			@Size(min = 5, message = "title is too short") @Size(max = 50, message = "title is too big") String empname,
			@Digits(integer = 200, fraction = 0, message = "code should be number and no larger than 200") Short empage,
			@Min(value = 18, message = "Age should not be less than 18") @Max(value = 100, message = "Age should not be greater than 100") char empgender,
			String empmobilenumber, String empalternatemobilenumber, Double empsalary, String empemail,
			List<EmployeeAddress> employeeAddress) {
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

	public EmployeeDTO() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empid=" + empid + ", empname=" + empname + ", empage=" + empage + ", empgender="
				+ empgender + ", empmobilenumber=" + empmobilenumber + ", empalternatemobilenumber="
				+ empalternatemobilenumber + ", empsalary=" + empsalary + ", empemail=" + empemail
				+ ", employeeAddress=" + employeeAddress + "]";
	}
	
	

}
