package testStepsPackages;

import basePackage.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjectsPackage.loginFlipkartObjects;

public class LoginFlipkartTC {


    @Given("Launch the chrome browser")
    public void launch_the_chrome_browser() {


    }


    @When("Enter the value into username")
    public void enter_the_value_into_username() {

        System.out.println("This is Second Test Case");
    }

    @When("Enter the value of password")
    public void enter_the_value_of_password() {
        System.out.println("This is Third Test Case");
    }


}
