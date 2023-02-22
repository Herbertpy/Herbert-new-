package org.framework;

import java.awt.AWTException;
import java.io.IOException;

public class AdactinExecutionPage extends BaseCodes {
	
	public static void main(String[] args) throws AWTException, IOException {
		driverLaunch("https://adactinhotelapp.com/");
		maximizeMethod();
		implicitwait(30);
		
		AdactinloginPagePom login = new AdactinloginPagePom();
		login.loginPgData();
	}

}
