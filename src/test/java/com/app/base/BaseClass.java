package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
public static WebDriver driver = null;
	
 
	public static void browserlaunch() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/lookup.htm;jsessionid=25231D55EE1129FCEB33F77DA3ADC7C0");
	}
	
	
	public static String propFile(String key) {
		String value = null;
		try {
			File f= new File("C:\\Users\\THILLAI\\eclipse-workspace\\TestQA\\src\\test\\resources\\TestData\\config.properties");
			FileInputStream fis= new FileInputStream(f);
			Properties p = new Properties();
			p.load(fis);
			value = p.getProperty(key);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	/*public static String excelReadDataReuseable(int a , int b) {
		String value =null;
		try {
			// location
			File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Test_One_Two\\src\\test\\resources"
					+ "\\TestData\\July_Offline.xlsx");	
			// read -> FileInput
			FileInputStream fis = new FileInputStream(f);
			// work book 
			Workbook wb = new XSSFWorkbook(fis);
			// sheet
			Sheet sheet = wb.getSheet("Sheet1");
			//row
			Row row = sheet.getRow(a);
			Cell cell = row.getCell(b);
			//System.out.println(cell);
			int cellType = cell.getCellType();
			if(cellType==1) {
				value = cell.getStringCellValue();
				System.out.println(value);
			}else if(cellType==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
			value = s.format(dateCellValue);
			System.out.println(value);
			
				}else {
					double number = cell.getNumericCellValue();
					long l = (long)number;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		}*/
	
	public static void selectValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public static void typedata(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void clickdata(WebElement element) {
		element.click();
	}

	@AfterClass
	public static void closewindow() {
		driver.close();
	}

}
