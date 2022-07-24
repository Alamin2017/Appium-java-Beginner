package Mobile_Gesture;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Swipeleft_right {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.APP, "D:\\Soft\\Android_Studio\\Android_Demo_App.apk");			
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Create an object of android  actions class
		AndroidTouchAction ta=new AndroidTouchAction(driver);

		AndroidElement eleapp=(AndroidElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Btn4\"]");
		ta.tap(ElementOption.element(eleapp)).release().perform();
		Thread.sleep(2000);

		Dimension dimension=driver.manage().window().getSize();

		int start_x=(int) (dimension.width*8)/9;
		int start_y=(int) (dimension.height)/2;

		int end_x=(int) (dimension.width)/9;
		int end_y=(int) (dimension.height)/2;

		ta.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
		Thread.sleep(2000); 

	
		start_x=(int) (dimension.width)/9;
		start_y=(int) (dimension.height)/2;

		end_x=(int) (dimension.width*8)/9;
		end_y=(int) (dimension.height)/2;


		ta.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform(); 






	}

}
