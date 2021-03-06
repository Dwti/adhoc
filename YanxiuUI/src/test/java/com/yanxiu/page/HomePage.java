package com.yanxiu.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends PageBase{

	public HomePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(id="tv_tab_exam")
	private MobileElement tabExamine;
	
	@AndroidFindBy(id="tv_tab_task")
	private MobileElement tabTask;
	
	@AndroidFindBy(id="tv_tab_notice")
	private MobileElement tabNotice;
	
	@AndroidFindBy(id="tv_tab_bulletin")
	private MobileElement tabBulletin;
	
	@AndroidFindBy(uiAutomator="new UiSelector().text(\"作业\")")
	private MobileElement homeWorkItem;
	public void tapTask(){
		tabTask.click();
	}
	
	public void enterHomeworkPage(){
		homeWorkItem.click();
	}
}
