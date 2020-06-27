package com.krn.actitime.task;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.krn.actitime.baseclass.BaseClass;

public class DeleteCustomer extends BaseClass{
	@Test
	public void deleteCustomer() throws InterruptedException {
		taskpage.clickOnTaskTab(driver);
		String custName = xlib.getExcellData("deleteCustomer", 1, 0);
		driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]")).sendKeys(custName);
		// driver.findElement(By.xpath("//span[text()='SUJITH']")).click();
		// driver.findElement(By.xpath("//span[text()='SUJITH' and
		// @class='highlightToken']/../../..//div[@class='editButton']")).click();
		driver.findElement(By.xpath("//span[text()='" + custName + "']")).click();
		driver.findElement(By.xpath("//span[text()='" + custName + "' and @class='highlightToken']/../../..//div[@class='editButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='Delete'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		Thread.sleep(2000);

	}
}
