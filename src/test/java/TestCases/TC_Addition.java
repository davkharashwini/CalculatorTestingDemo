package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_Addition {
  @Test
  public void TC_AdditionOfTwoNumbers() 
  {
	  try 
	  {
		  System.setProperty("webdriver.chrome.driver",".//Automation jar//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.calculator.net");
		  driver.manage().window().maximize();
		  
		  String Expectedno="111111";
		  
		  driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		  
		  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]")).click();
		  
		  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		  
		  driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		  WebElement ans3= driver.findElement(By.xpath("//div[@id='sciOutPut']"));
		  
		  //System.out.println("Answer="+ans3.getText());
		  SoftAssert as=new SoftAssert();
		  as.assertEquals(Expectedno, ans3.getText().trim());
		  
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
