package Terminal_SubClasses;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.ExcelUtils;



public class Terminal_Validation {


	private static WebElement Create_New= null;
	private static WebElement Number = null;
	private static WebElement Name = null;
	private static WebElement AvrageLoadTime = null;
	private static WebElement InternalTerminal= null;
	
	private static WebElement City = null;
	private static WebElement State = null;
	private static WebElement StateInput = null;
	
	private static WebElement Latitude= null;
	private static WebElement Longitude= null;
	private static WebElement SupplierMappingTab = null;
	private static WebElement SupplierMappingCheckbox = null;
	private static WebElement SupplierMappingSearchbox = null;
	private static WebElement DriverMappingTab= null;
	private static WebElement DriverMappingCheckbox = null;
	private static WebElement DriverMappingSearchbox = null;
	private static WebElement TruckMappingTab = null;
	private static WebElement TruckMappingCheckbox = null;
	private static WebElement TruckMappingSerachBox = null;

	private static WebElement ErrorMessage =null;
	private static WebElement Searchbox = null;
	  
	  
	public static void Mouse (WebDriver driver) throws Exception{
		 
		
	 WebElement Maintenace = driver.findElement(By.xpath("//li[2]/span"));
	
	 Maintenace.click();
	 
	  Terminal_ScreenShots.CaptureScreenshot(driver);
	  
	  int ok_size1=driver.findElements(By.xpath("//li[2]/span")).size();
		 
	Actions action2 = new Actions(driver);
	  
	  Thread.sleep(5000);

	  action2.moveToElement(driver.findElements(By.xpath("//a[contains(text(),'Terminal')]")).get(ok_size1-1)).click();

	  Thread.sleep(5000);
	  Terminal_ScreenShots.CaptureScreenshot(driver);

	  driver.findElement(By.xpath("//a[contains(text(),'Terminal')]")).click();
	
	  Terminal_ScreenShots.CaptureScreenshot(driver);
		 
	 }
	 
	 public static WebElement Serachbox(WebDriver driver) throws Exception{
	 
	 
		 
		 Searchbox = driver.findElement(By.xpath(".//*[@id='txtSearchTerminalGrid']"));
		 ExcelUtils.setCellData("Pass", 7, 7);
		 return Searchbox;
		 	 }
	 
	 public static WebElement Create_New(WebDriver driver) throws Exception{
	 
		 Create_New = driver.findElement(By.xpath(".//*[@id='btncreate']"));
		 ExcelUtils.setCellData("Pass", 8, 7);	
		 return Create_New;
		  } 
	 
	 
	 
