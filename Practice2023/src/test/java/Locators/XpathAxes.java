package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://money.rediff.com/indices/nse/nifty-50");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// self node
		String text = driver.findElement(By.xpath("//a[@href=\"//money.rediff.com/companies/cipla/12540010\"]"))
				.getText();

		System.out.println("selfnode is---> " + text);

		// parent node
		text = driver.findElement(By.xpath("//a[@href=\"//money.rediff.com/companies/cipla/12540010\"]/parent::td"))
				.getText();

		System.out.println("parentnode is---> " + text);

		// child node
		List<WebElement> text1 = driver.findElements(
				By.xpath("//a[@href=\"//money.rediff.com/companies/cipla/12540010\"]/ancestor::tr/child::td"));

		System.out.println("total number of ancestor to child node-->" + text1.size());
		for (int i = 0; i <= text1.size() - 1; i++) {
			System.out.println(text1.get(i).getText());
		}

		//descendant
		List<WebElement> text5 = driver
				.findElements(By.xpath("//a[@href=\"//money.rediff.com/companies/cipla/12540010\"]/ancestor::tr/descendant::*"));

		System.out.println("descendant is---> " + text5.size());
		
		
		
		// ancestor
		text = driver.findElement(By.xpath("//a[@href=\"//money.rediff.com/companies/cipla/12540010\"]/ancestor::tr"))
				.getText();

		System.out.println("ancestornode is---> " + text);

		// following
		List<WebElement> text2 = driver
				.findElements(By.xpath("//a[@href=\"//money.rediff.com/companies/cipla/12540010\"]/following::td"));

		System.out.println("following is---> " + text2.size());

		//// preceding
		List<WebElement> text3 = driver
				.findElements(By.xpath("//a[@href=\"//money.rediff.com/companies/cipla/12540010\"]/preceding::td"));

		System.out.println("preceding is---> " + text3.size());
		// preceding sibling
		List<WebElement> text4 = driver.findElements(By
				.xpath("//a[@href=\"//money.rediff.com/companies/cipla/12540010\"]/ancestor::tr/preceding-sibling::*"));

		System.out.println("preceding sibling is---> " + text4.size());

		driver.close();
	}

}
