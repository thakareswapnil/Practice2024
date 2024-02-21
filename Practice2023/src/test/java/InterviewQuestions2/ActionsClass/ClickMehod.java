package InterviewQuestions2.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickMehod {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		
		WebElement clickable=driver.findElement(By.xpath("(//a[contains(text(),'Download')])[1]"));
		
		Actions act=new Actions(driver);
		
		act.click(clickable).build().perform();

	}

}
