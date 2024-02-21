package InterviewQuestions2.TypeOfPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopup {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeOptions options=new ChromeOptions();
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("disable-media_stream");
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver(options);
		
		driver.get("https://mictests.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id=\"mic-launcher\"]")).click();
		
		Thread.sleep(3000);
		
		

	}

}
