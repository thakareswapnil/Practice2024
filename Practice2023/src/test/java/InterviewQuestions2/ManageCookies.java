package InterviewQuestions2;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageCookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/");

		Set<Cookie> cookies = driver.manage().getCookies();
		// gives total number of the cookie present on the page
		System.out.println("total cookies on the page==" + cookies.size());

		// gives name and value of the all cookie present on the page

		for (Cookie cookie : cookies) {
			
		 
			System.out.println(
					"Name of the cookie==" + cookie.getName() + ":" + "value of the cookie is==" + cookie.getValue());

		}
		System.out.println("=====================================================");
		
		// fetch the particular cookie with the help of name
		System.out.println(driver.manage().getCookieNamed("fr"));// this return all value related to the cookie
		System.out.println("=====================================================");
		
		// to add user define cookie
		Cookie cobj = new Cookie("mycookie", "123456789");
		driver.manage().addCookie(cobj);
		System.out.println("=====================================================");
		
		cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		for (Cookie cookie : cookies) {
			System.out.println(
					"Name of the cookie==" + cookie.getName() + ":" + "value of the cookie is==" + cookie.getValue());

		}
		System.out.println("=====================================================");

		/*//to delete specific cookie
		driver.manage().deleteCookieNamed("mycookie");
		//after deleting specific cookie size of the cookie remaining
		cookies = driver.manage().getCookies();
		System.out.println("size of the cookie after deleting specific cookie"+cookies.size());
		for (Cookie cookie : cookies) {
			System.out.println(
					"Name of the cookie==" + cookie.getName() + ":" + "value of the cookie is==" + cookie.getValue());

		}
		System.out.println("=====================================================");
		//delete all the cookie
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("size of the cookie after deleting all cookie=="+cookies.size());
		
		
		driver.close();

	}*/
	}
}
