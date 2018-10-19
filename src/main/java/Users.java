import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Users {
    @FindBy(xpath=("//*[@id=\"tasks\"]/div[3]/a[2]"))
    private WebElement creatingUser;

    @FindBy (xpath = "//*[@id=\"main-panel\"]/h1")
    private WebElement pageTitle;

    @FindBy (id = "people")
    private WebElement userIdBox;


    public WebElement getcreateUser() {

        return creatingUser;
    }

    public WebElement getPageTitle(){
        return pageTitle;
    }

    public WebElement getUserIdBox(){
        return userIdBox;
    }
}
