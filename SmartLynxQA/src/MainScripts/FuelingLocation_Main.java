package MainScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FuelLocation_SubClasses.FuelingLocation;
import Utility.Constant;
import Utility.ExcelUtils;

public class FuelingLocation_Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "F://New folder//chromedriver.exe");	
	

		 WebDriver driver = new ChromeDriver();


	driver.get(Constant.Url);
	
    Thread.sleep(2000);
    ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"FuelingLocation");
    Thread.sleep(2000);
    FuelingLocation.Execute(driver);


 

  //  driver.quit();



	}

}
