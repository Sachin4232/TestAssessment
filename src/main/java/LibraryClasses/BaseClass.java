package LibraryClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
	@SuppressWarnings("deprecation")
	public void openBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.get(UtilityClass.PFData("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
}