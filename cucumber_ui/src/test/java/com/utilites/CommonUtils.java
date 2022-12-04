package com.utilites;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.constants.Constants;
import com.page_objects.LoginPage;
import com.webdriver_manager.Driver_Manger;

public class CommonUtils {

	public void loadProperties(){


		Properties properties = new Properties();

		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		Constants.url =	properties.getProperty("url");
		Constants.browser =	properties.getProperty("browser");
		Constants.username = properties.getProperty("username");
		Constants.password 	=properties.getProperty("password");
		Constants.chrome_driver_location =properties.getProperty("chrome_driver_location");
		Constants.firefox_driver_location=properties.getProperty("firefox_driver_location");


	}
	
	public void initWebElements() {
		PageFactory.initElements(Driver_Manger.getDriver(), LoginPage.class);
	}

}
