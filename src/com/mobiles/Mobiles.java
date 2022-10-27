package com.mobiles;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Mobiles {

	public static void main(String[] args) {
	
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	
	 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));	
		
		Search.click();
		
		Search.sendKeys("OnePlus Nord");
		
		WebElement SearchClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		SearchClick.click();
		
		//To search the OnePlus Nord
		
		List<WebElement> OnePlusNordName = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		
		//To search the price of OnePlus Nord
		
		List<WebElement> OnePlusNordPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		System.out.println("Number of results: " + OnePlusNordName.size());
		
		
		
		for(int i=0;i<=OnePlusNordName.size()-1;i++) 
			
			
		{			
			if (OnePlusNordName.get(i).getText().contains("OnePlus")) 
				
			{
				System.out.println("Product Name: "+OnePlusNordName.get(i).getText()+ ",Product Price: "+OnePlusNordPrice.get(i).getText());
				
			}
		}
		
		 String Price = null;
		String Title = null;
		String Customer_Reviews = null;
		DBConnect.DatabaseInsert(Title,Price,Customer_Reviews );
		driver.close();
	}
}


	
	