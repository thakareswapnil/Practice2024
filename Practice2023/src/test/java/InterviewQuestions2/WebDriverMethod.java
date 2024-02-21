package InterviewQuestions2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//get
		driver.get("https://www.facebook.com/");
		
		//manage
		driver.manage().window().maximize();
		
		//get title
		System.out.println(driver.getTitle());
		
		//get current url
		System.out.println(driver.getCurrentUrl());
		
		//get page source
		//System.out.println(driver.getPageSource());
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		driver.close();
		
		

	}

}
