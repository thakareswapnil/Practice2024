package Interviewquestions_SDET2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebtable2_with_all_Element {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> ele = driver
				.findElements(By.xpath("//a[contains(text(),'Escorts Ltd.')]/parent::td/parent::tr/parent::tbody/child::tr"));

		System.out.println(ele.size());
		for (WebElement e : ele) {
			String eledata=e.getText();
			if(eledata.equals("Sun Pharma"))
			System.out.println(eledata);
		}
	}
		
		
		
//	public static void getxpath() {
//		List<WebElement> ele = driver
//				.findElements(By.xpath("//a[contains(text(),'Escorts Ltd.')]/parent::td/parent::tr/parent::tbody/child::tr"));
//
//		//System.out.println(ele.size());
//		for (WebElement e : ele) {
//			String eledata=e.getText();
//			if(eledata.startsWith("Sun Pharma.")){
//				System.out.println(eledata);
//				
//			}
//		}

	}


