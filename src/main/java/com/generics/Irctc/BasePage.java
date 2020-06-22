package com.generics.Irctc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
 public void selectByVisibleText(WebElement element, String text)
 {
	 Select sec = new Select(element);
	 sec.selectByVisibleText(text);
	 
 }
 
 public void Value(WebElement element, String text)
 {
	 Select sec = new Select(element);
	 sec.selectByValue(text);
	 
 }

 public void index(WebElement element, int index)
 {
	 Select sec = new Select(element);
	 sec.selectByIndex(index);
	
	
	 
 }
}
