package December2023;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("testing");
		
		List <WebElement> list=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//descendant:://div[@class='lnnVSe']"));
		
		System.out.println("total member of list"+list.size());
		
		
		
	

	}

}
