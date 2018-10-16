package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class EditListTest extends BaseTest {
    @Test(description = "Edit name of the exist list")
    public void test2() {
       Assert.assertTrue(app.homePage.renameList("Johny Depp").isContainList("Johny Depp"));
    }

}
