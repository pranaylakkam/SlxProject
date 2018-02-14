package ContractFunctionalities;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ContractFunctionalities.Contract_FieldValidations;
import Utility.ExcelUtils;

    public class Contract_FieldValidations {

	private static WebElement Number = null;
	private static WebElement Search = null;
	private static WebElement Create_New= null;
    private static WebElement Perpetual_Checkbox= null;
	private static WebElement Priceineffect_Checkbox= null;
	private static WebElement Terminal_Dropdown= null;
	private static WebElement Terminal_Input= null;
	private static WebElement SupplierDropdown= null;
	private static WebElement SupplierSelect= null;
	private static WebElement VendorDropdown= null;
	private static WebElement VendorSelect= null;
	private static WebElement Product_DetailsTab= null;
	private static WebElement ProductName_Checkbox= null;
	private static WebElement Save_Button= null;
	private static WebElement Save_Message= null;

	private static WebElement Pin = null;
	private static WebElement Product_DetailsSaerchBox = null;
	
	
 public static void Mouse (WebDriver driver) throws Exception{
		
	 WebElement Maintenace = driver.findElement(By.xpath("//li[2]/span"));
	
	 Maintenace.click();
	 
	  
	  
	  int ok_size1=driver.findElements(By.xpath("//li[2]/span")).size();
		 
		 
	  
	  Actions action2 = new Actions(driver);
	  
	  Thread.sleep(5000);

	  action2.moveToElement(driver.findElements(By.xpath("//li[2]/div/ul/li/a")).get(ok_size1-1)).click();

	  Thread.sleep(5000);

	  driver.findElement(By.xpath("//li[2]/div/ul/li/a")).click();
	  
	 }
 
 public static void Url(WebDriver driver) throws Exception{
	 
	 String ExpectedUrlMessage = ExcelUtils.getCellData(95,5);
	 String ActualUrlMessage = driver.getCurrentUrl();
		
	 if(ExpectedUrlMessage.equals(ActualUrlMessage)){
		 
		 System.out.println(ActualUrlMessage);
		 System.out.println("Logged sucessfully");
			ExcelUtils.setCellData(ActualUrlMessage, 95, 6);
		    ExcelUtils.setCellData("Pass", 95, 7);	 
	 }
	 else
	 {
		 System.out.println(ActualUrlMessage);
			ExcelUtils.setCellData(ActualUrlMessage, 95, 6);
		    ExcelUtils.setCellData("Fail", 95, 7);
	 }
	 
 }
 
 
 
 public static void VendorErrorMessage (WebDriver driver) throws Exception{
	 
	 
	 String ExpectedVendorErrorMessage = ExcelUtils.getCellData(18,5);
	 String ActualVendorErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseContract_VendorId-error']")).getText();
		
		if(ExpectedVendorErrorMessage.equals(ActualVendorErrorMessage))
		{
			System.out.println(ActualVendorErrorMessage);
			ExcelUtils.setCellData(ActualVendorErrorMessage, 18, 6);
		    ExcelUtils.setCellData("Pass", 18, 7);
		}
		else
		{
            ExcelUtils.setCellData(ActualVendorErrorMessage, 18, 6);
			ExcelUtils.setCellData("Fail", 18, 7);
			
		}
 }
 
 
 
 public static void SupplierErrorMessage (WebDriver driver) throws Exception{
	 
	 
     	 String ExpectedSupplierErrorMessage =ExcelUtils.getCellData(16, 5);
		String ActualSupplierErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseContract_SupplierId-error']")).getText();
		
		if(ExpectedSupplierErrorMessage.equals(ActualSupplierErrorMessage))
		{
			System.out.println(ActualSupplierErrorMessage);
			ExcelUtils.setCellData(ActualSupplierErrorMessage, 16, 6);
			ExcelUtils.setCellData("Pass", 16, 7);		
		}
		else{
			
             ExcelUtils.setCellData(ActualSupplierErrorMessage, 16, 6);
			
			ExcelUtils.setCellData("Fail", 16, 7);
		}
}
 public static WebElement Search(WebDriver driver) throws Exception{
 
 
	 
	 Search = driver.findElement(By.xpath(".//*[@id='txtSearchContractGrid']"));
	 ExcelUtils.setCellData("Pass", 8, 7);
	 return Search; 
 } 
 public static WebElement Create_New(WebDriver driver) throws Exception{
     
	 Create_New = driver.findElement(By.xpath(".//*[@id='btncreate']"));
	 ExcelUtils.setCellData("Pass", 9, 7);
	 
	 return Create_New;
	 
 } 
 
 

 
 public static void ErrorMessage (WebDriver driver) throws Exception{
 
 
	 String ExpectedNumberErrorMessage = ExcelUtils.getCellData(11, 5);
	 String ActualNumberErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseContract_Number-error']")).getText();
		
		if(ExpectedNumberErrorMessage.equals(ActualNumberErrorMessage))
		{
			System.out.println(ActualNumberErrorMessage);
			
			ExcelUtils.setCellData(ActualNumberErrorMessage, 11, 6);
			
			ExcelUtils.setCellData("Pass", 11, 7);
		}

		String ExpectedTerminalErrorMessage = ExcelUtils.getCellData(14, 5);;
				String ActualTerminalErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseContract_TerminalId-error']")).getText();
				
				if(ExpectedTerminalErrorMessage.equals(ActualTerminalErrorMessage))
				{
					System.out.println(ActualTerminalErrorMessage);
					ExcelUtils.setCellData(ActualTerminalErrorMessage, 14, 6);
					
					ExcelUtils.setCellData("Pass", 14, 7);
				}else
				
				{
                    ExcelUtils.setCellData(ActualTerminalErrorMessage, 14, 6);
				    ExcelUtils.setCellData("Fail", 14, 7);	
				}
		
			WebElement 	Save_Button = driver.findElement(By.xpath(".//*[@id='btnCreate']"));
				
			Save_Button.click();
			ExcelUtils.setCellData("Pass", 16, 7);
				
				
				
			
				
				
} 
 
 
 
 
public static WebElement Number (WebDriver driver) throws Exception{
 
 
	 
	 Number = driver.findElement(By.xpath(".//*[@id='BaseContract_Number']"));
	 ExcelUtils.setCellData("Pass", 19, 7);
	 return Number;
	 
 
 }



 

public static WebElement Perpetual_Checkbox(WebDriver driver) throws Exception{
	 
	Perpetual_Checkbox = driver.findElement(By.xpath(".//*[@id='BaseContract_Perpetual']"));
	ExcelUtils.setCellData("Pass", 22, 7);
	 return Perpetual_Checkbox;
	 
	 
	 
	 
 }
 
public static WebElement Pin(WebDriver driver) throws Exception{
	 
	Pin = driver.findElement(By.xpath(".//*[@id='BaseContract_Pin']"));
	ExcelUtils.setCellData("Pass", 30, 7);
	 return Pin;
	 
	 
	 
	 
 }

public static WebElement Priceineffect_Checkbox(WebDriver driver) throws Exception{
	 
	Priceineffect_Checkbox = driver.findElement(By.xpath(".//*[@id='BaseContract_UseBolEndTime']"));
	ExcelUtils.setCellData("Pass", 23, 7);
	 return Priceineffect_Checkbox;
	 	 
 }
public static WebElement Terminal_Dropdown(WebDriver driver) throws Exception{
	 
	Terminal_Dropdown = driver.findElement(By.xpath("//div[@id='tabContractDetails']/div/div/fieldset/fieldset[2]/div/div/span/span/span[2]/span"));
	ExcelUtils.setCellData("Pass", 24, 7);
	 return Terminal_Dropdown;
	 	 
 } 

public static WebElement Terminal_Input(WebDriver driver) throws Exception{
	 
	Terminal_Input = driver.findElement(By.xpath(".//span[@class='k-list-filter']/input"));
	ExcelUtils.setCellData("Pass", 26, 7);
	 return Terminal_Input;
	 	 
 } 

public static WebElement SupplierDropdown(WebDriver driver) throws Exception{
	 
	SupplierDropdown = driver.findElement(By.xpath("//div[@id='tabContractDetails']/div/div/fieldset/fieldset[2]/div[2]/div/span/span/span[2]/span"));
	ExcelUtils.setCellData("Pass", 27, 7);
	return SupplierDropdown;
	 	 
 } 

public static WebElement SupplierSelect(WebDriver driver) throws Exception{
	 
	SupplierSelect = driver.findElement(By.xpath("//ul[@id='BaseContract_SupplierId_listbox']/li[2]"));
	ExcelUtils.setCellData("Pass", 27, 7);
	return SupplierSelect;
	 	 
 } 

public static WebElement VendorDropdown(WebDriver driver) throws Exception{
	 
	VendorDropdown = driver.findElement(By.xpath("//div[@id='tabContractDetails']/div/div/fieldset/fieldset[2]/div[3]/div/span/span/span[2]/span"));
	ExcelUtils.setCellData("Pass", 28, 7);
	return VendorDropdown;
	 	 
 } 

public static WebElement VendorSelect(WebDriver driver) throws Exception{
	 
	VendorSelect = driver.findElement(By.xpath("//ul[@id='BaseContract_VendorId_listbox']/li[2]"));
	ExcelUtils.setCellData("Pass", 29, 7);
	 return VendorSelect;
	 	 
 }
public static WebElement Product_DetailsTab(WebDriver driver) throws Exception{
	 
	Product_DetailsTab = driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
	ExcelUtils.setCellData("Pass", 31, 7);
	 return Product_DetailsTab;
	 	 
 } 
 

public static WebElement Product_DetailsSaerchBox(WebDriver driver) throws Exception{
	 
	Product_DetailsSaerchBox = driver.findElement(By.xpath("//a[contains(text(),'Product Name')]"));
	ExcelUtils.setCellData("Pass", 32, 7);
	 return Product_DetailsSaerchBox;
	 	 
 }



public static WebElement ProductName_Checkbox(WebDriver driver) throws Exception{
	 
	ProductName_Checkbox = driver.findElement(By.xpath(".//*[@id='ContractDetailsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
	ExcelUtils.setCellData("Pass", 33, 7);
	 return ProductName_Checkbox;
	 	 
 } 
 
public static WebElement Save_Button(WebDriver driver) throws Exception{
	 
	Save_Button = driver.findElement(By.xpath(".//*[@id='btnCreate']"));
	ExcelUtils.setCellData("Pass", 34, 7);
	 return Save_Button;
	 	 
 } 
 
public static WebElement Save_Message(WebDriver driver) throws Exception{
	 
	Save_Message = driver.findElement(By.xpath("//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
	ExcelUtils.setCellData("Pass", 35, 7);
	if(Save_Message.isDisplayed())
	{
		System.out.print(Save_Message.getText());
		
		ExcelUtils.setCellData(Save_Message.getText(), 35, 6);
	}
	return Save_Button;
	 	 
 } 
 



}
