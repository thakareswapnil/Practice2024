package InterviewQuestions2;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {

//		total number of rows and column
//		print all text from webtable
//		print specific data from table
		
		Scanner sc=new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/ecosystem/");

//		int totalrow = driver
//				.findElements(By.xpath("//div[@class=\"row justify-content-center p-5 td-box--100\"]//tbody//tr"))
//				.size();
//		System.out.println("total number of row in the table ==" + totalrow);
//
//		int totalcolumn = driver
//				.findElements(By.xpath("//div[@class=\"row justify-content-center p-5 td-box--100\"]//thead//tr//th"))
//				.size();
//		System.out.println("total number of column in the table ==" + totalcolumn);
//
//		List<WebElement> rowsdata = driver
//				.findElements(By.xpath("//div[@class=\"row justify-content-center p-5 td-box--100\"]//tbody//tr"));
//
//		System.out.println("data prsent in the row of the table ");
//		for (WebElement rowdata : rowsdata) {
//			System.out.println(rowdata.getText());
//		}
//		
//		System.out.println("***************************************");
//		
//		System.out.println("data prsent in the column of the table ");
//		List<WebElement> columnsdata = driver
//				.findElements(By.xpath("//div[@class=\"row justify-content-center p-5 td-box--100\"]//thead//tr//th"));
//
//		for (WebElement columndata : columnsdata) {
//			System.out.println(columndata.getText());
//			
//		}
//		
		//data present in the specific row and column
		
		String  specificdata=driver.findElement(By.xpath("//div[@class=\"row justify-content-center p-5 td-box--100\"]//tbody//tr["+i+"]//td["+j+"]")).getText();
		System.out.println(specificdata);
		
		
		
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
