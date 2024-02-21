package InterviewQuestions2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleAndWIndowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		//driver.findElement(By.id("newWindowBtn")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]")).click();
//		
//		Set<String>windowID=driver.getWindowHandles();
//
//		List<String> windowhandle=new ArrayList<String>(windowID);
//		
//		for(String id:windowhandle) {
//		String title=	driver.switchTo().window(id).getTitle();
//			System.out.println(title+"---"+id);
//			
////			if(title.equalsIgnoreCase("Basic Controls - H Y R Tutorials"))
////				driver.close();
//		}
//		
//		
//	}
	}
}
