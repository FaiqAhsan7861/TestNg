package oct1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pack.Apputil;

public class FirstTestNgClass extends Apputil{
@Test(priority = 2)
public void Admin()
{
	driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
	Reporter.log("============Executing Admin Test==============");
}
@Test(priority = 0,enabled = true)
public void PIM()
{
	driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	Reporter.log("============Executing PIM Test================");
}
@Test(priority = 1)
public void Leave()
{
	driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
	Reporter.log("============Executing Leave Test================");
}
}
