package week4day1assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Herokuapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
		int  row = driver.findElements(By.xpath("//table[@cellspacing='0']//tr")).size();
		System.out.println("The number of rows : " + row);
		
		int col = driver.findElements(By.xpath("//table[@cellspacing='0']//tr/th")).size();
		System.out.println("The number of columns : " + col);
		
	List<WebElement> data =  driver.findElements(By.xpath("//table[@cellspacing='0']//tr[3]/td[2]"));
		for(int i=0;i<data.size();i++) {
		String data1 =data.get(i).getText();
		
		System.out.println("required data:"+data1);
		}
		   driver.findElement(By.xpath("//table[@cellspacing='0']//tr[4]/td[3]")).click();
		   
		   Thread.sleep(5000);
	}
		     
		
		
}


