package basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class baseClass {


    public static WebDriver setConnection() {
        ChromeOptions op = new ChromeOptions();
        op.addArguments("");
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "G:\\Projects\\Flipkart\\Resources\\Servers\\chromedriver.exe");
        driver = new ChromeDriver();

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

}
