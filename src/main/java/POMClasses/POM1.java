package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class POM1 
{
	@FindBy(xpath="//img[@alt='Tendable Logo']") private WebElement Home;
	@FindBy(xpath="//a[text()='Our Story']") private WebElement OurStory;
	@FindBy(xpath="//a[text()='Our Solution']") private WebElement OurSolution;
	@FindBy(xpath="//a[text()='Why Tendable?']") private WebElement WhyTendable;
	@FindBy(xpath="//a[text()='Request A Demo']") private WebElement RequestADemo;
	
	public POM1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyHomeVisibility() throws InterruptedException
	{
		boolean result = Home.isDisplayed();
		
		Assert.assertTrue(result);
		
		Thread.sleep(2000);
	}
	
	public void verifyOurStoryVisibility() throws InterruptedException
	{
		boolean result = OurStory.isDisplayed();
		
		Assert.assertTrue(result);
		
		Thread.sleep(2000);
	}
	
	public void verifyOurSolutionVisibility() throws InterruptedException
	{
		boolean result = OurSolution.isDisplayed();
		
		Assert.assertTrue(result);
		
		Thread.sleep(2000);
	}
	
	public void verifyWhyTendableVisibility() throws InterruptedException
	{
		boolean result = WhyTendable.isDisplayed();
		
		Assert.assertTrue(result);
		
		Thread.sleep(2000);
	}
	
	public void verifyRequestADemoVisibility() throws InterruptedException
	{
		boolean result = RequestADemo.isDisplayed();
		
		Assert.assertTrue(result);
		
		Thread.sleep(2000);
	}
}