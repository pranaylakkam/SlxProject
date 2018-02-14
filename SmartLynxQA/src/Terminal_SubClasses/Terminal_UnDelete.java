package Terminal_SubClasses;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Utility.ExcelUtils;

public class Terminal_UnDelete {
	
public static  void UnDelete (WebDriver driver) throws Exception{
		
		WebElement  Create_new =driver.findElement(By.xpath(".//*[@id='btncreate']"));
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Create_new.click();
		Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//*[@id='BaseTerminal_NumDesc']")).sendKeys(ExcelUtils.getCellData(87,4 ));
	//   Terminal_ScreenShots.CaptureScreenshot(driver);
			Thread.sleep(3000);
			ExcelUtils.setCellData("Pass",87, 7	);
		// entering the new Username in the name field in the create terminal
		 driver.findElement(By.xpath(".//*[@id='BaseTerminal_NameCode']")).sendKeys(ExcelUtils.getCellData(88,4 ));
		Thread.sleep(3000);
		Terminal_ScreenShots.CaptureScreenshot(driver);
		ExcelUtils.setCellData("Pass",88, 7	);
		// entering the Average load time  in the Avrage load time field in the create terminal
	
	      
		  
		driver.findElement(By.xpath(".//*[@id='BaseTerminal_AveLoadTime']")).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(89,4 )));
		ExcelUtils.setCellData("Pass",89, 7	);
		
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Thread.sleep(3000);
		WebElement InternalTerminal= driver.findElement(By.xpath(".//*[@id='BaseTerminal_Internal']"));
		Thread.sleep(3000);
		InternalTerminal.click();
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Thread.sleep(3000);
		// entering the Address in the Address field in the create terminal
		 
      driver.findElement(By.xpath(".//*[@id='TerminalAddress_Address']")).sendKeys(ExcelUtils.getCellData(90,4 ));
		 Terminal_ScreenShots.CaptureScreenshot(driver);
		 ExcelUtils.setCellData("Pass",90, 7	);
		 Thread.sleep(3000);
		// entering the city name  in the city field in the create terminal
		 
		 driver.findElement(By.xpath(".//*[@id='TerminalAddress_City']")).sendKeys(ExcelUtils.getCellData(91,4 ));
		 Terminal_ScreenShots.CaptureScreenshot(driver);
		 Thread.sleep(3000);
		 ExcelUtils.setCellData("Pass",91, 7	);
	 driver.findElement(By.xpath("//div[@id='tabTerminalDetails']/div/div/fieldset/fieldset[2]/div[3]/div/span/span/span[2]/span")).click();
	 Thread.sleep(4000);
	 Terminal_ScreenShots.CaptureScreenshot(driver);
   int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
   Terminal_ScreenShots.CaptureScreenshot(driver);
   Thread.sleep(6000);
// enter the state name in the searchbox of the dropdown
  
   driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(ExcelUtils.getCellData(92,4 ));
   Thread.sleep(6000);
   Terminal_ScreenShots.CaptureScreenshot(driver);
   ExcelUtils.setCellData("Pass",92, 7	);
   driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
   Thread.sleep(3000);
   Terminal_ScreenShots.CaptureScreenshot(driver);
// entering the new Zip in the Zip field in the create terminal
  
   
 driver.findElement(By.xpath(".//*[@id='TerminalAddress_Zip']")).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(93,4 )));
   Thread.sleep(3000);
   Terminal_ScreenShots.CaptureScreenshot(driver);
   ExcelUtils.setCellData("Pass",93, 7	);
// entering the new number in the Latitude field in the create terminal
    driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude']")).click();
Terminal_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude']")).clear();
Terminal_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude']")).sendKeys(String.valueOf(ExcelUtils.getCellDataDecimals(94,4 )));
   Terminal_ScreenShots.CaptureScreenshot(driver);
   Thread.sleep(3000);
   ExcelUtils.setCellData("Pass",94, 7);
 // entering the new number in the Longitude field in the create terminal
    driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude']")).click();
   Terminal_ScreenShots.CaptureScreenshot(driver);
   driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude']")).clear();
   Terminal_ScreenShots.CaptureScreenshot(driver);
 driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude']")).sendKeys(String.valueOf(ExcelUtils.getCellDataDecimals(95,4 )));
   Thread.sleep(3000);
   ExcelUtils.setCellData("Pass",95, 7);
