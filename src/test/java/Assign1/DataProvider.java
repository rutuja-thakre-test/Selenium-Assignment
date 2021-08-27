package Assign1;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class DataProvider {
		WebDriver driver;
		
		@BeforeMethod
		public void setUp() {
			
			System.setProperty("webdriver.chrome.driver","H:\\download\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		@Test(dataProvider="TestData")
		public void test(String username, String password) {
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys("username");
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys("password");
		}
		@org.testng.annotations.DataProvider(name="TestData")
		public Object[][] getData()
		{
			Object[][] data =new Object[3][2];
			data[0][0]="user1";
			data[0][1]= "password1";
			
			data[1][0]="user2";
			data[1][1]= "password2";
			
			data[2][0]="user3";
			data[2][1]= "password3";
			
			return data;
			
		}
		
		
		@AfterMethod
		public void tearDown() {
			//driver.close();
			
		}

	}


