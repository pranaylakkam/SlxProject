package Driver_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Trailer_SubClasses.LogIn_page;
import Utility.ExcelUtils;

public class Driver {
	
	

	 public static void Execute(WebDriver driver) throws Exception{
		 
		 

			String sUserName = ExcelUtils.getCellData(3, 4);
       	String sPassword = ExcelUtils.getCellData(4, 4);
		    String Search = ExcelUtils.getCellData(7, 4);
		    String Driver_Id = ExcelUtils.getCellData(13, 4);
		  
		    

		  int Driver_PhoneNumber = ExcelUtils.getCellDataNum(17, 4);
		  int Driver_MobileNumber = ExcelUtils.getCellDataNum(18, 4);
		  int Driver_Cost =ExcelUtils.getCellDataNum(19, 5);
		  String EditDriver_Name = ExcelUtils.getCellData(33, 4);
		  int   EditDriver_HomePhone1 = ExcelUtils.getCellDataNum(34, 4);
		  int Driver_MobileNumber1 = ExcelUtils.getCellDataNum(35, 4);
		  int  EditDriver_Cost1 = ExcelUtils.getCellDataNum(36, 4);
		  String EditDriver_Email1 =ExcelUtils.getCellData(37, 4);
		
		 String Serach1=    ExcelUtils.getCellData(43, 4);
		    
		    
		   
			LogIn_page.txtbx_UserName(driver).sendKeys(sUserName);
			ExcelUtils.setCellData("Pass",4, 7);
			LogIn_page.txtbx_Password(driver).sendKeys(sPassword);
			ExcelUtils.setCellData("Pass",4, 7);
			LogIn_page.btn_LogIn(driver).click();  
			
			ExcelUtils.setCellData("Pass",4, 7);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 //MouseHandler
			 Driver_Validation.mouse(driver);
			 Thread.sleep(1000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 //Searchbox
			 Driver_Validation.Search(driver).click();
			 
			    
				
			 Driver_Validation.Search(driver).sendKeys(Search);
			 Thread.sleep(2000);
			 //Createnew button
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_Validation.Create_Newbutton(driver).click();
		     Thread.sleep(2000);
			 //Clikding on the Save button for Error Message Verification
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_Validation.Save_Button(driver).click();
			 Thread.sleep(2000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 // Error Message Validator
			 Driver_Validation.ErrorMessage(driver);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Thread.sleep(2000); 
			 // driver Id
			
			 Driver_Validation.Driver_ID(driver).sendKeys((Driver_Id));
			 Thread.sleep(3000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 
			 Thread.sleep(3000);
			 //Driver Name
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_Validation.Driver_Name(driver);
			
			Driver_ScreenShots.CaptureScreenshot(driver);
			 Thread.sleep(3000);
			 // Driver Password
			 Driver_Validation.Driver_Password(driver).click();
			 Thread.sleep(3000);
			 Driver_Validation.Driver_Password(driver).clear();
			 Thread.sleep(2000);
			 Driver_Validation.Driver_Password(driver).sendKeys(sPassword);
			//Driver Phone Number 
			Driver_Validation.Driver_HomePhone(driver).clear();
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Thread.sleep(3000);
			 //Driver home phone number
			
			 Driver_Validation.Driver_HomePhone(driver).sendKeys(String.valueOf(Driver_PhoneNumber));
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_Validation.Driver_Moblie(driver).clear();
			 Thread.sleep(3000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
		
			 Driver_Validation.Driver_Moblie(driver).sendKeys(String.valueOf(Driver_MobileNumber));
			 Thread.sleep(3000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			// driver Cost hours
		
			 Driver_Validation.Driver_Cost(driver).sendKeys(String.valueOf(Driver_Cost));
			 Thread.sleep(3000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
		//	 Drive Email Id
			 Driver_Validation.Driver_Email(driver);
			 Thread.sleep(3000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			//Terminal Mapping Tab
			 Driver_Validation.TerminalMapping_Tab(driver).click();
			 Thread.sleep(3000);
			 
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 //Terminal Expand button
			 Driver_Validation.TerminalMapping_Expand(driver).click();
			 Thread.sleep(6000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 // Terminal Checkbox
			 Driver_Validation.TerminalMapping_Access(driver).click();
			 Thread.sleep(3000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			//Collapse
			 Driver_Validation.TerminalMapping_Collapse(driver).click();
			 Thread.sleep(3000);Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			//clicking on the Region Mapping tab
			 Driver_Validation.RegionMapping_Tab(driver).click();
			 Thread.sleep(3000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_Validation.RegionMapping_Checkbox(driver).click();
			 Thread.sleep(3000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 // Save button
			 Driver_Validation.Save_Button(driver).click();
			 Thread.sleep(3000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_Validation.Save_Message(driver);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 
			 Thread.sleep(3000);
			 
			 //Edit button & Screen
			 Thread.sleep(5000);
			 Driver_EditScreen.Edit_Button(driver).click();
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Thread.sleep(5000);
			 // Editing the Driver Name
			 Driver_EditScreen.EditDriver_Name(driver).clear();
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 
			 Driver_EditScreen.EditDriver_Name(driver).sendKeys(EditDriver_Name);
		;Driver_ScreenShots.CaptureScreenshot(driver);
			
			 Thread.sleep(5000);
			 // Driver Phone number
			 Driver_EditScreen.EditDriver_HomePhone(driver).clear();
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_EditScreen.EditDriver_HomePhone(driver).sendKeys(String.valueOf(EditDriver_HomePhone1));
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Thread.sleep(5000);
			 //Editing Driver Mobile NUmber
			 Driver_EditScreen.EditDriver_Moblie(driver).clear();
			 Driver_ScreenShots.CaptureScreenshot(driver);
			
			 Driver_EditScreen.EditDriver_Moblie(driver).sendKeys(String.valueOf(Driver_MobileNumber1));
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Thread.sleep(5000);
			 // Driver Cost
			 Driver_EditScreen.EditDriver_Cost(driver).clear();
			 Driver_ScreenShots.CaptureScreenshot(driver);
		
			 Driver_EditScreen.EditDriver_Cost(driver).sendKeys(String.valueOf(EditDriver_Cost1));
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 //Editing the Driver Email
			 Driver_EditScreen.EditDriver_Email(driver).clear();
			 
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Thread.sleep(5000);
		
			 Driver_EditScreen.EditDriver_Email(driver).sendKeys(EditDriver_Email1);
			 Thread.sleep(5000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
		//Terminal Mapping Tab
			 Driver_EditScreen.EditTerminalMapping_Tab(driver).click();
			 Thread.sleep(5000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 //Expand
			 Driver_EditScreen.EditTerminalMapping_Expand(driver).click();
			 Thread.sleep(5000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 //Collapse
			 Driver_EditScreen.EditTerminalMapping_Collapse(driver).click();
			 Thread.sleep(5000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 //Region mapping mapping tab
			 Driver_EditScreen.EditRegionMapping_Tab(driver).click();
			 Thread.sleep(5000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_EditScreen.EditRegionMapping_Checkbox(driver).click();
			 Thread.sleep(5000);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 //Updatebutton
			 Driver_EditScreen.Update_button(driver).click();
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Thread.sleep(5000);
			 
			 Driver_EditScreen.Update_Message(driver);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 //Delete POPUP
			 
			 Driver_Delete.Delete(driver).click();
			 Thread.sleep(3000);
			 //Delete Pop Up Message
			 Driver_Delete.confirmationContent(driver);
			 Thread.sleep(3000);
			// Driver_Delete.Driverconfirmationok(driver).click();
			 Driver_Delete.Driverconfirmationcancel(driver).click();
			 Thread.sleep(3000);
			 Driver_Delete.DriverDeleteMessage(driver);
			
			 Thread.sleep(3000);
			 Driver_Delete.Delete(driver).click();
			 Thread.sleep(3000);
			 Driver_Delete.Driverconfirmationcancel(driver).click();
			 
			 // Existing Values
			 
			 Thread.sleep(5000);
			 Driver_ExistingValues.ExistingValues(driver);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 //UnDelete 
			 Thread.sleep(5000);
			 Driver_unDelete.ExistingValues(driver);
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 
			 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }

}
