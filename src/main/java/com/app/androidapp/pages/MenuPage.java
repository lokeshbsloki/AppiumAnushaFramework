package com.app.androidapp.pages;

import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MenuPage {

	AndroidDriver driver;
	
	public MenuPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(uiAutomator="text(\"T-shirts\")")
	private MobileElement tshirts;

	public MobileElement getTshirts() {
		return tshirts;
	}
	
	public void tapOnTshirts() {
		tshirts.click();
	}
}
