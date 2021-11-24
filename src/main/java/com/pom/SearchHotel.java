package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public WebDriver driver;

	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement noOfRooms;
	
	public SearchHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkInDate;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOutDate;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultRoom;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childRoom;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;
	
	
	
	

}
