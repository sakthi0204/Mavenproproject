package com.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class2 {


	public static WebDriver driver;
	public static String value;


	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumOctProject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "ccc");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "ccc");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("INVALID BROWSER");
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void getUrl(String url) { // getUrl("google,com");
		driver.get(url);
	}

	public static void toClose() {
		driver.close();
	}

	public static void toQuit() {
		driver.quit();
	}

	public static void toclick(WebElement element) {
		element.click();
	}

	public static void toNavigate(String Url) {
		driver.navigate().to(Url);
	}

	public static void toNavigateBack() {
		driver.navigate().back();
	}

	public static void toNavigateForward() {
		driver.navigate().forward();
	}

	public static void toRefresh() {
		driver.navigate().refresh();
	}

	public static void sendkey(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void toGetTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void toGetCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void moveToElement(WebElement element) { // actions moveToElement
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void toScroll(String a) { // JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver; // toScroll
		js.executeScript("window.scrollBy(0," + a + ")");

	}

	public static void scrollByElement(WebElement element) {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void threadSleep(int a) throws InterruptedException { // Thread.sleep
		Thread.sleep(a);
	}

	public static void frameIn(int a) { // frame open
		driver.switchTo().frame(a);
	}

	public static void frameOut() { // frame close
		driver.switchTo().defaultContent();
	}

	public static void implicitlyWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS); // implycitlyWait
	}

	public static void takesScreenshot(String path) throws IOException { // Screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}

	public static void windowhandels(int a) { // windowHandles
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(a));
	}
	
	public static void select(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}

	public static String particular_Data(String path,int sheetindex,int rowindex,int cellindex) throws IOException {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(sheetindex);
		Row row = sheetAt.getRow(rowindex);
		Cell cell = row.getCell(cellindex);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			value= cell.getStringCellValue();
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int val = (int) numericCellValue;
			value = String.valueOf(val); 
			
		}
		wb.close();
		return value;
	}
	public static String particular_Row(String path,int sheetindex,int rowindex) throws IOException  {
		File f=new File(path);
		FileInputStream fis =new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(sheetindex);
		Row row = sheetAt.getRow(rowindex);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < numberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				value= cell.getStringCellValue();
				
				
			}else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int val = (int) numericCellValue;
				value= String.valueOf(val);
				}
			}
		wb.close();
		return value;

	}
	public static String particular_Column(String path,int sheetindex,int columnindex) throws Throwable {
		File f=new File(path);
		FileInputStream fis =new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(sheetindex);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(columnindex);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				value= cell.getStringCellValue();
				
			}else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int val = (int) numericCellValue;
				value=String.valueOf(val);
			}
		}
		wb.close();
		return value;

	}
	public static String allDataInExcel(String path) throws Throwable {
		File f=new File(path);
		FileInputStream fis =new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					value = cell.getStringCellValue();
					System.out.println(value);
					}else if (cellType.equals(CellType.NUMERIC)) {
						double cellvalue = cell.getNumericCellValue();
						int val =(int) cellvalue;
						value=String.valueOf(val);
						
						}
				     }
			      }
		             wb.close();
					return value;
				}



}
