package Assign1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@BeforeTest
	public void abc() throws InterruptedException {
	 
		
		String url=" https://jqueryui.com/droppable/";
		System.setProperty("webdriver.chrome.driver","H:\\download\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(newTb.get(1));
 }
	@AfterMethod
	public void tearDown() throws Exception {
		//driver.close();
	}
	
	@Test
	public void Test() throws InterruptedException
	{
	//source element
		Thread.sleep(3000);
	WebElement fromElement = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	//destination element
	WebElement toElement = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	//reference for action class
	Actions action = new Actions(driver);
	action.dragAndDrop(fromElement , toElement).perform();
	
	String expectedMessage = "Dropped";
	
	String actualMessage = driver.findElement(By.xpath("//*[@id=\\\"droppable\\\"]")).getText();
	
	Assert.assertEquals(expectedMessage, actualMessage);
	
	}

}
