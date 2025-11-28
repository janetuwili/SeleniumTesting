package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    private WebDriver driver;
    private By dropDowmElement = By.id("my-dropdown-1");
    public  DropDownPage(WebDriver driver){
        this.driver = driver;

    }
    public void selectFromDown(String actions){
        Select select = new Select(driver.findElement(dropDowmElement));
        select.selectByVisibleText(actions);



    }
    public String getSelectedText(){
        Select select = new Select(driver.findElement(dropDowmElement));
        return select.getFirstSelectedOption().getText();

    }
}
