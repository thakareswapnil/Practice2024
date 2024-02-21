package InterviewQuestions2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider11 {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test(dataProvider = "data1")
	public void test1(String username, String password, String result) {

		WebElement uname = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		uname.sendKeys(username);

		WebElement pass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pass.sendKeys(password);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		WebElement dash = driver
				.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]"));
		String dashdata = dash.getText();

		if (dashdata.equals("Dashboard")) {
			driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
			driver.findElement(By.xpath("(//a[@role=\"menuitem\"])[4]")).click();// logout

			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@DataProvider(name = "data1")
	public String[][] testdata() throws IOException {

		String path = ".//test-output//loginData.xlsx";
		XlUtilities xlutil = new XlUtilities(path);
		int row = xlutil.getrowcount("Sheet1");
		int cell = xlutil.getcellcount("Sheet1", 1);

		String[][] logindata = new String[row][cell];
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < cell; j++) {
				logindata[i - 1][j] = xlutil.celldata("Sheet1", i, j);
			}
		}

		return logindata;

	}

	@AfterTest
	public void teardown() {
		driver.close();

	}

}
