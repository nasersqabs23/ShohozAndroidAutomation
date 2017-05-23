package com.shohoz.bus.android.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Naser on 4/28/2017.
 */
public class AppInitializer {

    PropertyHandler propertyHandler;


    public AppInitializer(){
        propertyHandler=new PropertyHandler();
    }


    private DesiredCapabilities getCapability(){

        DesiredCapabilities capabilities = new  DesiredCapabilities ();
        File app=initializeAPKFile();
        capabilities.setCapability(CapabilityType.BROWSER_NAME,  propertyHandler.getPropertyValue("BROWSER_NAME"));
        capabilities.setCapability("deviceName", propertyHandler.getPropertyValue("deviceName"));
        capabilities.setCapability("platformName", propertyHandler.getPropertyValue("platformName"));
        capabilities.setCapability("platformVersion", propertyHandler.getPropertyValue("platformVersion"));
        capabilities.setCapability("app",app);
        capabilities.setCapability("appPackage",propertyHandler.getPropertyValue("appPackage"));
        return capabilities;
    }

    public AppiumDriver getDriver(){
        AppiumDriver driver=null;

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getCapability());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

    private File initializeAPKFile(){
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, new PropertyHandler().getPropertyValue("apkFilePath"));
        File app = new File(appDir, new PropertyHandler().getPropertyValue("apkFileName"));
        return app;
    }
}
