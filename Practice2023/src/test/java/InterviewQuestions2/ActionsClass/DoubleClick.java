package InterviewQuestions2.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(ele).build().perform();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
