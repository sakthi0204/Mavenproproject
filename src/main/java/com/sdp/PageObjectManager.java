package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel;
import com.pom.BookingConfirmation;
import com.pom.Confirm_Hotel;
import com.pom.SearchHotel;
import com.pom.login_page;

public class PageObjectManager {
	
	public  WebDriver driver;
	private login_page lp;
	private SearchHotel sh;
	private Confirm_Hotel ch;
	private Book_Hotel bh;
	private BookingConfirmation bc;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	public login_page getInstancelp() {
		if (lp==null) {
			lp = new login_page(driver);
			
		}
		return lp;
	}
	public SearchHotel getInstancesh() {
		if (sh==null) {
			sh = new SearchHotel(driver);
			
		}
		return sh;
	}
	public Confirm_Hotel getInstancech() {
		if (ch==null) {
			ch = new Confirm_Hotel(driver);
			
		}
		return ch;
	}
	public Book_Hotel getInstancebh() {
		if (bh==null) {
			bh = new Book_Hotel(driver);
			
		}
		return bh;
	}
	public BookingConfirmation getInstancebc() {
		if (bc==null) {
			bc = new BookingConfirmation(driver);
			
		}
		return bc;
	}
}
