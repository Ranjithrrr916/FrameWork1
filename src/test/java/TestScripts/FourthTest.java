package TestScripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class FourthTest extends BaseClass
{
 @Test
 
		public void fourthTest()
		{
	      SoftAssert soft=new SoftAssert();
	      
	      home.clickGears();
	      home.clickSkillrarydemoAPP();
	      web.handleChildBrowser();
	      
	      soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		web.scrollToElement(skillraryDemo.getcontactus());
	    skillraryDemo.clickContactUs();
	   
	    
	  soft.assertTrue(contact.getPageHeader().isDisplayed());
	    
	    List<String>data=excel.fetchDatafromExcel("Sheet1");
	    contact.submitDetails(data.get(1), data.get(2),data.get(3),data.get(4));
	    soft.assertAll();
	    
		}
}
