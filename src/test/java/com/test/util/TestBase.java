package com.test.util;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		prop= new Properties();
		
		FileInputStream file;
		try {
			file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\test\\config\\config.properties");
			
		prop.load(file);
	} catch (IOException e) {
	e.printStackTrace();
	}
		
	}

	public void initialize() {
		String Browser = prop.getProperty("browser");
		
		if(Browser .equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Util.page_Load_Timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.implicitly_Wait, TimeUnit.SECONDS);
		
	}
		else if (Browser .equals("FF")) {
			
			
			
		}
		
		
}
	public static void geturl(String URL) {
		
		driver.get(prop.getProperty("url"));
}
}