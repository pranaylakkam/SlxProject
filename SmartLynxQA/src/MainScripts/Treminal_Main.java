package MainScripts;

import java.util.HashMap;
import java.util.Map;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Terminal_SubClasses.Terminal;
import Utility.Constant;
import Utility.ExcelUtils;

public class Treminal_Main {
	private static WebDriver driver;

	public static void main(String[] args) throws Exception {
	
	
	System.setProperty("webdriver.chrome.driver", "F://Driver//chromedriver.exe");	
	//   System.setProperty("webdriver.gecko.driver", "C://Users//kode18//workspace//MyProduct//Driver//geckodriver.exe");
 
	   ChromeOptions options = new ChromeOptions();
	   options.addArguments("--disable-web-security");
	   options.addArguments("--start-maximized");
	   options.addArguments("--no-proxy-server");
	   Map<String, Object> prefs = new HashMap<String, Object>();
	   prefs.put("credentials_enable_service", false);
	   prefs.put("profile.password_manager_enabled", false);
	   options.setExperimentalOption("prefs", prefs);
	   options.addArguments("disable-infobars");
	   driver = new ChromeDriver(options);
	
	
	
	driver.get(Constant.Url);
	
    Thread.sleep(2000);
    ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Terminal");
    Thread.sleep(2000);
Terminal.Execute(driver);
		
	}

}