 public static WebElement ErrorMessage(WebDriver driver) throws Exception{
	 
	 
	 
	 
	 
	 
	 Terminal_ScreenShots.CaptureScreenshot(driver);
	 driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude']")).clear();
	 Terminal_ScreenShots.CaptureScreenshot(driver);
	 driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude']")).clear();
	 Terminal_ScreenShots.CaptureScreenshot(driver);
	 driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();	 
	 
	    String ExpectedNumberErrorMessage = ExcelUtils.getCellData(11, 5);
		String ActualNumberErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseTerminal_NumDesc-error']")).getText();
		
		if(ExpectedNumberErrorMessage.equals(ActualNumberErrorMessage))
		{
			System.out.println(ActualNumberErrorMessage);
			 ExcelUtils.setCellData(ActualNumberErrorMessage, 11, 6);	
			 ExcelUtils.setCellData("Pass", 11, 7);	
			 
		}
		else
		{
			 ExcelUtils.setCellData(ActualNumberErrorMessage, 11, 6);	
			 ExcelUtils.setCellData("Fail", 11, 7);	
			
		}
		String ExpectedNameErrorMessage =  ExcelUtils.getCellData(12, 5);
		String ActualNameErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseTerminal_NameCode-error']")).getText();
		
		if(ExpectedNameErrorMessage.equals(ActualNameErrorMessage))
		{
			 ExcelUtils.setCellData(ExpectedNameErrorMessage, 12, 6);
			System.out.println("ActualNameErrorMessage");
			 ExcelUtils.setCellData("Pass", 12, 7);	
			
		}
		else
		{
			 ExcelUtils.setCellData(ExpectedNameErrorMessage, 12, 6);
			 ExcelUtils.setCellData("Fail", 12, 7);	
		}
		String ExpectedAverageloadtimeErrorMessage =  ExcelUtils.getCellData(13, 5);
		String ActualAverageloadtimeErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseTerminal_AveLoadTime-error']")).getText();
		
		if(ExpectedAverageloadtimeErrorMessage.equals(ActualAverageloadtimeErrorMessage))
		{
			 ExcelUtils.setCellData(ActualAverageloadtimeErrorMessage, 13, 6);
			 ExcelUtils.setCellData("Pass", 13, 7);
			 System.out.println(ActualAverageloadtimeErrorMessage);
		}
		else{
			ExcelUtils.setCellData(ActualAverageloadtimeErrorMessage, 13, 6);
			 ExcelUtils.setCellData("Fail", 13, 7);
		}
		
		String ExpectedAddressErrorMessage =  ExcelUtils.getCellData(14, 5);
		String ActualAddressErrorMessage = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Address-error']")).getText();
		
		if(ExpectedAddressErrorMessage.equals(ActualAddressErrorMessage))
		{
			 ExcelUtils.setCellData(ActualAddressErrorMessage, 14, 6);
			System.out.println(ActualAddressErrorMessage);
			 ExcelUtils.setCellData("Pass", 14, 7);
			
		}
		else
		{
			ExcelUtils.setCellData(ActualAddressErrorMessage, 14, 6);
			System.out.println(ActualAddressErrorMessage);
			 ExcelUtils.setCellData("Fail", 14, 7);
			
		}
		String ExpectedCityErrorMessage =  ExcelUtils.getCellData(15, 5);
		String ActualCityErrorMessage = driver.findElement(By.xpath(".//*[@id='TerminalAddress_City-error']")).getText();
		
		if(ExpectedCityErrorMessage.equals(ActualCityErrorMessage))
		{
			 ExcelUtils.setCellData(ActualCityErrorMessage, 15, 6);
			System.out.println(ActualCityErrorMessage);
			 ExcelUtils.setCellData("Pass", 15, 7);
		}
		else{
			 ExcelUtils.setCellData(ActualCityErrorMessage, 15, 6);
				System.out.println(ActualCityErrorMessage);
				 ExcelUtils.setCellData("Fail", 15, 7);
		}
		String ExpectedStateErrorMessage =  ExcelUtils.getCellData(16, 5);
		String ActualStateErrorMessage = driver.findElement(By.xpath(".//*[@id='TerminalAddress_State-error']")).getText();
		
		if(ExpectedStateErrorMessage.equals(ActualStateErrorMessage))
		{
			 ExcelUtils.setCellData(ActualStateErrorMessage, 16, 6);
			 ExcelUtils.setCellData("Pass", 16, 7);
			 System.out.println(ActualStateErrorMessage);
		}else
		{
			ExcelUtils.setCellData(ActualStateErrorMessage, 16, 6);
			 ExcelUtils.setCellData("Fail", 16, 7);
			
		}
		String ExpectedZipErrorMessage = ExcelUtils.getCellData(17, 5);
		String ActualZipErrorMessage = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Zip-error']")).getText();
		
		if(ExpectedZipErrorMessage.equals(ActualZipErrorMessage))
		{
			 ExcelUtils.setCellData(ActualZipErrorMessage, 17, 6);
			 ExcelUtils.setCellData("Pass", 17, 7);
			 
			System.out.println(ActualZipErrorMessage);
		}
		else
		{
			 ExcelUtils.setCellData(ActualZipErrorMessage, 17, 6);
			 ExcelUtils.setCellData("Fail", 17, 7);
		}
		String ExpectedLatitudeErrorMessage =  ExcelUtils.getCellData(19, 5);
		String ActualLatitudeErrorMessage = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude-error']")).getText();
		
		if(ExpectedLatitudeErrorMessage.equals(ActualLatitudeErrorMessage))
		{
			 ExcelUtils.setCellData(ActualLatitudeErrorMessage, 19, 6);
			 ExcelUtils.setCellData("Pass", 19, 7);
			System.out.println(ActualLatitudeErrorMessage);
			
		}
		else
		{
			ExcelUtils.setCellData(ActualLatitudeErrorMessage, 19, 6);
			 ExcelUtils.setCellData("Fail", 19, 7);
		}
		String ExpectedLongitudeErrorMessage =  ExcelUtils.getCellData(20, 5);
		String ActualLongitudeErrorMessage = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude-error']")).getText();
		
		if(ExpectedLongitudeErrorMessage.equals(ActualLongitudeErrorMessage))
		{
			 ExcelUtils.setCellData(ActualLongitudeErrorMessage, 20, 6);
			 ExcelUtils.setCellData("Pass", 20, 7);
			 
			System.out.println(ActualLongitudeErrorMessage);
		}else
		{
			ExcelUtils.setCellData(ActualLongitudeErrorMessage, 20, 6);
			 ExcelUtils.setCellData("Fail", 20, 7);
		}
		
		
		 return ErrorMessage;
		 
	 
	 } 
	 
	 
	 
