package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;
import GenericLibraries.ExcelUtility;

public class FirstTest extends BaseClass
{
	 @Test
	 
	 public void firstTest() throws InterruptedException
	 {
		 SoftAssert soft=new SoftAssert();
				 
		 home.clickGears();
		 home.clickSkillrarydemoAPP();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		skillraryDemo.mouseHoverTocourse(web);
		
		skillraryDemo.clickSeleniumtraining();
		
	soft.assertEquals(selenium.getPageHeader(), "Selenium Training");
		selenium.doubleClickOnPlusButton(web);
		
		Thread.sleep(2000);
		selenium.clickAddToCart();
		web.handleAlert();
		web.explicitlyWait(time, selenium.getItemAddedMessage());
		web.takeScreenShot();

		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		
		soft.assertAll();		 
	 }
   
}
