package StepObject;

import PageObject.LoginObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginStep extends LoginObject {

    WebDriver driver;
    public  LoginStep(WebDriver driver1){
        driver=driver1;

    }
    public  void emailFiledAction(String email){

        driver.findElement(emileFiled).sendKeys(email);
    }

    public  void  passwordFiledAction (String password){

        driver.findElement(passwordFiled).sendKeys(password);
    }

    public void  loginBottonAction (){
        driver.findElement(loginBotton).sendKeys(Keys.ENTER);
    }
}
