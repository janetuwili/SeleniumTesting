package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseOverPage {
    private WebDriver driver;
    private By imgPictures = By.className("img-fluid");
    private By imgCaptions = By.className("caption");
    public MouseOverPage(WebDriver driver){
        this.driver = driver;

    }
    public void hoverFigure(int index){
        WebElement figure = driver.findElement(imgPictures).get(index-1);

    }



}
