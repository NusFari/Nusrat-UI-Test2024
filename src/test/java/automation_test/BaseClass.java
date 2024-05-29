package automation_test;

import command_providers.ActOn;
import nusrat_utilities.DriverFactory;
import nusrat_utilities.ReadConfigFiles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {//base class is use for redundancy
    public WebDriver driver;
    public Logger LOGGER = LogManager.getLogger(this.getClass().getName());//you don't need to mention the class name.it will automatically get the class name.it's not a static or final the reason is
    //because this is re-initializing the value of the time.all the time its assign a new value.that's the reason we cant declare as a static or final.
    String testCaseName = String.format("---------test:%s----------",this.getClass().getName());
    String endCaseName = String.format("---------test End:%s----------",this.getClass().getName());

    @BeforeClass
    public void addThread() {//this method will execute before executing any class.//this class is used to get the log
        ThreadContext.put("threadName", this.getClass().getName());//i have to give a name thread-name.this is coming for log4j.otherwise log file won't be able to create the name.
        driver= DriverFactory.getInstance().getDriver();//value is coming form the driver factory.Driver-factory.getInstance.get driver
    }

    @BeforeMethod//will be executed before the test
    public void browserInitialization() {
        String browserUrl=ReadConfigFiles.getPropertyValues("Url");
        LOGGER.info(testCaseName);
        LOGGER.debug("Opening the URL:"+browserUrl);
        ActOn.browser(driver).openBrowser(browserUrl);
    }

    @AfterMethod
    public void browserCleanup() {//after method will be executed after the test
        DriverFactory.getInstance().removeDriver();
        LOGGER.info(endCaseName);

    }
}
