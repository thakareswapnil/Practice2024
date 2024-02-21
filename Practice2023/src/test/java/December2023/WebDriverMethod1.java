package December2023;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		
		//get method
		
		//driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		//getpage source methof
		//System.out.println(driver.getPageSource());
		
		
		//get current url
		
		System.out.println(driver.getCurrentUrl());
		
		//get title
		
		System.out.println(driver.getTitle());
		
		//get window handle
		System.out.println(driver.getWindowHandle());
		
		//get window handles
		Set<String > handles=driver.getWindowHandles();
		System.out.println(handles);
		
		//navigate method
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amezon.in/");
		
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		
	System.out.println(driver.manage().window().getSize());
	
	
	System.out.println(driver.manage().window().getPosition());
		
		//driver.close();
		
		//driver.quit();
		
		
	}

}
