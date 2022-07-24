

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class EMICalculator2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
	
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.APP, "D:\\Soft\\Android_Studio\\emi-calculator.apk");			
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.continuum.emi.calculator:id/btnStart").click();
		Thread.sleep(2000);
		
		WebElement loan=driver.findElementById("com.continuum.emi.calculator:id/etLoanAmount");
		loan.sendKeys("100000");
		Thread.sleep(2000);
		WebElement interest=driver.findElementById("com.continuum.emi.calculator:id/etInterest");
		interest.sendKeys("9.0");
		Thread.sleep(2000);
		WebElement year=driver.findElementById("com.continuum.emi.calculator:id/etYears");
		year.sendKeys("6");
		Thread.sleep(2000);
		WebElement month=driver.findElementById("com.continuum.emi.calculator:id/etMonths");
		month.sendKeys("6");
		Thread.sleep(2000);
		WebElement pFee=driver.findElementById("com.continuum.emi.calculator:id/etFee");
		pFee.sendKeys("2.5");
		Thread.sleep(2000);
		driver.findElementById("com.continuum.emi.calculator:id/btnCalculate").click();
		 
		String monthlyemi=driver.findElementById("com.continuum.emi.calculator:id/monthly_emi_result").getText();
		String totalinterest=driver.findElementById("com.continuum.emi.calculator:id/total_interest_result").getText();
		String processingfee=driver.findElementById("com.continuum.emi.calculator:id/processing_fee_result").getText();
		String totalpayment=driver.findElementById("com.continuum.emi.calculator:id/total_payment_result").getText();
	
		
		

	}



}
