package MainScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utility.Constant;
import Utility.ExcelUtils;
import ContractFunctionalities.Contract;

public class Contract_Main {

	

	private static WebDriver driver;
		 
		public static void main(String[] args) throws Exception {
			
			
			
			System.setProperty("webdriver.chrome.driver", "F://New folder//chromedriver.exe");	
			
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
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Contract");
        Thread.sleep(2000);
        Contract.Execute(driver);
       
 	}
	}


