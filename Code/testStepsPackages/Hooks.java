package testStepsPackages;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void beforeScenarios() {
        System.out.println("THIS IS THE BEFORE SCENARIO=");
    }
    @Before
    public void beforeScenariosStart() {
        System.out.println("-------------Start----------------");
    }

    @After
    public void afterScenarios() {
        System.out.println("THIS IS THE AFTER SCENARIO=");
    }
    @After
    public void afterScenariosScenario() {
        System.out.println("-------------End----------------");
    }
}
