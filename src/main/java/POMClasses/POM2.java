package POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2
{
    @FindBy(xpath="//a[text()='Contact Us']") private WebElement ContactUs;
    @FindBy(xpath="(//button[text()='Contact'])[1]") private WebElement MarketingContact;
    @FindBy(xpath="//p[text()='Sorry, there was an error submitting the form. Please try again.']") private WebElement ErrorMsg;
	
	public POM2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnContactUs()
	{
		ContactUs.click();
	}
	
	public void clickOnMarketingContact_FillDetails(WebDriver driver) throws InterruptedException
	{
		MarketingContact.click();
		
		driver.findElement(By.xpath("(//input[@class='freeform-input '])[1]")).sendKeys("Sachin Kharje");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='freeform-input '])[2]")).sendKeys("Expleo Solutions Limited Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("95189705698");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("sachinhkharje4232@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='consentAgreed'])[1]")).click();
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}
	
	public String errorMessageChecking()
	{
		String text = ErrorMsg.getText();
		return text;
	}
}