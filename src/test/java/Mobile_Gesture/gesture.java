package Mobile_Gesture;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class gesture {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.APP, "D:\\Soft\\Android_Studio\\ApiDemos-debug.apk");			
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Create an object of android touchaction class
		AndroidTouchAction ta=new AndroidTouchAction(driver);
		
		//tap operation
		//AndroidElement eleOS=(AndroidElement) driver.findElementByXPath("//android.widget.TextView[@text='OS']");
		//ta.tap(ElementOption.element(eleOS)).perform();
		
		//swipe/scroll operation
		AndroidElement eleViews=(AndroidElement) driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		ta.tap(ElementOption.element(eleViews)).release().perform();
		
		//AndroidElement eleGallery=(AndroidElement) driver.findElementByXPath("//android.widget.TextView[@text='Gallery']");
		//ta.tap(ElementOption.element(eleGallery)).perform();
		
		//AndroidElement elephoto=(AndroidElement) driver.findElementByXPath("//android.widget.TextView[@text='1. Photos']");
		//ta.tap(ElementOption.element(elephoto)).perform();
		AndroidElement elephoto=(AndroidElement) driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']");
		ta.tap(ElementOption.element(elephoto)).release().perform();
		
		//pic1 scrolling horizontal.........
		//AndroidElement pic1=(AndroidElement) driver.findElementsByClassName("android.widget.ImageView").get(0);
		//ta.press(ElementOption.element(pic1)).waitAction().moveTo(PointOption.point(-20,210)).release().perform();
		
		//drag and drop for android element
		AndroidElement drag1=(AndroidElement) driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		AndroidElement drag2=(AndroidElement) driver.findElementById("io.appium.android.apis:id/drag_dot_2");
		AndroidElement drag3=(AndroidElement) driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		ta.longPress(ElementOption.element(drag1)).moveTo(ElementOption.element(drag2)).release().perform();
		
		
		
		

	}

}
