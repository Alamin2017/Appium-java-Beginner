import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class InstallEmulator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "v_device");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
		
		cap.setCapability(MobileCapabilityType.APP, "D:\\Soft\\Android_Studio\\emi-calculator.apk");			
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("com.continuum.emi.calculator:id/btnStart").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]").click();
		Thread.sleep(2000);
		
		driver.findElementById("com.continuum.emi.calculator:id/rbEMI").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView").click();
		Thread.sleep(2000);
		

		driver.findElementById("android:id/button1").click();
		Thread.sleep(2000);
		
	}

}
