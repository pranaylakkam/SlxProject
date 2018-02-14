package Trailer_SubClasses;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Utility.ExcelUtils;

public class Trailer_UnDelete {
	

	
	 public static void UnDelete(WebDriver driver) throws Exception{
	    	

	    	String Number	=ExcelUtils.getCellData(84, 4);
	    	String Description =ExcelUtils.getCellData(85, 4);
	    	String WareHouseidDropdownInput = ExcelUtils.getCellData(86, 4);
	    	int LoadedGrossWeight = ExcelUtils.getCellDataNum(87, 4);
	    	int CompartmentNumber = ExcelUtils.getCellDataNum(90, 4);
	 
	    	String Search= ExcelUtils.getCellData(84, 4);
	      
	       	
	    	
	    	WebElement	createnew = driver.findElement(By.xpath(".//*[@id='btncreate']"));
	    	createnew.click();
	    	ExcelUtils.setCellData("pass",84, 7);
	    	Trailer_ScreenShots.CaptureScreenshot(driver);
	    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	 
	    
	    	    
	    		Trailer_Validation.Number(driver).sendKeys((Number));
	    	Trailer_ScreenShots.CaptureScreenshot(driver);
	    	 Thread.sleep(3000);
	    	 ExcelUtils.setCellData("pass",84, 7);
	    		
	    
	    	Trailer_ScreenShots.CaptureScreenshot(driver);
	    	driver.findElement(By.xpath(".//*[@id='BaseTrailer_Description']")).sendKeys(Description);
	    	ExcelUtils.setCellData("pass",86, 7);
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
	       
	    	 Thread.sleep(6000);
	         driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
	    	 Thread.sleep(3000);
	    	 ExcelUtils.setCellData("pass",87, 7);
	    		Trailer_Validation.LoadedGrossWeight(driver).sendKeys(String.valueOf(LoadedGrossWeight));
	    		ExcelUtils.setCellData("pass",87, 7);
	    		Trailer_ScreenShots.CaptureScreenshot(driver);
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath(".//*[@id='tab13']/div[2]/div/div/nav/ul/li[2]/a")).click();
	    	 Thread.sleep(3000);
	    	 ExcelUtils.setCellData("pass",88, 7);
	    	 
	    	 driver.findElement(By.xpath(".//*[@id='TrailerCompartmentsGrid']/div[1]/a")).click();
	    	 Thread.sleep(3000);
	    	 ExcelUtils.setCellData("pass",89, 7);
	    	 driver.findElement(By.xpath(".//*[@id='CompartmentNumber']")).sendKeys(String.valueOf(CompartmentNumber));
	    	 
	    	 Thread.sleep(3000);
	     ExcelUtils.setCellData("pass",90, 7);
	     driver.findElement(By.xpath(".//*[@id='tab13']/div[2]/div/div/nav/ul/li[3]/a")).click();
	     Thread.sleep(3000);
	     Trailer_ScreenShots.CaptureScreenshot(driver);
	     ExcelUtils.setCellData("pass",93, 7);
	     driver.findElement(By.xpath(".//*[@id='RegionTrailersGrid']/div[2]/table/tbody/tr[1]/td[1]/input")).click();
	     Thread.sleep(3000);
	     Trailer_ScreenShots.CaptureScreenshot(driver);	
	     ExcelUtils.setCellData("pass",91, 7);
		 WebElement Save = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
		 Save.submit();
		 ExcelUtils.setCellData("pass",94, 7);
	 Trailer_ScreenShots.CaptureScreenshot(driver);
	 Thread.sleep(3000);
	String UnDeleteMessage = driver.findElement(By.xpath("//*[@id='tab13']/div[1]/div/div/p")).getText();
	String UnDeleteActualMessage = ExcelUtils.getCellData(96, 5);
	 Trailer_ScreenShots.CaptureScreenshot(driver);
	 Thread.sleep(3000);
	 
	 if(UnDeleteMessage.equals(UnDeleteActualMessage)){
		 
		 ExcelUtils.setCellData(UnDeleteMessage,96, 6);
		 ExcelUtils.setCellData("pass",97, 7);
		 
		 System.out.println(UnDeleteMessage);
		//WebElement Checkbox = driver.findElement(By.xpath("//*[@id='BaseTrailer_IsRecordActive']"));
		Trailer_ScreenShots.CaptureScreenshot(driver);
		
		ExcelUtils.setCellData("pass",97, 7);
		Trailer_ScreenShots.CaptureScreenshot(driver);
	 }
	 
	 Thread.sleep(3000);
	 WebElement UpDate = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
	 UpDate.click();
	 ExcelUtils.setCellData("pass",98, 7);
	 WebElement UpDateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
	 Thread.sleep(3000);
	 if(UpDateMessage.isDisplayed())
	 {ExcelUtils.setCellData(UpDateMessage.getText(),99, 6);
	 ExcelUtils.setCellData("pass",99, 7);
		 System.out.println(UpDateMessage.getText());
	 }
	 Thread.sleep(3000);
	 
		driver.findElement(By.xpath(".//*[@id='txtSearchTrailerGrid']")).click();
		
		
	   	driver.findElement(By.xpath(".//*[@id='txtSearchTrailerGrid']")).sendKeys(Search);
	   	Thread.sleep(2000);
	   	driver.findElement(By.xpath(".//*[@id='txtSearchTrailerGrid']")).sendKeys(Keys.ENTER);
	   	
	   	
		Thread.sleep(3000);
		
		
		WebElement Verify = driver.findElement(By.xpath(".//*[@id='TrailerGrid']/div[2]"));
		Verify.getText();
		
