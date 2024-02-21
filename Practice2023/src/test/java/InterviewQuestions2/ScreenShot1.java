package InterviewQuestions2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		
	
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random=RandomString.make(7);
		
		
		File dest=new File("C:\\Users\\swapnil\\OneDrive\\Desktop\\Screenshot\\demo1"+random+".jpg");
	
		FileHandler.copy(source, dest);

	}

}
