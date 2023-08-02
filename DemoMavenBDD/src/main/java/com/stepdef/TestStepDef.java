package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDef {
	WebDriver driver = null;
	@Given("^User should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
     
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Users/Offline%20Website/index.html");
		
}
	@When("^User enter valid credential$")
	public void user_enter_valid_credential() throws Throwable {

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
}
	@Then("^User should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
		Assert.assertEquals("JavaByKiran | Dashboard ", driver.getTitle());
}
	@Then("^User see JBK logo$")
	public void user_see_JBK_logo() throws Throwable {
		
		WebElement logo = driver.findElement(By.tagName("img"));
		Assert.assertTrue(logo.isDisplayed());
		
		
		
		

}
}