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

	public class MobilesTest {


	    public static void main(String args[]) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException{
		
			
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		 
		  driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		 
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 
			js.executeScript("window.scrollBy(0,500)", "");
		 
	    driver.findElement(By.xpath("//img[@alt='Redmi 9A Sport (Coral Green, 2GB RAM, 32GB Storage) | 2GHz Octa-core Helio G25 Processor | 5000 mAh Battery']")).click();
	 
		 
		 Thread.sleep(2000);
		 String Title= driver.findElement(By.xpath("//span[normalize-space()='Redmi 9A Sport (Coral Green, 2GB RAM, 32GB Storage) | 2GHz Octa-core Helio G25 Processor | 5000 mAh Battery']")).getText();
		 Thread.sleep(2000);
		
	    System.out.println(Title);
	    Thread.sleep(2000);
	    
	  String Price = driver.findElement(By.xpath("//span[normalize-space()='6,999']")).getText(); 
	    System.out.println(Price);
	  
	  
	    String Customer_Reviews = driver.findElement(By.xpath("//span[contains(text(),'166,952')]")).getText();
	    System.out.println(Customer_Reviews);
	 DBConnect.DatabaseInsert(Title,Price,Customer_Reviews );

}
}
	
	 
		// driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung galaxy note 10 plus");
		 
		// Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		// dropdown.selectByIndex(16);
	   //  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	 
	  //   To find the product titles of samsung galaxy note 10 plus
	 
	   //  List <WebElement> PhoneTitle = driver.findElements(By.xpath(".//span[@class='a-size-medium a-color-base a-text-normal']"));
	 
	 // To find the product prices of samsung galaxy note 10 plus
	 
	    /* List <WebElement> PhonePrice = driver.findElements(By.xpath(".//span[@class='a-price-whole']"));

	 for(int i=0;i<PhoneTitle.size();i++)
	 {
		 if (PhoneTitle.get(i).getText().contains("samsung galaxy note 10 plus")) 
			{
				System.out.println("Product Name: " + PhoneTitle.get(i).getText() + ", Product Price: "+	PhonePrice.get(i).getText());
			}
		}
		
		driver.close();*/
	     
	     
	    
	     
	     

	     
	     
	 
	 
		 
		/* driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		 
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 
			js.executeScript("window.scrollBy(0,500)", "");
		 
	    driver.findElement(By.xpath("//img[@alt='Redmi 9A Sport (Coral Green, 2GB RAM, 32GB Storage) | 2GHz Octa-core Helio G25 Processor | 5000 mAh Battery']")).click();
	 
		 
		 Thread.sleep(2000);
		 
		
		 String Title= driver.findElement(By.xpath("//span[normalize-space()='Redmi 9A Sport (Coral Green, 2GB RAM, 32GB Storage) | 2GHz Octa-core Helio G25 Processor | 5000 mAh Battery']")).getText();
		 Thread.sleep(2000);
		
	    System.out.println(Title);
	    Thread.sleep(2000);
	    
	  String Price = driver.findElement(By.xpath("//span[normalize-space()='6,999']")).getText(); 
	    System.out.println(Price);
	  
	  
	    String Customer_Reviews = driver.findElement(By.xpath("//span[contains(text(),'166,586')]")).getText();
	    System.out.println(Customer_Reviews);
	  DBConnect.DatabaseInsert(Title,Price,Customer_Reviews );

	  //  String Price = driver.findElement(By.xpath("//*[@id=\"corePrice_desktop\"]/div/table/tbody/tr[2]/td[2]")).getText(); 
	//  System.out.println(Price);
	 // DBConnect.DatabaseInsert(Price);
	  
	  //  String Customer_Reviews = driver.findElement(By.xpath("//span[@id='acrCustomerReviewText'][1]")).getText();
	 // System.out.println(Customer_Reviews);
	  // DBConnect.DatabaseInsert(Customer_Reviews);
	    
	   // String Price = driver.findElement(By.xpath("//*[@id=\"corePrice_desktop\"]/div/table/tbody/tr[2]/td[2]")).getText(); 
	  //  System.out.println(Price);
	 // DBConnect.DatabaseInsert(Price);
			 
			 
		//String Customer_Reviews = driver.findElement(By.xpath("//span[@id='acrCustomerReviewText'][1]")).getText();
		//System.out.println(Customer_Reviews);
//		 DBConnect.DatabaseInsert(Customer_Reviews);
		

		
		/* Thread.sleep(2000);
			 
		driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
	    driver.findElement(By.xpath("//img[@alt='narzo 50']")).click();
	    
		 String Title1= driver.findElement(By.xpath("//a[@id='bylineInfo']")).getText();
		System.out.println(Title1);
		 DBConnect.DatabaseInsert(Title1);
		
	    
	    String Price1 = driver.findElement(By.xpath("//*[@id=\"corePrice_desktop\"]/div/table/tbody/tr[2]/td[2]")).getText();
	   System.out.println(Price1);	
	   DBConnect.DatabaseInsert(Price1);
	    
		     
		 String Customer_Reviews1 = driver.findElement(By.xpath("//span[@id='acrCustomerReviewText'][1]")).getText();
		 System.out.println(Customer_Reviews1);
		 DBConnect.DatabaseInsert(Customer_Reviews1);
		 
		 
		     
		  Thread.sleep(2000);
		
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		 
	 JavascriptExecutor js =(JavascriptExecutor) driver;
		 
		js.executeScript("window.scrollBy(0,500)", "");
		 
	 driver.findElement(By.xpath("//img[@alt='Tecno 8 pro']")).click();
	 Thread.sleep(2000);
		 String Title2= driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
	 System.out.println(Title2);
	 DBConnect.DatabaseInsert(Title2);
	 
	 
	 Thread.sleep(1000);
	  String Price2 = driver.findElement(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']//span[@class='a-price-whole']")).getText();
	 System.out.println(Price2);
	 DBConnect.DatabaseInsert(Price2);
	 
	 Thread.sleep(1000);
	 
	  String Customer_Reviews2 = driver.findElement(By.xpath("//span[@id='acrCustomerReviewText'][1]")).getText();
	  System.out.println(Customer_Reviews2);
	  DBConnect.DatabaseInsert(Customer_Reviews2);*/
	  
		// driver.close();
		
	  

		 
		 

	 
