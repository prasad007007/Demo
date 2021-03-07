package testStepsPackages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;

public class NewTesting {
    @Given("Check the Given")
    public void check_the_given() {
        System.out.println("Order checking 1");
    }


//    @And("Verify all the scenario")
//    public void verify_all_the_scenario() {
//        System.out.println("Order checking 2");
//    }
//
//    @And("Okay")
//    public void okay() {
//
//    }

}
