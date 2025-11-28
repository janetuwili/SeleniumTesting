package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LongPage {
    private WebDriver driver;
    WebElement imageIcon = driver.findElement(By.className("img-fluid"));

    public LongPage(WebDriver driver){
        this.driver = driver;

    }

}
