package components;

import org.openqa.selenium.By;

import utility.BaseClass;

public class Wallet extends BaseClass{
	 By sideMenu=By.id("com.ongo.wanafood:id/imgHam");
	 By wallet_Link=By.id("com.ongo.wanafood:id/design_menu_item_text");
	 By wallet_Amount=By.id("com.ongo.wanafood:id/tv_walletCash");
	 By wonna_Amount=By.id("com.ongo.wanafood:id/tv_crashWallet");
	 By referCode=By.id("com.ongo.wanafood:id/refercodetv");
	 public void wallet_Amount_Verify() throws Exception {
		 click(sideMenu);
		 click(wallet_Link);
		 gettextfromapp(wallet_Amount);
		 System.out.println(text22);
		 if(text22.equalsIgnoreCase("₹10.0/-")) {
			 System.out.println("Pass");
		 }
		 gettextfromapp(wonna_Amount);
		 System.out.println(wonna_Amount);
		 if(text22.equalsIgnoreCase("₹0.0/-")) {
			 System.out.println("Pass");
		 }
		 readData.addStepDetails("wallet_Amount_Verify", "Wonna amount and wallet amount should be validate", "As per expected", "Pass", "");
		 
	 }

}
