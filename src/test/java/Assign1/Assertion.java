package Assign1;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Assertion {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","H:\\download\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://accounts.google.com/signup");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


			WebElement attr = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
			attr.sendKeys("sonu");
			String firstname = attr.getAttribute("value");
			System.out.println("first name:"+firstname);
			
			WebElement attr1 = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
			attr1.sendKeys("jaiswal");
			String lastname = attr1.getAttribute("value");
			System.out.println("Last name:"+lastname);
			
			WebElement attr3 = driver.findElement(By.name("Username"));
			attr3.sendKeys("jaiswalsta12");
			String username = attr3.getAttribute("value");
			System.out.println("username:"+username);
			
			
			//driver.close();
			
			
		}

	}


