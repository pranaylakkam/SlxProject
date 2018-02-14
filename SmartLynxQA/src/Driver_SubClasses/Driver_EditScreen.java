package Driver_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class Driver_EditScreen {
	
private static WebElement  Edit_Button= null;
	
	private static WebElement EditDriver_Name= null;
	private static WebElement EditDriver_Password= null;
	private static WebElement EditDriver_HomePhone= null;
	private static WebElement EditDriver_Moblie= null;
	private static WebElement EditDriver_Cost= null;
	private static WebElement EditDriver_Email= null;
	private static WebElement EditTerminalMapping_Tab= null;
	private static WebElement EditTerminalMapping_Expand = null;
	private static WebElement  EditTerminalMapping_Access= null;
	private static WebElement EditTerminalMapping_Collapse= null;
	private static WebElement EditRegionMapping_Tab= null;
	private static WebElement  EditRegionMapping_Checkbox = null;
	private static WebElement Update_button = null;
	private static WebElement Update_Message = null;

	
	
	 public static WebElement Edit_Button(WebDriver driver) throws Exception{

		 Edit_Button = driver.findElement(By.xpath(".//*[@id='DriverGrid']/div[2]/table/tbody/tr[1]/td[4]/a"));
		 ExcelUtils.setCellData("Pass",32, 7);
		 return Edit_Button;
	 }
		 
		
	 	
	 public static WebElement EditDriver_Name(WebDriver driver) throws Exception{

		 EditDriver_Name = driver.findElement(By.xpath(".//*[@id='BaseDriver_Name']"));
		
		 ExcelUtils.setCellData("Pass",33, 7);
		 
		 
		 return EditDriver_Name;
		 
		 } 	 
	
 
	 
	 public static WebElement EditDriver_HomePhone(WebDriver driver)throws Exception{

		 EditDriver_HomePhone = driver.findElement(By.xpath(".//*[@id='BaseDriver_HomePhone']"));
		 ExcelUtils.setCellData("Pass",34, 7);
		 return EditDriver_HomePhone;
		 
		 } 	 
	 
	 
	 public static WebElement EditDriver_Moblie(WebDriver driver)throws Exception{

		 EditDriver_Moblie = driver.findElement(By.xpath(".//*[@id='BaseDriver_CellPhone']"));
		 ExcelUtils.setCellData("Pass",36, 7);
		 return EditDriver_Moblie;
		 
		 } 	 
	 

	 public static WebElement EditDriver_Cost(WebDriver driver) throws Exception{

		 EditDriver_Cost = driver.findElement(By.xpath(".//*[@id='BaseDriver_CostPerHour']"));
		 ExcelUtils.setCellData("Pass",37, 7);
		 return EditDriver_Cost;
		 
		 } 	 
	 
	 public static WebElement EditDriver_Email(WebDriver driver) throws Exception {

		 EditDriver_Email = driver.findElement(By.xpath(".//*[@id='BaseDriver_Email']"));
		 ExcelUtils.setCellData("Pass",37, 7);
		 return EditDriver_Email;
		 
		 } 	 
	 
	 
	 public static WebElement EditTerminalMapping_Tab(WebDriver driver) throws Exception{

		 EditTerminalMapping_Tab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
		 ExcelUtils.setCellData("Pass",38, 7);
		 return EditTerminalMapping_Tab;
		 
		 } 	 
	 
	 
	 public static WebElement EditTerminalMapping_Expand(WebDriver driver) throws Exception{

		 EditTerminalMapping_Expand = driver.findElement(By.xpath(".//*[@id='btnExpandCollpseTerminals']"));
		 ExcelUtils.setCellData("Pass",39, 7);
		 return EditTerminalMapping_Expand;
		 
		 } 	 
	 
	 
	 public static WebElement EditTerminalMapping_Access(WebDriver driver) throws Exception{

		 EditTerminalMapping_Access = driver.findElement(By.xpath(".//span[@class = 'k-checkbox']/input[@value='1036']"));
		 ExcelUtils.setCellData("Pass",40, 7);
		 return EditTerminalMapping_Access;
		 
		 } 	 
	 
	 
	 public static WebElement EditTerminalMapping_Collapse(WebDriver driver) throws Exception{

		 EditTerminalMapping_Collapse = driver.findElement(By.xpath(".//*[@id='btnExpandCollpseTerminals']"));
		 ExcelUtils.setCellData("Pass",41, 7);
		 return EditTerminalMapping_Collapse;
		 
		 } 	 
	 
	 
	 public static WebElement EditRegionMapping_Tab(WebDriver driver) throws Exception{

		 EditRegionMapping_Tab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[3]/a"));
		 ExcelUtils.setCellData("Pass",42, 7);
		 return EditRegionMapping_Tab;
		 
		 } 	 
	 
	 public static WebElement EditRegionMapping_Checkbox(WebDriver driver)throws Exception{

		 EditRegionMapping_Checkbox = driver.findElement(By.xpath(".//*[@id='RegionDriversGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
		 ExcelUtils.setCellData("Pass",43, 7);
		 return EditRegionMapping_Checkbox;
		 
		 } 	 	 
	 
	 public static WebElement Update_button(WebDriver driver)throws Exception{

		 Update_button = driver.findElement(By.xpath(".//*[@id='btnUpdate']"));
		 ExcelUtils.setCellData("Pass",44, 7);
		 return Update_button;
		 
		 } 	 	 
	 
	 public static WebElement Update_Message(WebDriver driver)throws Exception{

		 Update_Message = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 ExcelUtils.setCellData("Pass",46, 7);
		 System.out.print(Update_Message.getText());
		 ExcelUtils.setCellData(Update_Message.getText(),47, 6);
		 return Update_Message;
		 
		 } 	 	 
	 	 

}
