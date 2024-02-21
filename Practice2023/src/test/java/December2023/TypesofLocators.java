package December2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesofLocators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
	//by id
		
	//WebElement email=	driver.findElement(By.id("email"));
		
		//by tagname
//		WebElement email=	driver.findElement(By.tagName("input"));
//	email.sendKeys("thakare23@gmail.com");
	
	//by  name
//	WebElement email1=driver.findElement(By.name("email"));
//	email1.sendKeys("akjfdjadfkkf");
//		
//	//by  linktext
//		WebElement email2=driver.findElement(By.linkText("Forgotten password?"));
//		email2.click();
		
//		//by partial linktext
//				WebElement email2=driver.findElement(By.partialLinkText("Forgotten"));
//				email2.click();
//				
				
				//by class
				
				//driver.findElement(By.className(" ")).click();
				
		WebElement email=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
		email.sendKeys("adfasdf");
		
		Thread.sleep(3000);
		
		email.clear();
	}

}
