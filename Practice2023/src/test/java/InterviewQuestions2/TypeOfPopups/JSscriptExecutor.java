package InterviewQuestions2.TypeOfPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSscriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	/*	//to accept the alert
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		//to accept or dismiss the alert popup
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		
		Thread.sleep(3000);
		
		//driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();*/
		
		//get and send text to the alert box
		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Thread.sleep(3000);
		
		Alert windowalert=driver.switchTo().alert();
		System.out.println(windowalert.getText());
		
		windowalert.sendKeys("helloooo");
		windowalert.accept();
		Thread.sleep(2000);
		driver.close();
		
	}

}
