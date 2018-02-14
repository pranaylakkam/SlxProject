package Terminal_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class Terminal_EditScreen {
	
private static WebElement EditButton= null;
private static WebElement EditName = null;
private static WebElement EditAvrageLoadTime = null;
private static WebElement EditInternalTerminal= null;
private static WebElement EditAddress = null;
private static WebElement EditCity = null;
private static WebElement EditState = null;
private static WebElement EditStateInput = null;
private static WebElement EditZip = null;
private static WebElement EditLatitude= null;
private static WebElement EditLongitude= null;
private static WebElement EditSupplierMappingTab = null;
private static WebElement EditSupplierMappingCheckbox = null;
private static WebElement EditDriverMappingTab= null;
private static WebElement EditDriverMappingCheckbox = null;
private static WebElement EditTruckMappingTab = null;
private static WebElement EditTruckMappingCheckbox = null;
private static WebElement Update = null;
private static WebElement UpdateMessage = null;
 public static WebElement EditButton(WebDriver driver)throws Exception{
	 
	 
		 
	 EditButton = driver.findElement(By.xpath("//*[@id='TerminalGrid']/div[2]/table/tbody/tr[1]/td[5]/a"));
	 ExcelUtils.setCellData("Pass",49, 7);
		 return EditButton;
		 
	 
	 } 
	
 
 public static WebElement  EditName (WebDriver driver)throws Exception{
	 
	 EditName  = driver.findElement(By.xpath(".//*[@id='BaseTerminal_NameCode']"));
	 ExcelUtils.setCellData("Pass",50, 7);
	return EditName;
	
}
public static WebElement  EditAvrageLoadTime(WebDriver driver)throws Exception{
	 
	 
	 
	EditAvrageLoadTime  = driver.findElement(By.xpath(".//*[@id='BaseTerminal_AveLoadTime']"));
	ExcelUtils.setCellData("Pass",51, 7);
		 return  EditAvrageLoadTime ;
		 
	 
	 } 

 public static WebElement  EditInternalTerminal (WebDriver driver)throws Exception{
	 
	 
	 
	 EditInternalTerminal= driver.findElement(By.xpath(".//*[@id='BaseTerminal_Internal']"));
	 ExcelUtils.setCellData("Pass",52, 7);
		 return EditInternalTerminal ;
		 
	 
	 } 

 public static WebElement   EditAddress(WebDriver driver)throws Exception{
	 
	 
	 EditAddress = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Address']"));
	 ExcelUtils.setCellData("Pass",53, 7);
		 return  EditAddress ;
		 
	 
	 } 

 public static WebElement  EditCity (WebDriver driver)throws Exception{
	 
	 
	 
	 EditCity = driver.findElement(By.xpath(".//*[@id='TerminalAddress_City']"));
	 ExcelUtils.setCellData("Pass",54, 7);
		 return EditCity;
		 
	 
	 } 


 public static WebElement EditZip (WebDriver driver)throws Exception{
	 
	 
	 
	 EditZip  = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Zip']"));
	 ExcelUtils.setCellData("Pass",55, 7);
		 return   EditZip ;
		 
	 
	 } 

 public static WebElement   EditLatitude (WebDriver driver)throws Exception{
	 EditLatitude  = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude']"));
	 ExcelUtils.setCellData("Pass",56, 7);
 EditLatitude.clear();
 EditLatitude.sendKeys("23.2654");
	
 return   EditLatitude;
		 
	 
	 } 

 public static WebElement   EditLongitude (WebDriver driver)throws Exception{
	 
	 EditLongitude = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude']"));
	 ExcelUtils.setCellData("Pass",57, 7);
	 EditLongitude.clear();
	 EditLongitude.sendKeys("32.2321");
	    return  EditLongitude;	 
	 
	 } 
 
public static WebElement   EditSupplierMappingTab (WebDriver driver)throws Exception{
	 
	 
	 
	EditSupplierMappingTab  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
	ExcelUtils.setCellData("Pass",58, 7);
		 return  EditSupplierMappingTab ;
		 
	 
	 } 
	 

public static WebElement   EditSupplierMappingCheckbox (WebDriver driver)throws Exception{
	 
	 
	 
	EditSupplierMappingCheckbox  = driver.findElement(By.xpath(".//*[@id='TerminalSuppliersGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
	ExcelUtils.setCellData("Pass",59, 7);
		 return  EditSupplierMappingCheckbox ;
		 
	 
	 } 

public static WebElement   EditDriverMappingTab (WebDriver driver)throws Exception{
	 
	 
	 
	EditDriverMappingTab  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[3]/a"));
	ExcelUtils.setCellData("Pass",60, 7);
		 return  EditDriverMappingTab ;
		 
	 
	 } 

public static WebElement   EditDriverMappingCheckbox (WebDriver driver)throws Exception{
	 
	 
	 
	EditDriverMappingCheckbox  = driver.findElement(By.xpath(".//*[@id='TerminalDriversGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
	ExcelUtils.setCellData("Pass",61, 7);
		 return  EditDriverMappingCheckbox ;
		 
	 
	 } 

public static WebElement  EditTruckMappingTab (WebDriver driver)throws Exception{
	 
	 
	 
	EditTruckMappingTab  = driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[4]/a"));
	ExcelUtils.setCellData("Pass",62, 7);
		 return   EditTruckMappingTab ;
		 
	 
	 } 

public static WebElement  EditTruckMappingCheckbox (WebDriver driver)throws Exception{
	 
	 
	 
	EditTruckMappingCheckbox  = driver.findElement(By.xpath("//*[@id='TruckTerminalsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
	ExcelUtils.setCellData("Pass",63, 7);
		 return   EditTruckMappingCheckbox ;
		 
	 
	 } 
	 
public static  WebElement Update (WebDriver driver)throws Exception{
	 WebElement Update =	driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
	 ExcelUtils.setCellData("Pass",64, 7);
	return Update;
}	

  public static  WebElement UpdateMessage (WebDriver driver) throws Exception{
	 WebElement UpdateMessage =	driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
	 ExcelUtils.setCellData("Pass",68, 7);
	 System.out.println(UpdateMessage.getText());
	 ExcelUtils.setCellData(UpdateMessage.getText(),68, 6);
	return UpdateMessage;
}	

}	