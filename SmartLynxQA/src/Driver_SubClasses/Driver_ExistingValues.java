package Driver_SubClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;


public class Driver_ExistingValues {
	
	public static  void ExistingValues (WebDriver driver) throws Exception{
		Driver_ScreenShots.CaptureScreenshot(driver);
	
		
		WebElement  Create_new =driver.findElement(By.xpath(".//*[@id='btncreate']"));
		Create_new.click();
		 ExcelUtils.setCellData("Pass",48, 7);
		 
		 Thread.sleep(5000);
		 String Driver_id = ExcelUtils.getCellData(49, 4);
		 ExcelUtils.setCellData("Pass",49, 7);
		 driver.findElement(By.xpath(".//*[@id='BaseDriver_UserCode']")).sendKeys((Driver_id));
		Driver_ScreenShots.CaptureScreenshot(driver);
		 Thread.sleep(5000);
		String Driver_Name =  ExcelUtils.getCellData(50, 4);
		 ExcelUtils.setCellData("Pass",50, 7);
		 driver.findElement(By.xpath(".//*[@id='BaseDriver_Name']")).sendKeys(Driver_Name);
		 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 int Driver_Password = ExcelUtils.getCellDataNum(51, 4);
		 ExcelUtils.setCellData("Pass",51, 7);
		 driver.findElement(By.xpath(".//*[@id='BaseDriver_Password']")).sendKeys(String.valueOf(Driver_Password));
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 Thread.sleep(5000);
		 int Driver_HomePhone = ExcelUtils.getCellDataNum(52, 4);
		 ExcelUtils.setCellData("Pass",52, 7);
		 driver.findElement(By.xpath(".//*[@id='BaseDriver_HomePhone']")).sendKeys(String.valueOf(Driver_HomePhone));
		 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 
		 int Driver_CellPhone = ExcelUtils.getCellDataNum(53, 4);
		 ExcelUtils.setCellData("Pass",53, 7);
		  driver.findElement(By.xpath(".//*[@id='BaseDriver_CellPhone']")).sendKeys(String.valueOf(Driver_CellPhone));
		 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 int CostPerHour = ExcelUtils.getCellDataNum(54, 4);
		
		  driver.findElement(By.xpath(".//*[@id='BaseDriver_CostPerHour']")).sendKeys(String.valueOf(CostPerHour));
		  ExcelUtils.setCellData("Pass",54, 7);
		 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 String Email = ExcelUtils.getCellData(55, 4);
	
		 
		 driver.findElement(By.xpath(".//*[@id='BaseDriver_Email']")).sendKeys(Email);
		 ExcelUtils.setCellData("Pass",55, 7);
		 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 WebElement TerminalMapping_Tab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
		TerminalMapping_Tab.click();
		 Thread.sleep(5000);
		 ExcelUtils.setCellData("Pass",56, 7);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 WebElement TerminalMapping_Expand = driver.findElement(By.xpath(".//*[@id='btnExpandCollpseTerminals']"));
		 TerminalMapping_Expand.click();
		 ExcelUtils.setCellData("Pass",57, 7);
		 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 WebElement TerminalMapping_Access = driver.findElement(By.xpath(".//span[@class = 'k-checkbox']/input[@value='2327']"));
		 TerminalMapping_Access.click();
		 Thread.sleep(5000);
		 ExcelUtils.setCellData("Pass",58, 7);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 WebElement TerminalMapping_Collapse = driver.findElement(By.xpath(".//*[@id='btnExpandCollpseTerminals']"));
		 TerminalMapping_Collapse.click();
		 ExcelUtils.setCellData("Pass",59, 7);
		 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 WebElement RegionMapping_Tab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[3]/a"));
		 RegionMapping_Tab.click();
		 ExcelUtils.setCellData("Pass",60, 7);
		 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 WebElement RegionMapping_Checkbox = driver.findElement(By.xpath(".//*[@id='RegionDriversGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
		 RegionMapping_Checkbox.click();
		 ExcelUtils.setCellData("Pass",61, 7);
		 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 WebElement Save_Button = driver.findElement(By.xpath(".//*[@id='btnUpdate']"));
		 Save_Button.click();
		 ExcelUtils.setCellData("Pass",62, 7);
		 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		String ExistingValues = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p")).getText();
		String ActualMessage = ExcelUtils.getCellData(64,5 );
		 Thread.sleep(5000);
		 ExcelUtils.setCellData("Pass",63, 7);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 if(ExistingValues.equals(ActualMessage))
		 {		 ExcelUtils.setCellData("Pass",64, 7);
		 ExcelUtils.setCellData(ExistingValues,64, 6);
			 System.out.println(ExistingValues);
			 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
			 driver.findElement(By.xpath(".//*[@id='btnUpdate']")).click();
			 ExcelUtils.setCellData("Pass",65, 7);
		 }
		 else
		 {
			 driver.findElement(By.xpath(".//*[@id='btnUpdate']")).click();
			 ExcelUtils.setCellData("Fail",65, 7);
			 
		 }
		 
		 
		 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 WebElement UpdateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 if(UpdateMessage.isDisplayed())
		 {
			 Thread.sleep(5000);
			 ExcelUtils.setCellData("Pass",66, 7);
			 ExcelUtils.setCellData(UpdateMessage.getText(),66, 6);
			 System.out.print(UpdateMessage.getText());
		 }
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
			
		
	}

}
