package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
public WebDriver driver;
	
	@FindBy(xpath="(//table[@class='content']//following::td[@align='right'])[17]")
	private WebElement my_itinerary;
	
	@FindBy(xpath="//input[@name='logout']")
	private WebElement logout;

	public BookingConfirmation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

	public WebElement getLogout() {
		return logout;
	}

}
