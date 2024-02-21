package December2023;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsVSAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");

	//	Thread.sleep(5000);
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement feature = mywait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[@href=\"/products\"]"))));
//driver.findElement(By.xpath("//a[@href=\"/products\"]"));
		Actions act = new Actions(driver);

		// act.click(feature).perform();

		act.click(feature).build().perform();

		Action action = act.click(feature).build();// build will create the action
		action.perform();// perform will perform it
//		
//		Wait<WebDriver>MyWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
//				.pollingEvery(Duration.ofSeconds(4)).ignoring(NoSuchElementException.class);
//		
//		//usage
//		
//		WebElement element = MyWait.until(new Function<WebDriver,WebElement>(){
//			
//			public WebElement apply(WebDriver driver) {
//				
//				return driver.findElement(By.id("email12"));
//			}
//		});
		


	}

}
