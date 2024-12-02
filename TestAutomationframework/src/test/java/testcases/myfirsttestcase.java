package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class myfirsttestcase extends BaseTest {

	@Test(dataProvider="testdata")
	public static void LoginTest(String username, String password) 
	{   
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText(locatorsobj.getProperty("Signin_link"))).click(); // locators--properties
	       // driver.findElement(By.linkText("Sign In")).click();   // locators--properties
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.findElement(By.id(locatorsobj.getProperty("Email_Field"))).sendKeys(username);
			driver.findElement(By.xpath(locatorsobj.getProperty("Next_button"))).click();  
	        driver.findElement(By.id(locatorsobj.getProperty("pwd_field"))).sendKeys(password);
	        driver.findElement(By.xpath(locatorsobj.getProperty("login_btn"))).click();
	      //System.out.println("login Successfully");  // this will go into the log files.
	        //driver.logintozoho("user", "password");
		
	}
	
	@DataProvider(name="testdata")
	public Object[][] tdata(){
		
		return new Object[][] {
			{"poojapb452@gmail.com","poojabharti@123"},
			{"poojapb42@gmail.com","poojabharti@126"},
			{"poojapb4@gmail.com","poojabharti@12"},
			{"poojapb40@gmail.com","poojabharti@1"},
			
		};
		
	}
	
	
	
}
