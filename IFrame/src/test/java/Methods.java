import org.testng.annotations.Test;


import Logic.LaunchBrowsers;
import Logic.LogicalHomePage;

public class Methods extends LaunchBrowsers {
	
    @Test
    public void homePagevalidation() throws Exception{
    	LogicalHomePage.navigateToContactus();
    	
    }

}
