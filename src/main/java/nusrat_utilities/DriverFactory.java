package nusrat_utilities;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverFactory {
    //private static final Logger LOGGER= LogManager.getLogger(DriverFactory.class);
    //Do not allow to initialize this class from outside
    private DriverFactory(){
        //Do Nothing -- Empty Constructor
    }
    private static final DriverFactory instance=new DriverFactory();//instance is the object of the class
    public static DriverFactory getInstance(){
        return instance;//you cant use this because i blocked the constructor purposefully
    }
    //thread local driver object for webDriver
    ThreadLocal<WebDriver> driver=ThreadLocal.withInitial(() -> {//itz called landa method

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            return new ChromeDriver(options);



    });
    //Call this method to get the driver object and launch the browser
    public WebDriver getDriver(){
        return driver.get();
    }
    //Quits the driver and closes the browser
    public void removeDriver(){
        getDriver().quit();
        driver.remove();
    }
}


