package InterviewQuestions2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SceenShot2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.orangehrm.com/");
		
		WebElement logo1=driver.findElement(By.xpath("(//img[@alt=\"OrangeHRM Logo\"])[1]"));
		
		WebElement logo2=driver.findElement(By.xpath("(//img[@alt=\"OrangeHRM Logo\"])[2]"));
		
		File source1=((TakesScreenshot)logo1).getScreenshotAs(OutputType.FILE);
		
		File source2=((TakesScreenshot)logo2).getScreenshotAs(OutputType.FILE);
		
		String random=RandomString.make(7);
		
		File dest1=new File("C:\\Users\\swapnil\\OneDrive\\Desktop\\Screenshot\\logo1"+random+".jpg");
		
		File dest2=new File("C:\\Users\\swapnil\\OneDrive\\Desktop\\Screenshot\\logo2"+random+".jpg");
		
		FileHandler.copy(source1, dest1);
		
		FileHandler.copy(source2, dest2);
		
		driver.quit();
		
		
	}

}
