package com.krn.actitime.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.krn.actitime.pageclass.TaskPage;

public class BaseClass {
	public WebDriver driver;
	public ExcellLibrary xlib;
	public TaskPage taskpage;

	@BeforeClass
	public void openBrower() {
		System.setProperty("webdriver.chrome.driver","/home/skombettu/Desktop/Batch155/Batch155/Project/Jars/chromedriver_linux64/chromedriver");
		xlib = new ExcellLibrary();
		taskpage = new TaskPage();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Checkpoint
		String expectedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@BeforeMethod
	public void login() {
		String un = xlib.getExcellData("login", 1, 0);
		String pw = xlib.getExcellData("login", 1, 1);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.id("loginButton")).click();
	}

	@AfterMethod
	public void loginOut() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	@AfterClass
	public void closeBrower() {
		driver.close();
	}
}
