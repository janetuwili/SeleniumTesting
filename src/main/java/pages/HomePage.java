package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;

    }
    public LoginForm clickLoginForm(){
        clickLink("Login form");
        return new LoginForm(driver);
    }
    public void clickLongPage(){
        clickLink("Long page");
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite scroll");
        return new InfiniteScrollPage(driver);
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();

    }




}
