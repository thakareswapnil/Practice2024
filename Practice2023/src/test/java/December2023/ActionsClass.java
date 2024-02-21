package December2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebElement ele=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
//		
		Actions act=new Actions(driver);
		
		
		
		//Double click
	//	act.doubleClick(ele).perform();
//		
//		WebElement ele1=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
//		//right click or context click
//		act.contextClick(ele1).perform();
//		
		//drag and drop
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement source=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		
		WebElement destination=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		act.dragAndDrop(source, destination);
		

		
		
		
		
		
		
		
		
	}

}
