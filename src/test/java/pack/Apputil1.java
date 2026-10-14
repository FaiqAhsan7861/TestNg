package pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Apputil1 {
public static WebDriver driver;
@BeforeMethod
public static void Setup()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.qedgetech.com/calculator.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Reporter.log("======= Running Before Method=======",true);
}
@AfterMethod
public static void tearDown()
{
	driver.quit();
	Reporter.log("=====Running After Method=====",true);
}
}
