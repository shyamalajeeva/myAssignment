package Week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class editLead {

	public static void main(String[] args)throws InterruptedException {

				WebDriverManager.edgedriver().setup();
		
				EdgeDriver driver=new EdgeDriver();
				
				driver.get("http://leaftaps.com/opentaps/control/login");

				driver.findElement(By.id("username")).sendKeys("demosalesmanager");

				driver.findElement(By.id("password")).sendKeys("crmsfa");

				driver.findElement(By.className("decorativeSubmit")).click();
   
				driver.findElement(By.linkText("CRM/SFA")).click();

				driver.findElement(By.linkText("Leads")).click();

				driver.findElement(By.linkText("Find Leads")).click();

				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("shyamaJeeva");
				 	
				Thread.sleep(2000);

				driver.findElement(By.xpath("//div[@ class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();

				String title2 = driver.getTitle();
				System.out.println("newpage"+title2);

				driver.findElement(By.linkText("Edit")).click();

				driver.findElement(By.id("updateLeadForm_companyName")).clear();
				
				driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CtS");

				driver.findElement(By.name("submitButton"));
		 
				Thread.sleep(1000);

				driver.findElement(By.linkText("Find Leads")).click();
				
				
				String company= driver.findElement(By.xpath("//div[@ class='x-grid3-cell-inner x-grid3-col-companyName']/a")).getText();
				System.out.println("Updated company"+company);
				
				driver.close();
	}

}
