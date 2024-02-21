package Interview_Questions;

import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.index.qual.SubstringIndexBottom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination_With_Dynamic_Webtable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/admin/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// login
		driver.findElement(By.id("input-username")).sendKeys("demo");

		driver.findElement(By.id("input-password")).sendKeys("demo");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		// sales and orders

		driver.findElement(By.xpath("//button[@class=\"btn-close\"]")).click();

		driver.findElement(By.xpath("//a[@href=\"#collapse-4\"]")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();

		// total numbers of pages in the table

		String text = driver.findElement(By.xpath("//div[@class=\"col-sm-6 text-end\"]")).getText();

		System.out.println(text);// Showing 1 to 100 of 43 (5 Page)
		// 1 page out of 5
		// driver.findElement("").gettext().split(" ")[8]; String
		// total=text.substring(23, 24);
		// System.out.println(total);

		// to find total number of the pages we have to write logic using string method

///		text.indexOf("(")+1=this will give first index, it start from zero therefore +1
//		text.indexOf("Pages")-1=this will give last index it start from zero therefore -1
//
//		subString(text.indexOf("(")+1,text.indexOf("Pages")-1) =to get total page we use substring method

		int total_pages = Integer.valueOf(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));
//
		System.out.println("total number of pages are:" + total_pages);

		

		// total number of rows in every page
		
		for (int p = 1; p <= total_pages; p++) 
		{
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println(active_page.getText());//for every ctive page tag is "span" and fot remaaining page it is "a" tag
			//active_page.click();
		
			
			int row=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println(row);

			
			String pageno=Integer.toString(p+1);
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']"));
			
			
		}

	}

	
}
