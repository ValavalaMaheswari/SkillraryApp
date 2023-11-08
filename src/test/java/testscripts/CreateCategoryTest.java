package testscripts;


	import java.util.List;
	import java.util.Map;

	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

     import genericlibraries.BaseClass;

	

	public class CreateCategoryTest  extends BaseClass {
		
		@Test
		public void createCategoryTest() throws InterruptedException {
			SoftAssert soft = new SoftAssert();
			home.clickCoursesTab();
			home.clickCategoryLink();
			soft.assertTrue(category.getPageHeader().contains("Category"));
			
			
			category.clickNewButton();
			Thread.sleep(3000);
			soft.assertEquals(addCategory.getPageHeader(), "Add New Category");
			Map<String, String> map = excel.readFromExcel("Sheet1", "Add Category");
			String categoryName = map.get("Name")+jutil.generateRandomNum(100);
			addCategory.setName(categoryName);
			addCategory.clickSave();
			
			soft.assertTrue(category.getSuccessMessage().contains("Success"));
			boolean ispresent = false;
			List<WebElement> categoryList = category.getCategoryList();
		    for (WebElement e : categoryList) {
		    	if(e.getText().equals(categoryName)) {
		    		ispresent = true;
		    		break;
		    	}
		    }
		    soft.assertTrue(ispresent);
		    
		    category.clickDeleteButton(categoryName, driver);
		    category.clickDelete();
		    soft.assertTrue(category.getSuccessMessage().contains("Success"));
		    soft.assertAll();
		}
		

	}


