package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
public WebDriver driver;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement downScrol;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
	public Book_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getDownScrol() {
		return downScrol;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpireMonth() {
		return expireMonth;
	}

	public WebElement getExpireYear() {
		return expireYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement creditCard;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement ccType;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expireMonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expireYear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvNo;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement bookNow;
	
	
	

}
