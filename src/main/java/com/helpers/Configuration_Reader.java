package com.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	

	
	public Configuration_Reader() throws Throwable {
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenProProject\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String passurl() {
		String url = p.getProperty("url");
		return url;
	}
	public String passUsername() {
		String username = p.getProperty("username");
		return username;
	}
	public String passPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String passLocation() {
		String location = p.getProperty("location");
		return location;
	}
	public String passHotel() {
		String hotel = p.getProperty("hotel");
		return hotel;
	}
	public String passRoomtype() {
		String roomtype = p.getProperty("roomtype");
		return roomtype;
	}
	public String passNoofrooms() {
		String noofrooms = p.getProperty("noofrooms");
		return noofrooms;
	}
	public String passIndate() {
		String indate = p.getProperty("indate");
		return indate;
	}
	public String passOutdate() {
		String outdate = p.getProperty("outdate");
		return outdate;
	}
	public String passAdultroom() {
		String adultroom = p.getProperty("adultroom");
		return adultroom;
	}
	public String passChildroom() {
		String childroom = p.getProperty("childroom");
		return childroom;
	}
	public String passFirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	public String passLastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	public String passAddress() {
		String address = p.getProperty("address");
		return address;
	}
	public String passCcnum() {
		String ccnum = p.getProperty("ccnum");
		return ccnum;
	}
	public String passCctype() {
		String cctype = p.getProperty("cctype");
		return cctype;
	}
	public String passExpiremonth() {
		String expiremonth = p.getProperty("expiremonth");
		return expiremonth;
	}
	public String passExpireyear() {
		String expireyear = p.getProperty("expireyear");
		return expireyear;
	}
	public String passCvvnum() {
		String cvvnum = p.getProperty("cvvnum");
		return cvvnum;
	}

	
	

}
