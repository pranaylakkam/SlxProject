package FuelLocation_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class FuelLocation_EditScreen {
	
	private static WebElement Editbutton = null;
	private static WebElement Edit_Name = null;
	private static WebElement Edit_Address1 = null;
	private static WebElement Edit_City=null;
	
	
	public static WebElement Editbutton(WebDriver driver) throws Exception{

		 Editbutton = driver.findElement(By.xpath(".//*[@id='FuelingLocationGrid']/div[2]/table/tbody/tr[1]/td[5]/a"));
		 ExcelUtils.setCellData("Pass", 34,7);
		 return Editbutton;
		 
		 }

	public static WebElement Edit_Name(WebDriver driver) throws Exception{
	
		Edit_Name = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Text']"));
		 ExcelUtils.setCellData("Pass", 35,7);
		return Edit_Name;
		
	}
	
	public static WebElement Edit_Address1(WebDriver driver) throws Exception{
		
		Edit_Address1 = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Address1']"));
		 ExcelUtils.setCellData("Pass", 36,7);
		return Edit_Address1;
		
	}
	
	
	public static  WebElement Edit_City (WebDriver driver) throws Exception{
		
		Edit_City =		driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_City']"));
		 ExcelUtils.setCellData("Pass", 37,7);
		return Edit_City;
	}
	public static  WebElement StateDropdownFeildVliadation (WebDriver driver) throws Exception{
		WebElement  StateDropdownFeildVliadation= driver.findElement(By.xpath(".//*[@id='tabDetails']/div/div/fieldset[2]/div[2]/div/span[1]/span/span[2]"));
		
		return StateDropdownFeildVliadation;
	
	}	
	public static  WebElement StateDropdownInputFeildVliadation (WebDriver driver) throws Exception{
		
		
		WebElement	StateDropdownInputFeildVliadation = driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_State-list']/span/input"));
		
		Thread.sleep(6000);
		
		int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
		Thread.sleep(5000);
      driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(ExcelUtils.getCellData(38, 4));
      Thread.sleep(6000);
  
      driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
   
		ExcelUtils.setCellData("Pass",24, 7);
		return StateDropdownInputFeildVliadation;
	
	}
	
  	public static  WebElement Edit_Zip (WebDriver driver) throws Exception{
		
		WebElement Edit_Zip= 	driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Zip']"));
		 ExcelUtils.setCellData("Pass", 39,7);
		return Edit_Zip;
	
	}
	
    public static  WebElement Edit_RegionMappingTab (WebDriver driver) throws Exception{
		
		WebElement Edit_RegionMapping= 	driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
		 ExcelUtils.setCellData("Pass", 40,7);	
		return Edit_RegionMapping;
	
	}
   
    public static  WebElement Edit_RegionMappingCheckbox (WebDriver driver) throws Exception{
		
		WebElement Edit_RegionMappinCheckbox= 	driver.findElement(By.xpath(".//*[@id='RegionFuelingLocationsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
		 ExcelUtils.setCellData("Pass", 41,7);	
		return Edit_RegionMappinCheckbox;
	
	}
    
    
    
    
    public static  WebElement Update (WebDriver driver) throws Exception{
		
		WebElement Update= 	driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
		 ExcelUtils.setCellData("Pass", 42,7);
		return Update;
	
	}
   
    public static  WebElement Update_Message(WebDriver driver) throws Exception{
 		
 		WebElement Update_Message= 	driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
 		 ExcelUtils.setCellData("Pass", 43,7);
 		System.out.println(Update_Message.getText());
 		
 		ExcelUtils.setCellData(Update_Message.getText(),43,6);
 		return Update_Message;
 	
 	}
    
    
    
    
	

}
