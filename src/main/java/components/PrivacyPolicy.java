package components;

import org.openqa.selenium.By;

import utility.BaseClass;

public class PrivacyPolicy extends BaseClass {
	By back=By.id("com.ongo.wanafood:id/arrwimg");
	By sideMenu=By.id("com.ongo.wanafood:id/imgHam");
	By privacy_Link=By.id("com.ongo.wanafood:id/design_menu_item_text");
	By privacy_Val=By.id("com.ongo.wanafood:id/tvTermsConditions");
	
	public void nav_PrivacyPolicy() throws Exception {
		try {
			click(back);
			click(sideMenu);
			click(privacy_Link);
			gettextfromapp(privacy_Val);
			System.out.println(text22);
			if(text22.equalsIgnoreCase("Privacy Policy")) {
				System.out.println("Pass");
			}
			readData.addStepDetails("nav_PrivacyPolicy", "Should navigate to Privacy Policy", "As Per Expected", "Pass", "Y");
		} catch (Exception e) {
			readData.addStepDetails("nav_PrivacyPolicy", "Should navigate to Privacy Policy", "Not As Per Expected", "Fail", "Y");

		}
	}
	
	
	

}
