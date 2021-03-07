package utilsPackage;

import basePackage.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class goIbibo {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver= baseClass.setConnection();
        System.setProperty("webdriver.chrome.driver", "G:\\Projects\\Flipkart\\Resources\\Servers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.goibibo.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@class=\"ico13 blue db\"]/a[2]"));
        driver.switchTo().frame("authiframe");
        driver.findElement(By.xpath("//*[@id=\"authMobile\"]")).sendKeys("7448039471");
        Thread.sleep(10000);

        TakesScreenshot scr = (TakesScreenshot) driver;
        File file = scr.getScreenshotAs(OutputType.FILE);


    }
}
