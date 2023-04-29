package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InmakesLoginPojo extends BaseClass {
	
	//1.Non parameterized constructor
	//className as methodName
	
	public InmakesLoginPojo() {
		PageFactory.initElements(driver, this);//this keyword it represent the current class variables
	}

	//2.Private Web elements
	//webElement email = driver.findElement(By.id("email"))---->Actual find Web element
	// @FindBy Annotations
	@FindBy(id = "username")
	private WebElement email;
	
	@FindBy(name = "password")
	private WebElement passWord;
	
	@FindBy(id = "loginBtn")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail1() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getPassWord1() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getLogin1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
