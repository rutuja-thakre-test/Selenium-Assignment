package Assign1;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DropDown {
	
	WebDriver driver;
	String url="https://www.jquery-az.com/boots/demo.php?ex=63.0_2";
	
	@BeforeClass
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver","H:\\download\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test
	public void Test() throws InterruptedException{
		
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button/span")).click();
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.close();
	}
}

