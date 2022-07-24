package practice;

import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class NotepadTest {

	private static WindowsDriver driver;

	@Test
	public static void setup() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("app", "Microsoft.BingWeather_8wekyb3d8bbwe!App");
			driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}catch(Exception e){
			e.printStackTrace();
		} finally {
		}
	}

}
