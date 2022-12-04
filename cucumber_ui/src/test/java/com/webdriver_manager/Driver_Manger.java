package com.webdriver_manager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Manger {

	private static final Logger LOGGER = LogManager.getLogger(Driver_Manger.class);
	private static WebDriver driver=null;

	public static void lanchbrowser() {
		// TODO Auto-generated method stub
		try {
			
			switch (Constants.browser) {
			case "chrome":

				WebDriverManager.chromedriver().setup();
				LOGGER.info("Lanching" + Constants.browser);

				driver= new ChromeDriver();
				break;

			case "firefox"	:
				WebDriverManager.firefoxdriver().setup();
				LOGGER.info("Lanching" + Constants.browser);

				driver= new ChromeDriver();
				break;

			default:
				WebDriverManager.chromedriver().setup();

				driver= new ChromeDriver();
				break;
			}


		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	public static WebDriver getDriver() {
		return driver;
	}
}
