package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		// absolute xpath for Book a free demo
		//driver.findElement(By.xpath("/html/body/nav/div/div[2]/div[2]/ul/li/a")).click();

		
		//absolute xpath for enter the email field 
//		driver.findElement(
//				By.xpath("/html/body/div/div/div/section/div/div/div/div/div/div/form/fieldset/div/div/input"))
//				.sendKeys("asdfasfd.gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/section/div/div/div/div/div/div/form/fieldset/div/div/input")).sendKeys("asdfadf");
		
		
	}

}
