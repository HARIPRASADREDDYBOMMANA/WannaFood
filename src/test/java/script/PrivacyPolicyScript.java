package script;

import org.testng.annotations.Test;

import components.PrivacyPolicy;
import utility.BaseClass;

public class PrivacyPolicyScript extends BaseClass {
	PrivacyPolicy policy=new PrivacyPolicy();
	
  @Test(description="Verifying the PrivacyPolicy Script Functionality")
  public void f() throws Exception {
	  policy.nav_PrivacyPolicy();
  }
}
