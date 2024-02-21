package Interviewquestions_SDET2024;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLInks1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("total links avliable on the page is  "+links.size());
		
		for(int i=0;i<=links.size();i++) {
			
			WebElement ele=links.get(i);
			
			String url=ele.getAttribute("href");
			
			URL link=new URL(url);
			Thread.sleep(4000);
			HttpURLConnection httpconnect=(HttpURLConnection)link.openConnection();
			
			httpconnect.connect();
			
			int code=httpconnect.getResponseCode();
			
			if(code>=400) {
				System.out.println(link+"--->"+"it is a broken link");
			}
			else
			{
				System.out.println(link+"--->"+"it is a valid link");
		}
		
		
		

	}

	}
}
