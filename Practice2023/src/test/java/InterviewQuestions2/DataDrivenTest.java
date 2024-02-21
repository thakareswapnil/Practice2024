package InterviewQuestions2;

import java.io.IOException;
import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

	}
	@Test(dataProvider = "testdata")
	public void testcasess(String uname,String pass,String result){
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement username=driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		username.clear();
		username.sendKeys(uname);
		
		WebElement password=driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		password.clear();
		password.sendKeys(pass);
		
		driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
		
	}
	
	@DataProvider(name="testdata")
	public String [][] getdata() throws IOException {
		
//		String [][]logindata= { 
//				{"admin@yourstore.com","admin","Valid"},
//				{"admin@yourstore.com","adm","Invalid"},
//				{"adm@yourstore.com","admin","Invalid"},
//				{"adm@yourstore.com","adm","Invalid"}
//				
//				
//				
//		};
		String path="C:\\Users\\swapnil\\eclipse-workspace\\Practice2023\\loginData.xlsx";
		XlUtilities xlutils=new XlUtilities(path);
		
		int rowcounts=xlutils.getrowcount("sheet1");	
		int cellcounts=xlutils.getcellcount("sheet1", 1);
		
		String logindata[][]=new String[rowcounts][cellcounts];
		for(int i=1;i<=rowcounts;i++) {
			for(int j=0;j<cellcounts;j++) {
				logindata[i-1][j]=xlutils.celldata("sheet1", i, j);
			}
		}
		
		return logindata;
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
