package com.krn.actitime.task;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.krn.actitime.baseclass.BaseClass;

public class CreateCustomer extends BaseClass{
	@Test
	public void createCustomer() throws InterruptedException {
		taskpage.clickOnTaskTab(driver);
		taskpage.clickOnAddNew(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		String custName = xlib.getExcellData("createCustomer", 1, 0);
		String description = xlib.getExcellData("createCustomer", 1, 1);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(custName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(description);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
	}

	}

