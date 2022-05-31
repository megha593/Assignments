import org.testng.annotations.Test;

import Logic.LaunchBrowsers;
import Logic.LogicalHomepage;

public class Methods extends LaunchBrowsers {
	
	@Test
	public void homePagevalidation() throws Exception {

		LogicalHomepage.navigateToobjAnnualincome();
	}

}
