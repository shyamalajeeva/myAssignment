package week4day1assignment;


	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class PrintRowandTable {

	
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions ch = new ChromeOptions();
			ch.addArguments("--disable-notifications");
			
			ChromeDriver driver = new ChromeDriver(ch);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
			driver.get(" https://html.com/tags/table/");
			
		
			int  row = driver.findElements(By.xpath("//div[@class='render']/table//tr")).size();
			System.out.println("The number of rows : " + row);
			
			int col = driver.findElements(By.xpath("//div[@class='render']/table//th")).size();
			System.out.println("The number of columns : " + col);
			
			
			
			driver.close();
		}}