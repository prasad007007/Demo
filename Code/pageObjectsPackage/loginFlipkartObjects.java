package pageObjectsPackage;

import locatorPackage.loginPopUp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginFlipkartObjects {
    @FindBy(how = How.XPATH, using = loginPopUp.loco_UserId_xpath)
    public WebElement eUserId;

    @FindBy(how = How.XPATH, using = loginPopUp.loco_Password_xpath)
    public WebElement ePassword;

    @FindBy(how = How.XPATH, using = loginPopUp.loco_Login_xpath)
    public WebElement eLogin;

    @FindBy(how = How.XPATH, using = loginPopUp.loco_UsernameOnPage_xpath)
    public WebElement eUsernameOnPage;
}
