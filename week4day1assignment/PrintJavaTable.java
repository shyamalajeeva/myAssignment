package week4day1assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintJavaTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get(" https://html.com/tags/table/");
		List<WebElement> text= driver.findElements(By.xpath("//div[@class='render']/table"));
		for (int i = 0; i < text.size(); i++) {
			System.out.println(text.get(i).getText());
		}
		List<WebElement> body = driver.findElements(By.xpath("//div[@class='render']/table/tbody"));
		System.out.println(body.size());
		
		

	}

}
