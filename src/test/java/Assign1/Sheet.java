package Assign1;
import java.io.FileInputStream;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sheet {
	
	WebDriver driver;
	String url=" https://jqueryui.com/droppable/";
	
	@BeforeClass
	public void setUp() throws Exception{ 
		System.setProperty("webdriver.chrome.driver","H:\\download\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException
	{
		//create a path for excel
		String path = "\\C:\\Users\\hp\\Documents\\Workbook.xlsx\\";
		
		//create input stream for the excel using above path
		FileInputStream fileStream = new FileInputStream(path);
		
		//create a reference of the workbook using the input stream reference - POI jars
		XSSFWorkbook workbook = new XSSFWorkbook (fileStream);
		
		//create a sheet reference using the workbook reference -- POI Jars-- already added
		XSSFSheet sheet = workbook.getSheet("Credentials");
	
		//get the last row num
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=1; i<=rowCount; i++)
		{
			//get the user_name
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			
			//passing the user_name in the valid field
			driver.findElement(By.name("")).clear();
			driver.findElement(By.name("")).sendKeys(username);
			
			//get the password
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			
			//passing the password in the password field
			driver.findElement(By.name("")).sendKeys(password);
			driver.findElement(By.name("")).click();
			List<WebElement> messageCount = driver.findElements(By.id(""));
			{
				driver.findElement(By.id("")).click();
			}
			else
			{
				continue;
			
		}
	}
	}
}
