package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_Multiply {
  @Test
  public void TC_MultiplicationOfTwoNumbers()
  {
	  try
	  {
			System.setProperty("webdriver.chrome.driver",".//Automation jar//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.calculator.net");
			driver.manage().window().maximize();
			
			String ExpNo = "222075";
			//driver.findElement(By.id("sciOutPut")).sendKeys("423");
			driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
			driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
			
			driver.findElement(By.xpath("//span[normalize-space()='×']")).click();
			
			driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
			
			driver.findElement(By.xpath("//span[normalize-space()='=']")).click();
			WebElement ans=driver.findElement(By.xpath("//div[@id='sciOutPut']"));
			
			//System.out.println("Answer = "+ans.getText());
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(ExpNo,ans.getText().trim());
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[normalize-space()='AC']")).click();
			sa.assertAll();
			driver.close();
	  }catch (InterruptedException e) 
		  {
			e.printStackTrace();
		  }	 	
  }
}
