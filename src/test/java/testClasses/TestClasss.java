package testClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryClasses.BaseClass;
import LibraryClasses.UtilityClass;
import POMClasses.POM1;
import POMClasses.POM2;

public class TestClasss extends BaseClass
{
	POM1 P1; POM2 P2;
	
	@BeforeClass
	public void callingBrowser() throws IOException
	{
		openBrowser();
		P1=new POM1(driver);
		P2=new POM2(driver);
	}
	
	@BeforeMethod
	public void objCreation() throws IOException, InterruptedException
	{
		P1.verifyHomeVisibility();
		P1.verifyOurStoryVisibility();
		P1.verifyOurSolutionVisibility();
		P1.verifyWhyTendableVisibility();
		P1.verifyRequestADemoVisibility();
		P2.clickOnContactUs();
		P2.clickOnMarketingContact_FillDetails(driver);
	}
	
	@Test
	public void validateTextFromGuru99() throws IOException
	{
		String actErrorrText=P2.errorMessageChecking();
		String expErrorrText=UtilityClass.PFData("expErrorText");
		System.out.println("=====actErrorrText=====");
		System.out.println("=====expErrorrText=====");
		Assert.assertEquals(actErrorrText,expErrorrText);
	}
	
	@AfterMethod
	public void waitSomeTime() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}