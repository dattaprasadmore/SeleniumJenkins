package org.pda.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleTest {

	@Test
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		//driver.findElement(By.id("q")).sendKeys("Selenium");
		Thread.sleep(1000);
		driver.quit();
	}
}