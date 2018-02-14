package ContractFunctionalities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ContractFunctionalities.Contract_Screenshots;
import Utility.ExcelUtils;

public class Contract_ExistingValues {
	public static  void ExistingValues (WebDriver driver) throws Exception{
		
		WebElement  Create_new =driver.findElement(By.xpath(".//*[@id='btncreate']"));
		Contract_Screenshots.CaptureScreenshot(driver);
		Create_new.click();
		ExcelUtils.setCellData("Pass", 53, 7);
		Thread.sleep(3000);
		Contract_Screenshots.CaptureScreenshot(driver);
		
		int Number =ExcelUtils.getCellDataNum(54, 4);
		
		
		WebElement Number1 = driver.findElement(By.xpath(".//*[@id='BaseContract_Number']"));
		Number1.sendKeys(String.valueOf(Number));
		ExcelUtils.setCellData("Pass", 54, 7);
		Thread.sleep(3000);
		Contract_Screenshots.CaptureScreenshot(driver);
				 Contract_Screenshots.CaptureScreenshot(driver);
		 WebElement	 Perpetual_Checkbox = driver.findElement(By.xpath(".//*[@id='BaseContract_Perpetual']"));
		 Perpetual_Checkbox.click();
		 ExcelUtils.setCellData("Pass", 57, 7);
		 Thread.sleep(3000);
		 Contract_Screenshots.CaptureScreenshot(driver);
		 WebElement Priceineffect_Checkbox = driver.findElement(By.xpath(".//*[@id='BaseContract_UseBolEndTime']"));
		 Priceineffect_Checkbox.click();
		 ExcelUtils.setCellData("Pass", 58, 7);
		 Thread.sleep(3000);
		 Contract_Screenshots.CaptureScreenshot(driver);
		 WebElement  Terminal_Dropdown = driver.findElement(By.xpath("//div[@id='tabContractDetails']/div/div/fieldset/fieldset[2]/div/div/span/span/span[2]"));
		 Terminal_Dropdown.click();
		 ExcelUtils.setCellData("Pass", 59, 7);
		 Thread.sleep(3000);
		 Contract_Screenshots.CaptureScreenshot(driver);
	     int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
	     Thread.sleep(3000);
	     Contract_Screenshots.CaptureScreenshot(driver);
	     String DropDownInput =ExcelUtils.getCellData(60, 4);
	     driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(DropDownInput);
	     Thread.sleep(3000);
	     Contract_Screenshots.CaptureScreenshot(driver);
	     ExcelUtils.setCellData("Pass", 60, 7);
	     driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
	     
	     Thread.sleep(3000);
	     Contract_Screenshots.CaptureScreenshot(driver);
	     WebElement SupplierDropdown = driver.findElement(By.xpath("//div[@id='tabContractDetails']/div/div/fieldset/fieldset[2]/div[2]/div/span/span/span[2]/span"));
		 SupplierDropdown.click();
		 ExcelUtils.setCellData("Pass", 61, 7);
		 Contract_Screenshots.CaptureScreenshot(driver);
		 
		
		 
		 int ok_size3=driver.findElements(By.xpath("//ul[@id='BaseContract_SupplierId_listbox']/li[2]")).size();
		 Thread.sleep(7000);
		 driver.findElements(By.xpath("//ul[@id='BaseContract_SupplierId_listbox']/li[2]")).get(ok_size3-1).click();
		// Thread.sleep(5000);
	ExcelUtils.setCellData("Pass", 62, 7);
//			 driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).click();
	
	Contract_Screenshots.CaptureScreenshot(driver);
		 Thread.sleep(3000);
		 WebElement  VendorDropdown = driver.findElement(By.xpath("//div[@id='tabContractDetails']/div/div/fieldset/fieldset[2]/div[3]/div/span/span/span[2]"));
		 VendorDropdown.click();
		 ExcelUtils.setCellData("Pass", 63, 7);
		 Contract_Screenshots.CaptureScreenshot(driver);
		 Thread.sleep(3000);
		 int ok_size4=driver.findElements(By.xpath("//ul[@id='BaseContract_VendorId_listbox']/li[2]")).size();
		 Thread.sleep(6000);
		 
		 driver.findElements(By.xpath("//ul[@id='BaseContract_VendorId_listbox']/li[2]")).get(ok_size4-1).click();

	 ExcelUtils.setCellData("Pass", 64, 7);

	 Contract_Screenshots.CaptureScreenshot(driver);
		 Thread.sleep(3000);
		 WebElement  Product_DetailsTab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
		 Product_DetailsTab.click();
		 ExcelUtils.setCellData("Pass", 66, 7);
		 Contract_Screenshots.CaptureScreenshot(driver);
		 Thread.sleep(3000);
		 WebElement  ProductName_Checkbox = driver.findElement(By.xpath(".//*[@id='ContractDetailsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
		 ProductName_Checkbox.click();
		 ExcelUtils.setCellData("Pass", 68, 7);
		 Thread.sleep(3000);
		 Contract_Screenshots.CaptureScreenshot(driver);
		 WebElement 	 Save_Button = driver.findElement(By.xpath(".//*[@id='btnCreate']"));
		 Save_Button.click();
		 ExcelUtils.setCellData("Pass", 69, 7);
		 Thread.sleep(3000);
		 String ActualMessage = ExcelUtils.getCellData(70, 5);
		 String ExistingValues = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p")).getText();
		 Thread.sleep(3000);
		 ExcelUtils.setCellData("Pass", 55, 7);
		 Contract_Screenshots.CaptureScreenshot(driver);
		 if(ExistingValues.equals(ActualMessage))
		 {
			 Contract_Screenshots.CaptureScreenshot(driver);
			 Thread.sleep(3000);
			 ExcelUtils.setCellData("Pass", 70, 7);
			 ExcelUtils.setCellData(ExistingValues, 70, 6);
			 driver.findElement(By.xpath(".//*[@id='btnCreate']")).click();
			 
			 ExcelUtils.setCellData("Pass", 71, 7);
			 
		System.out.println(ExistingValues);
			 Contract_Screenshots.CaptureScreenshot(driver);
		 }
		 else
		 {
			 driver.findElement(By.xpath(".//*[@id='btnCreate']")).click();
			 ExcelUtils.setCellData("Fail", 71, 7);
			 
		 }
		 Thread.sleep(2000);
		 WebElement UpDateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 System.out.println(UpDateMessage.getText());
		 ExcelUtils.setCellData("Pass", 72, 7);
		 ExcelUtils.setCellData(UpDateMessage.getText(), 72, 6);

		 
		 
		 
		 
		 
	} 
		 
		 
		 
		 
		 
		 
		 

}
