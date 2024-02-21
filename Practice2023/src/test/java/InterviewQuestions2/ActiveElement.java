package InterviewQuestions2;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin" + Keys.TAB);
		

		driver.switchTo().activeElement().sendKeys("admin123" + Keys.TAB);

		driver.switchTo().activeElement().click();

	}

}
