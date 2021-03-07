package utilsPackage;

import basePackage.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFramePractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = baseClass.setConnection();
        driver.get("http://demo.automationtesting.in/Frames.html");
        WebElement elementSingle=driver.findElement(By.xpath("//*[@href='#Single']"));
        WebElement elementMultiple=driver.findElement(By.xpath("//*[@href='#Multiple']"));
        elementSingle.click();
        driver.switchTo().frame("singleframe");
        WebElement elementSingleFrameTextBox=driver.findElement(By.xpath("//*[@type='text']"));
        elementSingleFrameTextBox.sendKeys("This is the Single Frame");
            Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        elementMultiple.click();
        WebElement elementMultipleOuterFrame=driver.findElement(By.xpath("//*[@src='MultipleFrames.html']"));
        driver.switchTo().frame(elementMultipleOuterFrame);
        Thread.sleep(2000);
        WebElement elementMultipleInnerFrame=driver.findElement(By.xpath("//*[@src='SingleFrame.html']"));
        driver.switchTo().frame(elementMultipleInnerFrame);
        Thread.sleep(2000);
        WebElement elementMultipleFrameTextBox=driver.findElement(By.xpath("//*[@type='text']"));
        elementMultipleFrameTextBox.sendKeys("This is the Multiple Frame TextBox");
        Thread.sleep(5000);
        driver.quit();
    }
}
