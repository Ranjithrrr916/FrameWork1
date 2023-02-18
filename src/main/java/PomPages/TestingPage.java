package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebDriverUtility;

public class TestingPage
{

	//Declaration
	
			@FindBy(xpath="//h1[@class='page-header']")
			 private WebElement pageHeader;
			
			@FindBy(id="Selenium Training")
			 private WebElement seleniumImage;
			
			@FindBy(id="cartArea")
			 private WebElement  cartArea;
			
			@FindBy(xpath="//footer[@class='main-footer']/descendant::i[@class='fa fa-facebook']")
			 private WebElement facebookIcon;
			
			
			//initialization
			
			public TestingPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//utilization
			public String getPageHeader()
			{
				return pageHeader.getText();
			}
			
			public WebElement getSeleniumimage()
			{
				return seleniumImage;
			}
			public WebElement getCartArea()
			{
				return cartArea;
			}
			public WebElement getFaceBookIcon()
			{
				return facebookIcon;
			}
			public void clickFaceBookIcon()
			{
				facebookIcon.click();
			}
			
			
			
}
