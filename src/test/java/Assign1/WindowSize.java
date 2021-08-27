package Assign1;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowSize {
	WebDriver driver;
	String url="http://openclinic.sourceforge.net/openclinic/home/index.php";
	@BeforeClass
	public void before()
	{
		System.setProperty("webdriver.chrome.driver","H:\\download\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
  @Test
  public void f() {
	  System.out.println(driver.manage().window().getSize());
      Dimension dm = new Dimension(450,630);
      driver.manage().window().setSize(dm);
  }
  @AfterClass
  public void after()
  {
	  driver.close();
  }
}
