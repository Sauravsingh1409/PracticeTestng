package com.Gaya.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	@Test
	 public void TestGoogle() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorial", Keys.ENTER);
		String expectedTitle = "HYR Tutorials - Google Search";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(5000);		
		driver.quit();
	 }
	@Test
	 public void TestFacebook() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("HYR Tutorial", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		driver.quit();
	 }
}
