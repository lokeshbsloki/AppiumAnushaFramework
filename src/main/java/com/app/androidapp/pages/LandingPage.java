package com.app.androidapp.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.app.androidapp.util.MobileActionUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPage {
	
	AndroidDriver driver;
	
	@AndroidFindBy(accessibility = "Drawer Open")
	private MobileElement hambergerIcon;
	
	
	@AndroidFindBy(accessibility = "CATEGORIES")
	private MobileElement categories;

	public LandingPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getHambergerIcon() {
		return hambergerIcon;
	}
	
	public MobileElement getCategories() {
		return categories;
	}
	
	public MenuPage tapOnHamburgerIcon() {
		hambergerIcon.click();
		return new MenuPage(driver);
	}
	
}
