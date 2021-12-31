package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Day04_02 {
	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		System .setProperty("webdriver.chrome.driver", "C:\\Users\\aks\\eclipse-workspace\\Selenium-01\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement inkcourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions actions = new Actions (driver);
		actions.moveToElement(inkcourse).perform();
		
		WebElement inkBigdata = driver.findElement(By.xpath("//span[text()='Bigdata Training']"));
		inkBigdata.click();
		//Close Browser
		//Driver.quit();
	}
		
		
		

	}


