package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUserPage {
	//Declaration
	@FindBy(xpath="//b[text()='Add New User']")
	private WebElement pageHeader;
	
	@FindBy(xpath="//input[@id='email' and @required]")
	private WebElement emailTF;
	
	@FindBy(xpath="//input[@id='password'  and @required]")
	private WebElement passwordTF;
	
	@FindBy(xpath="//input[@id='firstname' and @required]")
	private WebElement firstnameTF;
	
	@FindBy(xpath="//input[@id='lastname' and @required]")
	private WebElement lastnameTF;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement addressTextArea;
	
	@FindBy(xpath="//input[@id='contact']")
	private WebElement contactInfoTF;
	
	@FindBy(xpath="(//input[@id='photo'])[2]")
	private WebElement photo;
	
	@FindBy(xpath="//button[@name='add']")
	private WebElement saveButton;
	
	//Initialization
	public AddNewUserPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
		
	}
	public void createNewUser(String email,String password,String firstname,String lastname,String address,String contact,String photoPath)
	{
		emailTF.sendKeys(email);
		passwordTF.sendKeys(password);
		firstnameTF.sendKeys(firstname);
		lastnameTF.sendKeys(lastname);
		addressTextArea.sendKeys(address);	
		contactInfoTF.sendKeys(contact);
		photo.sendKeys(photoPath);
		saveButton.click();
	}
}
