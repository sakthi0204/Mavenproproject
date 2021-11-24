package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Hotel {
public WebDriver driver;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radioButton;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement tocontinue;

	public Confirm_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getTocontinue() {
		return tocontinue;
	}


}
