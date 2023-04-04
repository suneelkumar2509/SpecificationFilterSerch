package com.tcl.employesystem.tclemployesystem.dto;



import com.tcl.employesystem.tclemployesystem.model.Employee;

import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class EmployeeAddressDTO {

	private Long id;

	@Size(min = 5, message = "title is too short")
	@Size(max = 50, message = "title is too big")
	@NotBlank(message = " enter valide adresstype")
	private String adresstype;

	private String adress;

	@Size(min = 5, message = "title is too short")
	@Size(max = 50, message = "title is too big")
	@NotBlank(message = " enter valide city")
	private String city;

	private String state;


	@NotBlank(message = " enter valide pincode")
	private String pincode;
	
	private String country;

	@ManyToOne
	private Employee Employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdresstype() {
		return adresstype;
	}

	public void setAdresstype(String adresstype) {
		this.adresstype = adresstype;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Employee getEmployee() {
		return Employee;
	}

	public void setEmployee(Employee employee) {
		Employee = employee;
	}

	public EmployeeAddressDTO(Long id,
			@Size(min = 5, message = "title is too short") @Size(max = 50, message = "title is too big") @NotBlank(message = " enter valide adresstype") String adresstype,
			String adress,
			@Size(min = 5, message = "title is too short") @Size(max = 50, message = "title is too big") @NotBlank(message = " enter valide city") String city,
			String state, @NotBlank(message = " enter valide pincode") String pincode, String country,
			com.tcl.employesystem.tclemployesystem.model.Employee employee) {
		super();
		this.id = id;
		this.adresstype = adresstype;
		this.adress = adress;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
		Employee = employee;
	}

	public EmployeeAddressDTO() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeAddressDTO [id=" + id + ", adresstype=" + adresstype + ", adress=" + adress + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + ", country=" + country + ", Employee=" + Employee + "]";
	}
	
	
	
	

}
