package December2023;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.its.ITSValidityPeriod.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerType1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		
		
		driver.findElement(By.xpath("//input[@role=\"searchbox\"]")).sendKeys("Pune");
		
		driver.findElement(By.xpath("//input[@aria-controls=\"pr_id_2_list\"]")).sendKeys("mumbai");
		
		driver.findElement(By.xpath("//input[@class=\"ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted\"]")).click();
		
		
		
		String month="April";
		
		String year="2024";
		
		String day="6";
		
		
			//System.out.println(tmonth+" "+tyear);
		
			//to reach to the  month and year
			while(true) {
				String tmonth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month ng-tns-c58-10 ng-star-inserted\"]")).getText();
				
				 String tyear=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year ng-tns-c58-10 ng-star-inserted\"]")).getText();
				
				if((tmonth.equalsIgnoreCase(month)&&tyear.equals(year))) 
					break;
				else
					driver.findElement(By.xpath("//span[@class=\"ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10\"]")).click();
			}
		
		//to select date
			Thread.sleep(5000);
		List<WebElement> date=	driver.findElements(By.xpath("//div[@style=\"z-index: 1004; top: -299px; left: 0px; transform: translateY(0px); opacity: 1;\"]//td"));
		
		for(WebElement d:date) {
			
			String dt=d.getText();
		
			if(dt.equals(day))
				d.click();
			
		}
		Thread.sleep(3000);
		WebElement Aclass=driver.findElement(By.xpath("//span[@class=\"ng-tns-c65-11 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted\"]"));
		Aclass.click();
		Select s=new Select(Aclass);
		
		s.selectByVisibleText("AC 2 Tier (2A)");
	}

}
