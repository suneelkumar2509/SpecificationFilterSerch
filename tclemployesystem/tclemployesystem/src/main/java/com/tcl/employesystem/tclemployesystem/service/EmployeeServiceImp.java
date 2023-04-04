package com.tcl.employesystem.tclemployesystem.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.springbootsunilblog.springbootsunilblog.exception.Blogexeceptionhandler;
import com.springbootsunilblog.springbootsunilblog.exception.ResourceNotFoundException;
import com.tcl.employesystem.tclemployesystem.dto.EmployeeDTO;
import com.tcl.employesystem.tclemployesystem.model.Employee;
import com.tcl.employesystem.tclemployesystem.reporsetry.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmployeeRepo repo;
	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public EmployeeDTO AddEmployee( EmployeeDTO employeedto) {
		Employee employee = modelMapper.map(employeedto, Employee.class);
		EmployeeDTO savedemployeeDto = null;
		Employee savedemployee = null;
		try {
			savedemployee = repo.save(employee);

		} catch (Exception e) {
			throw new Blogexeceptionhandler("post allready existed");
		}
		savedemployeeDto = modelMapper.map(savedemployee, EmployeeDTO.class);
		return savedemployeeDto;

	}

	@Override
	public List<EmployeeDTO> GetAllEmployee(int pageno ,int psgesize, String sortby,String sortdrc) {
		Sort sort =sortdrc.equalsIgnoreCase(Sort.Direction.ASC.name())?
    			Sort.by(sortby).ascending():Sort.by(sortby).descending();
    	
    	Pageable pag = PageRequest.of(pageno, psgesize, sort);
  
    	Page<Employee>allemploylist =this.repo.findAll(pag);
    	List<EmployeeDTO>allemploydtolist = allemploylist.stream()
    			.map((Employee)-> modelMapper
    			.map(Employee, EmployeeDTO.class)).collect(Collectors.toList());
    		
		return allemploydtolist;
	}

	@Override
	public Employee UpdateEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public void DeleteEmployee(Long empid)throws ResourceNotFoundException {
		Employee employe = repo.findById(empid)
				.orElseThrow(() -> new ResourceNotFoundException("post not found for this id  " + empid));
		repo.delete(employe);
		repo.deleteById(empid);


	}

	

}
