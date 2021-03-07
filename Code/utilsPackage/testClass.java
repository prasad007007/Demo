package utilsPackage;


import basePackage.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import sun.net.www.content.text.Generic;

import java.awt.event.KeyEvent;
import java.util.*;

import static java.awt.event.KeyEvent.*;

public class testClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello Java");
        A a = new A();
        a.b();

//        WebDriver driver = baseClass.setConnection();
//        WebDriver driver1 = baseClass.setConnection();
//        driver.get("https://www.google.com");
//        driver1.get("https://www.facebook.com");
//        Thread.sleep(2000);
//        driver.switchTo().window(driver1.getWindowHandle());
//
//        Thread.sleep(5000);
//
//        driver.quit();
//        Map<String, String> mhash = new HashMap<String, String>();
//        mhash.put("1", "One");
//        mhash.put("2", "Two");
//        mhash.put("3", "Three");
//        mhash.put(null, "Three");
//        mhash.put(null, "Four");
//        mhash.put("3", "Three");
//        mhash.put("4", "Four");
//        mhash.put("5", "Five");
//
//        System.out.println(mhash);
//
//
//        Set<String> obj=new HashSet<String>();
//        obj.add("One");
//        obj.add("Two");
//        obj.add("Three");
//        obj.add("Three");
//        obj.add("Three");
//        obj.add("Three");
//        obj.add("Three");
//        obj.add("Three");
//        obj.add("Four");
//        obj.add("Five");
//
//        System.out.println(obj);


    }

}

final class A {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = baseClass.setConnection();
//        driver.get("https://demoqa.com/automation-practice-form/");
//        List<WebElement> lstInputBox = driver.findElements(By.xpath("//input"));
//
//        System.out.println("**");
//        Iterator<WebElement> itr = lstInputBox.listIterator();
//        while (itr.hasNext()) {
//            try {
//                System.out.println(itr.next().getAttribute("type") + "**");
//            } catch (Exception e) {
//            }
//            driver.quit();
//        }

        WebDriver driver = baseClass.setConnection();
        driver.get("http://demo.automationtesting.in/WebTable.html");
        List<WebElement> tableList = driver.findElements(By.xpath("//*[@role=\"grid\"]"));
        Thread.sleep(2000);
        new Actions(driver).doubleClick(tableList.get(0));
        Thread.sleep(2000);
        Iterator<WebElement> tableIterator = tableList.iterator();
        while (tableIterator.hasNext()){

           List<WebElement> rowList =  tableIterator.next().findElements(By.xpath(".//div[@role='rowgroup']"));

            Iterator<WebElement> rowiIterator=rowList.listIterator();
           while (rowiIterator.hasNext()){
               System.out.println(rowiIterator.next().getText()+" ** ");

               List<WebElement> colList=rowiIterator.next().findElements(By.xpath(".//div/div"));
               Iterator<WebElement> colIterator= colList.iterator();
               while (colIterator.hasNext()){
                   System.out.print(" == "+ colIterator.next().getText());

               }
               System.out.println("-------------------------------------------------------------------");
            }


        }

    }

    final void b() {
        System.out.println("b");
    }
}
