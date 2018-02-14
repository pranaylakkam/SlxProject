package FuelLocation_SubClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class FuelLocation_ExistingValues {
	
	public static  void Create_new (WebDriver driver) throws Exception{
	
		// User Name in Login Page
		WebElement  Create_new =driver.findElement(By.xpath(".//*[@id='btncreate']"));

		Create_new.click();
		FuelLocation_ScreenShots.CaptureScreenshot(driver);
		 ExcelUtils.setCellData("pass",52, 7);
		driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Code']")).sendKeys(ExcelUtils.getCellData(53, 4));
		 FuelLocation_ScreenShots.CaptureScreenshot(driver);
		 ExcelUtils.setCellData("pass",53, 7);
		 
		 driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Text']")).sendKeys(ExcelUtils.getCellData(54, 4));
			FuelLocation_ScreenShots.CaptureScreenshot(driver);
			 ExcelUtils.setCellData("pass",54, 7);
				driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Address1']")).sendKeys(ExcelUtils.getCellData(55, 4));
			FuelLocation_ScreenShots.CaptureScreenshot(driver);
			 ExcelUtils.setCellData("pass",55, 7);
			 
				driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_City']")).sendKeys(ExcelUtils.getCellData(56, 4));
			FuelLocation_ScreenShots.CaptureScreenshot(driver);
			 ExcelUtils.setCellData("pass",56, 7);
			 driver.findElement(By.xpath(".//*[@id='tabDetails']/div/div/fieldset[2]/div[2]/div/span[1]/span/span[2]")).click();
			FuelLocation_ScreenShots.CaptureScreenshot(driver);
			
			 driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_State-list']/span/input"));
			 FuelLocation_ScreenShots.CaptureScreenshot(driver);
				Thread.sleep(6000);
				FuelLocation_ScreenShots.CaptureScreenshot(driver);
				int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
				Thread.sleep(000);
				FuelLocation_ScreenShots.CaptureScreenshot(driver);
			
		        driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(ExcelUtils.getCellData(57, 4));
		        Thread.sleep(6000);FuelLocation_ScreenShots.CaptureScreenshot(driver);
		        ExcelUtils.setCellData("pass",57, 7);
		        driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
		        FuelLocation_ScreenShots.CaptureScreenshot(driver);
		        
		       	driver.findElement(By.xpath(".//*[@id='BaseFuelingLocation_Zip']")).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(58, 4)));
		        FuelLocation_ScreenShots.CaptureScreenshot(driver);
		        ExcelUtils.setCellData("pass",58, 7);
		        WebElement RegionMappingTab =	driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
		        RegionMappingTab.click();
		        FuelLocation_ScreenShots.CaptureScreenshot(driver);
		        ExcelUtils.setCellData("pass",59, 7);
		        Thread.sleep(6000);
		        WebElement RegionMappingCheckbox =	driver.findElement(By.xpath(".//*[@id='RegionFuelingLocationsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
		        RegionMappingCheckbox.click();
		        Thread.sleep(6000);
		        ExcelUtils.setCellData("pass",61, 7);
		        WebElement Save =	driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
		        Save.click();
		        FuelLocation_ScreenShots.CaptureScreenshot(driver);
		        Thread.sleep(3000); 
		        ExcelUtils.setCellData("pass",62, 7);
		      
		        String ActualMessage = ExcelUtils.getCellData(63, 5);
		        
		        String ExistingValues = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p")).getText();
		   if(ExistingValues.equals(ActualMessage))
		   {  
			   System.out.println(ExistingValues);
			   FuelLocation_ScreenShots.CaptureScreenshot(driver);
			   ExcelUtils.setCellData(ExistingValues,63, 6);
			   driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
			   ExcelUtils.setCellData("pass",63, 7);
			   ExcelUtils.setCellData("Pass",64, 7);
		   }
		   else
		   {
			   driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
			   ExcelUtils.setCellData(ExistingValues,63, 6);
			   ExcelUtils.setCellData("Fail",64, 7);
			   ExcelUtils.setCellData("Fail",63, 7);
		   }
		   FuelLocation_ScreenShots.CaptureScreenshot(driver);
		   Thread.sleep(5000);
		   
		 WebElement  UpdateMessage =driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		   if(UpdateMessage.isDisplayed())
		   {
			   FuelLocation_ScreenShots.CaptureScreenshot(driver);
			  System.out.println(UpdateMessage.getText());
			  ExcelUtils.setCellData(UpdateMessage.getText(),65, 6);
			  ExcelUtils.setCellData("Pass",65, 7);
			  
		   }
		
		   FuelLocation_ScreenShots.CaptureScreenshot(driver);
	}

}
