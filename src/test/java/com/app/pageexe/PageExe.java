package com.app.pageexe;

import java.util.Map;

import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;
import com.app.locator.Locator_LoginPage;

import io.cucumber.datatable.DataTable;

public class PageExe extends Locator_LoginPage{
	
	public static void getUrl() {
		driver.get(propFile("url"));
	}
	
	public static void firstname( String data) {
		
		BaseClass.typedata(Locator_LoginPage.firstname_Locator(), data);
			
	}

	public static void lastname( String data) {
		
		BaseClass.typedata(Locator_LoginPage.lastname_Locator(), data);
			
	}

	public static void email( String data) {
		
		BaseClass.typedata(Locator_LoginPage.email_Locator(), data);
			
	}
}
