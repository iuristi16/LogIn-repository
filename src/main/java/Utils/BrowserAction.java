package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BrowserAction {


   public static WebDriver driver = new ChromeDriver();

    @BeforeMethod

    public  void openBrowser(){
        driver.manage().window().maximize();
        driver.get("https://auth.tnet.ge/ka/user/login/?Continue=https://vendoo.ge/");

    }



}
