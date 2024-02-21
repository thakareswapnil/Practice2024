package InterviewQuestions2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.RandomString;

public class ScreenShotWithExplicitWait {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		
	
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
		
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		WebElement ele1=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class=\"text-center\"]")));
		
		File source=((TakesScreenshot)ele1).getScreenshotAs(OutputType.FILE);
		
		String random=RandomString.make(7);
		
		
		File dest=new File("C:\\Users\\swapnil\\OneDrive\\Desktop\\Screenshot\\demo1"+random+".jpg");
	
		FileHandler.copy(source, dest);

	}

}