	 public static WebElement Number (WebDriver driver){
	 
	 
		 
		 Number  = driver.findElement(By.xpath(".//*[@id='BaseTerminal_NumDesc']"));
		
		 return Number ;
		 
	 
	 } 
	 
 public static WebElement  Name (WebDriver driver) throws Exception{
	 
	
	
	 Name  = driver.findElement(By.xpath(".//*[@id='BaseTerminal_NameCode']"));
	Name.sendKeys(ExcelUtils.getCellData(22, 4));
	Thread.sleep(3000);
	Name.sendKeys(Keys.TAB);
	String ExpectedNameErrorMessage = ExcelUtils.getCellData(23, 5);
	String ActualNameErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseTerminal_NameCode-error']")).getText();
	
	if(ExpectedNameErrorMessage.equals(ActualNameErrorMessage))
	{
		ExcelUtils.setCellData("Pass",23,7);
	    ExcelUtils.setCellData(ActualNameErrorMessage, 23, 6);
		System.out.println(ActualNameErrorMessage);
	}
	else
	{
		ExcelUtils.setCellData("Fail",23,7);
	    ExcelUtils.setCellData(ActualNameErrorMessage, 23, 6);
		
	}
	
	WebElement Name_Error_Message=driver.findElement(By.xpath(".//*[@id='BaseTerminal_NameCode-error']"));
	if(Name_Error_Message.isDisplayed())
	{
		Name.clear();
		Name.sendKeys(ExcelUtils.getCellData(24, 4));
		
		ExcelUtils.setCellData("Pass",24,7);
	}
	 
	 	 return  Name ;
		 
	 
	 } 
	 
 public static WebElement  AvrageLoadTime(WebDriver driver) throws Exception{
	 
	 
	 
	 AvrageLoadTime  = driver.findElement(By.xpath(".//*[@id='BaseTerminal_AveLoadTime']"));
	 ExcelUtils.setCellData("Pass",25,7);
		 return  AvrageLoadTime;
		 
	 
	 } 

 public static WebElement  InternalTerminal (WebDriver driver){
	 
	 
	 
	 InternalTerminal= driver.findElement(By.xpath(".//*[@id='BaseTerminal_Internal']"));
		
		 return InternalTerminal ;
		 
	 
	 } 

 public static void   Address(WebDriver driver) throws Exception{
	 
	 
WebElement Address = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Address']"));
		
	 
	 Address.sendKeys(ExcelUtils.getCellData(26,4));
	 String ExpectedAddressErrorMessage = ExcelUtils.getCellData(26,5);
	   	String	ActualAddressErrorMessage = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Address-error']")).getText();
	   
	   	if(ExpectedAddressErrorMessage.equals(ActualAddressErrorMessage))
	   	{
	   		
	   		System.out.print(ActualAddressErrorMessage);
	   		
	   		
	   	}
		 
	   	Address.clear();
	   	Address.sendKeys("10306 Barberville Rd.");
	 
	   	
	 } 

