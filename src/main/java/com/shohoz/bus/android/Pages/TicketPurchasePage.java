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


public class TicketPurchasePage {

    public TicketPurchasePage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @FindBy(name = "Enter City")
    public WebElement assertFromEnterCity;

    @FindBy(name = "Dhaka")
    public WebElement assertDhakaCity;

    @FindBy(name = "Enter City")
    public WebElement assertToEnterCity;

    @FindBy(name = "Cox's Bazar")
    public WebElement assertCoxBazarCity;

    @FindBy(name = "Journey Date")
    public WebElement assertJourneyDate;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Next month']")
    public WebElement  assertNextMonth;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='05 May 2017']")
    public WebElement  assert5thMay;

    @FindBy(name = "SEARCH")
    public WebElement assertSearchButton;

    @AndroidFindBy(id = "com.shohoz.bus.android:id/filter_button")
    public WebElement  assertFilterButton;

    @FindBy(name = "A/C")
    public WebElement assertAcOption;

    @FindBy(name = "OPERATORS")
    public WebElement assertOperators;

    @FindBy(name = "Hanif Enterprise")
    public WebElement assertHalifEnterprise;

    @FindBy(name = "APPLY")
    public WebElement assertApplyButton;

    @FindBy(name = "9:00 PM - 06:00 AM")
    public WebElement assertHalif9Pmto6Am;

    @FindBy(name = "Seat Layout")
    public WebElement assertSeatLayout;

    @FindBy(name = "DONE")
    public WebElement assertDoneButton;

    @FindBy(name = "Boarding Point")
    public WebElement assertBoardingPoint;

    @FindBy(name = "Kallyanpur Bus Point")
    public WebElement assertKallayanpurBusPoint;

    @FindBy(name = "CONTINUE BOOKING")
    public WebElement assertContinueBooking1;

    @FindBy(name = "Full Name")
    public WebElement assertFullName;

    @FindBy(name = "Male")
    public WebElement assertMaleGender;

    @FindBy(name = "  Email Id")
    public WebElement assertEmailId;

    @FindBy(name = "Mobile No")
    public WebElement assertMobileNo;

    @FindBy(name = "I agree with the  ")
    public WebElement assertIAgreeWithThe;

    @FindBy(name = "CONTINUE BOOKING")
    public WebElement assertContinueBooking2;




    public void TicketPurchaseCheck(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        assertFromEnterCity.click();

        sleep(5000);

        assertDhakaCity.click();

        sleep(5000);

        assertToEnterCity.click();

        sleep(5000);

        assertCoxBazarCity.click();

        sleep(5000);

        assertJourneyDate.click();

        sleep(5000);

        assertNextMonth.click();

        sleep(5000);

        assert5thMay.click();

        sleep(5000);

        assertSearchButton.click();

        sleep(5000);

        assertFilterButton.click();

        sleep(5000);

        assertAcOption.click();

        sleep(5000);

        assertOperators.click();

        sleep(5000);

        assertHalifEnterprise.click();

        sleep(5000);

        assertApplyButton.click();

        sleep(5000);

        assertHalif9Pmto6Am.click();

        sleep(5000);

        assertSeatLayout.click();

        sleep(5000);

        driver.tap(1,474,446,1);

        sleep(5000);

        assertDoneButton.click();

        sleep(5000);

        assertBoardingPoint.click();

        sleep(5000);

        assertKallayanpurBusPoint.click();

        sleep(5000);

        assertContinueBooking1.click();

        sleep(5000);

        assertFullName.sendKeys("mr. simon mark");

        driver.hideKeyboard();

        sleep(5000);

        assertMaleGender.click();

        sleep(5000);

        assertEmailId.sendKeys("demo@email.com");

        sleep(5000);

        driver.swipe(40, 425, 40, 340, 3000);

        assertIAgreeWithThe.click();

        sleep(5000);

        assertMobileNo.sendKeys("0187546523");

        sleep(5000);

        assertContinueBooking2.click();

        sleep(5000);

    }


}
