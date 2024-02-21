package InterviewQuestions2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalNumberOfActiveElement {

	public static void main(String[] args) {

		int count = 0;
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/");
		
		driver.manage().deleteAllCookies();

		List<WebElement> ele = driver.findElements(By.xpath("//*"));
		for (WebElement webElement : ele) {

			if (webElement.isEnabled()) {
				// System.out.println(webElement.getText());
				count++;
			}

		}
		System.out.println("total number of active element on the webpage is==" + count);
		driver.close();
	}

}
