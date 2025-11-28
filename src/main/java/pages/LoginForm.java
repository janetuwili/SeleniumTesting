package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm {
    private WebDriver driver;
    private By userNameField = By.id("username");
    private By passwordField = By.id("password");
    WebElement submitButton = driver.findElement(By.className("submit"));
    private By errorMessage = By.id("invalid");
    public LoginForm(WebDriver driver){
        this.driver = driver;
    }
    public void setUserName(String userName){
        driver.findElement(userNameField).sendKeys(userName);

    }
    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void setSubmitButton(){
        driver.findElement((By) submitButton).click();
    }
    public String setErrorMessage(){
        return driver.findElement(errorMessage).getText();


    }



}
