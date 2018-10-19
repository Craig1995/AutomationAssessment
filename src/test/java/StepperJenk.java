import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class StepperJenk {

    WebDriver driver;
    public static ExtentTest extent;
    public static ExtentReports report;

    @Before
    public void setup() {
        report = new ExtentReports("C:\\Users\\Gouldstone\\Desktop\\AssessmentReport.html", false);
        extent = report.startTest("Login Test");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gouldstone\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();

//        driver.manage().window().maximize();
    }

    @Given("^that you are on the create UserScreen$")
    public void that_you_are_on_the_create_UserScreen() {
        // Write code here that turns the phrase above into concrete actions
        adminLogin adminLogin = PageFactory.initElements(driver, adminLogin.class);
        Home homePage = PageFactory.initElements(driver, Home.class);
        Manage managePage = PageFactory.initElements(driver, Manage.class);
        Users userPage = PageFactory.initElements(driver, Users.class);

            extent.log(LogStatus.INFO, "Started test");

        driver.get("http://localhost:8080/login?from=%2F");

            extent.log(LogStatus.INFO, "The admin Logging in");

        adminLogin.getAdminUsername().sendKeys(Constants.adminUsername);
        adminLogin.getAdminPassword().sendKeys(Constants.adminPassword);
        adminLogin.getAdminPassword().submit();
            extent.log(LogStatus.INFO, "Admin is logged in");

        driver.get("http://localhost:8080/manage");
            extent.log(LogStatus.INFO, "making way to manage users");

        driver.get("http://localhost:8080/manage");
            extent.log(LogStatus.INFO, "finding way to users page");

        driver.get("http://localhost:8080/securityRealm");
            extent.log(LogStatus.INFO, "going to the create user page");

        driver.get("http://localhost:8080/securityRealm/addUser");
            extent.log(LogStatus.INFO, "going to the add a user page");

    }

        @When("^the User details are entered on the Create UserScreen$")
    public void the_User_details_are_entered_on_the_Create_UserScreen() {
            // Write code here that turns the phrase above into concrete actions
            CreateUser createPage = PageFactory.initElements(driver, CreateUser.class);
            // sends the created inputs below to the elements called upon
            createPage.getUsername().sendKeys("craig12345");
            createPage.getPassword().sendKeys("password12345");
            createPage.getConfirmPassword().sendKeys("password12345");
            createPage.getFullName().sendKeys("Craig");
                    extent.log(LogStatus.INFO, "Details of user have been entered");

        }

    @When("^the details are submitted on the Create UserScreen$")
    public void the_details_are_submitted_on_the_Create_UserScreen() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://localhost:8080/securityRealm/addUser");
        CreateUser create = PageFactory.initElements(driver, CreateUser.class);
        create.getCreateButton().click();
            extent.log(LogStatus.INFO, "user details submitted");

    }

    @Then("^the Username should be visible on the UsersScreen$")
    public void the_Username_should_be_visible_on_the_UsersScreen() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://localhost:8080/asynchPeople/");
        List<WebElement> UserList = driver.findElements(By.id("people"));
             System.out.println(UserList);
    }

    @When("^the User details \"([^\"]*)\" username, \"([^\"]*)\" password, \"([^\"]*)\" confirm Password, and \"([^\"]*)\" Fullname are entered on the Create UserScreen$")
    public void the_User_details_username_password_confirm_Password_and_Fullname_are_entered_on_the_Create_UserScreen(String arg1, String arg2, String arg3, String arg4) {
        // Write code here that turns the phrase above into concrete actions
        CreateUser createPage = PageFactory.initElements(driver, CreateUser.class);
        //send inputs to the elements on the site
        createPage.getUsername().sendKeys(arg1);
        createPage.getPassword().sendKeys(arg2);
        createPage.getConfirmPassword().sendKeys(arg3);
        createPage.getFullName().sendKeys(arg4);

    }

    @Then("^the \"([^\"]*)\" username should be visible on the UsersScreen$")
    public void the_username_should_be_visible_on_the_UsersScreen(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        List<WebElement> Userslist = driver.findElements(By.id("people"));
            System.out.println(Userslist);
    }

    @Given("^the \"([^\"]*)\" username is visible on the UsersScreen$")
    public void the_username_is_visible_on_the_UsersScreen(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        List<WebElement> Userslist = driver.findElements(By.id("people"));
        System.out.println(Userslist);
    }




    @When("^the \"([^\"]*)\" username is clicked on the UserScreen$")
    public void the_username_is_clicked_on_the_UserScreen(String arg1) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^the User Profile should display the \"([^\"]*)\" username on the ProfileScreen$")
    public void the_User_Profile_should_display_the_username_on_the_ProfileScreen(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("^the \"([^\"]*)\" Username's profile page has been loaded$")
    public void the_Username_s_profile_page_has_been_loaded(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("^the configure button has been clicked on the profile page$")
    public void the_configure_button_has_been_clicked_on_the_profile_page()  {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I change the old FullName on the Configure Page to a new FullName \"([^\"]*)\"$")
    public void i_change_the_old_FullName_on_the_Configure_Page_to_a_new_FullName(String arg1) {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I save the changes to the Configure Page$")
    public void i_save_the_changes_to_the_Configure_Page()  {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^the Configure Page should show the NewFullName \"([^\"]*)\"$")
    public void the_Configure_Page_should_show_the_NewFullName(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
    }
    @After
    public void teardown() {

        driver.quit();
        report.flush();
    }
}