// save button
 	 WebElement Save =	driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
	 Save.click();
	 ExcelUtils.setCellData("Pass",102, 7);
	 Terminal_ScreenShots.CaptureScreenshot(driver);
	 Thread.sleep(5000);
// if error message is displayed then it clicks on the undelete button and clicks on the update button
	 String ActualMessage = ExcelUtils.getCellData(103, 5);
     String Message = driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p")).getText();
     Terminal_ScreenShots.CaptureScreenshot(driver);
     if(Message.equals(ActualMessage))
{
	Thread.sleep(5000);
	System.out.println(Message);
	ExcelUtils.setCellData(Message,103, 6);
	
	Terminal_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id='BaseTerminal_IsRecordActive']")).click();
	Thread.sleep(3000);
	Terminal_ScreenShots.CaptureScreenshot(driver);
 driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
 ExcelUtils.setCellData("Pass", 105, 7);
 Terminal_ScreenShots.CaptureScreenshot(driver);
}
else
{
	System.out.println(Message);
	driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
	ExcelUtils.setCellData(Message,103, 6);
	 ExcelUtils.setCellData("Pass", 105, 7);
	
}
Thread.sleep(6000);
// successfull updation message
WebElement UpdateMessage= driver.findElement(By.xpath("//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
Terminal_ScreenShots.CaptureScreenshot(driver);
if(UpdateMessage.isDisplayed())
{
	Terminal_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	System.out.println(UpdateMessage.getText());
	ExcelUtils.setCellData(UpdateMessage.getText(), 106, 5);
	ExcelUtils.setCellData("Pass", 106, 7);
}


Thread.sleep(5000);
driver.findElement(By.xpath(".//*[@id='txtSearchTerminalGrid']")).click();
Thread.sleep(3000);

  driver.findElement(By.xpath(".//*[@id='txtSearchTerminalGrid']")).sendKeys(ExcelUtils.getCellData(107, 4));
	WebElement Verify = driver.findElement(By.xpath(".//*[@id='TerminalGrid']/div[2]"));
	Verify.getText();
	Thread.sleep(5000);
	if(Verify.getText().isEmpty()){
		System.out.println("Fail ");
		
		WebElement  Create_new1 =driver.findElement(By.xpath(".//*[@id='btncreate']"));
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Create_new1.click();
		Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//*[@id='BaseTerminal_NumDesc']")).sendKeys(ExcelUtils.getCellData(87,4 ));
	//   Terminal_ScreenShots.CaptureScreenshot(driver);
			Thread.sleep(3000);
			ExcelUtils.setCellData("Pass",87, 7	);
		// entering the new Username in the name field in the create terminal
		 driver.findElement(By.xpath(".//*[@id='BaseTerminal_NameCode']")).sendKeys(ExcelUtils.getCellData(88,4 ));
		Thread.sleep(3000);
		Terminal_ScreenShots.CaptureScreenshot(driver);
		ExcelUtils.setCellData("Pass",88, 7	);
		// entering the Average load time  in the Avarage load time field in the create terminal
	
	      
		  
		 driver.findElement(By.xpath(".//*[@id='BaseTerminal_AveLoadTime']")).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(89,4 )));
		 ExcelUtils.setCellData("Pass",89, 7	);
		
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Thread.sleep(3000);
		WebElement InternalTerminal1= driver.findElement(By.xpath(".//*[@id='BaseTerminal_Internal']"));
		Thread.sleep(3000);
		InternalTerminal1.click();
		Terminal_ScreenShots.CaptureScreenshot(driver);
		Thread.sleep(3000);
		// entering the Address in the Address field in the create terminal
		 
      driver.findElement(By.xpath(".//*[@id='TerminalAddress_Address']")).sendKeys(ExcelUtils.getCellData(90,4 ));
		 Terminal_ScreenShots.CaptureScreenshot(driver);
		 ExcelUtils.setCellData("Pass",90, 7	);
		 Thread.sleep(3000);
		// entering the city name  in the city field in the create terminal
		 
		 driver.findElement(By.xpath(".//*[@id='TerminalAddress_City']")).sendKeys(ExcelUtils.getCellData(91,4 ));
		 Terminal_ScreenShots.CaptureScreenshot(driver);
		 Thread.sleep(3000);
		 ExcelUtils.setCellData("Pass",91, 7	);
	 driver.findElement(By.xpath("//div[@id='tabTerminalDetails']/div/div/fieldset/fieldset[2]/div[3]/div/span/span/span[2]/span")).click();
	 Thread.sleep(4000);
	 Terminal_ScreenShots.CaptureScreenshot(driver);
   int ok_size1=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
   Terminal_ScreenShots.CaptureScreenshot(driver);
   Thread.sleep(6000);
// enter the state name in the searchbox of the dropdown
  
   driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size1-1).sendKeys(ExcelUtils.getCellData(92,4 ));
   Thread.sleep(6000);
   Terminal_ScreenShots.CaptureScreenshot(driver);
   ExcelUtils.setCellData("Pass",92, 7	);
   driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size1-1).sendKeys(Keys.ENTER);
   Thread.sleep(3000);
   Terminal_ScreenShots.CaptureScreenshot(driver);
