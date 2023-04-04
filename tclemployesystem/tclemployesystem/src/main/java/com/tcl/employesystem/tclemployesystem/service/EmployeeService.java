package com.tcl.employesystem.tclemployesystem.service;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import com.springbootsunilblog.springbootsunilblog.exception.ResourceNotFoundException;
import com.tcl.employesystem.tclemployesystem.dto.EmployeeDTO;
import com.tcl.employesystem.tclemployesystem.model.Employee;

public interface EmployeeService {
	
	public EmployeeDTO AddEmployee( EmployeeDTO employeedto) ;
	
	// public List<EmployeeDTO>  GetAllEmployee();

	 public Employee UpdateEmployee(Employee employee);
	 
	public void DeleteEmployee(Long empid) throws ResourceNotFoundException ;

	List<EmployeeDTO> GetAllEmployee(int pageno, int psgesize, String sortby, String sortdrc);


}
