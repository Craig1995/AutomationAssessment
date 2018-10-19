import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class LoginTest {

    public WebDriver driver = null;
    ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\loginReport.html", true);
    ExtentTest test;

    @Before
    public void setup(){
        System.setProperty("webdriver.driver.chrome", "C:\\Users\\Gouldstone\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void login(){
        test = extent.startTest("Login");
        driver.get("http://localhost:8080/");

//        test.log(LogStatus.INFO, "Demo site opened");
//        driver.get("http://localhost:8080/securityRealm/addUser");
//        CreateUser newUser = PageFactory.initElements(driver, CreateUser.class);
//        newUser.setCreateUsername("root", "root", "root");
//        test.log(LogStatus.INFO, "User Created");
    }
}
