package com.tcl.employesystem.tclemployesystem.reporsetry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcl.employesystem.tclemployesystem.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

		

}
