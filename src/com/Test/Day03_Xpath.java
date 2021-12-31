package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_Xpath {

			public static void main(String[] args) {
			// TODO Auto-generated method stub
			System .setProperty("webdriver.chrome.driver", "C:\\Users\\aks\\eclipse-workspace\\Selenium-01\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.automationtesting.in/Register.html");
			
			
			WebElement btnlogin = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
			
			btnlogin.click();
			
			
			
	       WebElement btnhobbies = driver.findElement(By.xpath(" (//input[@type=\"checkbox\"])[3]"));
			
			btnhobbies.click();
			
			WebElement txtfirstname = driver.findElement(By.xpath(" (//input[@type='text'])[1]"));
			txtfirstname.sendKeys("Naresh Kumar");

			  
		}

	}
