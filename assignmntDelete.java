package Week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignmntDelete {

	public static void main(String[] args) throws InterruptedException {
	
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/main");
		
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");

			driver.findElement(By.id("password")).sendKeys("crmsfa");

			driver.findElement(By.className("decorativeSubmit")).click();
   
			driver.findElement(By.linkText("CRM/SFA")).click();
   
			driver.findElement(By.linkText("Leads")).click();
  
			driver.findElement(By.linkText("Find Leads")).click();

			driver.findElement(By.xpath("//span[text()='Phone']")).click();

 			driver.findElement(By.name("phoneCountryCode")).sendKeys("101");
 			
  			driver.findElement(By.name("phoneAreaCode")).sendKeys("333");
  			
 			driver.findElement(By.name("phoneNumber")).sendKeys("159263487");
 			
 			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
 			
 			driver.findElement(By.linkText("Find Leads")).click();
 		    		 
 			String company= driver.findElement(By.xpath(" //div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			System.out.println("Id captured"+company);
				
			driver.findElement(By.xpath("//div[@ class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
	
			driver.findElement(By.linkText("Delete")).click();

			driver.findElement(By.linkText("Find Leads")).click();
	 		  
			driver.findElement(By.name("id")).sendKeys(company);
			
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

			Thread.sleep(5000);
			String msg= driver.findElement(By.className("x-paging-info")).getText();
			System.out.println("This message confirms the successful deletion   "+msg);
			 
			driver.close();
	
	}
}