// entering the new Zip in the Zip field in the create terminal
  
   
 driver.findElement(By.xpath(".//*[@id='TerminalAddress_Zip']")).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(93,4 )));
   Thread.sleep(3000);
   Terminal_ScreenShots.CaptureScreenshot(driver);
   ExcelUtils.setCellData("Pass",93, 7	);
// // entering the new number in the Latitude field in the create terminal
    driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude']")).click();
Terminal_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude']")).clear();
Terminal_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(3000);

driver.findElement(By.xpath(".//*[@id='TerminalAddress_Latitude']")).sendKeys(String.valueOf(ExcelUtils.getCellDataDecimals(94,4 )));
   Terminal_ScreenShots.CaptureScreenshot(driver);
   Thread.sleep(3000);
   ExcelUtils.setCellData("Pass",94, 7	);
   // entering the new number in the Longitude field in the create terminal
    driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude']")).click();
   Terminal_ScreenShots.CaptureScreenshot(driver);
   driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude']")).clear();
   Terminal_ScreenShots.CaptureScreenshot(driver);
driver.findElement(By.xpath(".//*[@id='TerminalAddress_Longitude']")).sendKeys(String.valueOf(ExcelUtils.getCellDataDecimals(95,4 )));
   Thread.sleep(3000);
   ExcelUtils.setCellData("Pass",95, 7);
// save button
 	 WebElement Save1 =	driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
	 Save1.click();
	 ExcelUtils.setCellData("Pass",102, 7);
	Terminal_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(5000);
// if error message is displayed then it clicks on the undelete button and clicks on the update button
	String ActualMessage1 = ExcelUtils.getCellData(103, 5);
String Message1 = driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p")).getText();
Terminal_ScreenShots.CaptureScreenshot(driver);
if(Message1.equals(ActualMessage1))
{
	Thread.sleep(5000);
	System.out.println(Message1);
	ExcelUtils.setCellData(Message1,103, 6);
	
	Terminal_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='BaseTerminal_IsRecordActive']")).click();
	Thread.sleep(3000);
	Terminal_ScreenShots.CaptureScreenshot(driver);
 driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
 ExcelUtils.setCellData("Pass", 105, 7);
 Terminal_ScreenShots.CaptureScreenshot(driver);
}

	else
		
	{
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id='BaseTerminal_IsRecordActive']")).click();
			Thread.sleep(3000);
		System.out.println(Message);
		driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
		ExcelUtils.setCellData(Message,103, 6);
		 ExcelUtils.setCellData("Pass", 105, 7);
	
	}
	
	

Thread.sleep(6000);
// successfull updation message
WebElement UpdateMessage1= driver.findElement(By.xpath("//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
Terminal_ScreenShots.CaptureScreenshot(driver);
if(UpdateMessage1.isDisplayed())
{
	Terminal_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	System.out.println(UpdateMessage1.getText());
	ExcelUtils.setCellData(UpdateMessage1.getText(), 106, 5);
	ExcelUtils.setCellData("Pass", 106, 7);
}
Thread.sleep(5000);
driver.findElement(By.xpath(".//*[@id='txtSearchTerminalGrid']")).sendKeys(ExcelUtils.getCellData(107, 4));
	WebElement Verify1 = driver.findElement(By.xpath(".//*[@id='TerminalGrid']/div[2]"));
	Verify1.getText();
	Thread.sleep(5000);
	if(Verify1.getText().isEmpty()){
		System.out.println("Fail ");
		System.out.println(" no File Found");

}else{
	System.out.println(" File Found");
}
		
		
	}


}

}
