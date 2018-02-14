package Trailer_SubClasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Trailer_ScreenShots {

	
	

	
	 
	 public static void CaptureScreenshot(WebDriver driver){
	  
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  try{
	   
	   FileUtils.copyFile(src, new File("F://SmartLynxQA_Automation//SmartLynxQA//ScreenShots//Trailer//"+System.currentTimeMillis()+".png"));
	  }
	  catch (IOException e) {
	   
	   System.out.println(e.getMessage());
	  }
	  
	  
	  
	  
	 }
	 
	 
	 

	}	



