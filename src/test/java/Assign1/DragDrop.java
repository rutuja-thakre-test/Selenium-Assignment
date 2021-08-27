package Assign1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragDrop {

	WebDriver driver;
	String url=" https://jqueryui.com/droppable/";
	
	@BeforeMethod
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver","H:\\download\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.close();
	}
	
	@Test
	public void Test() throws InterruptedException
	{
	//source element
	WebElement fromElement = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
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