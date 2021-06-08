package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_Subtraction {
  @Test
  public void TC_SubtractionOfTwoNumbers()
  {
	 try
		{
	      System.setProperty("webdriver.chrome.driver",".//Automation jar//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.calculator.net");
		  driver.manage().window().maximize();
		  
		  String Expectedno="23329646";
		  
		  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		 	  
		  driver.findElement(By.xpath(" //span[contains(text(),'–')]")).click();
		  
		  driver.findElement(By.xpath(" //span[contains(text(),'–')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'9')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		  
		  driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		  WebElement ans4= driver.findElement(By.xpath("//div[@id='sciOutPut']"));
		  
		  //System.out.println("Answer="+ans4.getText());
		  SoftAssert as=new SoftAssert();
		  as.assertEquals(Expectedno, ans4.getText().trim());
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		  as.assertAll();  
		  driver.close();
		}catch (InterruptedException e) 
		  {
			e.printStackTrace();
		  }
	 
  }
}
