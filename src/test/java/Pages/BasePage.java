package Pages;

import Drivers.DriverFactory;
import Helpers.Utils;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BasePage extends  DriverFactory{
    public  static WebDriver driver = DriverFactory.getDriver();


    public BasePage() {
        {
            PageFactory.initElements(driver, this);

        }





    }

}


