import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateUser {

    @FindBy(xpath="//*[@id=\"username\"]")
    private WebElement username;

    @FindBy(xpath="//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[2]/td[2]/input")
    private WebElement password;

    @FindBy(xpath="//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[3]/td[2]/input")
    private WebElement confirmPassword;

    @FindBy(xpath="//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[4]/td[2]/input")
    private WebElement fullName;

    @FindBy(id ="yui-gen1")
    private WebElement createUserButton;

    public WebElement getUsername() {
        return username;    }

    public WebElement getPassword() {
        return password; }

    public WebElement getConfirmPassword() {
        return confirmPassword; }

    public WebElement getFullName() {
        return fullName; }

    public WebElement getCreateButton() {
        return createUserButton; }
}
