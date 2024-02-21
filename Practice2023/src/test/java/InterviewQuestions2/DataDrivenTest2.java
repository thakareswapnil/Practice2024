package InterviewQuestions2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest2 {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	@Test(dataProvider  = "exceldata")
	public void testdata(String username,String password,String result) {
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys(username);
		
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys(password);
		
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		
		String results=driver.findElement(By.xpath("//h1[@class=\"post-title\"]")).getText();
		
		
		if(results.equalsIgnoreCase("Logged In Successfully")) {
			assertTrue(true, "valid username and password");
		}
		else
		{
			assertTrue(false, "invalid username  and password");
		}
			
		
		
	}
	
	@ DataProvider(name="exceldata")
	public String [][]getdata() throws IOException {
		
		String path="C:\\Users\\swapnil\\eclipse-workspace\\Practice2023\\loginData.xlsx";
		XlUtilities xlutils=new XlUtilities(path);
		
		int rowcount=xlutils.getrowcount("sheet1");
		int cellcount=xlutils.getcellcount("sheet1", 1);
		
		String [][] logindata=new String[rowcount][cellcount];
		
		for(int i=1;i<=rowcount;i++) {
			for(int j=0;j<cellcount;j++) {
				logindata[i-1][j]=xlutils.celldata("sheet1", i, j);
			}
		}
		
		
		
		return logindata;
		
	}
	
	@AfterTest
	public void  teardown() {
		driver.close();
		
	}

}
