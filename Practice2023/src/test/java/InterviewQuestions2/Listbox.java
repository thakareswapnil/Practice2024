package InterviewQuestions2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.ls.LSInput;

public class Listbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/nget/train-search");
		
	WebElement listbox=	driver.findElement(By.xpath("//span[contains(text(),'All Classes')]"));
	
	listbox.click();
		
		Select s1=new Select(listbox);
		
		s1.selectByIndex(1);
		
	}

}
