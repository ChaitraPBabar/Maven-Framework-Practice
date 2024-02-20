package src.in.valtech.config;
import com.browserstack.local.Local;
import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class SampleBS
{
	    public static RemoteWebDriver driver;
	    public static final String USERNAME = "gopalaswamym_yUzG5Y";
	    public static final String AUTOMATE_KEY = "Mm4QiPDVP4kfy9CxPqsT";
	    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	    public static void main(String[] args) throws Exception
	    {
	    	 try {
	 			 
	  
	    	DesiredCapabilities caps = new DesiredCapabilities();
	    	//caps.setCapability("browserstack.selenium_version", "3.141.59");
	    	caps.setCapability("os_version", "14.0");
	    	caps.setCapability("browser", "chrome");
			caps.setCapability("real_mobile", "true");
			caps.setCapability("browser_version", "107");
			caps.setCapability("resolution", "1600x1200");
			caps.setCapability("browserstack.networkLogs", "false");
			caps.setCapability("browserstack.debug", "true");
			caps.setCapability("browserstack.local", "true");
			caps.setCapability("browserstack.force", "true");
			caps.setCapability("browserstack.forcelocal", "true");
			caps.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
			caps.setCapability("browserstack.console", "info");
			
		
	        driver = new RemoteWebDriver(new URL(URL), caps);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        driver.get("https://www.makemytrip.com/");
	        Thread.sleep(5000);
	        // stop the Local instance
	   // 	bsLocal.stop();
	    	
	        driver.quit();
	    	 }
	        catch (Exception e) {
	            System.err.println("BrowserStack Local Exception: " + e.getMessage());
	        
	    }
 }    
	
}
