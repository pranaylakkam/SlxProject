package Terminal_SubClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Terminal {
	
	public static void Execute(WebDriver driver) throws Exception{
	
		
		
	
	LogIn_page.txtbx_UserName(driver).sendKeys(ExcelUtils.getCellData(3,4 ));
	ExcelUtils.setCellData("Pass", 3, 7);
	// Password in Login Page

	Terminal_ScreenShots.CaptureScreenshot(driver);

	LogIn_page.txtbx_Password(driver).sendKeys(ExcelUtils.getCellData(4,4 )); 
	ExcelUtils.setCellData("Pass", 4, 7);
	Terminal_ScreenShots.CaptureScreenshot(driver);
	// Login button
	LogIn_page.btn_LogIn(driver).click();  
	ExcelUtils.setCellData("Pass", 5, 7);
	Terminal_ScreenShots.CaptureScreenshot(driver);
	Terminal_Validation.Mouse(driver);

	Thread.sleep(2000);
		
	Terminal_Validation.Serachbox(driver).sendKeys(ExcelUtils.getCellData(7,4 ));
	


	Terminal_ScreenShots.CaptureScreenshot(driver);
	// clicking on create new button
		//Thread.sleep(6000);
		Thread.sleep(2000);
		Terminal_Validation.Create_New(driver).click();
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Thread.sleep(2000);
	   // Error message validation

	    Thread.sleep(2000);
	    Terminal_Validation.ErrorMessage(driver);
	    Terminal_ScreenShots.CaptureScreenshot(driver);
	    // Entering the number in create new terminal
	  
		Terminal_Validation.Number(driver).sendKeys(String.valueOf(ExcelUtils.getCellData(21,4 )));
		Thread.sleep(2000);
		Terminal_ScreenShots.CaptureScreenshot(driver);
	// Name field validation 	
		Terminal_Validation.Name(driver);
		Thread.sleep(2000);
		Terminal_ScreenShots.CaptureScreenshot(driver);
		// enter the number AvrageLoadTime 
		
	      
		  Terminal_Validation.AvrageLoadTime(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(25,4)));
	      Thread.sleep(1000);
		
	      
		Thread.sleep(2000);
		// enter the Address
		Terminal_ScreenShots.CaptureScreenshot(driver);
//		String Address = sheet.getRow(1).getCell(5).getStringCellValue();

		Terminal_Validation.Address(driver);
		Thread.sleep(2000);
		Terminal_ScreenShots.CaptureScreenshot(driver);
		// enter the city name
//		String City = sheet.getRow(1).getCell(6).getStringCellValue();
		Terminal_Validation.City(driver);
		Thread.sleep(2000);
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Terminal_Validation.State(driver).click();
		Terminal_ScreenShots.CaptureScreenshot(driver);
		// enter the state input
		Thread.sleep(1000);
		
		Terminal_Validation.StateInput(driver).sendKeys(ExcelUtils.getCellData(29,4));
		Thread.sleep(2000);
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Terminal_Validation.StateInput(driver).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		// enter the zip
		Terminal_ScreenShots.CaptureScreenshot(driver);
		
	 //8    
		Terminal_Validation.Zip(driver);	
		Thread.sleep(2000);
		// validation for latitude
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Terminal_Validation.Latitude(driver);
		Thread.sleep(2000);
		// validation for longitude
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Terminal_Validation.Longitude(driver);
		Thread.sleep(2000);
		Terminal_ScreenShots.CaptureScreenshot(driver);
		// clicking on the supplier tab
		Terminal_Validation.SupplierMappingTab(driver).click();
		Thread.sleep(2000);
		//clicking on the supplier checkbox
	
		Terminal_Validation.SupplierMappingSearchbox(driver).sendKeys(ExcelUtils.getCellData(38,4));
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Thread.sleep(4000);
		Terminal_Validation.SupplierMappingCheckbox(driver).click();
		Thread.sleep(2000);
		Terminal_ScreenShots.CaptureScreenshot(driver);
		// clicking on the drivermapping tab
		Terminal_Validation.DriverMappingTab(driver).click();
		Thread.sleep(2000);
		Terminal_ScreenShots.CaptureScreenshot(driver);
		// clicking on the driver mapping checkbox
		
		Terminal_Validation.DriverMappingSearchbox(driver).sendKeys(ExcelUtils.getCellData(41,4 ));
		Thread.sleep(4000);
		Terminal_Validation.DriverMappingCheckbox(driver).click();
		Thread.sleep(2000);
		Terminal_ScreenShots.CaptureScreenshot(driver);
		//clicking on the truckmapping tab
		Terminal_Validation.TruckMappingTab(driver).click();
		Thread.sleep(6000);
		Terminal_ScreenShots.CaptureScreenshot(driver);
		// clicking on the truckmapping checkbox
				Terminal_Validation.TruckMappingSerachBox(driver).sendKeys(ExcelUtils.getCellData(44,4 ));
		Thread.sleep(2000);
		Terminal_Validation.TruckMappingCheckbox(driver).click();
		Thread.sleep(2000);
		// clicking on the save button
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Terminal_Validation.Save(driver).click();
		
		Terminal_ScreenShots.CaptureScreenshot(driver);
		//Terminal EditScreen
		Thread.sleep(2000);
		Terminal_Validation.SaveMessage(driver);
		// clicking on the edit button
		
	  Terminal_EditScreen.EditButton(driver).click();
	  Thread.sleep(2000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  // editing the name
	  Terminal_EditScreen.EditName(driver).clear();
	  Thread.sleep(2000);
	  
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	
	  
	  Terminal_EditScreen.EditName(driver).sendKeys(ExcelUtils.getCellData(50,4));
	  Thread.sleep(2000);
	  
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  // editing the avrage load time
	  Terminal_EditScreen.EditAvrageLoadTime(driver).clear();
	  Thread.sleep(2000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);

	  Terminal_EditScreen.EditAvrageLoadTime(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(51,4)));
	  
	  Thread.sleep(2000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  Terminal_EditScreen.EditAddress(driver).clear();
	  
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  Thread.sleep(2000);
	  // editing the address
	 
	  Terminal_EditScreen.EditAddress(driver).sendKeys(ExcelUtils.getCellData(52,4));
	  
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  // editing the city field
	  Thread.sleep(2000);
	  Terminal_EditScreen.EditCity(driver).clear();
	  Thread.sleep(2000);
	  
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  Terminal_EditScreen.EditCity(driver).sendKeys(ExcelUtils.getCellData(53,4));
	  // editing the zip feild
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  Thread.sleep(2000);
	  Terminal_EditScreen.EditZip(driver).clear();
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  Thread.sleep(2000);
	 
	  Terminal_EditScreen.EditZip(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(55, 4)));
	  Thread.sleep(2000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	// editing the latitude field
	  Terminal_EditScreen.EditLatitude(driver).clear();
	  Thread.sleep(2000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	
	  Terminal_EditScreen.EditLatitude(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(56, 4)));
	  Thread.sleep(2000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	// editing the longitude field
	  Terminal_EditScreen.EditLongitude(driver).clear();
	  
	  Thread.sleep(2000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	
	  Terminal_EditScreen.EditLongitude(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(57, 4)));
	 // Terminal_EditScreen.EditLongitude(driver).sendKeys("32.62111");
	  Thread.sleep(6000);

	  Terminal_ScreenShots.CaptureScreenshot(driver);
	// clicking on the supplier screen
	  Terminal_EditScreen.EditSupplierMappingTab(driver).click();
	  Thread.sleep(6000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  // clicking on the supplier checkbox
	  Terminal_EditScreen.EditSupplierMappingCheckbox(driver).click();
	  Thread.sleep(6000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  // clicking on the Edit driver mapping tab
	  Terminal_EditScreen.EditDriverMappingTab(driver).click();
	  Thread.sleep(6000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  // clicking on the drivermapping checkbox
	  Terminal_EditScreen.EditDriverMappingCheckbox(driver).click();
	  Thread.sleep(6000);
	  
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  // clicking on the truckmapping tab
	  Terminal_EditScreen.EditTruckMappingTab(driver).click();
	  Thread.sleep(6000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  //clicking on the truck mapping checkbox
	  Terminal_EditScreen.EditTruckMappingCheckbox(driver).click();
	  Thread.sleep(6000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  // clicking on the update button
	  Terminal_EditScreen.Update(driver).click();
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  Thread.sleep(2000);
	  Terminal_EditScreen.UpdateMessage(driver);
	  // Terminal Delete
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  Terminal_Delete.Delete(driver).click();
	  Thread.sleep(2000);
	  Terminal_Delete.confirmationContent(driver);
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  Terminal_Delete.Terminalconfirmationcancel(driver).click();
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  //  ExistingTerminals Values
	  Thread.sleep(2000);
	 
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	ExistingTerminal_Values.ExistingValues(driver);
	Terminal_ScreenShots.CaptureScreenshot(driver);
	//UnDelete

	Thread.sleep(2000);
	Terminal_UnDelete.UnDelete(driver);
	Terminal_ScreenShots.CaptureScreenshot(driver);

}
}
