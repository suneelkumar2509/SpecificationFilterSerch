package com.tcl.employesystem.tclemployesystem.comtroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcl.employesystem.tclemployesystem.dto.EmployeeDTO;
import com.tcl.employesystem.tclemployesystem.service.EmployeeServiceImp;

@RestController
@RequestMapping("/tcl/api")
public class EmployeeConteoller {
	
	@Autowired
	private EmployeeServiceImp serviceImp;
	
	
	
	@PostMapping("/employes")
	public ResponseEntity<?> addemploye(@Validated @RequestBody EmployeeDTO employeedto, BindingResult binres) {
		if (binres.hasErrors()) {
			Map<String, String> validationsMap = new HashMap<String, String>();
			for (FieldError error : binres.getFieldErrors()) {
				validationsMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(validationsMap, HttpStatus.BAD_REQUEST);
		} else {

			EmployeeDTO st = serviceImp.AddEmployee(employeedto);
			return new ResponseEntity<EmployeeDTO>(st, HttpStatus.CREATED);
		}
	}
	
	
	
	@GetMapping("/employes")
	public ResponseEntity<List<EmployeeDTO>> getallemployee(
			@RequestParam(value = "Pageno", defaultValue = "0", required = false) Integer pageno,
			@RequestParam(value = "pagesize", defaultValue = "4", required = false) Integer pagesize,
			@RequestParam(value = "sotrby", defaultValue = "id", required = false) String sotrby,
			@RequestParam(value = "sotrdsc", defaultValue = "asc", required = false) String sotrdsc) {
		List<EmployeeDTO> employess = serviceImp.GetAllEmployee(pageno, pagesize, sotrby, sotrdsc);

		return new ResponseEntity<List<EmployeeDTO>>(employess, HttpStatus.OK);

	}


}
