import StepObject.LoginStep;
import Utils.BrowserAction;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.LoginData.*;


public class LogIn extends BrowserAction {



        @Test
    public  void LoginCorrectData() throws InterruptedException {
            LoginStep step2 = new LoginStep(driver);
            step2.emailFiledAction(correctEmailData);
            step2.passwordFiledAction(correctpasswordlData);
            step2.loginBottonAction();

            Thread.sleep(2000);

            String

                    expectedResult = "მომხმარებელი ან პაროლი არასწორია",
                    actualResult = driver.findElement(By.tagName("p")).getText();



            SoftAssert softAssert= new SoftAssert();
            softAssert.assertEquals(actualResult,expectedResult);
            softAssert.assertAll();



        }



    @Test
    public  void LoginInCorrectData() throws InterruptedException {
        LoginStep step2 = new LoginStep(driver);
        step2.emailFiledAction(incorrectEmailData);
        step2.passwordFiledAction(incorrectpasswordlData);
        step2.loginBottonAction();

        Thread.sleep(2000);



        String

                expectedResult = "მომხმარებელი ან პაროლი არასწორია",
                actualResult = driver.findElement(By.tagName("p")).getText();



        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(actualResult,expectedResult);
        softAssert.assertAll();

        driver.close();


    }

    }




