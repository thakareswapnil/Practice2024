package Interviewquestions_SDET2024;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("total links avliable on the page is  "+links.size());
		
		List<String> urlist =new ArrayList<String>();
		
		for(WebElement e:links) {
		String url=	e.getAttribute("href");
			
			urlist.add(url);
			
			//checkbrokenlinks(url);
		}
		//urlist.parallelStream().forEach(e->checkbrokenlinks(e));
		
	}



	

	
	public static void checkbrokenlinks(String url) throws InterruptedException, IOException {
		try {
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
			
		} catch (Exception e) {
			
		}
	

}
}