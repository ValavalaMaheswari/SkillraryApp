package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// The test is sucess

public class AddNewCategoryPage {
	//Declaration
	@FindBy(xpath="//b[text()='Add New Category']")
	private WebElement pageHeader;
	
	@FindBy(id="name")
	private WebElement nameTF;
	
	@FindBy(xpath="//button[@name='add']")
	private WebElement saveButton;
	
	//Initialization
	public AddNewCategoryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void setName(String categoryName) {
		nameTF.sendKeys(categoryName);
	}
	public void clickSave(){
		saveButton.click();
		
	}

}
