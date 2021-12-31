package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Day04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System .setProperty("webdriver.chrome.driver", "C:\\Users\\aks\\eclipse-workspace\\Selenium-01\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement s= driver.findElement(By.id("credit2"));
		WebElement d= driver.findElement(By.id("bank"));
		Actions actions = new Actions (driver);
		actions.dragAndDrop(s, d).perform();
		
		//Close browser
		
		//driver.quit();
		
	}

}
