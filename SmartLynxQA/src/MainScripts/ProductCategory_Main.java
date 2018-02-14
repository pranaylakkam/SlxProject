package MainScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ProductCategory_SubClasses.ProductCategory;
import Utility.Constant;
import Utility.ExcelUtils;

public class ProductCategory_Main {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	
		 
	
			
			
			
			System.setProperty("webdriver.chrome.driver", "F://New folder//chromedriver.exe");	
		//   System.setProperty("webdriver.gecko.driver", "C://Users//kode18//workspace//MyProduct//Driver//geckodriver.exe");

			 WebDriver driver = new ChromeDriver();


		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.get("https://www.p2pfuel.com/SLMain/");
		
		driver.get(Constant.Url);
		
        Thread.sleep(2000);
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"ProductCategory");
        Thread.sleep(2000);
        ProductCategory.Execute(driver);
 
      //  System.out.println("Login Successfully, now it is the time to Log Off buddy.");
 
    //    Home_Page.lnk_LogOut(driver).click(); 
 
      ///  driver.quit();
 
        //This is to send the PASS value to the Excel sheet in the result column.
 
 //       ExcelUtils.setCellData("Pass", 2, 5); 
 
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


