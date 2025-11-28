package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    @Test
    public void testInvalidCredentials(){
        var loginForm = homePage.clickLoginForm();
        loginForm.setUserName("jeannette");
        loginForm.setPasswordField("1234uwili");
        loginForm.setSubmitButton();
        assertTrue(loginForm.setErrorMessage().contains("userName is invalid"),"incorrect");


    }
}
