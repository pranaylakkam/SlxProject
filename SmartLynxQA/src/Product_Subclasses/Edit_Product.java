package Product_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Edit_Product {

	
	
	  private static WebElement Editbutton = null;
	
	  
	    private static WebElement EditDescription = null; 
	    private static WebElement EditProductCategorydropdown = null;
	    private static WebElement EditProductCategoryinput = null;
	    private static WebElement EditUnitOfMeasuresselect = null;
	    private static WebElement EditUnitOfMeasuresselectone=null;
	    private static WebElement EditProductSoldAs = null;
	    private static WebElement Editcheckbox =null;
	    private static WebElement Update =null;
	    private static WebElement EditProductSoldAsSearchbox = null;
	    private static WebElement UpdateMessage =null;
	  public static WebElement Editbutton(WebDriver driver){

			 Editbutton = driver.findElement(By.xpath("//*[@id='ProductGrid']/div[2]/table/tbody/tr[1]/td[5]/a"));
			 
			 return Editbutton;
			 
			 }
	  
	  

		public static WebElement EditDescription(WebDriver driver) {
			// TODO Auto-generated method stub
			
			    EditDescription =  driver.findElement(By.xpath("//*[@id='BaseProduct_NumDesc']"));
		        return EditDescription;
		}

		public static WebElement EditProductCategorydropdown(WebDriver driver){
			
			EditProductCategorydropdown = driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/div[3]/div/span[1]/span/span[1]"));
			
//			WebElement input = driver.findElement(By.xpath(".//*[@id='BaseProduct_DefaultProductCategoryId-list']/span/input"));
			
			return EditProductCategorydropdown;
		}
		public static WebElement  EditProductCategoryinput(WebDriver driver) throws InterruptedException
		{
			
			 Product_ScreenShots.CaptureScreenshot(driver);
			 int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
			  Product_ScreenShots.CaptureScreenshot(driver);
             driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys("DIESELS");
             Thread.sleep(6000);
              Product_ScreenShots.CaptureScreenshot(driver);
             driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
              Product_ScreenShots.CaptureScreenshot(driver);
             
             
            
             
                
                Thread.sleep(3000);
			
			return  EditProductCategoryinput;
		}
		public static WebElement EditUnitOfMeasuresselect(WebDriver driver){
			
			EditUnitOfMeasuresselect = driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/div[4]/div/span[1]/span/span[2]/span"));
			return EditUnitOfMeasuresselect;
		}

		public static WebElement EditUnitOfMeasuresselectone(WebDriver driver){
			
			EditUnitOfMeasuresselectone = driver.findElement(By.xpath("//li[@class='k-item'][@data-offset-index='0'][contains(text(),'Gallons')]"));
			return EditUnitOfMeasuresselectone;
		}
		public static WebElement EditProductSoldAs(WebDriver driver){
			
			EditProductSoldAs =driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
			return EditProductSoldAs;
		}
		
		
		public static WebElement EditProductSoldAsSearchbox(WebDriver driver){
			
			EditProductSoldAsSearchbox =driver.findElement(By.xpath(".//*[@id='txtSearchSoldAsProductGrid']"));
			
			EditProductSoldAsSearchbox.sendKeys("ProductTest6");
			
			
			return EditProductSoldAsSearchbox;
			
			
			
		}
		public static WebElement Editcheckbox(WebDriver driver){
			
			Editcheckbox =driver.findElement(By.xpath("//*[@id='SoldAsProductsGrid']/div[2]/table/tbody/tr[2]/td[1]/input"));
		 return Editcheckbox;

		}

		public static WebElement Update(WebDriver driver){
			Update = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
			return Update;
			
		}
		
		public static void UpdateMessage(WebDriver driver){
		WebElement	UpdateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
			
		System.out.print(UpdateMessage.getText());
			
		}
		
		
		
		
		
		
		
}
