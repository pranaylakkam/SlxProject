package FuelLocation_SubClasses;

import javax.swing.plaf.basic.BasicTreeUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.ExcelUtils;



public class FuelLocation_FelidValidation {
	
	private static WebElement  Create_new = null; 
	  private static WebElement  IdFeildVliadation= null; 
	  private static WebElement  NameFeildVliadation = null; 
	  private static WebElement  Address1FeildVliadation= null; 
	  private static WebElement  CityFeildVliadation = null; 
	  private static WebElement  StateDropdownFeildVliadation= null; 
	  private static WebElement StateDropdownInputFeildVliadation= null; 
	  private static WebElement   ZipFeildVliadation= null; 
	  private static WebElement RegionMappingTab = null; 
	  private static WebElement Save = null; 
	  private static WebElement SaveMessage =null;
	  private static WebElement ErrorMessage = null;
	  
	public static void mouse (WebDriver driver) throws Exception{
		 driver.findElement(By.cssSelector("#main > div.page-header.navbar.navbar-fixed-top.slHeadFoot > div > div.page-logo > a > img")).click();

		
		 FuelLocation_ScreenShots.CaptureScreenshot(driver);
		 WebElement element = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[2]/div/div/ul/li[1]/a"));

		 Actions action = new Actions(driver);

		 action.moveToElement(element).moveToElement(driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[2]/div/div/ul/li[1]/ul/li[11]/a"))).click().build().perform();
		 FuelLocation_ScreenShots.CaptureScreenshot(driver);
		 driver.manage().window().maximize();
		 ExcelUtils.setCellData("Pass",6, 7);
	  
	 }
	
	public static WebElement  Create_new (WebDriver driver) throws Exception{
		 
		WebElement  Create_new =driver.findElement(By.xpath(".//*[@id='btncreate']"));
		 ExcelUtils.setCellData("Pass",8, 7);

	 return Create_new;
	}
	public static WebElement ErrorMessage (WebDriver driver) throws Exception{
		
	String ExpectedIdErrorMessage = ExcelUtils.getCellData(10, 5);
	String ActualIdErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Code-error']")).getText();
	
	if(ExpectedIdErrorMessage.equals(ActualIdErrorMessage))
	{
		System.out.println(ActualIdErrorMessage);
		ExcelUtils.setCellData("Pass",10, 7);
		ExcelUtils.setCellData(ActualIdErrorMessage,10, 6);
	}
	else
	{
		ExcelUtils.setCellData("Fail",10, 7);
		ExcelUtils.setCellData(ActualIdErrorMessage,10, 6);
	}
	
	String ExpectedNameErrorMessage =ExcelUtils.getCellData(11, 5);
	String ActualNameErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Text-error']")).getText();
	
	if(ExpectedNameErrorMessage.equals(ActualNameErrorMessage))
	{
		System.out.println(ActualNameErrorMessage);
		ExcelUtils.setCellData("Pass",11, 7);
		ExcelUtils.setCellData(ActualNameErrorMessage,11, 6);
	}
	else
	{
		ExcelUtils.setCellData("Fail",11, 7);
		ExcelUtils.setCellData(ActualNameErrorMessage,11, 6);
	}
	
	String ExpectedAddress1ErrorMessage = ExcelUtils.getCellData(12, 5);
	String ActualAddress1ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Address1-error']")).getText();
	
	if(ExpectedAddress1ErrorMessage.equals(ActualAddress1ErrorMessage))
	{
		System.out.println(ActualAddress1ErrorMessage);
		ExcelUtils.setCellData("Pass",12, 7);
		ExcelUtils.setCellData(ActualAddress1ErrorMessage,12, 6);
	}	
	else
	{
		ExcelUtils.setCellData("Fail",12, 7);
		ExcelUtils.setCellData(ActualAddress1ErrorMessage,12, 6);
	}	
	String ExpectedCityErrorMessage = ExcelUtils.getCellData(13, 5);;
	String ActualCityErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_City-error']")).getText();
	
	if(ExpectedCityErrorMessage.equals(ActualCityErrorMessage))
	{
		System.out.println(ActualCityErrorMessage);
		ExcelUtils.setCellData("Pass",13, 7);
		ExcelUtils.setCellData(ActualCityErrorMessage,13, 6);
	}	
	else
	{
		ExcelUtils.setCellData("Fail",13, 7);
		ExcelUtils.setCellData(ActualCityErrorMessage,13, 6);
	}	
	String ExpectedStateErrorMessage = ExcelUtils.getCellData(14, 5);
	String ActualStateErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_State-error']")).getText();
	
	if(ExpectedStateErrorMessage.equals(ActualStateErrorMessage))
	{
		System.out.println(ActualStateErrorMessage);
		ExcelUtils.setCellData("Pass",14, 7);
		ExcelUtils.setCellData(ActualStateErrorMessage,14, 6);
	}		
	else
	{
		ExcelUtils.setCellData("Fail",14, 7);
		ExcelUtils.setCellData(ActualStateErrorMessage,14, 6);
	}	
	
	String ExpectedZipErrorMessage = ExcelUtils.getCellData(15, 5);
	String ActualZipErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Zip-error']")).getText();
	
	if(ExpectedZipErrorMessage.equals(ActualZipErrorMessage))
	{
		System.out.println(ActualZipErrorMessage);
		ExcelUtils.setCellData("Pass",15, 7);
		ExcelUtils.setCellData(ActualZipErrorMessage,15, 6);
		
	}		
	else
	{
		ExcelUtils.setCellData(ActualZipErrorMessage,15, 6);
		ExcelUtils.setCellData("Fail",15, 7);
	}
	
		 return ErrorMessage;
	}
	
	
	public static WebElement IdFeildVliadation (WebDriver driver){
		 WebElement IdFeildVliadation =	driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Code']"));
         return  IdFeildVliadation;
	}
	
	public static WebElement NameFeildVliadation (WebDriver driver) throws Exception{
		WebElement NameFeildVliadation=	driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Text']"));
		
		NameFeildVliadation.sendKeys(ExcelUtils.getCellData(17, 4));
		
		Thread.sleep(3000);

	String	NameErrorMessage =driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Text-error']")).getText();
	String ActualElement =  ExcelUtils.getCellData(17, 5);
		if(NameErrorMessage.equals( ActualElement))
		{
			ExcelUtils.setCellData(NameErrorMessage,17,6);
			ExcelUtils.setCellData("Pass",18,7);
			System.out.println(NameErrorMessage);
			NameFeildVliadation.clear();
			NameFeildVliadation.sendKeys( ExcelUtils.getCellData(18, 4));
		}
		
		
		return NameFeildVliadation;
	
	}		
	
	public static void Address1FeildVliadation (WebDriver driver) throws Exception{
		WebElement Address1FeildVliadation= 	driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Address1']"));
		Address1FeildVliadation.sendKeys(ExcelUtils.getCellData(19, 4));
		
		
		 String ExpectedAddress1FeildVliadationErrorMessage = ExcelUtils.getCellData(19, 5);
		   	String	ActualAddress1FeildVliadationErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Address1-error']")).getText();
		   
		   	if(ExpectedAddress1FeildVliadationErrorMessage.equals(ActualAddress1FeildVliadationErrorMessage))
		   	{
		   		System.out.print(ActualAddress1FeildVliadationErrorMessage);
		   		ExcelUtils.setCellData(ActualAddress1FeildVliadationErrorMessage,19, 6);
		   		ExcelUtils.setCellData("Pass",19, 7);
		   		
		   		
		   	}
			 
		   	Address1FeildVliadation.clear();
		   	Address1FeildVliadation.sendKeys(ExcelUtils.getCellData(20, 4));
		 
	
		 } 
		
	

	public static  WebElement CityFeildVliadation (WebDriver driver) throws Exception{
		WebElement CityFeildVliadation=		driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_City']"));
	//	WebElement City = driver.findElement(By.xpath(".//*[@id='BaseCustomer_City']"));
		CityFeildVliadation.sendKeys(ExcelUtils.getCellData(21, 4));
		CityFeildVliadation.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		String ExpectedCityFeildVliadationErrorMessage = ExcelUtils.getCellData(21, 5);
		String CityFeildVliadation_ErrorMessage2 = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_City-error']")).getText();
	
		
		if(ExpectedCityFeildVliadationErrorMessage.equals(CityFeildVliadation_ErrorMessage2))
		{
			System.out.println(CityFeildVliadation_ErrorMessage2);
		
			ExcelUtils.setCellData(CityFeildVliadation_ErrorMessage2,21, 6);
			ExcelUtils.setCellData("Pass",21, 7);
			CityFeildVliadation.clear();
			Thread.sleep(3000);
			CityFeildVliadation.sendKeys(ExcelUtils.getCellData(22, 4));
			CityFeildVliadation.sendKeys(Keys.TAB);
		}
		else{
			
			ExcelUtils.setCellData(CityFeildVliadation_ErrorMessage2,21, 6);
			ExcelUtils.setCellData("Fail",21, 7);
			Thread.sleep(3000);
			CityFeildVliadation.clear();
			Thread.sleep(4000);
			CityFeildVliadation.sendKeys(ExcelUtils.getCellData(22, 4));
			CityFeildVliadation.sendKeys(Keys.TAB);
			
		}
		
		String ExpectedCityFeildVliadation = ExcelUtils.getCellData(22, 5);
		String CityFeildVliadation_2 = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_City-error']")).getText();
	
		
		if(ExpectedCityFeildVliadation.equals(CityFeildVliadation_2))
		{
			System.out.println(CityFeildVliadation_ErrorMessage2);
		
			ExcelUtils.setCellData(CityFeildVliadation_ErrorMessage2,22, 6);
			ExcelUtils.setCellData("Pass",22, 7);
			
			CityFeildVliadation.sendKeys(ExcelUtils.getCellData(22, 4));
			CityFeildVliadation.sendKeys(Keys.TAB);
			CityFeildVliadation.clear();
			Thread.sleep(4000);
			CityFeildVliadation.sendKeys(ExcelUtils.getCellData(23, 4));
		}
		
		else
		{
			ExcelUtils.setCellData(CityFeildVliadation_ErrorMessage2,21, 6);
			ExcelUtils.setCellData("Fail",22, 7);
			CityFeildVliadation.clear();
			Thread.sleep(4000);
			
			CityFeildVliadation.sendKeys(ExcelUtils.getCellData(23, 4));
		}
		
		return CityFeildVliadation;
	}	
	public static  WebElement StateDropdownFeildVliadation (WebDriver driver) throws Exception{
		WebElement  StateDropdownFeildVliadation= driver.findElement(By.xpath(".//*[@id='tabDetails']/div/div/fieldset[2]/div[2]/div/span[1]/span/span[2]"));
		ExcelUtils.setCellData("Pass",24, 7);
		return StateDropdownFeildVliadation;
	
	}	
	public static  WebElement StateDropdownInputFeildVliadation (WebDriver driver) throws Exception{
		
		
		WebElement	StateDropdownInputFeildVliadation = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_State-list']/span/input"));
		
		Thread.sleep(6000);
		
	/*	int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
		Thread.sleep(5000);
      driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys("Arizona");
      Thread.sleep(6000);
  
      driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
   */
		ExcelUtils.setCellData("Pass",24, 7);
		return StateDropdownInputFeildVliadation;
	
	}
	public static  void ZipFeildVliadation (WebDriver driver) throws Exception{
	
		WebElement ZipFeildVliadation = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Zip']"));
		ZipFeildVliadation.click();
		Thread.sleep(3000);
		ZipFeildVliadation.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(25, 4)));
		ZipFeildVliadation.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		String ExpectedZipFeildVliadationErrorMessage = ExcelUtils.getCellData(25, 5);
		String ZipFeildVliadation_ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Zip-error']")).getText();
	
		
		if(ExpectedZipFeildVliadationErrorMessage.equals(ZipFeildVliadation_ErrorMessage))
		{
			System.out.println(ZipFeildVliadation_ErrorMessage);
			
			ExcelUtils.setCellData(ZipFeildVliadation_ErrorMessage, 25,6);
			ExcelUtils.setCellData("Pass", 25,7);
			ZipFeildVliadation.clear();
			Thread.sleep(3000);
			ZipFeildVliadation.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(26, 4)));
		}
		
		else
		{
			ExcelUtils.setCellData(ZipFeildVliadation_ErrorMessage, 25,6);
			ExcelUtils.setCellData("Fail", 25,7);
			ZipFeildVliadation.clear();
			Thread.sleep(3000);
			ZipFeildVliadation.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(26, 4)));
		}
		
	        String ExpectedZipFeildVliadationErrorMessage1 =  ExcelUtils.getCellData(26, 5);
			String ZipFeildVliadation_ErrorMessage1 = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Zip-error']")).getText();
		
			
			if(ExpectedZipFeildVliadationErrorMessage1.equals(ZipFeildVliadation_ErrorMessage1))
			{
				System.out.println(ZipFeildVliadation_ErrorMessage1);
				ExcelUtils.setCellData(ZipFeildVliadation_ErrorMessage1, 26,6);
				
				ExcelUtils.setCellData("Pass", 26,7);
				ZipFeildVliadation.clear();
				Thread.sleep(3000);
				ZipFeildVliadation.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(27, 4)));
			}
			else{
				
				System.out.println(ZipFeildVliadation_ErrorMessage1);
				
	               ExcelUtils.setCellData(ZipFeildVliadation_ErrorMessage1, 26,6);
				
				ExcelUtils.setCellData("Pass", 26,7);
				ZipFeildVliadation.clear();
				Thread.sleep(3000);
				ZipFeildVliadation.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(27, 4)));
				
				
			}
			
			
			
			
		}
	
	public static WebElement RegionMappingTab (WebDriver driver) throws Exception{
		WebElement RegionMappingTab =	driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
		ExcelUtils.setCellData("Pass", 28,7);
		return RegionMappingTab;
	}	
	
	public static WebElement RegionMappingCheckbox(WebDriver driver) throws Exception{
		WebElement RegionMappingCheckbox =	driver.findElement(By.xpath(".//*[@id='RegionFuelingLocationsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
		ExcelUtils.setCellData("Pass", 30,7);

		return RegionMappingCheckbox;
	}	
	
	
	
	
	public static  WebElement Save (WebDriver driver) throws Exception{
		 WebElement Save =	driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
		 ExcelUtils.setCellData("Pass", 31,7);
		return Save;
	}	
	
	
	public static  WebElement SaveMessage (WebDriver driver) throws Exception{
		 WebElement SaveMessage =	driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 
		 
		 if(SaveMessage.isDisplayed()){
			 ExcelUtils.setCellData("Pass", 32,7);
			 ExcelUtils.setCellData(SaveMessage.getText(),32,6);
		 }

		return SaveMessage;
	}
	

}
