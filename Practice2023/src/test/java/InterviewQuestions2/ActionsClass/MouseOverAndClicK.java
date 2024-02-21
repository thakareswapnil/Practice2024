package InterviewQuestions2.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAndClicK {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		WebElement ele1=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		
		WebElement ele2=driver.findElement(By.xpath("//span[text()='Create a Wish List']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ele1).click(ele2).build().perform();
		
		
	}

}
