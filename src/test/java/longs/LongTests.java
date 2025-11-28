package longs;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LongPage;

import static org.testng.Assert.assertEquals;

public class LongTests extends BaseTests {
    @Test
    public void testLongPage(){
        HomePage homePage1 = homePage;
        homePage1.clickLongPage();
        assertEquals(homePage1,"correct page","invalid page");






    }
}
