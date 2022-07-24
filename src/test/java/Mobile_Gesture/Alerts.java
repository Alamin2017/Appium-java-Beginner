package Mobile_Gesture;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class Alerts {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		
		AndroidElement eleapp=(AndroidElement) driver.findElementByXPath("//android.widget.TextView[@text='App']");
		ta.tap(ElementOption.element(eleapp)).release().perform();
		Thread.sleep(2000);
		
		AndroidElement elealert=(AndroidElement) driver.findElementByXPath("//android.widget.TextView[@text='Fragment']");
		ta.tap(ElementOption.element(elealert)).release().perform();
		Thread.sleep(2000);
		AndroidElement okcancel=(AndroidElement) driver.findElementByXPath("//android.widget.TextView[@text='List Array']");
		ta.tap(ElementOption.element(okcancel)).release().perform();
		Thread.sleep(2000);
		
	
		
		List<AndroidElement> allname=(List<AndroidElement>) driver.findElementsByClassName("android.widget.TextView");
		
		for (AndroidElement item:allname)
		{
			System.out.println(item.getText());
		}
		
		
		
		

	}

}
