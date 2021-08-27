package Assign1;

	import java.util.ArrayList;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class SwitchTab {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","H:\\download\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			String SelectLinkNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
			driver.findElement(By.linkText("Medical Records")).sendKeys(SelectLinkNewTab);
			

			ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
			
			driver.switchTo().window(tabs.get(1));
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click();
			
			Select dropdown = new Select(driver.findElement(By.id("search_type")));
			dropdown.selectByIndex(2);
			
			driver.findElement(By.id("search_patient")).click();
			
			driver.quit();


		}
		

	}

