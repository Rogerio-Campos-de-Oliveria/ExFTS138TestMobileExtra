package simples;

// This sample code supports Appium Java client >=9
// https://github.com/appium/java-client
import io.appium.java_client.AppiumBy;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flores {

    private AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {

        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("name", "Nosso Teste");


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", "9.0");
        desiredCapabilities.setCapability("appium:deviceName", "Samsung Galaxy S9 FHD GoogleAPI Emulator");
        desiredCapabilities.setCapability("appium:deviceOrientation", "portrait");
        desiredCapabilities.setCapability("appium:app", "storage:filename=giuliana-flores-2-0-44.apk");
        desiredCapabilities.setCapability("appium:appPackage", "br.com.giulianaflores.android");
        desiredCapabilities.setCapability("appium:appActivity", "br.com.giulianaflores.android.MainActivity");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("sauce:options", Map.ofEntries(Map.entry("name", "Appium Desktop Session -- Jan 26, 2024 7:33 PM")));
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL ("https://oauth-henriquerosafotos01-9a339:567c3888-769c-44b7-b464-6420dbcd82da@ondemand.us-west-1.saucelabs.com:443/wd/hub");



        driver = new AndroidDriver(remoteUrl, desiredCapabilities);

    }



    @Test
    public void sampleTest() {
        var el1 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Pular\"]"));
        el2.click();
        var el3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Criar minha conta depois\"]"));
        el3.click();
        var el4 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]"));
        el4.click();
        var el5 = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
        el5.click();
        var el6 = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"7%, OFF, Buquê de 6 Rosas Amarelas e Almofada Mickey - Zona Criativa, DE:R$179,90, Por: , R$167,90, Em até 3x de R$55,97 sem Juros\"]/android.view.ViewGroup[2]/android.widget.ImageView"));
        el6.click();
        var el7 = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Buquê de 6 Rosas Amarelas e Almofada Mickey - Zona Criativa\"])[2]"));
        el7.click();
        var el8 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" R$ 167,90\"]"));
        el8.click();
        var el9 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"CONTINUAR\"]"));
        el9.click();


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
