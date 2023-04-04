package com.tcl.employesystem.tclemployesystem.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootsunilblog.springbootsunilblog.exception.ResourceNotFoundException;
import com.springbootsunilblog.springbootsunilblog.model.Comment;
import com.tcl.employesystem.tclemployesystem.dto.EmployeeAddressDTO;
import com.tcl.employesystem.tclemployesystem.model.Employee;
import com.tcl.employesystem.tclemployesystem.model.EmployeeAddress;
import com.tcl.employesystem.tclemployesystem.reporsetry.EmployeeAddressRepo;
import com.tcl.employesystem.tclemployesystem.reporsetry.EmployeeRepo;

@Service
public class EmployeeAddressServiceImp implements EmployeeAddressService {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private EmployeeRepo employeerepo;
	@Autowired
	private EmployeeAddressRepo employeeaddressrepo;

	@Override
	public EmployeeAddressDTO AddEmployeeAddress( long empid,EmployeeAddressDTO employeeaddressdto) {
		return employeeaddressdto;
//		Employee employeeaddr = employeerepo.findById(empid)
//				.orElseThrow(() -> new ResourceNotFoundException("post not found for this id  " + empid));
//
//		EmployeeAddress employeeaddress = modelMapper.map(employeeaddressdto, EmployeeAddress.class);
//
//		employeeaddress.setAdress(employeeaddr);
//
//		Employee addaddress = employeerepo.save(employeeaddress);
//
//		return modelMapper.map(addaddress, EmployeeAddressDTO.class);
	}

	@Override
	public List<EmployeeAddressDTO> GetAllEmployeeAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeAddressDTO UpdateEmployeeAddress(EmployeeAddressDTO employeeaddressdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteEmployeeAddress(Long Id) {
		// TODO Auto-generated method stub

	}

}
