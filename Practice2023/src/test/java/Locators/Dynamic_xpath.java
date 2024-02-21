package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_xpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/admin/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//conttains 
		
	driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("demo");
		
WebElement password=driver.findElement(By.xpath("//input[contains(@name,'passw')]"));
password.sendKeys("demo");

driver.findElement(By.xpath("//button[starts-with(@type,\"submit\")]")).click();
		
	}

}
