package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.assertEquals;

public class DropDownTests extends BaseTests {
    @Test
    public void testDropDown(){
       DropDownPage dropDownPage = homePage.clickDropDownMenu();
       dropDownPage.selectFromDown("AnotherAction");
       assertEquals(dropDownPage.getSelectedText(),"Action","Action 1 failed");
       dropDownPage.selectFromDown("Another action");
       assertEquals(dropDownPage.getSelectedText(),"Another action","Action 2 failed");
       dropDownPage.selectFromDown("Something else here");
       assertEquals(dropDownPage.getSelectedText(),"Something else here","Action 3 failed ");
       dropDownPage.selectFromDown("Separated Link");
       assertEquals(dropDownPage.getSelectedText(),"Separated Link","Action 4 failed");
    }
}
