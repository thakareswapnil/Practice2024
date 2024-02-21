package InterviewQuestions2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import net.bytebuddy.utility.RandomString;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotWithMethod {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.orangehrm.com/");
		
		WebElement e1=driver.findElement(By.xpath("//div[@class=\"homepage-slider-content\"]"));
		
		WebElement e2=driver.findElement(By.xpath("//input[@type=\"email\"]"));
		
		
		
		screenshot(e1,"oranege");
		
		screenshot(e2,"email");
		
		driver.close();

	}
	
	public static void screenshot(WebElement ele,String name) throws IOException {
		
		File source=((TakesScreenshot)ele).getScreenshotAs(OutputType.FILE);
		
		String random=RandomString.make(7);
		
		String filename=name+random;
		
		File dest =new File("C:\\Users\\swapnil\\OneDrive\\Desktop\\Screenshot\\"+filename+".jpg");
		
		FileHandler.copy(source, dest);
		
	}

}
