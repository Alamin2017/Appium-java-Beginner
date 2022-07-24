package Mobile_Gesture;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToastMessage {

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
		

		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")")).click();

		
	    driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).scrollIntoView(new UiSelector().text(\"Spinner\"));")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"io.appium.android.apis:id/spinner1\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"blue\")")).click();
		
		String message=driver.findElementByXPath("//android.widget.Toast[1]").getText();
		
		System.out.println(message);
		
		driver.runAppInBackground(Duration.ofSeconds(5));
		

	}

}