		System.out.println(Verify.getText());
		
		
		
		
		if(Verify.getText().isEmpty()){
			
			System.out.println("Fail ");
			WebElement	createnew1 = driver.findElement(By.xpath(".//*[@id='btncreate']"));
	    	createnew1.click();
	    	ExcelUtils.setCellData("pass",84, 7);
	    	Trailer_ScreenShots.CaptureScreenshot(driver);
	    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	 
	    
	    	    
	    		Trailer_Validation.Number(driver).sendKeys((Number));
	    	Trailer_ScreenShots.CaptureScreenshot(driver);
	    	 Thread.sleep(3000);
	    	 ExcelUtils.setCellData("pass",84, 7);
	    		
	    
	    	Trailer_ScreenShots.CaptureScreenshot(driver);
	    	driver.findElement(By.xpath(".//*[@id='BaseTrailer_Description']")).sendKeys(Description);
	    	ExcelUtils.setCellData("pass",86, 7);
	    	Thread.sleep(3000);
	    	Trailer_ScreenShots.CaptureScreenshot(driver);
	    
	    	Trailer_ScreenShots.CaptureScreenshot(driver);
	    	 WebElement WareHouseidDropdown1 = driver.findElement(By.xpath("//div[@id='tabDetails']/div/div/fieldset/fieldset/div[3]/div/span/span/span[2]/span"));
	    	 Trailer_ScreenShots.CaptureScreenshot(driver);
	    	 WareHouseidDropdown1.click();
	    	 Thread.sleep(3000);
	    	 int ok_size1=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
	    	 Thread.sleep(8000);
	    		
	    		
	         driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size1-1).sendKeys((WareHouseidDropdownInput));
	       
	    	 Thread.sleep(8000);
	         driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size1-1).sendKeys(Keys.ENTER);
	    	 Thread.sleep(3000);
	    	 ExcelUtils.setCellData("pass",87, 7);
	    		Trailer_Validation.LoadedGrossWeight(driver).sendKeys(String.valueOf(LoadedGrossWeight));
	    		ExcelUtils.setCellData("pass",87, 7);
	    		Trailer_ScreenShots.CaptureScreenshot(driver);
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath(".//*[@id='tab13']/div[2]/div/div/nav/ul/li[2]/a")).click();
	    	 Thread.sleep(3000);
	    	 ExcelUtils.setCellData("pass",88, 7);
	    	 
	    	 driver.findElement(By.xpath(".//*[@id='TrailerCompartmentsGrid']/div[1]/a")).click();
	    	 Thread.sleep(3000);
	    	 ExcelUtils.setCellData("pass",89, 7);
	    	 driver.findElement(By.xpath(".//*[@id='CompartmentNumber']")).sendKeys(String.valueOf(CompartmentNumber));
	    	 
	    	 Thread.sleep(3000);
	     ExcelUtils.setCellData("pass",90, 7);
	     driver.findElement(By.xpath(".//*[@id='tab13']/div[2]/div/div/nav/ul/li[3]/a")).click();
	     Thread.sleep(3000);
	     Trailer_ScreenShots.CaptureScreenshot(driver);
	     ExcelUtils.setCellData("pass",93, 7);
	     driver.findElement(By.xpath(".//*[@id='RegionTrailersGrid']/div[2]/table/tbody/tr[1]/td[1]/input")).click();
	     Thread.sleep(3000);
	     Trailer_ScreenShots.CaptureScreenshot(driver);	
	     ExcelUtils.setCellData("pass",91, 7);
		 WebElement Save1 = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
		 Save1.submit();
		 ExcelUtils.setCellData("pass",94, 7);
	 Trailer_ScreenShots.CaptureScreenshot(driver);
	 Thread.sleep(3000);
	 WebElement UnDeleteMessage1 = driver.findElement(By.xpath("//*[@id='tab13']/div[1]/div/div/p")); 
	 Trailer_ScreenShots.CaptureScreenshot(driver);
	 Thread.sleep(3000);
	 
	 if(UnDeleteMessage1.isDisplayed()){
		 
		 ExcelUtils.setCellData(UnDeleteMessage1.getText(),97, 6);
		 ExcelUtils.setCellData("pass",97, 7);
		 
		 System.out.println(UnDeleteMessage1.getText());
		WebElement Checkbox1 = driver.findElement(By.xpath("//*[@id='BaseTrailer_IsRecordActive']"));
		Trailer_ScreenShots.CaptureScreenshot(driver);
		Checkbox1.click();
		ExcelUtils.setCellData("pass",97, 7);
		Trailer_ScreenShots.CaptureScreenshot(driver);
	 }
	 
	 Thread.sleep(3000);
	 WebElement UpDate1 = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
	 UpDate1.click();
	 ExcelUtils.setCellData("pass",98, 7);
	 WebElement UpDateMessage1 = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p")); 
	 Thread.sleep(3000);
	 if(UpDateMessage1.isDisplayed())
	 {ExcelUtils.setCellData(UpDateMessage1.getText(),99, 6);
	 ExcelUtils.setCellData("pass",99, 7);
		 System.out.println(UpDateMessage1.getText());
	 }
	 Thread.sleep(3000);
	 
		driver.findElement(By.xpath(".//*[@id='txtSearchTrailerGrid']")).click();
		
		
	   	driver.findElement(By.xpath(".//*[@id='txtSearchTrailerGrid']")).sendKeys(Search);
	   	
		Thread.sleep(3000);
		
		
		WebElement Verify1 = driver.findElement(By.xpath(".//*[@id='TrailerGrid']/div[2]"));
		Verify1.getText();
		
		System.out.println(Verify1.getText());
		
		
		
		
		if(Verify1.getText().isEmpty()){
			
			System.out.println("Fail ");
			
			
			
			
		}
		else
		{	System.out.println("Result found ");
		 ExcelUtils.setCellData("pass",99, 7);	
		}
		
		
	 
}
}
}