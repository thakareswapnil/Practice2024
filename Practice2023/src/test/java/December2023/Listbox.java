package December2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		WebElement wb=driver.findElement(By.xpath("class=\"ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all\""));
		
		Select st=new Select(wb);
		
		st.selectByIndex(3);
		
	//	st.selectByValue("Vistadome AC (EV)");
		
     //   st.selectByVisibleText("LOWER BERTH/SR.CITIZEN");
	}

}
