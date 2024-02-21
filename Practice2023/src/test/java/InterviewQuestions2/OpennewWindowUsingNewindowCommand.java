package InterviewQuestions2;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpennewWindowUsingNewindowCommand {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/");
		
		WebElement msg=driver.findElement(By.xpath("//a[contains(text(),'Messenger')]"));
		String URL=msg.getAttribute("href");
		
		driver.switchTo().newWindow(WindowType.WINDOW);//to open new window in browser
		
		driver.get(URL);
		
		Set<String> ids=driver.getWindowHandles();
		
		for (String id : ids) {
		System.out.println(id);
			
		}
		
		driver.close();
		
		
		
		
		
	}

}
