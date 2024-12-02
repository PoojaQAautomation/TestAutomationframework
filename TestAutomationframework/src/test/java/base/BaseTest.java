package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties locatorsobj = new Properties();// it read the locators file
	public static FileReader fr;
	public static FileReader locatorfr; // it is object creation of readfile

	@BeforeMethod
	public void setUp() throws IOException {
		if(driver == null){
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			FileReader locatorfr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			prop.load(fr);
			locatorsobj.load(locatorfr); // it load all the locators which are exist in locators.properties
			
			
			}
		
		if(prop.getProperty("Browser").equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup(); // base
		driver = new ChromeDriver();  // base
		driver.get(prop.getProperty("TestUrl"));  // properties
		}
		
	   else if (prop.getProperty("Browser").equalsIgnoreCase("firefox")){
		WebDriverManager.firefoxdriver().setup(); // base
		driver = new FirefoxDriver();
		driver.get(prop.getProperty("TestUrl")); //properties
	   }
		
	   }
	@AfterMethod

	public void tearDrown() {
		driver.close();
		System.out.println("tearDrown successfully");
		
	}

	}