 public static WebElement  City (WebDriver driver) throws Exception{
	 
	
	 
	 City = driver.findElement(By.xpath(".//*[@id='TerminalAddress_City']"));
	 
	 City.sendKeys(ExcelUtils.getCellData(27,4));
	 
	 String ExpectedCityErrorMessage = ExcelUtils.getCellData(27,6);
	   	String	ActualCityErrorMessage = driver.findElement(By.xpath(".//*[@id='TerminalAddress_City-error']")).getText();
	   
	   	if(ExpectedCityErrorMessage.equals(ActualCityErrorMessage))
	   	{
	   		System.out.print(ActualCityErrorMessage);
	   		ExcelUtils.setCellData("Pass",27,7);
	   		ExcelUtils.setCellData(ActualCityErrorMessage,27,6);
	   		
	   	}else
	   	{
	   		ExcelUtils.setCellData("Fail",27,7);
	   		ExcelUtils.setCellData(ActualCityErrorMessage,27,6);
	   		
	   	}
		 
	   	City.clear();
	   	City.sendKeys(ExcelUtils.getCellData(28,4));
	 
	  return City;
		 
	 
	 } 

 public static WebElement  State(WebDriver driver){
	 
	 
	 
	 State  = driver.findElement(By.xpath("//div[@id='tabTerminalDetails']/div/div/fieldset/fieldset[2]/div[3]/div/span/span/span[2]/span"));
		
		 return  State ;
		 
	 
	 } 

 public static WebElement  StateInput (WebDriver driver){
	 
	 
	 
	 StateInput  = driver.findElement(By.xpath(".//*[@id='TerminalAddress_State-list']/span/input"));
		
		 return  StateInput ;
		 
	 
	 } 

 public static void Zip (WebDriver driver) throws Exception{
	 
	 
	 WebElement Zip = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Zip']"));
		Zip.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(30, 4)));
		Zip.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		String ExpectedZipErrorMessage = ExcelUtils.getCellData(30, 5);
		String Zip_ErrorMessage = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Zip-error']")).getText();
	
		
		if(ExpectedZipErrorMessage.equals(Zip_ErrorMessage))
		{
			ExcelUtils.setCellData(Zip_ErrorMessage, 30, 6);
			ExcelUtils.setCellData("Pass", 30, 7);

			System.out.println(Zip_ErrorMessage);
			
		}
		else
		{
			ExcelUtils.setCellData(Zip_ErrorMessage, 30, 6);
			ExcelUtils.setCellData("Fail", 30, 7);
			System.out.println(Zip_ErrorMessage);
		}
		
		
		
		WebElement ZipErrorMessage = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Zip-error']"));
		
		if(ZipErrorMessage.isDisplayed())
		{
			Zip.clear();
			Zip.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(31, 4)));
			Thread.sleep(3000);
		
			
			
			String ExpectedZipErrorMessage1 = ExcelUtils.getCellData(31, 5);
			String Zip_ErrorMessage1 = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Zip-error']")).getText();
		
			
			if(ExpectedZipErrorMessage1.equals(Zip_ErrorMessage1))
			{
				System.out.println(Zip_ErrorMessage1);
				ExcelUtils.setCellData(Zip_ErrorMessage1, 31, 6);
				ExcelUtils.setCellData("Pass", 31, 7);
				
			}
			else{
				System.out.println(Zip_ErrorMessage1);
				ExcelUtils.setCellData(Zip_ErrorMessage1, 31, 6);
				ExcelUtils.setCellData("Pass", 31, 7);
			}
			
			WebElement ZipErrorMessage1 = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Zip-error']"));
			
			if(ZipErrorMessage1.isDisplayed()){
				
				Zip.clear();
				Zip.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(32, 4)));
				ExcelUtils.setCellData("Pass", 32, 7);
			}
			
		}
	 
	 } 

 public static WebElement   Latitude (WebDriver driver) throws Exception{
	  Latitude  = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude']"));
	
	  Latitude.clear();
	  
	  Latitude.sendKeys(String.valueOf(ExcelUtils.getCellDataDecimals(33, 4)));
	  Latitude.sendKeys(Keys.TAB);
		  return   Latitude;
	 } 

 public static WebElement   Longitude (WebDriver driver) throws Exception{
	 
	 Longitude = driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude']"));
	 
	 Longitude.clear();
	  
	 Longitude.sendKeys(String.valueOf(ExcelUtils.getCellDataDecimals(35, 4)));
		
	 return  Longitude;
		 
	 
	 } 
 
