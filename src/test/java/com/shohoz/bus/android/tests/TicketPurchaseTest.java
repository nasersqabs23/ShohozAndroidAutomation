package com.shohoz.bus.android.tests;

import com.shohoz.bus.android.Pages.StartupPage;
import com.shohoz.bus.android.Pages.TicketPurchasePage;

import com.shohoz.bus.android.Utilities.AppInitializer;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import  java.io.File;
import  java.net.URL;
import java.net.MalformedURLException;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Naser on 4/28/2017.
 */
public class TicketPurchaseTest {

    AppiumDriver   driver;

    StartupPage    startUpPage;
    TicketPurchasePage   ticketPurchasePage;


    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app =new AppInitializer();
        driver = app.getDriver();

        startUpPage = new StartupPage(driver);
        ticketPurchasePage = new TicketPurchasePage(driver);

        startUpPage.NavigateToMainPage(driver);

    }

    @Test
    public void TicketPurchase() throws MalformedURLException, InterruptedException{

        ticketPurchasePage.TicketPurchaseCheck(driver);

    }

    @After
    public void tearDown(){

        driver.quit();

    }
}
