package com.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.baseClass.Base_Class2;
import com.sdp.PageObjectManager;
import com.testRunner.Test_Runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class2 {
	
	public static WebDriver driver= Test_Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Name :"+ name );
	}
	
	@After
	public void afterHooks(Scenario s) throws Throwable {
		if (s.isFailed()) {
			takesScreenshot("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumOctProject\\screenshot\\Mavenpro.png");
			
		}
		String status = s.getStatus();
		System.out.println("Status :"+ status);
	}
	
	@Given("^user Launch \"([^\"]*)\" The Application$")
	public void user_Launch_The_Application(String passurl) throws Throwable {
		getUrl(passurl);

	}

	@When("^user Enter \"([^\"]*)\" In Username Field$")
	public void user_Enter_In_Username_Field(String Username) throws Throwable {
		threadSleep(2000);
	sendkey(pom.getInstancelp().getUsername(), Username);
	

	}

	@When("^user Enter \"([^\"]*)\" In Password Field$")
	public void user_Enter_In_Password_Field(String Password) throws Throwable {
		threadSleep(1000);
	sendkey(pom.getInstancelp().getPassword(), Password);

	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel() throws Throwable {
		toclick(pom.getInstancelp().getLogin());

	}

	@When("^user Select The Hotel \"([^\"]*)\" Location$")
	public void user_Select_The_Hotel_Location(String location) throws Throwable {
		select(pom.getInstancesh().getLocation(), location);
		
	}

		
		
		
	@When("^user Select The Hotel \"([^\"]*)\"$")
	public void user_Select_The_Hotel(String hotel) throws Throwable {
		select(pom.getInstancesh().getHotel(), hotel);
	}

	@When("^user Select The Room \"([^\"]*)\" Type$")
	public void user_Select_The_Room_Type(String roomtype) throws Throwable {
		select(pom.getInstancesh().getRoomType(), roomtype);
	}

	

	@When("^user Select The \"([^\"]*)\" Number Of Room$")
	public void user_Select_The_Number_Of_Room(String noofrooms) throws Throwable {
		select(pom.getInstancesh().getNoOfRooms(), noofrooms);
	}
	
	@When("^user Select CheckIn \"([^\"]*)\" Date$")
	public void user_Select_CheckIn_Date(String indate) throws Throwable {
		sendkey(pom.getInstancesh().getCheckInDate(), indate);
	}

	@When("^user Select CheckOut \"([^\"]*)\" Date$")
	public void user_Select_CheckOut_Date(String outdate) throws Throwable {
		sendkey(pom.getInstancesh().getCheckOutDate(), outdate);
		}

	@When("^user Select The Adults \"([^\"]*)\" Per Room$")
	public void user_Select_The_Adults_Per_Room(String Adultroom) throws Throwable {
		select(pom.getInstancesh().getAdultRoom(), Adultroom);
	}

	@When("^user Select The Children \"([^\"]*)\" Per Room$")
	public void user_Select_The_Children_Per_Room(String childroom) throws Throwable {
		select(pom.getInstancesh().getChildRoom(), childroom);
	}

	@Then("^user Click On Search Button And It Navigate To The Select Hotel$")
	public void user_Click_On_Search_Button_And_It_Navigate_To_The_Select_Hotel() throws Throwable {
		toclick(pom.getInstancesh().getSearch());

	}

	@When("^user Click Radio Button$")
	public void user_Click_Radio_Button() throws Throwable {
	}

	@When("^user Click On Continue Button And It Navigate to Book Hotel$")
	public void user_Click_On_Continue_Button_And_It_Navigate_to_Book_Hotel() throws Throwable {
		toclick(pom.getInstancech().getRadioButton());
		toclick(pom.getInstancech().getTocontinue());
	}

	@When("^user Enter \"([^\"]*)\" In First Name Field$")
	public void user_Enter_In_First_Name_Field(String firstname) throws Throwable {
		scrollByElement(pom.getInstancebh().getDownScrol());
		sendkey(pom.getInstancebh().getFirstName(), firstname);
	}

	@When("^user Enter \"([^\"]*)\" In Last Name Field$")
	public void user_Enter_In_Last_Name_Field(String lastname) throws Throwable {
		sendkey(pom.getInstancebh().getLastname(), lastname);
	}

	@When("^user Enter \"([^\"]*)\" In Address Field$")
	public void user_Enter_In_Address_Field(String address) throws Throwable {
		sendkey(pom.getInstancebh().getAddress(), address);
	}

	@When("^user Enter \"([^\"]*)\" In Credit Card No Field$")
	public void user_Enter_In_Credit_Card_No_Field(String ccnum) throws Throwable {
		sendkey(pom.getInstancebh().getCreditCard(), ccnum);
	}

	@When("^user Select The Credit Card \"([^\"]*)\" Type$")
	public void user_Select_The_Credit_Card_Type(String cctype) throws Throwable {
		select(pom.getInstancebh().getCcType(), cctype);
	}

	@When("^user Select The Expiry \"([^\"]*)\" Month And \"([^\"]*)\" Year$")
	public void user_Select_The_Expiry_Month_And_Year(String expiremonth, String expireyear) throws Throwable {
		select(pom.getInstancebh().getExpireMonth(), expiremonth);
		select(pom.getInstancebh().getExpireYear(), expireyear);
	}

	@When("^user \"([^\"]*)\" In Cvv Number Field$")
	public void user_In_Cvv_Number_Field(String cvvnum) throws Throwable {
		sendkey(pom.getInstancebh().getCvvNo(), cvvnum);
	}

	@Then("^user Click On The Book Now Button And It Navigate To Booking Confirmation$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigate_To_Booking_Confirmation() throws Throwable {
		threadSleep(2000);
		toclick(pom.getInstancebh().getBookNow());
		threadSleep(2000);
		takesScreenshot("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumOctProject\\screenshot\\adactin.png");
	}

	@Then("^user Click On The Logout And Successfully Logged Out$")
	public void user_Click_On_The_Logout_And_Successfully_Logged_Out() throws Throwable {
		threadSleep(3000);
		scrollByElement(pom.getInstancebc().getMy_itinerary());
		threadSleep(3000);
		toclick(pom.getInstancebc().getLogout());
		threadSleep(2000);
		takesScreenshot("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumOctProject\\screenshot\\adactin2.png");
	}


}
