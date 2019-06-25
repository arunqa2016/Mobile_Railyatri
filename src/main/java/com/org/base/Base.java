package com.org.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static DesiredCapabilities caps;
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static Properties prop;
	private String propPath = "C:\\Users\\HP\\eclipse-workspace\\RailyatriMobileweb\\src\\main\\java\\com\\org\\config\\Config.properties";
	public static String reportLocation = "E:\\Railyatri_MobileWeb_Report.html";
	
	public Base() {
		
		FileInputStream file;
		try {
			file = new FileInputStream(propPath);
			prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@BeforeSuite
	public static void setup() throws MalformedURLException {
		
		caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		caps.setCapability(MobileCapabilityType.UDID, "5203828d4c3cc305");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SamsungGalaxy");	
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability("autoGrandPermissions", true);

		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
			
		driver.get(prop.getProperty("url"));
		extent = new ExtentReports(reportLocation);
		
	}
	
	@AfterSuite
	public static void tearDown() {
		extent.endTest(logger);
		extent.flush();
		driver.get(reportLocation);
	}
	
}
