package com.krn.actitime.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskPage {
	//@FindBy(xpath="//a[@href='/tasks/tasklist.do']")
		//WebElement taskTab;
		
		//@FindBy(xpath="//div[text()='Add New']")
		//WebElement addNew;
		
		public void clickOnTaskTab(WebDriver driver) {
			driver.findElement(By.xpath("//a[@href='/tasks/tasklist.do']")).click();
			//taskTab.click();
		}

		public void clickOnAddNew(WebDriver driver) {
			driver.findElement(By.xpath("//div[text()='Add New']")).click();
			//addNew.click();
		}
}
