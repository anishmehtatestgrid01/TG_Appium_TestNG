//import com.sun.org.apache.xpath.internal.operations.String;
import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;

import java.net.URL;


public class AndroidApp {


    //public String gridURL = "http://testos.testgrid.io:8056/wd/hub";

    AppiumDriver driver;

    @Test
    @org.testng.annotations.Parameters(value = {"version","platform","device","udids", "TG_url"})
    public void AndroidApp1(String version, String platform, String device, String udids, String TG_url) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("deviceName", device);
            capabilities.setCapability("platformVersion",version);
            capabilities.setCapability("platformName", platform);
            System.out.println(platform);
            capabilities.setCapability("appPackage", "org.asdtm.goodweather");
            //capabilities.setCapability("deviceOrientation", "PORTRAIT");
            capabilities.setCapability("appActivity", "org.asdtm.goodweather.MainActivity");
            capabilities.setCapability("udid", udids);



            //capabilities.setCapability("geoLocation", "HK");

            String hub = TG_url;

            driver = new AppiumDriver(new URL(TG_url), capabilities);
            Thread.sleep(5000);
            MobileElement Menu = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]\n");
            //Clicking on Menu
           // System.out.println(driver.getPageSource());
            Menu.click();
            Thread.sleep(1000);

            driver.quit();





        } catch (Exception e) {
            e.printStackTrace();
            try{
                driver.quit();
            }catch(Exception e1){
                e.printStackTrace();
            }
        }


    }
}
