package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
	//Declaration
	@FindBy(xpath="//span[text()='SkillRary Admin']")
	private WebElement adminIcon;
	
	@FindBy(xpath="//span[text()='Courses']")
	private WebElement coursesTab;
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement usersTab;
	
	@FindBy(xpath=" //a[text()=' Course List']")
	private WebElement courseListLink;
	
	@FindBy(xpath="  //a[text()=' Category']")
	private WebElement categoryLink;
	
	@FindBy(xpath="//a[text()='Sign out']")
	private WebElement signOutLink;
	
	//Initialization
	public AdminHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public String getAdminIcon() {
		return adminIcon.getText();
		
	}
	public void clickUsersTab() {
		usersTab.click();
	}
	public void clickCoursesTab() {
		coursesTab.click();
	}
	public void clickCourseListLink() {
		courseListLink.click();
	}
	public void clickCategoryLink() {
		categoryLink.click();
	}
	public void signOutofApp() {
		adminIcon.click();
	    signOutLink.click();
	}
	
	

}
