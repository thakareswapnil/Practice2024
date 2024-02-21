package InterviewQuestions2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Switch to iframe using webelement
		WebElement framee=driver.findElement(By.xpath("//iframe[@name=\"globalSqa\"]"));
		driver.switchTo().frame(framee);
		
		//swtich to iframe using name of frame
		driver.switchTo().frame("globalSqa");
		
		//swtich to iframe using index  of frame not working
				driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//img[@data-image-title=\"SelenimTraining\"]")).click();

		driver.findElement(By.id("current_filter")).click();
	}

}
