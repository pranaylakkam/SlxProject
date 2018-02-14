package Driver_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.ExcelUtils;


public class Driver_Validation {

	
	private static WebElement Search=null;
	private static WebElement Create_Newbutton= null;
	private static WebElement ErrorMessage = null;
	private static WebElement Driver_ID= null;
	private static WebElement Driver_Name= null;
	private static WebElement Driver_Password= null;
	private static WebElement Driver_HomePhone= null;
	private static WebElement Driver_Moblie= null;
	private static WebElement Driver_Cost= null;
	private static WebElement Driver_Email= null;
	private static WebElement TerminalMapping_Tab= null;
	private static WebElement TerminalMapping_Expand = null;
	private static WebElement  TerminalMapping_Access= null;
	private static WebElement TerminalMapping_Collapse= null;
	private static WebElement RegionMapping_Tab= null;
	private static WebElement  RegionMapping_Checkbox = null;
	private static WebElement Save_Button= null;
	private static WebElement Save_Message = null;
	
	
	
	
	public static void mouse (WebDriver driver) throws Exception{
		 driver.findElement(By.cssSelector("#main > div.page-header.navbar.navbar-fixed-top.slHeadFoot > div > div.page-logo > a > img")).click();

		Driver_ScreenShots.CaptureScreenshot(driver);
		 
		 WebElement element = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[2]/div/div/ul/li[1]/a"));
		Driver_ScreenShots.CaptureScreenshot(driver);
		 Actions action = new Actions(driver);
		 ExcelUtils.setCellData("Pass",5, 7);
		 action.moveToElement(element).moveToElement(driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[2]/div/div/ul/li[1]/ul/li[10]/a"))).click().build().perform();
		Driver_ScreenShots.CaptureScreenshot(driver);
		 driver.manage().window().maximize();
		
	  
	 }
	
	
	
	 public static WebElement Search(WebDriver driver) throws Exception{

	   	 Search = driver.findElement(By.xpath(".//*[@id='txtSearchDriverGrid']"));
	   	ExcelUtils.setCellData("Pass",6, 7);
	   	 return Search;
	   	 
	   	 }

	
	 public static WebElement Create_Newbutton(WebDriver driver) throws Exception{

		 Create_Newbutton = driver.findElement(By.xpath(".//*[@id='btncreate']"));
		 ExcelUtils.setCellData("Pass",8, 7);
		 return Create_Newbutton;
		 
		 }
	 

	 
	 
	 public static void ErrorMessage(WebDriver driver) throws Exception{

		// ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseDriver_UserCode']"));
		 
		 String ExpectedIdErrorMessage = "ID is required";
		 String ActualIdErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseDriver_UserCode-error']")).getText();
			
			if(ExpectedIdErrorMessage.equals(ActualIdErrorMessage))
			{
				System.out.println(ActualIdErrorMessage);
				ExcelUtils.setCellData(ActualIdErrorMessage,10, 6);
				ExcelUtils.setCellData("Pass",10, 7);
				
				
			}
		 
			String ExpectedNameErrorMessage = "Name is required";
			String ActualNameErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseDriver_Name-error']")).getText();
			
			if(ExpectedNameErrorMessage.equals(ActualNameErrorMessage))
			{
				System.out.println(ActualNameErrorMessage);
				ExcelUtils.setCellData(ActualNameErrorMessage,11, 6);
				ExcelUtils.setCellData("Pass",11, 7);
			}
		 
		 
			String ExpectedPasswordErrorMessage = "Password is required";
			String ActualPasswordErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseDriver_Password-error']")).getText();
			
			if(ExpectedPasswordErrorMessage.equals(ActualPasswordErrorMessage))
			{
				System.out.println(ActualPasswordErrorMessage);
				ExcelUtils.setCellData(ActualPasswordErrorMessage,12, 6);
				ExcelUtils.setCellData("Pass",12, 7);
			}
		 
		 } 
	 
	 
	 
	 
	 
	 public static WebElement Driver_ID(WebDriver driver) throws Exception{

		 Driver_ID = driver.findElement(By.xpath(".//*[@id='BaseDriver_UserCode']"));
		 ExcelUtils.setCellData("Pass",13, 7);
		 return Driver_ID;
		 
		 } 
	 	
	 public static void Driver_Name(WebDriver driver) throws Exception{

		 Driver_Name = driver.findElement(By.xpath(".//*[@id='BaseDriver_Name']"));
		 String Driver1 =  ExcelUtils.getCellData(14, 4);
		 String Driver2 =ExcelUtils.getCellData(15, 4);
		 
		 Driver_Name.sendKeys(Driver1);
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 Driver_Name.sendKeys(Keys.TAB);
		 Thread.sleep(3000);
		Driver_ScreenShots.CaptureScreenshot(driver);
		 WebElement NameError= driver.findElement(By.xpath("//*[@id='BaseDriver_Name-error']"));
		 System.out.println( NameError.getText());
		 ExcelUtils.setCellData(NameError.getText(),14, 6);
		 ExcelUtils.setCellData("Pass",14, 7);
		 
		 
		 
		Driver_ScreenShots.CaptureScreenshot(driver);
		 if(NameError.isDisplayed())
		 { Thread.sleep(3000);
		Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_Name.clear();
			 Thread.sleep(2000);
			 
			 
			Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_Name.sendKeys( Driver2 );
			 
			 ExcelUtils.setCellData("Pass",15, 7);
		 }
		 
		
		 
		 } 	 
	

	 public static WebElement Driver_Password(WebDriver driver) throws Exception{

		 Driver_Password = driver.findElement(By.xpath(".//*[@id='BaseDriver_Password']"));
		 ExcelUtils.setCellData("Pass",16, 7);
		 return Driver_Password;
		 
		 } 	 
	 
	 public static WebElement Driver_HomePhone(WebDriver driver) throws Exception{

		 Driver_HomePhone = driver.findElement(By.xpath(".//*[@id='BaseDriver_HomePhone']"));
		 ExcelUtils.setCellData("Pass",17, 7);
		 return Driver_HomePhone;
		 
		 } 	 
	 
	 
	 public static WebElement Driver_Moblie(WebDriver driver) throws Exception{

		 Driver_Moblie = driver.findElement(By.xpath(".//*[@id='BaseDriver_CellPhone']"));
		 ExcelUtils.setCellData("Pass",18, 7);
		 return Driver_Moblie;
		 
		 } 	 
	 

	 public static WebElement Driver_Cost(WebDriver driver) throws Exception{

		 Driver_Cost = driver.findElement(By.xpath(".//*[@id='BaseDriver_CostPerHour']"));
		 ExcelUtils.setCellData("Pass",19, 7);
		 return Driver_Cost;
		 
		 } 	 
	 
	 public static WebElement Driver_Email(WebDriver driver) throws Exception{
		Driver_ScreenShots.CaptureScreenshot(driver);
		 Driver_Email = driver.findElement(By.xpath(".//*[@id='BaseDriver_Email']"));
		Driver_ScreenShots.CaptureScreenshot(driver);
	String DriverEmail = 	ExcelUtils.getCellData(20, 4);
	String DriverEmail1 = 	ExcelUtils.getCellData(21, 4);
		
		 Driver_Email.sendKeys(DriverEmail );
		 
		 ExcelUtils.setCellData("Pass",20, 7);
		Driver_ScreenShots.CaptureScreenshot(driver);
		 Driver_Email.sendKeys(Keys.TAB);
		 Thread.sleep(3000);
		 String EmailError =ExcelUtils.getCellData(20, 5);
		String EmailErrorMessage = driver.findElement(By.xpath("//*[@id='BaseDriver_Email-error']")).getText();
		 System.out.println(EmailErrorMessage);
		 ExcelUtils.setCellData(EmailErrorMessage,20, 6);
		
		 
		 
		Driver_ScreenShots.CaptureScreenshot(driver);
		 if(EmailErrorMessage.equals(EmailError))
		 {
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 Thread.sleep(6000);
			Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_Email.clear();
			Driver_ScreenShots.CaptureScreenshot(driver);
			 Driver_Email.sendKeys(DriverEmail1);
			 ExcelUtils.setCellData("Pass",21, 7);
			Driver_ScreenShots.CaptureScreenshot(driver);
			 
		 }
		 
		 
		 return Driver_Email;
		 
		 } 	 
	 
	 
	 public static WebElement TerminalMapping_Tab(WebDriver driver) throws Exception{

		 TerminalMapping_Tab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
		 ExcelUtils.setCellData("Pass",22, 7);
		 return TerminalMapping_Tab;
		 
		 } 	 
	 
	 
	 public static WebElement TerminalMapping_Expand(WebDriver driver) throws Exception{

		 TerminalMapping_Expand = driver.findElement(By.xpath(".//*[@id='btnExpandCollpseTerminals']"));
		 ExcelUtils.setCellData("Pass",23, 7);
		 return TerminalMapping_Expand;
		 
		 } 	 
	 
	 
	 public static WebElement TerminalMapping_Access(WebDriver driver) throws Exception{

		 TerminalMapping_Access = driver.findElement(By.xpath(".//span[@class = 'k-checkbox']/input[@value='2327']"));
		 ExcelUtils.setCellData("Pass",24, 7);
		 return TerminalMapping_Access;
		 
		 } 	 
	 
	 
	 public static WebElement TerminalMapping_Collapse(WebDriver driver) throws Exception{

		 TerminalMapping_Collapse = driver.findElement(By.xpath(".//*[@id='btnExpandCollpseTerminals']"));
		 ExcelUtils.setCellData("Pass",26, 7);
		 return TerminalMapping_Collapse;
		 
		 } 	 
	 
	 
	 public static WebElement RegionMapping_Tab(WebDriver driver) throws Exception{

		 RegionMapping_Tab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[3]/a"));
		 ExcelUtils.setCellData("Pass",27, 7);
		 return RegionMapping_Tab;
		 
		 } 	 
	 
	 public static WebElement RegionMapping_Checkbox(WebDriver driver) throws Exception{

		 RegionMapping_Checkbox = driver.findElement(By.xpath(".//*[@id='RegionDriversGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
		 ExcelUtils.setCellData("Pass",27, 7);
		 return RegionMapping_Checkbox;
		 
		 } 	 	 
	 public static WebElement Save_Button(WebDriver driver) throws Exception{

		 Save_Button = driver.findElement(By.xpath(".//*[@id='btnUpdate']"));
		 ExcelUtils.setCellData("Pass",29, 7);
		 return Save_Button;
		 
		 } 	 
	 
	 
	 public static void Save_Message(WebDriver driver) throws Exception{

		 Save_Message = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 
		 if(Save_Message.isDisplayed())
		 { 
			 
			 ExcelUtils.setCellData(Save_Message.getText(),30, 6);
		    ExcelUtils.setCellData("Pass",30, 7);
			 
			 System.out.println(Save_Message.getText());
		 }
		 
		 
		 
		
		 
		 } 	 
	 
	 
}
