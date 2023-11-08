package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy(xpath="//h3[text()='Login']")
	private WebElement pageHeader;
	
	@FindBy(id="email")
	private WebElement emailTF;
	
	@FindBy(id="password")
	private WebElement passwordTF;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
		
	}
	public void setEmail(String email) {
		emailTF.sendKeys(email);
	}
	public void setPassword(String password) {
		passwordTF.sendKeys(password);
	}
	public void clickLogin() {
		loginButton.submit();
	}
	
	
	

}
