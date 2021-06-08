package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_Division {
  @Test
  public void TC_DivisionOfTwoNumbers()
  {
	  try 
	  {
		  System.setProperty("webdriver.chrome.driver",".//Automation jar//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.calculator.net");  
		  driver.manage().window().maximize();
		  
		  String Expectedno="20";
		  
		  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		  
		  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();
		  
		  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		  
		  driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		  WebElement ans2= driver.findElement(By.xpath("//div[@id='sciOutPut']"));
		  
		  //System.out.println("Answer="+ans2.getText());
		  SoftAssert as=new SoftAssert();
		  as.assertEquals(Expectedno, ans2.getText().trim());
	
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		  as.assertAll(); 
		  driver.close();
	  } catch (InterruptedException e) 
		  {
			e.printStackTrace();
		  }	 	 
  }
}
