package Product_Subclasses;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Product_ExistingValues {
	public static void ExistingValues(WebDriver driver) throws Exception {
		Product_ScreenShots.CaptureScreenshot(driver);
		 // USE PAGE LIBRARY NOW

		File file = new File("F://TestData.xlsx");
		FileInputStream iFile = new FileInputStream(file);
		 
		XSSFWorkbook wb = new XSSFWorkbook(iFile);
		XSSFSheet sheet = wb.getSheet("Product");

		int rowCount = 1;
		String Name = sheet.getRow(1).getCell(10).getStringCellValue();
		driver.findElement(By.xpath(".//*[@id='btncreate']")).click();
	Thread.sleep(2000);
	Product_ScreenShots.CaptureScreenshot(driver);
	
	
	  driver.findElement(By.xpath(".//*[@id='BaseProduct_NameCode']")).sendKeys(Name);
	  Product_ScreenShots.CaptureScreenshot(driver);
		String Description = sheet.getRow(1).getCell(10).getStringCellValue();

	  driver.findElement(By.xpath(".//*[@id='BaseProduct_NumDesc']")).sendKeys(Description);
	  Product_ScreenShots.CaptureScreenshot(driver);
	  driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/div[3]/div/span[1]/span/span[1]")).click();
      Thread.sleep(3000);
      Product_ScreenShots.CaptureScreenshot(driver);
      int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
      Product_ScreenShots.CaptureScreenshot(driver);
      
      String Product_Category_Input = sheet.getRow(1).getCell(12).getStringCellValue();
      driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Product_Category_Input);
      Thread.sleep(6000);
      Product_ScreenShots.CaptureScreenshot(driver);
      
      driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
      Thread.sleep(6000);
      Product_ScreenShots.CaptureScreenshot(driver);
      
      driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/div[4]/div/span[1]/span/span[2]/span")).click();
      Thread.sleep(6000);
      Product_ScreenShots.CaptureScreenshot(driver);
      
      int ok_size1=driver.findElements(By.xpath(".//li[@class='k-item'][@data-offset-index='0'][contains(text(),'BARREL')]")).size();
      Thread.sleep(6000);
      driver.findElements(By.xpath(".//li[@class='k-item'][@data-offset-index='0'][contains(text(),'BARREL')]")).get(ok_size1-1).click();
      Thread.sleep(6000);
      Product_ScreenShots.CaptureScreenshot(driver);
      /*
      driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
      Thread.sleep(9000);
      Product_ScreenShots.CaptureScreenshot(driver);
      
      
      
      driver.findElement(By.xpath(".//li[@class='k-item'][@data-offset-index='0'][contains(text(),'Gallons')]")).click();
      Product_ScreenShots.CaptureScreenshot(driver);
      */



			 Thread.sleep(3000);
  driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[2]/div[4]/div/span[1]/span/span[2]/span")).click();
          Thread.sleep(3000);
          Product_ScreenShots.CaptureScreenshot(driver);
          driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a")).click();
          Thread.sleep(3000);
          Product_ScreenShots.CaptureScreenshot(driver);
          driver.findElement(By.xpath(".//*[@id='SoldAsProductsGrid']/div[2]/table/tbody/tr[1]/td[1]/input")).click();
          Thread.sleep(2000);
          Product_ScreenShots.CaptureScreenshot(driver);
          driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).submit();
          Thread.sleep(3000);
          Product_ScreenShots.CaptureScreenshot(driver);
          
          WebElement ExistingMessage = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p"));
          
          
          if(ExistingMessage.isDisplayed())
          {
        	  System.out.println(ExistingMessage.getText());
        	  
        	   Product_ScreenShots.CaptureScreenshot(driver);
        	  driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
        	  
        	   Product_ScreenShots.CaptureScreenshot(driver);  
          }
          
          
          Thread.sleep(3000);
          
          Product_ScreenShots.CaptureScreenshot(driver);
          
          
         WebElement UpDateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
          if( UpDateMessage .isDisplayed())
{
        	  Product_ScreenShots.CaptureScreenshot(driver);
            	System.out.println(UpDateMessage.getText());
}
          
          
          
          
          
          
          
          
}
	
}
