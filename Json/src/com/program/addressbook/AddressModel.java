package com.program.addressbook;

import java.util.Comparator;

public class AddressModel  {//model class
	public static AddressModel getModel(String fname,String lname,Address address)//class return model object
	{
		return new AddressModel(fname,lname,address);
	}
	private String fname;
	private String lname;
	AddressModel(String fname,String lname,Address address)
	{
		this.fname=fname;
		this.lname=lname;
		this.address=address;
		
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private Address address;
	static class Address{
		private String city;
		private String state;
		private int zip;
		public static Address getAddress(String city,String state,int zip)//static class to return address object
		{
			return new Address(city,state,zip);
		}
		Address(String city,String state,int zip)
		{
			this.city=city;
			this.state=state;
			this.zip=zip;
			
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
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		
		
	}

	
}
