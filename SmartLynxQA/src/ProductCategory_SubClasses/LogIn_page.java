package ProductCategory_SubClasses;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class LogIn_page {

public static WebElement Element = null;

public static WebElement txtbx_UserName(WebDriver driver){

Element = driver.findElement(By.name("username"));

return Element;

}

 public static WebElement txtbx_Password(WebDriver driver){

 Element = driver.findElement(By.name("password"));

 return Element;
 }

 public static WebElement btn_LogIn(WebDriver driver){

 Element = driver.findElement(By.name("login"));

 return Element;
 
 
 
 

}

}