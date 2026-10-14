package oct1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pack.Apputil1;

public class MAThoperations extends Apputil1 {
	@Test
	public void addition()
	{
		driver.findElement(By.name("display")).sendKeys(("2343"));
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.name("display")).sendKeys("45454");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String resadd = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(resadd+"   "+"Executing addition test",true);
	}
	@Test
	public void multiplication()
	{
		driver.findElement(By.name("display")).sendKeys(("8585"));
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.name("display")).sendKeys("7373");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String resmult = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(resmult+"   "+"Executing 	multiplication test",true);
	}
	@Test
	public void division()
	{
		driver.findElement(By.name("display")).sendKeys(("2443"));
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.name("display")).sendKeys("4998");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String resdiv = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(resdiv+"   "+"Executing division test",true);
	}

}
