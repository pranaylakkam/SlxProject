package ProductCategory_SubClasses;

import javax.swing.plaf.basic.BasicTreeUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.ExcelUtils;

public class ProductCategory_Validation {
	
    private static MouseHandler mouse= null;
    private static WebElement Search = null;
    private static WebElement createnew = null;

    private static WebElement Description = null;
    private static WebElement ErrorDescription = null;
    private static WebElement MaxUserAutoClose = null;
    private static WebElement MaxPMServerAutoClose = null;
    private static WebElement Save = null;
   private static WebElement Bulkcheckbox = null;
    public static MouseHandler mouse (WebDriver driver) throws Exception{
   	 driver.findElement(By.cssSelector("#main > div.page-header.navbar.navbar-fixed-top.slHeadFoot > div > div.page-logo > a > img")).click();

   	
   	  
   	 WebElement element = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[2]/div/div/ul/li[1]/a"));

   	 Actions action = new Actions(driver);

   	 action.moveToElement(element).moveToElement(driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[2]/div/div/ul/li[1]/ul/li[17]/a"))).click().build().perform();
   	 driver.manage().window().maximize();
   	
   	 ExcelUtils.setCellData("Pass", 6, 7);
   	 
   	 return mouse;
   	  
    }
    public static WebElement Search(WebDriver driver) throws Exception{

      	 Search = driver.findElement(By.xpath(".//*[@id='txtSearchProductCategoryGrid']"));
      	ExcelUtils.setCellData("Pass", 7, 7);
      	 return Search;
      	 
    }
    
    public static WebElement createnew( WebDriver driver) throws Exception{
    	
    	createnew = driver.findElement(By.xpath(".//*[@id='btncreate']"));
    	ExcelUtils.setCellData("Pass", 8, 7);
    	return createnew;
    	
    }
    
    public static void FieldErrorMessage( WebDriver driver) throws Exception{
    	
    String ExpectedFieldErrorMessage = ExcelUtils.getCellData( 9, 5); 
    	String	ActualFieldErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProductCategory_Description-error']")).getText();
    
    	if(ExpectedFieldErrorMessage.equals(ActualFieldErrorMessage))
    	{
    		System.out.print(ActualFieldErrorMessage);
    		ExcelUtils.setCellData(ActualFieldErrorMessage, 9, 6); 
    		ExcelUtils.setCellData("Pass", 9, 7); 
    		
    	}
    
    }
    
    
    
    
   public static void Description( WebDriver driver) throws Exception{
    	
	String   Description1 = ExcelUtils.getCellData(10, 4);
	   Description = driver.findElement(By.xpath(".//*[@id='BaseProductCategory_Description']"));
	   
	   Description.sendKeys(Description1);
	   Thread.sleep(3000);
	   Description.sendKeys(Keys.TAB);
	   String ExpectedDescriptionErrorMessage = ExcelUtils.getCellData(10, 5);
   	String	ActualDescriptionErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProductCategory_Description-error']")).getText();
   
   	if(ExpectedDescriptionErrorMessage.equals(ActualDescriptionErrorMessage))
   	{
   		System.out.print(ActualDescriptionErrorMessage);
   		ExcelUtils.setCellData("Pass", 10,7);
   		
   	}
   	else
   	{
   		System.out.print(ActualDescriptionErrorMessage);
   		ExcelUtils.setCellData(ActualDescriptionErrorMessage, 10, 6);
   		ExcelUtils.setCellData("Fail", 10, 7); 	
   	}
   	Thread.sleep(3000);
    Description.clear();
    String   Description2 = ExcelUtils.getCellData(11, 4);
    Description.sendKeys(Description2);
   	
    ExcelUtils.setCellData("Pass", 11, 7);   
    }
  
   
   
   
   
   public static WebElement MaxUserAutoClose( WebDriver driver) throws Exception{
	   MaxUserAutoClose  = driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxManualAdjustment']"));
	 
	   ExcelUtils.setCellData("Pass", 12, 7); 
	   return MaxUserAutoClose;
	   
   }
   public static WebElement MaxPMServerAutoClose( WebDriver driver) throws Exception{
	   MaxPMServerAutoClose  = driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxProductMovementAutoCloseAdjustment']"));
	   ExcelUtils.setCellData("Pass", 13, 7); 
	   return MaxPMServerAutoClose;
	   
   }
  
   public static WebElement Bulkcheckbox( WebDriver driver) throws Exception{
	   Bulkcheckbox  = driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxProductMovementAutoCloseAdjustment']"));
	   ExcelUtils.setCellData("Pass", 11, 7); 
return Bulkcheckbox;
	   
   }
  
     
   
   public static WebElement Save( WebDriver driver) throws Exception{
	   Save  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
	   ExcelUtils.setCellData("Pass", 14, 7); 
	   return Save;
	   
	  }

   public static WebElement SaveMessage( WebDriver driver) throws Exception{
	 
	   WebElement SaveMessage  = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
	   
	   System.out.print(SaveMessage.getText());
	   
	   ExcelUtils.setCellData(SaveMessage.getText(), 15, 6); 
	   ExcelUtils.setCellData("Pass", 15, 7);
	   return SaveMessage;
	   
	  }
   
   
   
   
   
   

}
