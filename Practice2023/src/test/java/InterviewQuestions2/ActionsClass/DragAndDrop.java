package InterviewQuestions2.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement dest = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);

		act.dragAndDrop(source, dest);

		Thread.sleep(3000);

		driver.close();
	}

}
