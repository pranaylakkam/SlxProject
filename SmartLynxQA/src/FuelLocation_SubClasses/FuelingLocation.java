package FuelLocation_SubClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import FuelLocation_SubClasses.FuelLocation_FelidValidation;
import FuelLocation_SubClasses.FuelLocation_ScreenShots;

import Trailer_SubClasses.LogIn_page;
import Utility.ExcelUtils;

public class FuelingLocation {
	
	public static void Execute(WebDriver driver) throws Exception{
	 

	LogIn_page.txtbx_UserName(driver).sendKeys(ExcelUtils.getCellData(3, 4));
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
//Sending Password
	
	LogIn_page.txtbx_Password(driver).sendKeys(ExcelUtils.getCellData(4, 4));
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	//clicking on the LOgin Button
	LogIn_page.btn_LogIn(driver).click();
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	// Create FuelLocation
	 Thread.sleep(3000);
	 //Mouse handler
	FuelLocation_FelidValidation.mouse(driver);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	 Thread.sleep(3000);
	
	 //Create new button
	FuelLocation_FelidValidation.Create_new(driver).click();
	 Thread.sleep(3000);
	 FuelLocation_ScreenShots.CaptureScreenshot(driver);
	 //FuelLocation Id
	
	 FuelLocation_FelidValidation.IdFeildVliadation(driver).click();
	 Thread.sleep(2000);
	 FuelLocation_ScreenShots.CaptureScreenshot(driver);
	 //Save Button for error message for a mandatory fields
	 FuelLocation_FelidValidation.Save(driver).click();
	 Thread.sleep(2000);
	 FuelLocation_ScreenShots.CaptureScreenshot(driver);
	 //Error Messages
	 FuelLocation_FelidValidation.ErrorMessage(driver);
	 Thread.sleep(2000);
	 //ID feild
	 FuelLocation_ScreenShots.CaptureScreenshot(driver);
	

	FuelLocation_FelidValidation.IdFeildVliadation(driver).sendKeys(ExcelUtils.getCellData(16, 4));
	 Thread.sleep(2000);
	 FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_FelidValidation.NameFeildVliadation(driver);
	//Address field Verification
	FuelLocation_ScreenShots.CaptureScreenshot(driver);

	FuelLocation_FelidValidation.Address1FeildVliadation(driver);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	//City Field Verification
	FuelLocation_FelidValidation.CityFeildVliadation(driver);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	//State DropDown
	FuelLocation_FelidValidation.StateDropdownFeildVliadation(driver).click();
	 Thread.sleep(3000);
	 FuelLocation_ScreenShots.CaptureScreenshot(driver);
	 Thread.sleep(3000);
	FuelLocation_FelidValidation.StateDropdownInputFeildVliadation(driver).click();
	 Thread.sleep(6000);
	 //State Droopdown input
	 FuelLocation_ScreenShots.CaptureScreenshot(driver);

	FuelLocation_FelidValidation.StateDropdownInputFeildVliadation(driver).sendKeys(ExcelUtils.getCellData(24, 4));
	 Thread.sleep(5000);
	 FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_FelidValidation.StateDropdownInputFeildVliadation(driver).sendKeys(Keys.ENTER);
	 Thread.sleep(3000);
	 // Zip Feild validation
	 FuelLocation_ScreenShots.CaptureScreenshot(driver);
	 
	FuelLocation_FelidValidation.ZipFeildVliadation(driver);
	Thread.sleep(3000);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_FelidValidation.RegionMappingTab(driver).click();
	Thread.sleep(3000);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_FelidValidation.RegionMappingCheckbox(driver).click();
	Thread.sleep(3000);
	
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_FelidValidation.Save(driver).click();
	Thread.sleep(3000);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_FelidValidation.SaveMessage(driver);
	
	Thread.sleep(3000);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_EditScreen.Editbutton(driver).click();
	Thread.sleep(3000);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_EditScreen.Edit_Name(driver).clear();
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	//String Edit_Name = sheet.getRow(1).getCell(8).getStringCellValue();
	FuelLocation_EditScreen.Edit_Name(driver).sendKeys(ExcelUtils.getCellData(35,4));
	Thread.sleep(3000);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_EditScreen.Edit_Address1(driver).clear();;
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	//String Edit_Address1 = sheet.getRow(1).getCell(9).getStringCellValue();
	FuelLocation_EditScreen.Edit_Address1(driver).sendKeys(ExcelUtils.getCellData(36,4));
	Thread.sleep(3000);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_EditScreen.Edit_City(driver).clear();
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	//String Edit_City = sheet.getRow(1).getCell(10).getStringCellValue();
	FuelLocation_EditScreen.Edit_City(driver).sendKeys(ExcelUtils.getCellData(37,4));
	Thread.sleep(3000);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_EditScreen.StateDropdownFeildVliadation(driver).click();
	Thread.sleep(3000);
	FuelLocation_EditScreen.StateDropdownInputFeildVliadation(driver);
	Thread.sleep(3000);
	
	
	FuelLocation_EditScreen.Edit_Zip(driver).clear();
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	//String Edit_Zip  =  sheet.getRow(1).getCell(11).getStringCellValue();
	FuelLocation_EditScreen.Edit_Zip(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(39,4)));
	Thread.sleep(3000);
	FuelLocation_EditScreen.Edit_RegionMappingTab(driver).click();
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	FuelLocation_EditScreen.Edit_RegionMappingCheckbox(driver).click();
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_EditScreen.Update(driver).click();
	
	Thread.sleep(5000);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	FuelLocation_EditScreen.Update_Message(driver);
	
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	// Delete button
	Thread.sleep(3000);
	FuelLocation_Delete.Delete(driver).click();
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	FuelLocation_Delete.confirmationContent(driver);
	Thread.sleep(3000);
	
//	FuelLocation_Delete.confirmationok(driver).click();
	FuelLocation_Delete.confirmationcancel(driver).click();
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	FuelLocation_Delete.FuelLocationDeleteMessage(driver);
	FuelLocation_Delete.Delete(driver).click();
	Thread.sleep(6000);
	FuelLocation_Delete.confirmationcancel(driver).click();
	Thread.sleep(3000);
	
	// Existingvalues
	 
	
	FuelLocation_ExistingValues.Create_new(driver);
	Thread.sleep(3000);
	FuelLocation_ScreenShots.CaptureScreenshot(driver);
	
	
	
	
	}

}

