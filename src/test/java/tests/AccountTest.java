package tests;

import model.User;
import org.testng.annotations.Test;

public class AccountTest {

    @Test
    public void createAccountTest(){
        User user = new User("ckotd-9hz7@force.com", "TMSAQA20onl", "https://eu44.lightning.force.com");

    }
}
