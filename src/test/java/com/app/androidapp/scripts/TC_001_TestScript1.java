package com.app.androidapp.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.app.android.lib.BaseLib;
import com.app.androidapp.pages.LandingPage;
import com.app.androidapp.pages.MenuPage;
import com.app.androidapp.util.MobileActionUtil;

@Listeners(com.app.androidapp.reports.ListenersClass.class)
public class TC_001_TestScript1 extends BaseLib{
	
	@Test
	public void tc_001_testOne() throws IOException, InterruptedException
	{
		LandingPage landingPage = new LandingPage(gv.driver);
		MenuPage menuPage = landingPage.tapOnHamburgerIcon();
		menuPage.tapOnTshirts();
	}
}
