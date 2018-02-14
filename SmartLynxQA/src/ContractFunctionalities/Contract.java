package ContractFunctionalities;

import Utility.ExcelUtils;
import ContractFunctionalities.Login_Page;
import ContractFunctionalities.ContractDelete;
import ContractFunctionalities.ContractEdit;
import ContractFunctionalities.Contract_ExistingValues;
import ContractFunctionalities.Contract_FieldValidations;
import ContractFunctionalities.Contract_Screenshots;
import ContractFunctionalities.Contract_Undelete;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.Constant;
import Utility.ExcelUtils;

public class Contract {
	
	public static void Execute(WebDriver driver) throws Exception{
	 
	String sUserName = ExcelUtils.getCellData(4, 4);

	String sPassword = ExcelUtils.getCellData(5, 4);
	
	int Search = ExcelUtils.getCellDataNum(8, 4);
	int Number =ExcelUtils.getCellDataNum(19, 4);
	int Pin =ExcelUtils.getCellDataNum(31, 4);
	String Terminal = ExcelUtils.getCellData(25, 4);
	String ProductDetailsSearchBox = ExcelUtils.getCellData(33, 4);

	     Login_Page.txtbx_Username(driver).sendKeys(sUserName);
	     ExcelUtils.setCellData("Pass", 4, 7); 
		Login_Page.txtbx_Password(driver).sendKeys(sPassword);
		ExcelUtils.setCellData("Pass", 5, 7); 
		Login_Page.btn_Login(driver).click();
		ExcelUtils.setCellData("Pass", 6, 7); 
		
		
		Contract_Screenshots.CaptureScreenshot(driver);
		
		
		
		//Thread.sleep(3000);
		
		Contract_FieldValidations.Url(driver);
		
		Thread.sleep(1000);
		Contract_FieldValidations.Mouse(driver);
		Contract_Screenshots.CaptureScreenshot(driver);
		
		

		Thread.sleep(1000);
		//Contract_FieldValidations.Search(driver).sendKeys(String.valueOf((Search)));
		Thread.sleep(1000);
	
		
		Contract_FieldValidations.Create_New(driver).click();
		Thread.sleep(3000);
		Contract_Screenshots.CaptureScreenshot(driver);
		Contract_FieldValidations.Save_Button(driver).click();
		ExcelUtils.setCellData("Pass", 10, 7); 
		Thread.sleep(2000);
		Contract_Screenshots.CaptureScreenshot(driver);
		Contract_FieldValidations.ErrorMessage(driver);
		Thread.sleep(2000);
		Contract_Screenshots.CaptureScreenshot(driver);
		
		
		Contract_FieldValidations.Number(driver).sendKeys(String.valueOf(Number));
//		Contract_FieldValidations.Number_Errorfild(driver);
		Thread.sleep(3000);

		Contract_Screenshots.CaptureScreenshot(driver);
		Contract_FieldValidations.Perpetual_Checkbox(driver).click();
		Thread.sleep(1000);
		Contract_Screenshots.CaptureScreenshot(driver);
		Contract_FieldValidations.Priceineffect_Checkbox(driver).click();
		Thread.sleep(1000);
		Contract_Screenshots.CaptureScreenshot(driver);
	Contract_FieldValidations.Terminal_Dropdown(driver).click();
		Thread.sleep(6000);
		Contract_Screenshots.CaptureScreenshot(driver);
		
		Contract_FieldValidations.Terminal_Input(driver).sendKeys(Terminal);
		Thread.sleep(3000);
		Contract_Screenshots.CaptureScreenshot(driver);
		Contract_FieldValidations.Terminal_Input(driver).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Contract_Screenshots.CaptureScreenshot(driver);
		
		Contract_FieldValidations.Save_Button(driver).click();
		Thread.sleep(1000);
		Contract_FieldValidations.SupplierErrorMessage(driver);
		Thread.sleep(1000);
		Contract_FieldValidations.SupplierDropdown(driver).click();
		Thread.sleep(1000);
		Contract_Screenshots.CaptureScreenshot(driver);
		Contract_FieldValidations.SupplierSelect(driver).click();
		Thread.sleep(1000);
		Contract_FieldValidations.Save_Button(driver).click();
		Thread.sleep(1000);
		Contract_FieldValidations.VendorErrorMessage(driver);
		Thread.sleep(3000);
		Contract_Screenshots.CaptureScreenshot(driver);
		Contract_FieldValidations.VendorDropdown(driver).click();
		Thread.sleep(1000);
		Contract_Screenshots.CaptureScreenshot(driver);
		Contract_FieldValidations.VendorSelect(driver).click();
		Thread.sleep(1000);
		
		Contract_FieldValidations.Pin(driver).sendKeys(String.valueOf(Pin));
		Contract_Screenshots.CaptureScreenshot(driver);
		Contract_FieldValidations.Product_DetailsTab(driver).click();
		Thread.sleep(1000);
		Contract_FieldValidations.Product_DetailsSaerchBox(driver).sendKeys(ProductDetailsSearchBox);
		Contract_Screenshots.CaptureScreenshot(driver);
		Contract_FieldValidations.ProductName_Checkbox(driver).click();
		Thread.sleep(1000);
		Contract_Screenshots.CaptureScreenshot(driver);
		Contract_FieldValidations.Save_Button(driver).click();
		Thread.sleep(1000);
		Contract_FieldValidations.Save_Message(driver);
	
		Contract_Screenshots.CaptureScreenshot(driver);
		// Edit Contract fields
		Contract_Screenshots.CaptureScreenshot(driver);
		Thread.sleep(1000);
		Thread.sleep(6000);
		Contract_Screenshots.CaptureScreenshot(driver);
		ContractEdit.Edit_Button(driver).click();
		Thread.sleep(6000);
		Contract_Screenshots.CaptureScreenshot(driver);
	
		Thread.sleep(1000);
    	Contract_Screenshots.CaptureScreenshot(driver);
		ContractEdit.Perpetual_Checkbox(driver).click();
		Contract_Screenshots.CaptureScreenshot(driver);
		ContractEdit.Priceineffect_Checkbox(driver).click();
		Thread.sleep(1000);
		Contract_Screenshots.CaptureScreenshot(driver);
		ContractEdit.Product_DetailsTab(driver).click();
		Thread.sleep(1000);
		Contract_Screenshots.CaptureScreenshot(driver);
		ContractEdit.ProductName_Checkbox(driver).click();
		Thread.sleep(1000);
		Contract_Screenshots.CaptureScreenshot(driver);
		ContractEdit.Update_Button(driver).click();
		Thread.sleep(1000);
		Contract_Screenshots.CaptureScreenshot(driver);
		ContractEdit.Update_Message(driver);
		Contract_Screenshots.CaptureScreenshot(driver);
		// Delete POP UP
		Thread.sleep(1000);
		ContractDelete.Delete(driver).click();
		Contract_Screenshots.CaptureScreenshot(driver);
		Thread.sleep(4000);
		ContractDelete.confirmationContent(driver);
		Thread.sleep(1000);
	//	ContractDelete.Contractconfirmationok(driver).click();
		ContractDelete.Contractconfirmationcancel(driver).click();
		ExcelUtils.setCellData("Pass", 49,7 );
		Thread.sleep(1000);
		ContractDelete.confirmationContent(driver);
		Thread.sleep(1000);
		ContractDelete.Delete(driver).click();
		ExcelUtils.setCellData("Pass", 50, 7);
		Thread.sleep(1000);
		ContractDelete.Contractconfirmationcancel(driver).click();
		ExcelUtils.setCellData("Pass", 51, 7);
		Contract_Screenshots.CaptureScreenshot(driver);
		Thread.sleep(1000);
	//	ContractDelete.ContractDeleteMessage(driver);
		Thread.sleep(1000);
		Contract_Screenshots.CaptureScreenshot(driver);
		// ExistingValues	
		
		Contract_ExistingValues.ExistingValues(driver);
		Contract_Screenshots.CaptureScreenshot(driver);
		// Contract_UnDelete
		Thread.sleep(1000);
		
		Contract_Undelete.UnDelete(driver);
		Contract_Screenshots.CaptureScreenshot(driver);
		
		
		
		
		
		
	
	
	
	
}
}