package utilsPackage;

import basePackage.baseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= baseClass.setConnection();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        WebElement eleDynamicAlert=driver.findElement(By.xpath("//*[@href=\"#Textbox\"]"));
        eleDynamicAlert.click();
        WebElement elementAlertGButton=driver.findElement(By.xpath("//*[@class='btn btn-info']"));
        elementAlertGButton.click();
        Alert alert=   driver.switchTo().alert();
       // System.out.println(alert.getText());
       // Thread.sleep(5000);
        alert.sendKeys("Hello This is the Test");
        Thread.sleep(5000);
        alert.accept();
        driver.switchTo().defaultContent();
        elementAlertGButton.click();
        Thread.sleep(5000);
        alert.dismiss();
        Thread.sleep(5000);

        driver.quit();

    }
}