public static WebElement   SupplierMappingTab (WebDriver driver)throws Exception{
	 
	 
	 
	SupplierMappingTab  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
	ExcelUtils.setCellData("Pass",37, 7);
		 return  SupplierMappingTab ;
		 
	 
	 } 
	 
public static WebElement   SupplierMappingSearchbox (WebDriver driver)throws Exception{
	 
	 
	 
	SupplierMappingSearchbox  = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/form/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/input[2]"));
	ExcelUtils.setCellData("Pass",38, 7);
		 return  SupplierMappingSearchbox ;
		 
	 
	 } 

public static WebElement   SupplierMappingCheckbox (WebDriver driver)throws Exception{
	 
	 
	 
	SupplierMappingCheckbox  = driver.findElement(By.xpath("//*[@id='TerminalSuppliersGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
	ExcelUtils.setCellData("Pass",39, 7);
		 return  SupplierMappingCheckbox ;
		 
	 
	 } 

public static WebElement   DriverMappingTab (WebDriver driver)throws Exception{
	 
	DriverMappingTab  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[3]/a"));
	ExcelUtils.setCellData("Pass",40, 7);
		 return  DriverMappingTab ;
		 
	 
	 }


public static WebElement   DriverMappingSearchbox (WebDriver driver)throws Exception{
	 
	 
	 
	DriverMappingSearchbox  = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/form/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/input[2]"));
	ExcelUtils.setCellData("Pass",41, 7);
    return  DriverMappingSearchbox ;
		 
	 
	 }
public static WebElement   DriverMappingCheckbox (WebDriver driver)throws Exception{
	 
	 
	 
	DriverMappingCheckbox  = driver.findElement(By.xpath("//*[@id='TerminalDriversGrid']/div[2]/table/tbody/tr/td[1]/input"));
	ExcelUtils.setCellData("Pass",42, 7);
		 return  DriverMappingCheckbox ;
		 
	 
	 } 

public static WebElement  TruckMappingTab (WebDriver driver)throws Exception{
	 
	 
	 
	 TruckMappingTab  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[4]/a"));
	 ExcelUtils.setCellData("Pass",43, 7);
		 return   TruckMappingTab ;
		 
	 
	 } 

public static WebElement  TruckMappingSerachBox (WebDriver driver)throws Exception{
	
 
	TruckMappingSerachBox  = driver.findElement(By.xpath("//*[@id='TruckTerminalsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
	ExcelUtils.setCellData("Pass",44, 7);
		 return   TruckMappingSerachBox ;
		 
	 
	 } 

public static WebElement  TruckMappingCheckbox (WebDriver driver)throws Exception{
	 
	TruckMappingCheckbox  = driver.findElement(By.xpath("//*[@id='TruckTerminalsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
	ExcelUtils.setCellData("Pass",45, 7);
		 return   TruckMappingCheckbox ;
		  } 
	 
public static  WebElement Save (WebDriver driver) throws Exception{
	 WebElement Save =	driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
	 ExcelUtils.setCellData("Pass",46, 7);
	return Save;
}	


public static  WebElement SaveMessage (WebDriver driver) throws Exception{
	 WebElement SaveMessage =	driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
	 
	 
	 if(SaveMessage.isDisplayed()){
		 ExcelUtils.setCellData("Pass",47, 7);
		 ExcelUtils.setCellData(SaveMessage.getText(),47, 6);
		 System.out.println(SaveMessage.getText());
	 }

	return SaveMessage;
}

	 
}
