package com.tcl.employesystem.tclemployesystem.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity

public class EmployeeAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "adresstype", nullable = false)
	private String adresstype;
	
	private String adress;
	
	@Column(name = "city", nullable = false)
	private String city;
	
	private String state;
	
	@Column(name = "pincode", nullable = false)
	private String pincode;
	private String country;
	
	@ManyToOne
	@JoinColumn(name="empid")
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

	public EmployeeAddress(Long id, String adresstype, String adress, String city, String state, String pincode,
			String country, Employee employee) {
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

	public EmployeeAddress() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeAddress [id=" + id + ", adresstype=" + adresstype + ", adress=" + adress + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + ", country=" + country + ", Employee=" + Employee + "]";
	}

	
	
}
