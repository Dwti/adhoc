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
	//启动app
	public static void startapp()throws Exception{
		AppiumDriver driver;
	//apk的地址F:\workspace\myappium\apps
	File app=new File("F:\\workspace\\myappium\\apps\\com.yanxiu.gphone.student9.apk");
		
		
		
		//设置apk的路径
		//File classpathRoot = new File(System.getProperty("user.dir"));
	    //File appDir = new File(classpathRoot, "apps");
	    //File app = new File(appDir, "com.yanxiu.gphone.student9.apk");

	DesiredCapabilities capabilities=new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

	
	//capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MI NOTE LTE");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	//指定某设备,设备udid就是在dos窗口下通过adb devices看到的设备名称
	//capabilities.setCapability(MobileCapabilityType.UDID,"402d3418");
    //apk的包类名和主类名
	//capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.yanxiu.gphone.student9");
	//capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,"");
	capabilities.setCapability("unicodeKeyboard", "True");
	//重置输入法为系统默认
     capabilities.setCapability("resetKeyboard", "True");
	//安装时不对apk进行重签名，设置很有必要，否则有的apk在重签名之后无法正常使用	
	//capabilities.setCapability("noSign", "True");
	driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
		Thread.sleep(50000);
			System.out.println("启动app成功");
	
	}
	//滑动启动屏
	public static void huadong()throws Exception{
		 
		
	}
	
	
	
	
	
	//登录
	public static void login()throws Exception{
		System.out.println(driver.getPageSource());
		AndroidElement jiaose=driver.findElementByName("jiaose");
		if(jiaose.equals("偶是学生"))
		{
			jiaose.click();	
		}else{
			System.out.println("没找到对象");
		}
		
		
		System.out.println(driver.findElement(By.xpath("//android.widget.Botton[1]")).getText());
		
		AndroidElement login=driver.findElementByName("登录");
		login.click();
		
		AndroidElement username=driver.findElementById("MainApp-yanxiu_com:id/phone");
		username.sendKeys("18606703065");
		AndroidElement password=driver.findElementById("MainApp-yanxiu_com:id/password");
		password.sendKeys("dtt123456");
		TouchAction touch=new TouchAction(driver);
		touch.longPress(password).release().perform();
		AndroidElement loginSubmit=driver.findElement(By.xpath("//android.widget.Button[@text='登录']"));
		loginSubmit.click();
		Thread.sleep(10000);
		
		String curActivity=driver.currentActivity();
		System.out.println(curActivity);
		Thread.sleep(10000);
		if(curActivity.equals(".ui.activity.MainActivity")){
			System.out.println("登陆成功");
		}else{
			System.out.println("登陆失败");
		}
		if(driver.getPageSource().contains("首页"))
		{
			System.out.println("登陆成功");
		}
		else{
			System.out.println("登陆失败");
		}
		Thread.sleep(10000);
		
	}
	
	
	
	
	//退出appium连接
	   public static void quit(){
					driver.quit();
				};
}




