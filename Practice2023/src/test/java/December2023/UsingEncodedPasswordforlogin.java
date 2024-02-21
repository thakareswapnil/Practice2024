package December2023;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingEncodedPasswordforlogin {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("asdfasdf@gmail.com");
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys(decodingpassword("c3dhcG5pbEAxMjM="));
		
		//driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys(decodingpassword("c3dhcG5pbEAxMjM="));
	
	}//this will convert the encoded password to it's original format 
	static String decodingpassword(String pass) {
		byte [] decode=Base64.decodeBase64(pass);
		String pdecode=new String(decode);
		return pdecode;
	}

}
