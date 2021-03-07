package utilsPackage;

import basePackage.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;

public class WebTablePractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = baseClass.setConnection();
        driver.get("http://demo.automationtesting.in/WebTable.html");

        ////*[@role='grid']/div[2]/div/div[1]/div/div[6]/user-click-select/div/button
Thread.sleep(5000);
        WebElement eachCell=driver.findElement(By.xpath("//*[@role='grid']/div[2]/div/div["+5+"]/div/div["+3+"]"));
        WebElement eachCell1=driver.findElement(By.xpath("//*[@role='grid']/div[2]/div/div["+5+"]/div/div["+1+"]"));
        System.out.println(eachCell.getText()+"      "+eachCell1.getText());
        if(eachCell.getText().trim().equals("FeMale") &&  eachCell1.getText().trim().equals("ragini@gimal.com")) {
            WebElement Editbutton=driver.findElement(By.xpath("//*[@role='grid']/div[2]/div/div["+5+"]/div/div["+6+"]/user-click-select/div/button"));

            new Actions(driver).doubleClick(Editbutton).perform();
        }
//        for(int i=1;i<=10;i++){
//            for(int j=1;j<=6;j++){
//                WebElement eachCell = driver.findElement(By.xpath("//*[@role='grid']/div[2]/div/div["+i+"]/div/div["+j+"]"));
//
//                System.out.print(eachCell.getText()+"     ");
//            }
//
//
//            System.out.println();
//        }
      //  WebElement elementWebTables = driver.findElement(By.xpath("//*[@role='grid']/div[2]"));
//
//        List<WebElement> elementRow = elementWebTables.findElements(By.xpath(".//div/div"));
//        Iterator<WebElement> rowIterator = elementRow.iterator();
//
//        while (rowIterator.hasNext()) {
//
//            List<WebElement> elementCell = rowIterator.next().findElements(By.xpath(".//div/div"));
//            Iterator<WebElement> cellIterator = elementCell.iterator();
//            System.out.println(cellIterator.next().getText());
////            while (cellIterator.hasNext()) {
////                System.out.println(cellIterator.next().getText());
////            }
//            System.out.println("******************");
//        } System.out.println("*-*-*-*-*-*-*-*-*-*-*");
        Thread.sleep(10000);
        driver.quit();

    }

}
