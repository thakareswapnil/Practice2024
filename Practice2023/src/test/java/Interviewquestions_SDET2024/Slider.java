package Interviewquestions_SDET2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement MIN_Slider=driver.findElement(By.xpath("(//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[1]"));
		
		System.out.println(MIN_Slider.getSize());//(21, 21)
		
		System.out.println(MIN_Slider.getLocation());//(59, 250)
		
		Actions act=new Actions(driver);

		act.dragAndDropBy(MIN_Slider, 100, 0).perform();
		
		WebElement Max_Slider=driver.findElement(By.xpath("(//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[2]"));
		
		act.dragAndDropBy(Max_Slider, -100, 0).perform();
	}

}
