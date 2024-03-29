package com.testNg;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.baseClass.Base_Class2;
import com.helpers.FileReaderManager;
import com.sdp.PageObjectManager;

public class TestNgRunner2 extends Base_Class2 {

	public static WebDriver driver=Base_Class2.browserLaunch("chrome");
	public static PageObjectManager pom=new PageObjectManager(driver);
	static Logger log = Logger.getLogger(TestNgRunner2.class);

	
	@Test(priority = 1)
	private void invokeUrl() throws Throwable {
		String passurl = FileReaderManager.getInstanceFrm().getinstanceCR().passurl();
		getUrl(passurl);//"https://adactinhotelapp.com/index.php"
		threadSleep(3000);
	}
	@Test(priority = 2)
	private void loginPage() throws IOException {
//		String username = FileReaderManager.getInstanceFrm().getinstanceCR().passUsername();
		String username = particular_Data("C:\\\\Users\\\\ELCOT\\\\Desktop\\\\writeData.xlsx", 1, 1, 0);
		sendkey(pom.getInstancelp().getUsername(), username);
//		String password = FileReaderManager.getInstanceFrm().getinstanceCR().passPassword();
		String password = particular_Data("C:\\\\Users\\\\ELCOT\\\\Desktop\\\\writeData.xlsx", 1, 1, 1);
		sendkey(pom.getInstancelp().getPassword(), password);
		toclick(pom.getInstancelp().getLogin());

	}
	@Test(priority = 3)
	private void searchHotel() throws Throwable {
		String location = FileReaderManager.getInstanceFrm().getinstanceCR().passLocation();
		select(pom.getInstancesh().getLocation(), location);
		String hotel = FileReaderManager.getInstanceFrm().getinstanceCR().passHotel();
		select(pom.getInstancesh().getHotel(), hotel);
		String roomtype = FileReaderManager.getInstanceFrm().getinstanceCR().passRoomtype();
		select(pom.getInstancesh().getRoomType(), roomtype);
		String noofrooms = FileReaderManager.getInstanceFrm().getinstanceCR().passNoofrooms();
		select(pom.getInstancesh().getNoOfRooms(), noofrooms);
		String indate = FileReaderManager.getInstanceFrm().getinstanceCR().passIndate();
		sendkey(pom.getInstancesh().getCheckInDate(), indate);
		String outdate = FileReaderManager.getInstanceFrm().getinstanceCR().passOutdate();
		sendkey(pom.getInstancesh().getCheckOutDate(), outdate);
		String Adultroom = FileReaderManager.getInstanceFrm().getinstanceCR().passAdultroom();
		select(pom.getInstancesh().getAdultRoom(), Adultroom);
		String childroom = FileReaderManager.getInstanceFrm().getinstanceCR().passChildroom();
		select(pom.getInstancesh().getChildRoom(), childroom);
		toclick(pom.getInstancesh().getSearch());

	}
	@Test(priority = 4)
	private void confirmHotel() {
		toclick(pom.getInstancech().getRadioButton());
		toclick(pom.getInstancech().getTocontinue());

	}
	@Test(priority = 5)
	private void bookHotel() throws Throwable {
		scrollByElement(pom.getInstancebh().getDownScrol());
		String firstname = FileReaderManager.getInstanceFrm().getinstanceCR().passFirstname();
		sendkey(pom.getInstancebh().getFirstName(), firstname);
		String lastname = FileReaderManager.getInstanceFrm().getinstanceCR().passLastname();
		sendkey(pom.getInstancebh().getLastname(), lastname);
		String address = FileReaderManager.getInstanceFrm().getinstanceCR().passAddress();
		sendkey(pom.getInstancebh().getAddress(), address);
		String ccnum = FileReaderManager.getInstanceFrm().getinstanceCR().passCcnum();
		sendkey(pom.getInstancebh().getCreditCard(), ccnum);
		String cctype = FileReaderManager.getInstanceFrm().getinstanceCR().passCctype();
		select(pom.getInstancebh().getCcType(), cctype);
		String expiremonth = FileReaderManager.getInstanceFrm().getinstanceCR().passExpiremonth();
		select(pom.getInstancebh().getExpireMonth(), expiremonth);
		String expireyear = FileReaderManager.getInstanceFrm().getinstanceCR().passExpireyear();
		select(pom.getInstancebh().getExpireYear(), expireyear);
		String cvvnum = FileReaderManager.getInstanceFrm().getinstanceCR().passCvvnum();
		sendkey(pom.getInstancebh().getCvvNo(), cvvnum);
		toclick(pom.getInstancebh().getBookNow());
		threadSleep(2000);
		takesScreenshot("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumOctProject\\screenshot\\adactin.png");
		
		threadSleep(3000);

	}
	@Test(priority = 6)
	private void bookingConfirm() throws IOException {
		scrollByElement(pom.getInstancebc().getMy_itinerary());
		toclick(pom.getInstancebc().getLogout());
		takesScreenshot("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumOctProject\\screenshot\\adactin2.png");

		}
	@Test(priority = 7)
	private void loggermethod() {
		PropertyConfigurator.configure("log4j.properties");
		log.info("Sucess");
	}
}
