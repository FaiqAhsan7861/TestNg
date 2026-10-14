package oct5;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Propertyfile {
	WebDriver driver;
	Properties logpro;
@Test
    public void validatelogin() throws Throwable 
    {
	logpro = new Properties();
	//load property file
	logpro.load(new FileInputStream("Login.properties"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(logpro.getProperty("Url"));
	driver.findElement(By.id("txtUsername")).sendKeys(logpro.getProperty("Objuser"));
	driver.findElement(By.id("txtPassword")).sendKeys(logpro.getProperty("Objpass"));
	driver.findElement(By.id("btnLogin")).click();
	driver.quit();

    }
}
