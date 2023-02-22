package org.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinloginPagePom extends BaseCodes {
	
	public AdactinloginPagePom() {
		PageFactory.initElements(driver, this);

	}

	@FindBy (id = "username")
	private WebElement userName;
	
	@FindBy (id ="password")
	private WebElement passWord;
	
	@FindBy (id ="login")
	private WebElement loginBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void loginPgData()  {
		
		sendKeysTxt(getUserName(), "Herbert8489");
		

		sendKeysTxt(getPassWord(), "Sam8489752875");
		click(getLoginBtn());
	
	}
	

}
