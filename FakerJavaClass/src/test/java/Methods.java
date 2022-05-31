import org.testng.annotations.Test;

import Logic.LaunchBrowsers;
import Logic.LogicalHomepage;

public class Methods extends LaunchBrowsers {
	/**
	 * Method to verify UI element in voot home page
	 * 
	 * @throws Exception
	 */
	@Test
	public void homePagevalidation() throws Exception {

		LogicalHomepage.navigateToContactus();
		LogicalHomepage.verifySuccessfulMsg();
	}

}
