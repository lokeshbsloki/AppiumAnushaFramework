package com.app.androidapp.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import com.app.androidapp.init.Constants;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MobileActionUtil {
	
	/**
	 * Description: This method is to long press on element upto 3 seconds then
	 * release
	 */
	public static void LongPressAction(AndroidDriver driver, WebElement element) throws IOException {

		try {
			TouchAction act1 = new TouchAction(driver);
			act1.longPress(element).waitAction(3000).release().perform();
		} catch (Exception e) {

		}
	}

	/**
	 * Description: Scroll to an Element
	 */
		public static void scrollToElement(AndroidDriver driver,String an,String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
	
	
	public static void tapOnElement(WebElement element, AndroidDriver driver)  {
		TouchAction act1 = new TouchAction(driver);
		act1.press(element).release().perform();
	}
		
	/**
	 * Description: this method Takes ScreenShots
	 * 
	 */
	public static String capture(AndroidDriver driver, String screenShotName) throws IOException {
		File source = driver.getScreenshotAs(OutputType.FILE);
		String dest = Constants.screenShotPath + screenShotName + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		return dest;
	}
	
	
	/**
	 * Description: this method hides keyboard
	 *
	 */
	public static void hideKeyboard(AndroidDriver driver) {
		try {
			driver.hideKeyboard();
			Thread.sleep(2000);
		} catch (Throwable e) {

		}
	}
	
	
	
	/**
	 * Description: Fetch text from element and return as string
	 * 
	 */

	public static String getText(WebElement elename, AndroidDriver driver, String elementName) {
		return elename.getText();
	}
	
	/**
	 * 
	 * Description: This method to scroll left side based on device height and
	 * width
	 */

	public static void swipeRightToLeft(int value, double startX, double endX, AndroidDriver driver) throws Exception {
		try {
			Thread.sleep(1000);
			System.out.println("inside swipe");
			for (int i = 1; i <= value; i++) {
				Dimension dSize = driver.manage().window().getSize();
				int startx = (int) (dSize.width * startX);
				int endx = (int) (dSize.width * endX);
				int starty = dSize.height / 2;
				driver.swipe(startx, starty, endx, starty, 1000);

			}
		} catch (Exception e) {

		}
	}
}