import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class adminLogin {
        @FindBy(xpath="//*[@id=\"j_username\"]")
        private WebElement adminUserame;

        @FindBy(xpath="/html/body/div/div/form/div[2]/input")
        private WebElement adminPassword;

        public WebElement getAdminUsername() {

            return adminUserame;
        }

        public WebElement getAdminPassword() {

            return adminPassword;
        }

    }

