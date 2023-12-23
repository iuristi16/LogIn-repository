package DataObject;

import com.github.javafaker.Faker;

public class LoginData {
   static Faker faker1 = new Faker();


    public  static String


    correctEmailData= "nini_ozbe@yahoo.com",
            correctpasswordlData="Iuristi16@",
    incorrectEmailData = faker1.bothify("????##@yahoo.com"),
    incorrectpasswordlData = faker1.bothify("???##??##");
}
