package Product_Subclasses;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Product_Subclasses.Delete_Product;
import Product_Subclasses.Edit_Product;
import Product_Subclasses.Login_Page;
import Product_Subclasses.Product_ExistingValues;
import Product_Subclasses.Product_ScreenShots;
import Product_Subclasses.Product_Undelete;
import Product_Subclasses.Product_Validation;
import Utility.ExcelUtils;


public class Product {

 private static WebDriver driver = null;


 public static void Execute(WebDriver driver) throws Exception {	
 
	 
String UserName = ExcelUtils.getCellData( 3, 4);
// sending the User Name
Login_Page.txtbx_UserName(driver).sendKeys(UserName);
Product_ScreenShots.CaptureScreenshot(driver);
String Password = ExcelUtils.getCellData( 4, 4);
// sending the Password
Login_Page.txtbx_Password(driver).sendKeys(Password);
Product_ScreenShots.CaptureScreenshot(driver);
//clicking on the login button
Login_Page.btn_LogIn(driver).click();
Product_ScreenShots.CaptureScreenshot(driver);
// Mouse handler
Product_Validation.mouse(driver);
Thread.sleep(3000);
Product_ScreenShots.CaptureScreenshot(driver);
Product_Validation.Search(driver).click();
Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(2000);
Product_ScreenShots.CaptureScreenshot(driver);
// searchbox 
String Search = ExcelUtils.getCellData( 4, 7);
Product_Validation.Search(driver).sendKeys(Search);

Product_ScreenShots.CaptureScreenshot(driver);


// create new Product
Thread.sleep(2000);
Product_Validation.button(driver).click();
Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(2000);

Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(2000);
// clicking on the save button to Verify Error Message
Product_ScreenShots.CaptureScreenshot(driver);
Product_Validation.submit(driver).click();

Product_ScreenShots.CaptureScreenshot(driver);
// checking the Field level validations
Product_Validation.FieldErrorMessage(driver);
//String Name = sheet.getRow(1).getCell(3).getStringCellValue();
//Product_Validation.Name(driver).sendKeys(Name);


Product_Validation.Name(driver);
Product_ScreenShots.CaptureScreenshot(driver);
String Description = ExcelUtils.getCellData(16, 4);
// Validating the Deescription field
Product_Validation.Description(driver);
Thread.sleep(2000);
Product_Validation.submit(driver).click();
Product_ScreenShots.CaptureScreenshot(driver);
//Product_Validation.ErrormessageDescription(driver);
Product_ScreenShots.CaptureScreenshot(driver);
//clicking on the Dropdown
Product_Validation.ProductCategorydropdown(driver).click();
Thread.sleep(2000);
Product_ScreenShots.CaptureScreenshot(driver);
// Searching the for the enetered state input sent from Excel sheet
String ProductCategoryinput = ExcelUtils.getCellData( 19, 4);
Product_Validation.ProductCategoryinput(driver).sendKeys(ProductCategoryinput);
Thread.sleep(2000);
Product_ScreenShots.CaptureScreenshot(driver);
Product_Validation.ProductCategoryinput(driver).sendKeys(Keys.ENTER);
Thread.sleep(6000);
// selecting the dropdown

Thread.sleep(6000);
Product_Validation.Bulk(driver);
//clicking on the Unit of measure dropdown




Thread.sleep(5000);
Product_ScreenShots.CaptureScreenshot(driver);
// clicking ont he product sold as Tab
Product_Validation.ProductSoldAs(driver).click();
Thread.sleep(5000);
Product_ScreenShots.CaptureScreenshot(driver);
//clicking on the produc sold as serach box
Product_Validation.ProductSoldAsSearchbox(driver);
Thread.sleep(3000);
// Checking the Check box
Product_Validation.checkbox(driver).click();
Thread.sleep(2000);
Product_ScreenShots.CaptureScreenshot(driver);
// clicking on the save button
Product_Validation.submit(driver).click();
Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(2000);
// Save Message
Product_Validation.SaveMessage(driver);

Thread.sleep(2000);



//Edit Screen Functions

Product_ScreenShots.CaptureScreenshot(driver);
// lcicking on the Edit button
Edit_Product.Editbutton(driver).click();
Thread.sleep(2000);
// Editing the Description field
Product_ScreenShots.CaptureScreenshot(driver);
Edit_Product.EditDescription(driver).click();
Thread.sleep(2000);
// clearing the Description feild
Product_ScreenShots.CaptureScreenshot(driver);
Edit_Product.EditDescription(driver).clear();
Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(2000);



//Product_Validation.ProductCategoryinput(driver).sendKeys(ProductCategoryinput);
String EditDescription = ExcelUtils.getCellData(30, 4);
Edit_Product.EditDescription(driver).sendKeys(EditDescription);
Thread.sleep(2000);
Product_ScreenShots.CaptureScreenshot(driver);
// Different State Input
Edit_Product.EditProductCategorydropdown(driver).click();
Thread.sleep(3000);
Product_ScreenShots.CaptureScreenshot(driver);
Edit_Product.EditProductCategoryinput(driver);
Product_ScreenShots.CaptureScreenshot(driver);
// product Sold as Tab
Edit_Product.EditProductSoldAs(driver).click();
Thread.sleep(2000);
Edit_Product.EditProductSoldAsSearchbox(driver);


Thread.sleep(2000);
Product_ScreenShots.CaptureScreenshot(driver);
// clicking on the UpDate button
Edit_Product.Update(driver).click();
Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(3000);
// update Message
Edit_Product.UpdateMessage(driver);

// Delete popup handler

Delete_Product.Delete(driver).click();
Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(2000);
// message in the alert box
Delete_Product.confirmationContent(driver);
Product_ScreenShots.CaptureScreenshot(driver);
// clicking on the cancel button
Delete_Product.confirmationcancel(driver).click();
Thread.sleep(2000);
// Existing Value Functionalaties
Product_ScreenShots.CaptureScreenshot(driver);
Product_ExistingValues.ExistingValues(driver);
Thread.sleep(2000);
// Undelete fucntionality
Product_Undelete.Undelete(driver);
Product_ScreenShots.CaptureScreenshot(driver);








}
 

 



}