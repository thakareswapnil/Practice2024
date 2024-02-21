package December2023;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserUsingUserInput {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Browser name");
		
		String browser=sc.nextLine();
		
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\OneDrive\\Desktop\\Installation\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
			 driver=new ChromeDriver();
		
		}
		
		
		
	}

}
