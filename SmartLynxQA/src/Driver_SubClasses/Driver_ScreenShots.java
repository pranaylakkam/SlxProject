package Driver_SubClasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Driver_ScreenShots {
	
	 public static void CaptureScreenshot(WebDriver driver){
		  
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  try{
		   
		   FileUtils.copyFile(src, new File("C://Users//kode18//workspace//SmartLynxQa//Driver//"+System.currentTimeMillis()+".png"));
		  }
		  catch (IOException e) {
		   
		   System.out.println(e.getMessage());
		  }
		  
		  
		  
		  
		 }

}
