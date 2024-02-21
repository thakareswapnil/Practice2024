package InterviewQuestions2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElemetnMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@name=\"email\"]"));
		
		System.out.println(email.isDisplayed());
		
		System.out.println(email.isEnabled());
		
		System.out.println(email.isSelected());
		
		Thread.sleep(3000);
		email.sendKeys("asdfasdf");
		Thread.sleep(3000);
		email.clear();

	}

}
