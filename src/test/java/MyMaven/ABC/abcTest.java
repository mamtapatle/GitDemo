package MyMaven.ABC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class abcTest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.ie.driver", "C:\\work\\selenium driver\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		
	}
	@Test
	public void googleTest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	
	@Test
	public void  Even() {
		System.out.println("this is demo test");
	}
	@Test
	public void  odd() {
		System.out.println("this is demo test");
	}
	@Test
	public void  get() {
		System.out.println("this is demo test");
	}
	
	@AfterTest
	public void wrapUp()
	{
		driver.quit();
	}

}
