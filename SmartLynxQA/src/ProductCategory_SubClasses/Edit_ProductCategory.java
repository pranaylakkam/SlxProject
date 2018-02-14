package ProductCategory_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class Edit_ProductCategory {
	
	 private static WebElement Edit = null;
	    private static WebElement Edit_Descritpion = null;
	    private static WebElement Edit_MaxUserAutoClose =null;
	    private static WebElement Edit_MaxPMServerAutoClose =null;
	    private static WebElement Update=null;
	    private static WebElement Delete = null;

	 
	   
	   public static WebElement Edit_Descritpion( WebDriver driver) throws Exception{
		   Edit_Descritpion  = driver.findElement(By.xpath(".//*[@id='BaseProductCategory_Description']"));
		   ExcelUtils.setCellData("Pass", 18, 6); 	
		   return Edit_Descritpion;
		   
	   }
	   
	   public static WebElement Edit_MaxUserAutoClose( WebDriver driver) throws Exception{
		   Edit_MaxUserAutoClose  = driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxManualAdjustment']"));
		   ExcelUtils.setCellData("Pass", 19, 6); 	
		   return  Edit_MaxUserAutoClose;
		   
	   }
	   public static WebElement Edit_MaxPMServerAutoClose( WebDriver driver) throws Exception{
		   Edit_MaxPMServerAutoClose  = driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxProductMovementAutoCloseAdjustment']"));
		   ExcelUtils.setCellData("Pass", 20, 6); 	
		   return  Edit_MaxPMServerAutoClose;
		   
	   }
	   
	   public static WebElement Update( WebDriver driver) throws Exception{
		   Update  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
		   ExcelUtils.setCellData("Pass", 22, 6); 	
		   return  Update;
		   
	   }

	public static WebElement Edit(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
		 Edit  = driver.findElement(By.xpath(".//*[@id='ProductCategoryGrid']/div[2]/table/tbody/tr[1]/td[4]/a/i"));
		 ExcelUtils.setCellData("Pass", 17, 6); 	  
		 return Edit;
	
		
		
	}
	
	
	
	
	public static WebElement UpDateMessage(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
WebElement		UpDateMessage  = driver.findElement(By.xpath(".//*[@id='ProductCategoryGrid']/div[2]/table/tbody/tr[1]/td[4]/a/i"));
		  
System.out.println(UpDateMessage.getText());

	
ExcelUtils.setCellData(UpDateMessage.getText(), 23, 5); 	
ExcelUtils.setCellData("Pass", 23, 6); 	
return UpDateMessage;		
	}
	
}
