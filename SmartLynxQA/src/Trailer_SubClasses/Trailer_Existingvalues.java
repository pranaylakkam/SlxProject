package Trailer_SubClasses;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

     public class Trailer_Existingvalues {
	
	
    public static void ExistingValues (WebDriver driver) throws Exception{
    	
    	
    	
    	String Number	=ExcelUtils.getCellData(67, 4);
    	String Description =ExcelUtils.getCellData(68, 4);
    	String WareHouseidDropdownInput = ExcelUtils.getCellData(69, 4);
    	int LoadedGrossWeight = ExcelUtils.getCellDataNum(70, 4);
    	int CompartmentNumber = ExcelUtils.getCellDataNum(73, 4);
    	
    	WebElement	createnew = driver.findElement(By.xpath(".//*[@id='btncreate']"));
    	createnew.click();
    	ExcelUtils.setCellData("pass",66, 7);
    	Trailer_ScreenShots.CaptureScreenshot(driver);
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 
    
    	    
    		Trailer_Validation.Number(driver).sendKeys((Number));
    	Trailer_ScreenShots.CaptureScreenshot(driver);
    	 Thread.sleep(3000);
    	 ExcelUtils.setCellData("pass",67, 7);
    		
    
    	Trailer_ScreenShots.CaptureScreenshot(driver);
    	driver.findElement(By.xpath(".//*[@id='BaseTrailer_Description']")).sendKeys(Description);
    	ExcelUtils.setCellData("pass",68, 7);
    	Thread.sleep(3000);
    	Trailer_ScreenShots.CaptureScreenshot(driver);
    
    	Trailer_ScreenShots.CaptureScreenshot(driver);
    	 WebElement WareHouseidDropdown = driver.findElement(By.xpath("//div[@id='tabDetails']/div/div/fieldset/fieldset/div[3]/div/span/span/span[2]/span"));
    	 Trailer_ScreenShots.CaptureScreenshot(driver);
    	 WareHouseidDropdown.click();
    	 Thread.sleep(3000);
    	 int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
    	 Thread.sleep(3000);
    		
    		
         driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys((WareHouseidDropdownInput));
       
    	 Thread.sleep(8000);
         driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
    	 Thread.sleep(3000);
    	 ExcelUtils.setCellData("pass",69, 7);
    		Trailer_Validation.LoadedGrossWeight(driver).sendKeys(String.valueOf(LoadedGrossWeight));
    		ExcelUtils.setCellData("pass",70, 7);
    		Trailer_ScreenShots.CaptureScreenshot(driver);
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath(".//*[@id='tab13']/div[2]/div/div/nav/ul/li[2]/a")).click();
    	 Thread.sleep(3000);
    	 ExcelUtils.setCellData("pass",71, 7);
    	 
    	 driver.findElement(By.xpath(".//*[@id='TrailerCompartmentsGrid']/div[1]/a")).click();
    	 Thread.sleep(3000);
    	 ExcelUtils.setCellData("pass",72, 7);
    	 driver.findElement(By.xpath(".//*[@id='CompartmentNumber']")).sendKeys(String.valueOf(CompartmentNumber));
    	 
    	 Thread.sleep(3000);
     ExcelUtils.setCellData("pass",73, 7);
     driver.findElement(By.xpath(".//*[@id='tab13']/div[2]/div/div/nav/ul/li[3]/a")).click();
     Thread.sleep(3000);
     Trailer_ScreenShots.CaptureScreenshot(driver);
     driver.findElement(By.xpath(".//*[@id='RegionTrailersGrid']/div[2]/table/tbody/tr[1]/td[1]/input")).click();
     Thread.sleep(3000);
     Trailer_ScreenShots.CaptureScreenshot(driver);	
     ExcelUtils.setCellData("pass",75, 7);
	 WebElement Save = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
	 Save.submit();
	         ExcelUtils.setCellData("pass",78, 7);
	 Trailer_ScreenShots.CaptureScreenshot(driver);
	 Thread.sleep(3000);
	 Trailer_ScreenShots.CaptureScreenshot(driver);
	 
	 String ActualErrorMessage = ExcelUtils.getCellData(79,5);
	 String Existingvaluesmessage = driver.findElement(By.xpath("//*[@id='tab13']/div[1]/div/div/p")).getText();
	 Thread.sleep(3000);
	 Trailer_ScreenShots.CaptureScreenshot(driver);
	if (ActualErrorMessage.equals(Existingvaluesmessage))
	{	
	
		ExcelUtils.setCellData(Existingvaluesmessage,79, 6);
		ExcelUtils.setCellData("pass",79, 7);
	  Trailer_ScreenShots.CaptureScreenshot(driver);
		driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
		ExcelUtils.setCellData("pass",80, 7);
	}
	Thread.sleep(3000);
	String UpdateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p")).getText();
	String ActualUpdateMessage = ExcelUtils.getCellData(81,5);
	
	if(UpdateMessage.equals(ActualUpdateMessage))
	Trailer_ScreenShots.CaptureScreenshot(driver);
	System.out.println(UpdateMessage );
	ExcelUtils.setCellData("pass",81, 7);
	ExcelUtils.setCellData(UpdateMessage ,81, 6);
	
}

}