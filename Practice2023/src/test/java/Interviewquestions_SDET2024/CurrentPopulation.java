package Interviewquestions_SDET2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentPopulation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
int i=0;
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.worldometers.info/");
		
		List<WebElement> pop=driver.findElements(By.xpath("//div[@data-target=\"#current_population\"]//span[@class=\"rts-counter\"]"));
		
		while(i<=5) {
			for(WebElement e:pop) {
				System.out.println(e.getText());
				i++;
			}
		}
	}

}
