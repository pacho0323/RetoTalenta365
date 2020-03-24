package com.co.talenta365.certificacion.models;

public class User {
	private String username;
	private String password;
	private String confirmpassword;
	private String email;
	private String firtsName;
	private String lastName;
	private String phone;
	private String country;
	private String city;
	private String address;
	private String state;
	private String postalCode;

	public User(String username, String password, String confirmpassword, String email, String firtsName,
			String lastName, String phone, String country, String city, String address, String state,
			String postalCode) {

		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.email = email;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.phone = phone;
		this.country = country;
		this.city = city;
		this.address = address;
		this.state = state;
		this.postalCode = postalCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
