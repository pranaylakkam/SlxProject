package Driver_SubClasses;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class Driver_unDelete {
	

	public static  void ExistingValues (WebDriver driver) throws Exception{
		Driver_ScreenShots.CaptureScreenshot(driver);
		WebElement  Create_new =driver.findElement(By.xpath(".//*[@id='btncreate']"));
		Create_new.click();
		 ExcelUtils.setCellData("Pass",68, 7);
		Driver_ScreenShots.CaptureScreenshot(driver);
	
		 Thread.sleep(5000);
		String Driver_id = ExcelUtils.getCellData(69, 4);
		 driver.findElement(By.xpath(".//*[@id='BaseDriver_UserCode']")).sendKeys(String.valueOf(Driver_id));
		 ExcelUtils.setCellData("Pass",69, 7);
		Driver_ScreenShots.CaptureScreenshot(driver);
		 Thread.sleep(5000);
		String Driver_Name =  ExcelUtils.getCellData(70, 4);
		 driver.findElement(By.xpath(".//*[@id='BaseDriver_Name']")).sendKeys(Driver_Name);
		 ExcelUtils.setCellData("Pass",70, 7);
		 Thread.sleep(5000);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 int Driver_Password = ExcelUtils.getCellDataNum(71, 4);
		 driver.findElement(By.xpath(".//*[@id='BaseDriver_Password']")).sendKeys(String.valueOf(Driver_Password));
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 ExcelUtils.setCellData("Pass",72, 7);
		 Thread.sleep(5000);
		 int Driver_HomePhone = ExcelUtils.getCellDataNum(73, 4);
		 driver.findElement(By.xpath(".//*[@id='BaseDriver_HomePhone']")).sendKeys(String.valueOf(Driver_HomePhone));
		 Thread.sleep(5000);
		 ExcelUtils.setCellData("Pass",73, 7);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 
		 int Driver_CellPhone = ExcelUtils.getCellDataNum(74, 4);
		  driver.findElement(By.xpath(".//*[@id='BaseDriver_CellPhone']")).sendKeys(String.valueOf(Driver_CellPhone));
		 Thread.sleep(5000);
		 ExcelUtils.setCellData("Pass",74, 7);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 int CostPerHour = ExcelUtils.getCellDataNum(75, 4);
		  driver.findElement(By.xpath(".//*[@id='BaseDriver_CostPerHour']")).sendKeys(String.valueOf(CostPerHour));
		 Thread.sleep(5000);
		 ExcelUtils.setCellData("Pass",75, 7);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 String Email = ExcelUtils.getCellData(76, 4);
		 driver.findElement(By.xpath(".//*[@id='BaseDriver_Email']")).sendKeys(Email);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 ExcelUtils.setCellData("Pass",76, 7);
	 WebElement TerminalMapping_Tab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
	TerminalMapping_Tab.click();
	 ExcelUtils.setCellData("Pass",77, 7);
	 Thread.sleep(5000);
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 WebElement TerminalMapping_Expand = driver.findElement(By.xpath(".//*[@id='btnExpandCollpseTerminals']"));
	 TerminalMapping_Expand.click();
	 Thread.sleep(5000);
	 ExcelUtils.setCellData("Pass",78, 7);
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 WebElement TerminalMapping_Access = driver.findElement(By.xpath(".//span[@class = 'k-checkbox']/input[@value='2327']"));
	 TerminalMapping_Access.click();
	 ExcelUtils.setCellData("Pass",79, 7);
	 Thread.sleep(5000);
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 WebElement TerminalMapping_Collapse = driver.findElement(By.xpath(".//*[@id='btnExpandCollpseTerminals']"));
	 TerminalMapping_Collapse.click();
	 ExcelUtils.setCellData("Pass",80, 7);
	 Thread.sleep(5000);
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 WebElement RegionMapping_Tab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[3]/a"));
	 RegionMapping_Tab.click(); ExcelUtils.setCellData("Pass",81,7);
	 Thread.sleep(5000);
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 WebElement RegionMapping_Checkbox = driver.findElement(By.xpath(".//*[@id='RegionDriversGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
	 RegionMapping_Checkbox.click();
	 ExcelUtils.setCellData("Pass",82, 7);
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 Thread.sleep(5000);
	 WebElement Save_Button = driver.findElement(By.xpath(".//*[@id='btnUpdate']"));
	 Save_Button.click();
	 ExcelUtils.setCellData("Pass",83, 7);
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 Thread.sleep(5000);
	 
	 String UnDeleteMessageError =  ExcelUtils.getCellData(84, 5);
String Undeletemesssage = driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p")).getText();
Driver_ScreenShots.CaptureScreenshot(driver);
if(Undeletemesssage.equals(UnDeleteMessageError))
{
Driver_ScreenShots.CaptureScreenshot(driver);


System.out.print(Undeletemesssage);	
ExcelUtils.setCellData("Pass",84, 7);
ExcelUtils.setCellData(Undeletemesssage,84, 6);
//driver.findElement(By.xpath(".//*[@id='BaseDriver_IsRecordActive']")).click();
Driver_ScreenShots.CaptureScreenshot(driver);
ExcelUtils.setCellData("Pass",85, 7);
driver.findElement(By.xpath(".//*[@id='btnUpdate']")).click();
ExcelUtils.setCellData("Pass",86, 7);
}
else{
	
	driver.findElement(By.xpath(".//*[@id='btnUpdate']")).click();
	ExcelUtils.setCellData("Fail",86, 7);
}

Thread.sleep(5000);
WebElement updatemessag_Undelete = driver.findElement(By.xpath("//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
Driver_ScreenShots.CaptureScreenshot(driver);
if(updatemessag_Undelete.isDisplayed())
{Driver_ScreenShots.CaptureScreenshot(driver);
ExcelUtils.setCellData("Pass",87, 7);
ExcelUtils.setCellData(updatemessag_Undelete.getText(),87, 6);
	System.out.println(updatemessag_Undelete.getText());
}

Thread.sleep(5000);
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[@id='txtSearchDriverGrid']")).click();

String Search = ExcelUtils.getCellData(70, 4);
	driver.findElement(By.xpath(".//*[@id='txtSearchDriverGrid']")).sendKeys(Search);
	
Thread.sleep(3000);


WebElement Verify1 = driver.findElement(By.xpath(".//*[@id='DriverGrid']/div[2]"));
Verify1.getText();

System.out.println(Verify1.getText());


if(Verify1.getText().isEmpty()){
	
	System.out.println("Fail ");
	
	
	WebElement  Create_new1 =driver.findElement(By.xpath(".//*[@id='btncreate']"));
	Create_new1.click();
	 ExcelUtils.setCellData("Pass",68, 7);
	Driver_ScreenShots.CaptureScreenshot(driver);

	
	 
	 Thread.sleep(5000);
	String Driver_id1 = ExcelUtils.getCellData(69, 4);
	 driver.findElement(By.xpath(".//*[@id='BaseDriver_UserCode']")).sendKeys(String.valueOf(Driver_id1));
	 ExcelUtils.setCellData("Pass",70, 7);
	Driver_ScreenShots.CaptureScreenshot(driver);
	 Thread.sleep(5000);
	String Driver_Name1 =  ExcelUtils.getCellData(70, 4);
	 driver.findElement(By.xpath(".//*[@id='BaseDriver_Name']")).sendKeys(Driver_Name1);
	 ExcelUtils.setCellData("Pass",71, 7);
	 Thread.sleep(5000);
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 int Driver_Password1 = ExcelUtils.getCellDataNum(71, 4);
	 driver.findElement(By.xpath(".//*[@id='BaseDriver_Password']")).sendKeys(String.valueOf(Driver_Password1));
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 ExcelUtils.setCellData("Pass",72, 6);
	 Thread.sleep(5000);
	 int Driver_HomePhone1 = ExcelUtils.getCellDataNum(72, 4);
	 driver.findElement(By.xpath(".//*[@id='BaseDriver_HomePhone']")).sendKeys(String.valueOf(Driver_HomePhone1));
	 Thread.sleep(5000);
	 ExcelUtils.setCellData("Pass",73, 7);
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 
	 int Driver_CellPhone1 = ExcelUtils.getCellDataNum(73, 4);
	  driver.findElement(By.xpath(".//*[@id='BaseDriver_CellPhone']")).sendKeys(String.valueOf(Driver_CellPhone1));
	 Thread.sleep(5000);
	 ExcelUtils.setCellData("Pass",74, 7);
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 int CostPerHour1 = ExcelUtils.getCellDataNum(74, 4);
	  driver.findElement(By.xpath(".//*[@id='BaseDriver_CostPerHour']")).sendKeys(String.valueOf(CostPerHour1));
	 Thread.sleep(5000);
	 ExcelUtils.setCellData("Pass",75, 7);
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 String Email1 = ExcelUtils.getCellData(75, 4);
	 driver.findElement(By.xpath(".//*[@id='BaseDriver_Email']")).sendKeys(Email1);
	 Driver_ScreenShots.CaptureScreenshot(driver);
	 ExcelUtils.setCellData("Pass",76, 7);
 WebElement TerminalMapping_Tab1 = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
TerminalMapping_Tab1.click();
 ExcelUtils.setCellData("Pass",77, 7);
 Thread.sleep(5000);
 Driver_ScreenShots.CaptureScreenshot(driver);
 WebElement TerminalMapping_Expand1 = driver.findElement(By.xpath(".//*[@id='btnExpandCollpseTerminals']"));
 TerminalMapping_Expand1.click();
 Thread.sleep(5000);
 ExcelUtils.setCellData("Pass",78, 7);
 Driver_ScreenShots.CaptureScreenshot(driver);
 WebElement TerminalMapping_Access1 = driver.findElement(By.xpath(".//span[@class = 'k-checkbox']/input[@value='2327']"));
 TerminalMapping_Access1.click();
 ExcelUtils.setCellData("Pass",80, 7);
 Thread.sleep(5000);
 Driver_ScreenShots.CaptureScreenshot(driver);
 WebElement TerminalMapping_Collapse1 = driver.findElement(By.xpath(".//*[@id='btnExpandCollpseTerminals']"));
 TerminalMapping_Collapse1.click();
 ExcelUtils.setCellData("Pass",81, 7);
 Thread.sleep(5000);
 Driver_ScreenShots.CaptureScreenshot(driver);
 WebElement RegionMapping_Tab1 = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[3]/a"));
 RegionMapping_Tab1.click(); ExcelUtils.setCellData("Pass",82, 7);
 Thread.sleep(5000);
 Driver_ScreenShots.CaptureScreenshot(driver);
 WebElement RegionMapping_Checkbox1 = driver.findElement(By.xpath(".//*[@id='RegionDriversGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
 RegionMapping_Checkbox1.click();
 ExcelUtils.setCellData("Pass",83, 7);
 Driver_ScreenShots.CaptureScreenshot(driver);
 Thread.sleep(5000);
 WebElement Save_Button1 = driver.findElement(By.xpath(".//*[@id='btnUpdate']"));
 Save_Button1.click();
 ExcelUtils.setCellData("Pass",84, 7);
 Driver_ScreenShots.CaptureScreenshot(driver);
 Thread.sleep(5000);
WebElement Undeletemesssage1 = driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p"));
Driver_ScreenShots.CaptureScreenshot(driver);
if(Undeletemesssage1.isDisplayed())
{
Driver_ScreenShots.CaptureScreenshot(driver);
System.out.print(Undeletemesssage1.getText());	
ExcelUtils.setCellData("Pass",85, 7);
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[@id='BaseDriver_IsRecordActive']")).click();
ExcelUtils.setCellData("Pass",85, 7);
Driver_ScreenShots.CaptureScreenshot(driver);

driver.findElement(By.xpath(".//*[@id='btnUpdate']")).click();

}

Thread.sleep(5000);
WebElement updatemessag_Undelete1 = driver.findElement(By.xpath("//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
Driver_ScreenShots.CaptureScreenshot(driver);
if(updatemessag_Undelete1.isDisplayed())
{Driver_ScreenShots.CaptureScreenshot(driver);
ExcelUtils.setCellData("Pass",68, 7);
System.out.println(updatemessag_Undelete1.getText());
}



driver.findElement(By.xpath(".//*[@id='txtSearchDriverGrid']")).click();

String Search1 = ExcelUtils.getCellData(70, 4);
driver.findElement(By.xpath(".//*[@id='txtSearchDriverGrid']")).sendKeys(Search1);

Thread.sleep(5000);


WebElement Verify2 = driver.findElement(By.xpath(".//*[@id='DriverGrid']/div[2]"));
Verify2.getText();

System.out.println(Verify2.getText());

Thread.sleep(5000);
if(Verify2.getText().isEmpty()){

System.out.println("Fail ");




}
else
{	System.out.println("Result found ");
ExcelUtils.setCellData("pass",99, 6);	
}

	
}
else
{	System.out.println("Result found ");
 ExcelUtils.setCellData("pass",99, 6);	
}




}

}
