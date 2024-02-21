package InterviewQuestions2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementandFindElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//exception no such element 
	//	WebElement name=driver.findElement(By.id("emaill"));
		
		List<WebElement> ele=driver.findElements(By.xpath("//div[@id=\"pageFooter\"]//a"));
		System.out.println(ele.size());
		
		for(WebElement e:ele) {
			System.out.println(e.getText());
		}
		

	}

}
