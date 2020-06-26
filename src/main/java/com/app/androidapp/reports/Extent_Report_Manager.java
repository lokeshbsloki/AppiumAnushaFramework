package com.app.androidapp.reports;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.app.android.lib.BaseLib;
import com.app.androidapp.init.Constants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Report_Manager extends BaseLib {
	public static String screenShotPath;
	
/**
 * createExtentReport method to initialize the extent reports
 * @param testname
 */
	public static void createExtentReport() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		extenthtmlreporter = new ExtentHtmlReporter(new File(Constants.DirPath + "\\reports\\extent\\"+timeStamp +".html"));
		extenthtmlreporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		extenthtmlreporter.config().setChartVisibilityOnOpen(true);
		extenthtmlreporter.config().setTheme(Theme.STANDARD);
		extenthtmlreporter.config().setEncoding("utf-8");
		extentreports = new ExtentReports();
		extentreports.attachReporter(extenthtmlreporter);
		
	}
}
