package GenericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomPages.ContactusPage;
import PomPages.CoreJavaForSeleniumPage;
import PomPages.CoreJavaVideoPage;
import PomPages.HomePagesofSkillrary;
import PomPages.SeleniumTrainingPage;
import PomPages.SkillraryDemoAppPage;
import PomPages.TestingPage;

public class BaseClass
{
	protected PropertiesFileUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePagesofSkillrary home;
	protected SkillraryDemoAppPage skillraryDemo;
	protected SeleniumTrainingPage selenium;
	protected TestingPage testing;
	protected ContactusPage contact;
	protected CoreJavaForSeleniumPage corejava; 
	protected CoreJavaVideoPage javavideo;
	protected long time;
	//@BeforeSuite
   //@BeforeTest
	
	@BeforeClass
	public void classConfiguration()
	{
	 property=new PropertiesFileUtility();
	 excel=new ExcelUtility();
	 web=new WebDriverUtility();
	 
	
	 property.propertyFileInitialization(IconstantPath.PROPERTIES_FILE_PATH);
	 excel.excelInitialization(IconstantPath.EXCEL_FILE_PATH);
	
	}
	
	
	@BeforeMethod
	public void methodConfiguration()
	{
		  time=Long.parseLong(property.fetchProperty("timeouts"));
			driver= web.openApplication(property.fetchProperty("browser"),property.fetchProperty("url"),time);
			
			home=new HomePagesofSkillrary(driver);
			
			Assert.assertTrue(home.getLogo().isDisplayed());
			
			skillraryDemo=new SkillraryDemoAppPage(driver);
			selenium=new SeleniumTrainingPage(driver);
			testing=new TestingPage(driver);
			contact=new ContactusPage(driver);
			corejava=new CoreJavaForSeleniumPage(driver);
			javavideo=new CoreJavaVideoPage(driver);		
	}
	
	@AfterMethod
	 public void methodTearDown()
	 {
		web.quitBrowser();
	 }
    @AfterClass
    public void classTearDown()
    {
    	excel.closeExcel();
    }
    //@AfterTest
	//@AfterTest@AfterSuite

}
