package Terminal_SubClasses;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;



public class ExistingTerminal_Values {

	public static  void ExistingValues (WebDriver driver) throws Exception{
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Thread.sleep(5000);
		WebElement  Create_new =driver.findElement(By.xpath("//*[@id='btncreate']"));
		
		Create_new.click();
		
		// // entering the new number in the number field in the create terminal 
         
		Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//*[@id='BaseTerminal_NumDesc']")).sendKeys(ExcelUtils.getCellData(67,4 ));
	//   Terminal_ScreenShots.CaptureScreenshot(driver);
			Thread.sleep(3000);
			ExcelUtils.setCellData("Pass",67,7);
		
		// entering the new Username in the name field in the create terminal
		 
		 driver.findElement(By.xpath(".//*[@id='BaseTerminal_NameCode']")).sendKeys(ExcelUtils.getCellData(68, 4));
		Thread.sleep(3000);
		ExcelUtils.setCellData("Pass",68,7);
		Terminal_ScreenShots.CaptureScreenshot(driver);
		
		// entering the Average load time  in the Avarage load time field in the create terminal
		
	      
		  
		 driver.findElement(By.xpath(".//*[@id='BaseTerminal_AveLoadTime']")).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(69, 4)));
		 ExcelUtils.setCellData("Pass",69,7);
		
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Thread.sleep(3000);
		WebElement InternalTerminal= driver.findElement(By.xpath(".//*[@id='BaseTerminal_Internal']"));
		Thread.sleep(3000);
		InternalTerminal.click();
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Thread.sleep(3000);
		// entering the Address in the Address field in the create terminal
		driver.findElement(By.xpath(".//*[@id='TerminalAddress_Address']")).sendKeys(ExcelUtils.getCellData(70, 4));
		 Terminal_ScreenShots.CaptureScreenshot(driver);
		 Thread.sleep(3000);
		 ExcelUtils.setCellData("Pass",70,7);
		// entering the city name  in the city field in the create terminal
		 driver.findElement(By.xpath(".//*[@id='TerminalAddress_City']")).sendKeys(ExcelUtils.getCellData(71,4));
		 Terminal_ScreenShots.CaptureScreenshot(driver);
		 Thread.sleep(3000);
		 ExcelUtils.setCellData("Pass",71,7);
	 driver.findElement(By.xpath("//div[@id='tabTerminalDetails']/div/div/fieldset/fieldset[2]/div[3]/div/span/span/span[2]/span")).click();
	 Thread.sleep(4000);
	 Terminal_ScreenShots.CaptureScreenshot(driver);
     int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
     Terminal_ScreenShots.CaptureScreenshot(driver);
     Thread.sleep(6000);
  // enter the state name in the searchbox of the dropdown
     driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(ExcelUtils.getCellData(72, 4));
     Thread.sleep(6000);
     ExcelUtils.setCellData("Pass",72,7);
     Terminal_ScreenShots.CaptureScreenshot(driver);
     
     driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
     Thread.sleep(3000);
     Terminal_ScreenShots.CaptureScreenshot(driver);
  // entering the new Zip in the Zip field in the create terminal
     
   driver.findElement(By.xpath(".//*[@id='TerminalAddress_Zip']")).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(73,4)));
     Thread.sleep(3000);
     ExcelUtils.setCellData("Pass",73,7);
     Terminal_ScreenShots.CaptureScreenshot(driver);
  // // entering the new number in the Latitude field in the create terminal
      driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude']")).click();
  Terminal_ScreenShots.CaptureScreenshot(driver);
  Thread.sleep(3000);
  driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude']")).clear();
  Terminal_ScreenShots.CaptureScreenshot(driver);
  Thread.sleep(3000);
 driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude']")).sendKeys(String.valueOf(ExcelUtils.getCellDataDecimals(74,4)));
     Terminal_ScreenShots.CaptureScreenshot(driver);
     ExcelUtils.setCellData("Pass",74,7);
     Thread.sleep(3000);
     // entering the new number in the Longitude field in the create terminal
      driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude']")).click();
     Terminal_ScreenShots.CaptureScreenshot(driver);
     driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude']")).clear();
     Terminal_ScreenShots.CaptureScreenshot(driver);
     driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude']")).sendKeys(String.valueOf(ExcelUtils.getCellDataDecimals(75, 4)));
     Thread.sleep(3000);
     ExcelUtils.setCellData("Pass",75,7);
     Terminal_ScreenShots.CaptureScreenshot(driver);
  // clicking on the supplier mapping tab
     WebElement SupplierMappingTab  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
     SupplierMappingTab.click();
     ExcelUtils.setCellData("Pass",76,7);
     Terminal_ScreenShots.CaptureScreenshot(driver);
     Thread.sleep(3000);
     // clicking on the supplier mapping checkbox
     Terminal_ScreenShots.CaptureScreenshot(driver);
     WebElement  SupplierMappingCheckbox  = driver.findElement(By.xpath(".//*[@id='TerminalSuppliersGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
     SupplierMappingCheckbox.click();
     ExcelUtils.setCellData("Pass",77,7);
     Terminal_ScreenShots.CaptureScreenshot(driver);
     Thread.sleep(3000);
  // clicking on the driver mapping tab
     WebElement	DriverMappingTab  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[3]/a"));
     DriverMappingTab.click();
     ExcelUtils.setCellData("Pass",78,7);
     Terminal_ScreenShots.CaptureScreenshot(driver);
     Thread.sleep(3000);
     // clicking on the driver mapping checkbox
 	 WebElement	DriverMappingCheckbox  = driver.findElement(By.xpath(".//*[@id='TerminalDriversGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
 	DriverMappingCheckbox.click();
 	ExcelUtils.setCellData("Pass",79,7);
 	Terminal_ScreenShots.CaptureScreenshot(driver);
 	Thread.sleep(3000);
 // clicking on the truck mapping tab
 	 WebElement TruckMappingTab  = driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[4]/a"));
		
 	Terminal_ScreenShots.CaptureScreenshot(driver);
 	TruckMappingTab.click();
 	ExcelUtils.setCellData("Pass",80,7);
 	Thread.sleep(3000);
 	Terminal_ScreenShots.CaptureScreenshot(driver);
 // clicking on the truck mapping checkbox 
 	WebElement TruckMappingCheckbox  = driver.findElement(By.xpath("//*[@id='TruckTerminalsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));	
 	Thread.sleep(3000);
 	 TruckMappingCheckbox.click();
 	ExcelUtils.setCellData("Pass",81,7);
 	Thread.sleep(3000);
 	Terminal_ScreenShots.CaptureScreenshot(driver);
 // save button
 	 WebElement Save =	driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
	Save.click();
	ExcelUtils.setCellData("Pass",82,7);
	Terminal_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	// if existingvalues error message is displayed then it click on the update button	
	String ActualMessage = "A Terminal with the entered Number already exists. Please edit this one or create a new with unique value.";
	String Existingvaluemessage = driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p")).getText();
	Terminal_ScreenShots.CaptureScreenshot(driver);
	if (Existingvaluemessage.equals(ActualMessage))

	{
		System.out.print(Existingvaluemessage);
		ExcelUtils.setCellData(Existingvaluemessage,83,6);
		ExcelUtils.setCellData("Pass",83,7);		
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
		ExcelUtils.setCellData("Pass",84,7);
		Terminal_ScreenShots.CaptureScreenshot(driver);
	}
	else {

		ExcelUtils.setCellData(Existingvaluemessage,83,6);
		ExcelUtils.setCellData("Fail",83,7);	
		driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
		ExcelUtils.setCellData("Pass",84,7);
	}
	
	Thread.sleep(3000);
    WebElement	UpdateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
	System.out.println(UpdateMessage.getText());

	ExcelUtils.setCellData(UpdateMessage.getText(),85,6);
	ExcelUtils.setCellData("Pass",85,7);	

	
	
		
	}
	
	
	
	
}
