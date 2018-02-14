package ContractFunctionalities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ContractFunctionalities.Contract_Screenshots;
import Utility.ExcelUtils;

public class Contract_Undelete {
	public static  void UnDelete (WebDriver driver) throws Exception{

	
		WebElement  Create_new =driver.findElement(By.xpath(".//*[@id='btncreate']"));
		Contract_Screenshots.CaptureScreenshot(driver);
		Create_new.click();
		ExcelUtils.setCellData("Pass", 74, 7);
		Thread.sleep(3000);
		Contract_Screenshots.CaptureScreenshot(driver);
		
		int Number =ExcelUtils.getCellDataNum(75, 4);
		
		
		WebElement Number1 = driver.findElement(By.xpath(".//*[@id='BaseContract_Number']"));
		Number1.sendKeys(String.valueOf(Number));
		ExcelUtils.setCellData("Pass", 75, 7);
		Thread.sleep(3000);
		Contract_Screenshots.CaptureScreenshot(driver);
		 Contract_Screenshots.CaptureScreenshot(driver);
					 WebElement	 Perpetual_Checkbox = driver.findElement(By.xpath(".//*[@id='BaseContract_Perpetual']"));
					 Perpetual_Checkbox.click();
					 ExcelUtils.setCellData("Pass", 78, 7);
					 Thread.sleep(3000);
					 Contract_Screenshots.CaptureScreenshot(driver);
					 WebElement Priceineffect_Checkbox = driver.findElement(By.xpath(".//*[@id='BaseContract_UseBolEndTime']"));
					 Priceineffect_Checkbox.click();
					 ExcelUtils.setCellData("Pass", 79, 7);
					 Thread.sleep(3000);
					 Contract_Screenshots.CaptureScreenshot(driver);
					 WebElement  Terminal_Dropdown = driver.findElement(By.xpath("//div[@id='tabContractDetails']/div/div/fieldset/fieldset[2]/div/div/span/span/span[2]"));
					 Terminal_Dropdown.click();
					 ExcelUtils.setCellData("Pass", 80, 7);
					 Thread.sleep(3000);
					 Contract_Screenshots.CaptureScreenshot(driver);
				     int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
				     Thread.sleep(8000);
				     Contract_Screenshots.CaptureScreenshot(driver);
				     String DropDownInput =ExcelUtils.getCellData(81, 4);
				     driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(DropDownInput);
				     Thread.sleep(3000);
				     Contract_Screenshots.CaptureScreenshot(driver);
				     ExcelUtils.setCellData("Pass", 82, 7);
				     driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
				     
				     Thread.sleep(3000);
				     Contract_Screenshots.CaptureScreenshot(driver);
				     
					 WebElement SupplierDropdown = driver.findElement(By.xpath("//div[@id='tabContractDetails']/div/div/fieldset/fieldset[2]/div[2]/div/span/span/span[2]/span"));
					 SupplierDropdown.click();
					 ExcelUtils.setCellData("Pass", 83, 7);
					 Contract_Screenshots.CaptureScreenshot(driver);
					 
					
					 
					 int ok_size3=driver.findElements(By.xpath("//ul[@id='BaseContract_SupplierId_listbox']/li[2]")).size();
					 Thread.sleep(7000);
					 driver.findElements(By.xpath("//ul[@id='BaseContract_SupplierId_listbox']/li[2]")).get(ok_size3-1).click();
					// Thread.sleep(5000);
				ExcelUtils.setCellData("Pass", 84, 7);
	//			 driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).click();
				
				Contract_Screenshots.CaptureScreenshot(driver);
					 Thread.sleep(3000);
					 WebElement  VendorDropdown = driver.findElement(By.xpath("//div[@id='tabContractDetails']/div/div/fieldset/fieldset[2]/div[3]/div/span/span/span[2]"));
					 VendorDropdown.click();
					 ExcelUtils.setCellData("Pass", 85, 7);
					 Contract_Screenshots.CaptureScreenshot(driver);
					 Thread.sleep(3000);
					 int ok_size4=driver.findElements(By.xpath("//ul[@id='BaseContract_VendorId_listbox']/li[2]")).size();
					 Thread.sleep(6000);
					 
					 driver.findElements(By.xpath("//ul[@id='BaseContract_VendorId_listbox']/li[2]")).get(ok_size4-1).click();
			
				 ExcelUtils.setCellData("Pass", 86, 7);
				 Contract_Screenshots.CaptureScreenshot(driver);
					 Thread.sleep(3000);
					 WebElement  Product_DetailsTab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
					 Product_DetailsTab.click();
					 ExcelUtils.setCellData("Pass", 87, 7);
					 Contract_Screenshots.CaptureScreenshot(driver);
					 Thread.sleep(3000);
					 WebElement  ProductName_Checkbox = driver.findElement(By.xpath(".//*[@id='ContractDetailsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
					 ProductName_Checkbox.click();
					 ExcelUtils.setCellData("Pass", 89, 7);
					 Thread.sleep(3000);
					 Contract_Screenshots.CaptureScreenshot(driver);
					 WebElement 	 Save_Button = driver.findElement(By.xpath(".//*[@id='btnCreate']"));
					 
					 Save_Button.click();

	 ExcelUtils.setCellData("Pass", 90, 7);
	Contract_Screenshots.CaptureScreenshot(driver);
	 Thread.sleep(3000);
     String ActualMessage = ExcelUtils.getCellData(91, 5) ;
	 String UnDelete = driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p")).getText();
	 Thread.sleep(3000);
	Contract_Screenshots.CaptureScreenshot(driver);
	 if(UnDelete.equals(ActualMessage))
	 {
		 
		 Thread.sleep(3000);
	
		 System.out.println(UnDelete);
		 ExcelUtils.setCellData(UnDelete, 91, 6);
		 ExcelUtils.setCellData("Pass", 91, 7);
	Contract_Screenshots.CaptureScreenshot(driver);
		
//	driver.findElement(By.xpath("//*[@id='BaseContract_IsRecordActive']")).click();
		 Thread.sleep(3000);
		 
		 ExcelUtils.setCellData("Pass", 92, 7);
		
		Contract_Screenshots.CaptureScreenshot(driver);
		 
		driver.findElement(By.xpath("//*[@id='btnCreate']")).click();
		
		ExcelUtils.setCellData("Pass", 93, 7);
		Contract_Screenshots.CaptureScreenshot(driver);
	 }
	 else{
		 driver.findElement(By.xpath("//*[@id='btnCreate']")).click();
			
			ExcelUtils.setCellData("Fail", 91, 7);
	 }
	 
	 Thread.sleep(3000);
	 WebElement UpDateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
	 Thread.sleep(3000);
	 ExcelUtils.setCellData("Pass", 94, 7);
	 System.out.println(UpDateMessage.getText());
	 
	 ExcelUtils.setCellData(UpDateMessage.getText(), 94, 6);
	 Thread.sleep(6000);
	 
	 
	 driver.findElement(By.xpath(".//*[@id='txtSearchContractGrid']")).click();
		
	    int Search =  ExcelUtils.getCellDataNum(75, 4);
	   	driver.findElement(By.xpath(".//*[@id='txtSearchContractGrid']")).sendKeys(String.valueOf(Search));
	   	
		Thread.sleep(3000);
		
		
		WebElement Verify1 = driver.findElement(By.xpath(".//*[@id='ContractGrid']/div[2]"));
		Verify1.getText();
		
		System.out.println(Verify1.getText());
		
		
		String Actual1 = "179";
		
		if(Verify1.getText().isEmpty()){
			
			System.out.println("Fail ");
			
			WebElement  Create_new1 =driver.findElement(By.xpath(".//*[@id='btncreate']"));
			Contract_Screenshots.CaptureScreenshot(driver);
			Create_new1.click();
			ExcelUtils.setCellData("Pass", 74, 6);
			Thread.sleep(3000);
			Contract_Screenshots.CaptureScreenshot(driver);
			
			int Number4 =ExcelUtils.getCellDataNum(75, 4);
			
			
			WebElement Number3 = driver.findElement(By.xpath(".//*[@id='BaseContract_Number']"));
			Number3.sendKeys(String.valueOf(Number4));
			ExcelUtils.setCellData("Pass", 75, 6);
			Thread.sleep(3000);
			Contract_Screenshots.CaptureScreenshot(driver);
						
				
				
				
						
						 Contract_Screenshots.CaptureScreenshot(driver);
						 WebElement	 Perpetual_Checkbox1 = driver.findElement(By.xpath(".//*[@id='BaseContract_Perpetual']"));
						 Perpetual_Checkbox1.click();
						 ExcelUtils.setCellData("Pass", 78, 6);
						 Thread.sleep(3000);
						 Contract_Screenshots.CaptureScreenshot(driver);
						 WebElement Priceineffect_Checkbox1 = driver.findElement(By.xpath(".//*[@id='BaseContract_UseBolEndTime']"));
						 Priceineffect_Checkbox1.click();
						 ExcelUtils.setCellData("Pass", 79, 6);
						 Thread.sleep(3000);
						 Contract_Screenshots.CaptureScreenshot(driver);
						 WebElement  Terminal_Dropdown1 = driver.findElement(By.xpath("//div[@id='tabContractDetails']/div/div/fieldset/fieldset[2]/div/div/span/span/span[2]"));
						 Terminal_Dropdown1.click();
						 ExcelUtils.setCellData("Pass", 80, 6);
						 Thread.sleep(3000);
						 Contract_Screenshots.CaptureScreenshot(driver);
					     int ok_size7=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
					     Thread.sleep(3000);
					     Contract_Screenshots.CaptureScreenshot(driver);
					     String DropDownInput1 =ExcelUtils.getCellData(81, 4);
					     driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size7-1).sendKeys(DropDownInput);
					     Thread.sleep(3000);
					     Contract_Screenshots.CaptureScreenshot(driver);
					     ExcelUtils.setCellData("Pass", 82, 6);
					     driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size7-1).sendKeys(Keys.ENTER);
					     
					     Thread.sleep(3000);
					     Contract_Screenshots.CaptureScreenshot(driver);
					     
						 WebElement SupplierDropdown1 = driver.findElement(By.xpath("//div[@id='tabContractDetails']/div/div/fieldset/fieldset[2]/div[2]/div/span/span/span[2]/span"));
						 SupplierDropdown1.click();
						 ExcelUtils.setCellData("Pass", 83, 6);
						 Contract_Screenshots.CaptureScreenshot(driver);
						 
						
						 
						 int ok_size6=driver.findElements(By.xpath("//ul[@id='BaseContract_SupplierId_listbox']/li[2]")).size();
						 Thread.sleep(7000);
						 driver.findElements(By.xpath("//ul[@id='BaseContract_SupplierId_listbox']/li[2]")).get(ok_size6-1).click();
						// Thread.sleep(5000);
					ExcelUtils.setCellData("Pass", 84, 6);
		//			 driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).click();
					
					Contract_Screenshots.CaptureScreenshot(driver);
						 Thread.sleep(3000);
						 WebElement  VendorDropdown1 = driver.findElement(By.xpath("//div[@id='tabContractDetails']/div/div/fieldset/fieldset[2]/div[3]/div/span/span/span[2]"));
						 VendorDropdown1.click();
						 ExcelUtils.setCellData("Pass", 85, 6);
						 Contract_Screenshots.CaptureScreenshot(driver);
						 Thread.sleep(3000);
						 int ok_size5=driver.findElements(By.xpath("//ul[@id='BaseContract_VendorId_listbox']/li[2]")).size();
						 Thread.sleep(6000);
						 
						 driver.findElements(By.xpath("//ul[@id='BaseContract_VendorId_listbox']/li[2]")).get(ok_size5-1).click();
				
					 ExcelUtils.setCellData("Pass", 86, 6);
					 Contract_Screenshots.CaptureScreenshot(driver);
						 Thread.sleep(3000);
						 WebElement  Product_DetailsTab1 = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
						 Product_DetailsTab1.click();
						 ExcelUtils.setCellData("Pass", 87, 6);
						 Contract_Screenshots.CaptureScreenshot(driver);
						 Thread.sleep(3000);
						 WebElement  ProductName_Checkbox1 = driver.findElement(By.xpath(".//*[@id='ContractDetailsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
						 ProductName_Checkbox1.click();
						 ExcelUtils.setCellData("Pass", 89, 6);
						 Thread.sleep(3000);
						 Contract_Screenshots.CaptureScreenshot(driver);
						 WebElement 	 Save_Button1 = driver.findElement(By.xpath(".//*[@id='btnCreate']"));
						 
						 Save_Button1.click();

		 ExcelUtils.setCellData("Pass", 90, 6);
		Contract_Screenshots.CaptureScreenshot(driver);
		 Thread.sleep(3000);
		 WebElement UnDelete1 = driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p"));
		 Thread.sleep(3000);
		Contract_Screenshots.CaptureScreenshot(driver);
		 if(UnDelete1.isDisplayed())
		 {
			 
			 Thread.sleep(3000);
		
			 System.out.println(UnDelete1.getText());
			 ExcelUtils.setCellData(UnDelete1.getText(), 91, 5);
			 ExcelUtils.setCellData("Pass", 91, 6);
		Contract_Screenshots.CaptureScreenshot(driver);
			
		driver.findElement(By.xpath("//*[@id='BaseContract_IsRecordActive']")).click();
			 Thread.sleep(3000);
			 
			 ExcelUtils.setCellData("Pass", 92, 6);
			
			Contract_Screenshots.CaptureScreenshot(driver);
			 
			driver.findElement(By.xpath("//*[@id='btnCreate']")).click();
			
			ExcelUtils.setCellData("Pass", 93, 6);
			Contract_Screenshots.CaptureScreenshot(driver);
		 }
		 
		 Thread.sleep(3000);
		 WebElement UpDateMessage1 = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 Thread.sleep(3000);
		 ExcelUtils.setCellData("Pass", 94, 6);
		 System.out.println(UpDateMessage1.getText());
		 
		 ExcelUtils.setCellData(UpDateMessage1.getText(), 94, 5);
		 Thread.sleep(6000);
		 
		 
		 driver.findElement(By.xpath(".//*[@id='txtSearchContractGrid']")).click();
			
		    int Search1 =  ExcelUtils.getCellDataNum(75, 4);
		   	driver.findElement(By.xpath(".//*[@id='txtSearchContractGrid']")).sendKeys(String.valueOf(Search1));
		   	
		   	
			Thread.sleep(3000);
			
			
			WebElement Verify2 = driver.findElement(By.xpath(".//*[@id='ContractGrid']/div[2]"));
			Verify2.getText();
			
			System.out.println(Verify2.getText());
			
			
			String Actual2 = "179";
			
			if(Verify2.getText().isEmpty()){
				
				System.out.println("Fail ");
				
				
				
				
			}
			else
			{	System.out.println("Result found ");
		//	 ExcelUtils.setCellData("pass",99, 6);	
			}	 
		 

		 
	}

			
			
		

	 
}
	
	}


