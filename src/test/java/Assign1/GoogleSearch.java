package Assign1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearch {
	WebDriver driver;
	String url="https://www.google.com/";
	@BeforeClass
	public void before()
	{
		System.setProperty("webdriver.chrome.driver","H:\\download\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	@AfterClass
	public void after()
	{
		driver.close();
	}
  @Test
  public void f() {
	  WebElement wb=driver.findElement(By.xpath("//input[@name='q']"));
	 wb.sendKeys("w3schools");
	 WebDriverWait w = new WebDriverWait(driver, 5);
     w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
     wb.submit();
	  
  }
}



