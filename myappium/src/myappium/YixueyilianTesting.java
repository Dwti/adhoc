package myappium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.junit.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.w3c.css.sac.SelectorList;
public class YixueyilianTesting {
	static AndroidDriver<AndroidElement> driver;
	//����app
	public static void startapp()throws Exception{
		AppiumDriver driver;
	//apk�ĵ�ַF:\workspace\myappium\apps
	File app=new File("F:\\workspace\\myappium\\apps\\com.yanxiu.gphone.student9.apk");
		
		
		
		//����apk��·��
		//File classpathRoot = new File(System.getProperty("user.dir"));
	    //File appDir = new File(classpathRoot, "apps");
	    //File app = new File(appDir, "com.yanxiu.gphone.student9.apk");

	DesiredCapabilities capabilities=new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

	
	//capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MI NOTE LTE");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	//ָ��ĳ�豸,�豸udid������dos������ͨ��adb devices�������豸����
	//capabilities.setCapability(MobileCapabilityType.UDID,"402d3418");
    //apk�İ�������������
	//capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.yanxiu.gphone.student9");
	//capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,"");
	capabilities.setCapability("unicodeKeyboard", "True");
	//�������뷨ΪϵͳĬ��
     capabilities.setCapability("resetKeyboard", "True");
	//��װʱ����apk������ǩ�������ú��б�Ҫ�������е�apk����ǩ��֮���޷�����ʹ��	
	//capabilities.setCapability("noSign", "True");
	driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
		Thread.sleep(50000);
			System.out.println("����app�ɹ�");
	
	}
	//����������
	public static void huadong()throws Exception{
		 
		
	}
	
	
	
	
	
	//��¼
	public static void login()throws Exception{
		System.out.println(driver.getPageSource());
		AndroidElement jiaose=driver.findElementByName("jiaose");
		if(jiaose.equals("ż��ѧ��"))
		{
			jiaose.click();	
		}else{
			System.out.println("û�ҵ�����");
		}
		
		
		System.out.println(driver.findElement(By.xpath("//android.widget.Botton[1]")).getText());
		
		AndroidElement login=driver.findElementByName("��¼");
		login.click();
		
		AndroidElement username=driver.findElementById("MainApp-yanxiu_com:id/phone");
		username.sendKeys("18606703065");
		AndroidElement password=driver.findElementById("MainApp-yanxiu_com:id/password");
		password.sendKeys("dtt123456");
		TouchAction touch=new TouchAction(driver);
		touch.longPress(password).release().perform();
		AndroidElement loginSubmit=driver.findElement(By.xpath("//android.widget.Button[@text='��¼']"));
		loginSubmit.click();
		Thread.sleep(10000);
		
		String curActivity=driver.currentActivity();
		System.out.println(curActivity);
		Thread.sleep(10000);
		if(curActivity.equals(".ui.activity.MainActivity")){
			System.out.println("��½�ɹ�");
		}else{
			System.out.println("��½ʧ��");
		}
		if(driver.getPageSource().contains("��ҳ"))
		{
			System.out.println("��½�ɹ�");
		}
		else{
			System.out.println("��½ʧ��");
		}
		Thread.sleep(10000);
		
	}
	
	
	
	
	//�˳�appium����
	   public static void quit(){
					driver.quit();
				};
}




