package utilsPackage;

import basePackage.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegisterPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= baseClass.setConnection();
        driver.get("http://demo.automationtesting.in/Register.html");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        WebElement eFirstName=driver.findElement(By.xpath("//*[@ng-model='FirstName']"));
        WebElement eLastName=driver.findElement(By.xpath("//*[@ng-model='FirstName']"));
        WebElement eAddress=driver.findElement(By.xpath("//*[@ng-model='Adress']"));
        WebElement eEmailAddress=driver.findElement(By.xpath("//*[@ng-model='EmailAdress']"));
        WebElement ePhone=driver.findElement(By.xpath("//*[@ng-model='Phone']"));
       WebElement eGenderRadiosMale=driver.findElement(By.xpath("//*[@ng-model='radiovalue' and @value='Male']"));
         WebElement eGenderRadiosFemale=driver.findElement(By.xpath("//*[@ng-model='radiovalue' and @value='FeMale']"));
        WebElement eChkHobbiesCricket=driver.findElement(By.xpath("//*[@value='Cricket' and @id='checkbox1']"));
        WebElement eChkHobbiesMovies=driver.findElement(By.xpath("//*[@value='Movies' and @id='checkbox2']"));
        WebElement eChkHobbiesHoney=driver.findElement(By.xpath("//*[@value='Hockey' and @id='checkbox3']"));


//        eFirstName.sendKeys("Mahesh");
//
//        eLastName.sendKeys("Rane");
//          eAddress .sendKeys("Kharbadi Road, Motala , Dist- Buldana,Maharashtra 443103");
//          eEmailAddress .sendKeys("mprane1312@gmail.com");
//          ePhone .sendKeys("9028871387");
//          eGenderRadiosMale .click();
//          eGenderRadiosFemale.click();
//          eChkHobbiesCricket.click();
//          eChkHobbiesMovies.click();
//          eChkHobbiesHoney.click();
        System.out.println("Before");
        WebElement elementLanguage=driver.findElement(By.xpath("//*[@id='msdd']"));
        elementLanguage.click();
        System.out.println("After Click");System.out.println("-----------------------------------");
        List<WebElement> eLanguages=driver.findElements(By.xpath("//*[@style='list-style:none;max-height: 230px;overflow: scroll;']/li/a"));

        for(int i=1;i<eLanguages.size();i++){
            if(i<=5){
                eLanguages.get(i).click();
            }else{break;}

        }  System.out.println("-----------------------------------");
        Thread.sleep(15000);
        List<WebElement> eDeselectLanguages=driver.findElements(By.xpath("//*[@id='msdd']/div/span"));
       Iterator<WebElement> itrDeselectLanguage=eDeselectLanguages.iterator();
       while (itrDeselectLanguage.hasNext()){
           itrDeselectLanguage.next().click();
       }

        // eLanguages.get().click();
        System.out.println("Select Element");
//        WebElement eSkillDropdown=driver.findElement(By.xpath("//*[@ng-model='Skill']"));
//        WebElement eCountryDropdown=driver.findElement(By.xpath("//*[@ng-model='country']"));
//        WebElement eSelectCountry=driver.findElement(By.xpath("//*[@role='combobox']"));
//
//
//        WebElement eDOByear=driver.findElement(By.xpath("//*[@ng-model='yearbox']"));
//        WebElement eDOBmonth=driver.findElement(By.xpath("//*[@ng-model='monthbox']"));
//        WebElement eDOBday=driver.findElement(By.xpath("//*[@ng-model='daybox']"));
//        WebElement ePassword=driver.findElement(By.xpath("//*[@ng-model='Password']"));
//        WebElement eConfirmPassword=driver.findElement(By.xpath("//*[@ng-model='CPassword']"));
//        WebElement eSubmitButton=driver.findElement(By.xpath("//*[@id='submitbtn']"));
//        WebElement eRefreshButton=driver.findElement(By.xpath("//*[@id='Button1']"));
//        WebElement eUploadImage=driver.findElement(By.xpath("//*[@id='imagesrc']"));

//                  Select selectLanguage=new Select(eLanguages);
//        selectLanguage.selectByVisibleText("Hindi");
//        selectLanguage.selectByVisibleText("English");

//        Select   selectSkill =new Select(eSkillDropdown);
//        selectSkill.selectByVisibleText("C");
//
//        Select   selectCountry=new Select(eCountryDropdown);
//          selectCountry.selectByVisibleText("India");
//
//        Select   selectObjCountry=new Select(eCountryDropdown);
//        selectCountry.selectByVisibleText("India");
//        Select selectObjeSelectCountry=new Select(eSelectCountry);
//        selectObjeSelectCountry.selectByVisibleText("India");
//        Thread.sleep(15000);
//driver.quit();
        System.out.println("Finish");
    }
}
