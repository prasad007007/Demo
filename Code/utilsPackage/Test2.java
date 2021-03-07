package utilsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.sql.SQLOutput;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=basePackage.baseClass.setConnection();
        driver.manage().window().maximize();
        driver.get("http://uitestpractice.com/");
        Thread.sleep(2000);
        //WebElement  controls1=driver.findElement(By.xpath("//*[text()='Controls']"));
       // controls1.click();
        WebElement  src=driver.findElement(By.xpath("//*[@id='draggable']"));

        WebElement  dest=driver.findElement(By.xpath("//*[@id='droppable']"));

         new Actions(driver).dragAndDrop(src,dest).build().perform();
        Thread.sleep(5000);driver.close();

    }

    public char getChar(int value) throws InterruptedException {


        WebDriver driver=basePackage.baseClass.setConnection();
        driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
        Thread.sleep(5000);
        WebElement  src=driver.findElement(By.xpath("//*[@id='todrag']/span[1]"));
        WebElement  dest=driver.findElement(By.id("mydropzone"));
        Actions act=new Actions(driver);
        act.dragAndDrop(src,dest).release().build().perform();

        //act.clickAndHold(src).moveToElement(dest).click(dest).build().perform();

        driver.quit();
//        System.out.println("The index value is = ");
//        int number =26;
//        int test=number/26;
//        String sValue;
//        int index=number+64;
//
//
////        char character = 'A';
////        int ascii = (int) character;
//        System.out.println( );
        char c=(char)value;
        return c;
    }
}
