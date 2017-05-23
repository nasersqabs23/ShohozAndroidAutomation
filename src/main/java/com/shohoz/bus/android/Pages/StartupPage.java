package com.shohoz.bus.android.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class StartupPage {

    public StartupPage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @FindBy(name = "Allow")
    public WebElement assertManagePhoneCallsAllow;

    @FindBy(name = "Allow")
    public WebElement assertAccessDeviceLocationAllow;

    @FindBy(name = "Allow")
    public WebElement assertAccessContactsAllow;

    @FindBy(name = "Allow")
    public WebElement assertAccessMediaFilesAllow;




    public void NavigateToMainPage(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        assertManagePhoneCallsAllow.click();
        sleep(5000);

        assertAccessDeviceLocationAllow.click();
        sleep(5000);

        assertAccessContactsAllow.click();
        sleep(5000);

        assertAccessMediaFilesAllow.click();
        sleep(10000);

    }
}
