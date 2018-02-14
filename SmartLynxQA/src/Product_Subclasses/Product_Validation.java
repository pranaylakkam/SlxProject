package Product_Subclasses;

import javax.swing.plaf.basic.BasicTreeUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.ExcelUtils;



 public class Product_Validation {

    private static WebElement element = null;
    private static MouseHandler mouse= null;
    private static WebElement button= null;
    private static WebElement Search=null;
    private static WebElement Name = null;
    private static WebElement ErrorMessageName =null;
    private static WebElement Description = null; 
    private static WebElement ErrormessageDescription =null;
    private static WebElement ProductCategorydropdown = null;
    private static WebElement ProductCategoryinput = null;
    private static WebElement EpaDisclamier = null;
    private static WebElement HazmatMessageDropDown =null;
    private static WebElement ProductSoldAs = null;
    private static WebElement checkbox =null;
    private static WebElement submit =null;
    private static WebElement Errormessage = null;
   private static WebElement ProductSoldAsSearchbox = null;
    private static WebElement IntialSave=null;
    private static WebElement FieldErrormesssage = null;
    private static WebElement Metercalibration = null;
    private static WebElement 	ToolTipsMessage= null;
    private static WebElement 	ProductModeSelect= null;
    private static WebElement 	ProductMode= null;
    
    public static MouseHandler mouse (WebDriver driver) throws InterruptedException{
    	
    	
    	WebElement Maintenace = driver.findElement(By.xpath("//li[2]/span"));
    	 
    	  Maintenace.click();
    	  
    	   
    	   
    	   int ok_size1=driver.findElements(By.xpath("//li[2]/span")).size();
    	   
    	   
    	   
    	   Actions action2 = new Actions(driver);
    	   
    	   Thread.sleep(5000);

    	   action2.moveToElement(driver.findElements(By.xpath("//a[contains(text(),'Product')]")).get(ok_size1-1)).click();

    	   Thread.sleep(5000);

    	   driver.findElement(By.xpath("//a[contains(text(),'Product')]")).click();
    	   
    	  
	 
	 return mouse;
	  
 }
    
    public static WebElement Search(WebDriver driver){

   	 Search = driver.findElement(By.xpath(".//*[@id='txtSearchProductGrid']"));
   	 
   	 return Search;
   	 
   	 }

    
 
 public static WebElement button(WebDriver driver){

	 button = driver.findElement(By.xpath(".//*[@id='btncreate']"));
	 
	 return button;
	 
	 }

 
 
 public static void FieldErrorMessage(WebDriver driver){
	 
	 
	 String ExpectedNameErrorMessage = "Name is required";
		String ActualNameErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_NameCode-error']")).getText();
		
		if(ExpectedNameErrorMessage.equals(ActualNameErrorMessage))
		{
			System.out.println(ActualNameErrorMessage);
		}
	 
		 String ExpectedDescriptionErrorMessage = "Description is required";
			String ActualDescriptionErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_NumDesc-error']")).getText();
			
			if(ExpectedDescriptionErrorMessage.equals(ActualDescriptionErrorMessage))
			{
				System.out.println(ActualDescriptionErrorMessage);
			}
		  
			 String ExpectedProductCategoryErrorMessage = "Product Category is required";
				String ActualProductCategoryErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_DefaultProductCategoryId-error']")).getText();
				
				if(ExpectedProductCategoryErrorMessage.equals(ActualProductCategoryErrorMessage))
				{
					System.out.println(ActualProductCategoryErrorMessage);
				}
			  		

			
		 
 }
 
 

public static void Name(WebDriver driver) throws Exception {
	// TODO Auto-generated method stub
	
WebElement	Name = driver.findElement(By.xpath(".//*[@id='BaseProduct_NameCode']"));
Name.sendKeys(ExcelUtils.getCellData(14, 4));
Thread.sleep(2000);
String ExpectedNameErrorMessage = ExcelUtils.getCellData(14, 5);
String ActualNameErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_NameCode-error']")).getText();

if(ExpectedNameErrorMessage.equals(ActualNameErrorMessage))
{
	System.out.println(ActualNameErrorMessage);
	
	ExcelUtils.setCellData(ActualNameErrorMessage, 14, 6);
	ExcelUtils.setCellData("Pass",14, 7);
	
	
}
else{
	System.out.println("Not Working");
	ExcelUtils.setCellData("Fail",14, 7);
	
	
}
Thread.sleep(2000);
WebElement NameErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_NameCode-error']"));

if(NameErrorMessage.isDisplayed())
{
	Name.clear();
	Name.sendKeys(ExcelUtils.getCellData(15, 4));
	ExcelUtils.setCellData("Pass",15, 7);
	
}else
{
	System.out.println("NotWorking");
	ExcelUtils.setCellData("Fail",15, 7);
}

}
             






public static void Description(WebDriver driver) throws Exception {
	// TODO Auto-generated method stub
	
Description =  driver.findElement(By.xpath(".//*[@id='BaseProduct_NumDesc']"));
Thread.sleep(2000);
Description.sendKeys(ExcelUtils.getCellData(16, 4));

String ExpectedDescriptionErrorMessage = ExcelUtils.getCellData(16, 5) ;
String ActualDescriptionErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_NumDesc-error']")).getText();

if(ExpectedDescriptionErrorMessage.equals(ActualDescriptionErrorMessage))
{
	System.out.println(ActualDescriptionErrorMessage);
	
	ExcelUtils.setCellData(ActualDescriptionErrorMessage, 16, 6);
	
	ExcelUtils.setCellData("Pass", 16, 7);
	
	
	
}
else
{
	
	System.out.println(ActualDescriptionErrorMessage);
	
	ExcelUtils.setCellData("Fail", 16, 7);
	
	
}

Thread.sleep(2000);
WebElement DescriptionErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_NumDesc-error']"));

if(DescriptionErrorMessage.isDisplayed())
{
	Description.clear();
	Description.sendKeys(ExcelUtils.getCellData(17, 4));
	System.out.println("data for Description  instered");
	
	ExcelUtils.setCellData("Pass", 17, 7);
}else{
	
	
	System.out.println("data for Description not instered");
	
	ExcelUtils.setCellData("Fail", 17, 7);
}
//return DescriptionErrorMessage;        
               
}





public static WebElement ProductCategorydropdown(WebDriver driver){
	
	ProductCategorydropdown = driver.findElement(By.xpath("//div[@id='tabProductDetails']/div/div/fieldset/div[3]/div/span/span/span[2]/span"));
	
//	WebElement input = driver.findElement(By.xpath(".//*[@id='BaseProduct_DefaultProductCategoryId-list']/span/input"));
	
	return ProductCategorydropdown;
}
public static WebElement ProductCategoryinput(WebDriver driver)
{
	
	
	ProductCategoryinput = driver.findElement(By.xpath(".//*[@id='BaseProduct_DefaultProductCategoryId-list']//following::input"));
	
	return ProductCategoryinput;
}


public static WebElement Metercalibration(WebDriver driver){

	
	Metercalibration = driver.findElement(By.xpath("//*[@id='BaseProduct_MeterCalibration']"));
	
	return Description;
	
}

public static WebElement ToolTipsMessage(WebDriver driver){
	
	ToolTipsMessage= driver.findElement(By.xpath("//*[@id='tabProductDetails']/div/div/fieldset[1]/fieldset[1]/div[1]/label/span/i"));
	return Description;
}



public static WebElement ProductMode(WebDriver driver){
	
	return ProductMode =driver.findElement(By.xpath("//*[@id='tabProductDetails']/div/div/fieldset[1]/fieldset[1]/div[2]/div/span[1]/span/span[2]/span"));
	
	
	
}

public static WebElement ProductModeSelect(WebDriver Driver){
	
	  ProductModeSelect = Driver.findElement(By.xpath("//*[@id='BaseProduct_ProductMode_listbox']/li"));
	
	 return ProductModeSelect;
}

public static WebElement HazmatMessageDropDown(WebDriver driver){
	
	HazmatMessageDropDown = driver.findElement(By.xpath("//*[@id='tabProductDetails']/div/div/fieldset[1]/fieldset[1]/div[3]/div/span[1]/span/span[2]/span"));
	
			return HazmatMessageDropDown;
}

public static WebElement EpaDisclamier(WebDriver driver){
	
 EpaDisclamier = driver.findElement(By.xpath("//*[@id='BaseProduct_EPADisclaimer']"));
	return Description;
	
}


public static void Bulk(WebDriver driver) throws Exception{
	
	  WebElement NonBulk = driver.findElement(By.xpath(".//*[@id='chkNonBulk']"));
	  
	  
	  if(NonBulk.isSelected()){
		  
		  WebElement  NonBulktype = driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/fieldset[2]/div[3]/div/span[1]/span/span[2]/span"));
		  
		  NonBulktype.click();
		  
		  WebElement  NonBulktypeSelect = driver.findElement(By.xpath(".//*[@id='BaseProduct_NonFuelTypeId_listbox']/li[2]"));
		  
		  NonBulktypeSelect.click();
		  
		  WebElement TruckMapping = driver.findElement(By.xpath("//a[contains(text(),'Product/Truck Mapping')]"));	  
		  
		  TruckMapping.click();
		  WebElement Search = driver.findElement(By.xpath(".//*[@id='TruckTypeAhead']"));
		  
		  
		  Search.sendKeys(ExcelUtils.getCellData(3, 7));
		  
		  
		  WebElement TruckCheckbox = driver.findElement(By.xpath(".//*[@id='ProductTrucksGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
		  TruckCheckbox.click();
		  
		  
		  
		  WebElement Save = driver.findElement(By.xpath(".//*[@name='btnCreate'][@type='submit']"));
		  
		  
		  Save.click();
		  
		  
		  
		  
	  }
	  
	  else
	  {
		  System.out.println("Clicking on the Product Sold as Tab");
	  }
	

		
	}
	









public static WebElement ProductSoldAs(WebDriver driver){
	
	ProductSoldAs =driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
	return ProductSoldAs;
}



public static WebElement ProductSoldAsSearchbox(WebDriver driver){
	
	ProductSoldAsSearchbox =driver.findElement(By.xpath(".//*[@id='txtSearchSoldAsProductGrid']"));
	
	ProductSoldAsSearchbox.sendKeys("ProductTest5");
	
	
	return ProductSoldAsSearchbox;
	
	
	
}



public static WebElement checkbox(WebDriver driver){
	
checkbox =driver.findElement(By.xpath(".//*[@id='SoldAsProductsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
 return checkbox;

}

public static WebElement submit(WebDriver driver){
	submit = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));	
	return submit;
	
	
}

public static void SaveMessage(WebDriver driver){
	
	
	
	
	
	WebElement SaveMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));	
	
	System.out.print(SaveMessage.getText());
	
	
	
	
	
	
	
	
	
	
	
	
}



}