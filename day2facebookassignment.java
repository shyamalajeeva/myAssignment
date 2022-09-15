package Week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;

public class day2facebookassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();

		driver.findElement(By.name("firstname")).sendKeys("shyami");
		
		driver.findElement(By.name("lastname")).sendKeys("jick");
		
		driver.findElement(By.name("reg_email__")).sendKeys("shmld@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("rrr");
		
		WebElement day = driver.findElement(By.id("day"));
		Select birthday=new Select(day);
		birthday.selectByValue("17");
		
		WebElement month = driver.findElement(By.id("month"));
		Select birthmonth=new Select(month);
		birthmonth.selectByValue("6");
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select birthyear=new Select(year);
		birthyear.selectByValue("1991");
		


		driver.findElement(By.name("sex")).click();
		
	}

	

}
