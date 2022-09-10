package week2day1class;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicatelead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//find username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//find password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	 //click the button
    driver.findElement(By.className("decorativeSubmit")).click();
    //GetText
    String text = driver.findElement(By.tagName("h2")).getText();
    //print the tagname
    System.out.println(text);
    //click crm/sfa
    driver.findElement(By.linkText("CRM/SFA")).click();
    //click leadsbutton;
    driver.findElement(By.linkText("Leads")).click();
    //click createlead;
    driver.findElement(By.linkText("Create Lead")).click();
    //click enetr companyname 
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf1");
    //firstname
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shyamala");
    //lastname
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jeeva");
    //firstname local
    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shyama");
    //department
   //dep
	 //
	  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Digital testing");

    
    //description field
  //description
  	 //createLeadForm_description
	  driver.findElement(By.id("createLeadForm_description")).sendKeys("working on first time.success");
	  	
    //email //email-

  	  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shyamalajeeva17@gmail.com");
  	  
  	  
  	  //create lead-smallSubmit //create button
  	 driver.findElement(By.className("smallSubmit")).click();
  	 
  	String title2 = driver.getTitle();
	
	System.out.println("newpage"+title2);
	
  	 
  	 //duplicate lead
     driver.findElement(By.linkText("Duplicate Lead")).click();
     
     //clear company name;createLeadForm_companyName enterb new company name;
     
     driver.findElement(By.className("inputBox")).clear();
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tcs");
	  
     
     //clear first name;
     driver.findElement(By.id("createLeadForm_firstName")).clear();
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("shyamalad");
	  
    // click create lead button  submitButton
     driver.findElement(By.name("submitButton")).click();
     
     String title1 = driver.getTitle();
 	
 	System.out.println("newpage"+title1);
    
	
	}

}
