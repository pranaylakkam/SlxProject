package FuelLocation_SubClasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class FuelLocation_ScreenShots {
	
	public static void CaptureScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  try{
		   
		   FileUtils.copyFile(src, new File("C://Users//kode18//workspace//SmartLynxQa//FuelLocation//"+System.currentTimeMillis()+".png"));
		  }
		  catch (IOException e) {
		   
		   System.out.println(e.getMessage());
		  }
		  
	}

}
