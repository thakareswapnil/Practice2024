package InterviewQuestions2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLInks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		//step1
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int totalLinks=links.size();
		System.out.println("total links available on the page are=="+totalLinks);
		
		for(int i=0;i<totalLinks;i++) {
			//step2
			WebElement ele=links.get(i);
			//step3
			String url=ele.getAttribute("href");
			//step4
			URL link=new URL(url);
			//step5
			HttpURLConnection httpurlconnect=(HttpURLConnection)link.openConnection();
			//step6
			httpurlconnect.connect();
			//step7
			int code=httpurlconnect.getResponseCode();
			
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
