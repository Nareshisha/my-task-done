package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System .setProperty("webdriver.chrome.driver", "C:\\Users\\aks\\eclipse-workspace\\Selenium-01\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement a=driver.findElement(By.id("credit2"));
		WebElement b=driver.findElement(By.id("bank"));
		
		WebElement c=driver.findElement(By.id("fourth"));
		WebElement d=driver.findElement(By.id("amt7"));
		
		WebElement e=driver.findElement(By.id("credit1"));
		WebElement f=driver.findElement(By.id("loan"));
		
		WebElement g=driver.findElement(By.id("fourth"));
		WebElement h=driver.findElement(By.id("amt8"));
		
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(a,b).perform();
		actions.dragAndDrop(c,d).perform();
		actions.dragAndDrop(e,f).perform();
		actions.dragAndDrop(g,h).perform();
		
		WebElement btn= driver.findElement(By.id("equal"));
	 String text = btn.getText();
	 System.out.println(text);
		
	}
		
		
}
