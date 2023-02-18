package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPage
{

	//declaration
	@FindBy(xpath = "//img[contains(@src,'contactus')]")
	private WebElement pageHeader;
	@FindBy(name = "name")
	private WebElement fullNameTF;
	@FindBy(name = "sender")
	private WebElement emailTF;
	@FindBy(name = "subject")
	private WebElement SubjectTF;
	@FindBy(name = "message")
	private WebElement messageTextArea;
	@FindBy(xpath= "//button[text()='Send us mail']")
	private WebElement sendUsMailButton;
	
	//initialization
	
			public ContactusPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//utilization
			public WebElement getPageHeader()
			{
				return pageHeader;
			}
			public void submitDetails(String name, String mail, String subject, String message )
			{
				fullNameTF.sendKeys(name);
				emailTF.sendKeys(mail);
				SubjectTF.sendKeys(subject);
				messageTextArea.sendKeys(message);
				sendUsMailButton.click();
			}
	
}
