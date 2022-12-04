package com.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.utilites.CommonUtils;
import com.webdriver_manager.Driver_Manger;

import io.cucumber.java.Before;

public class Common_Step_Defintions {


	private static final Logger LOGGER = LogManager.getLogger(Common_Step_Defintions.class);

	@Before
	public void beforeScenario() {

		LOGGER.info("Execuation Started");
		try {
			LOGGER.info("Instantiation the commonutils");

			CommonUtils commonUtils = new CommonUtils();
			LOGGER.info("Loading the properties file");

			commonUtils.loadProperties();

			LOGGER.info("Checking the driver is null or not");

			if(Driver_Manger.getDriver()==null) {

				LOGGER.info("Instantiation the null");

				Driver_Manger.lanchbrowser();
				commonUtils.initWebElements();
			}
		}
	
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	}

