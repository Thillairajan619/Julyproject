package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class Locator_LoginPage extends BaseClass {
	
	public static WebElement firstname_Locator() {
		return driver.findElement(By.xpath("//input[@id='firstName']"));
		}
	public static WebElement lastname_Locator() {
		return driver.findElement(By.xpath("//*[@id='lastName']"));
		
	}
	public static WebElement  email_Locator () {
		return driver.findElement(By.xpath("//*[@id='userEmail']"));
		
	}
	public static WebElement mobilenumber_Locator() {
		return driver.findElement(By.xpath("//*[@id='userNumber']"));
		
	}
    public static WebElement subject_Locator () {
		return driver.findElement(By.xpath("//*[@id='subjectsInput']"));
    	
    }
    
    public static WebElement address_Locator () {
		return driver.findElement(By.xpath("//*[@id='currentAddress']"));
    	
    }

}
