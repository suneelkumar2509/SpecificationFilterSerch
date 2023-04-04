package com.tcl.employesystem.tclemployesystem.service;

import java.util.List;

import com.tcl.employesystem.tclemployesystem.dto.EmployeeAddressDTO;

public interface EmployeeAddressService {
	
	
	
	//public EmployeeAddressDTO AddEmployeeAddress(EmployeeAddressDTO employeeaddressdto) ;
	
	 public List<EmployeeAddressDTO>  GetAllEmployeeAddress();

	 public EmployeeAddressDTO UpdateEmployeeAddress(EmployeeAddressDTO employeeaddressdto);
	 
	public void DeleteEmployeeAddress(Long Id) ;

	//EmployeeAddressDTO AddEmployeeAddress(EmployeeAddressDTO employeeaddressdto, Long empid);

	EmployeeAddressDTO AddEmployeeAddress(long empid, EmployeeAddressDTO employeeaddressdto);


}
