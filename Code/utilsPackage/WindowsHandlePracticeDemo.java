package utilsPackage;

import basePackage.baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandlePracticeDemo {
    public static void main(String[] args) throws InterruptedException {
      WebDriver driver=  baseClass.setConnection();
      driver.get("http://demo.automationtesting.in/Windows.html");
        WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        button.click();
        button.click();
        button.click();
        button.click(); button.click();  Thread.sleep(2000);
        String currentWindow=driver.getWindowHandle();
Set<String> allWIndows=driver.getWindowHandles();

        Iterator<String> ss=allWIndows.iterator();
        while (ss.hasNext()){
            driver.switchTo().window(ss.next());
            System.out.println(driver.getTitle());
            if(!driver.getTitle().equals("Frames & windows")){
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@href='/downloads' and @class='nav-item']")).click();
            }
        }
        System.out.println(allWIndows.size());
        driver.quit();
    }
}
