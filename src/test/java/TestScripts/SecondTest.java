package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class SecondTest extends BaseClass
{
  @Test
   public void secondTest() throws InterruptedException
   {
	  SoftAssert soft=new SoftAssert();
	  
	  home.clickGears();
	  home.clickSkillrarydemoAPP();
	  web.handleChildBrowser();
	  soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
	  
	  skillraryDemo.selectCategory(web, 1);
	soft .assertEquals(testing.getPageHeader(),"Testing");
	
	  web.dragAndDropElement(testing.getSeleniumimage(), testing.getCartArea());
	  Thread.sleep(5000);
	  web.scrollToElement(testing.getFaceBookIcon());    //scrolling operation
	  testing.clickFaceBookIcon();
	  
	  soft.assertAll(); 
	  
   }
}
