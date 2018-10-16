package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveListWithGoodsTest extends BaseTest {

    @Test(description = "Delete list with goods")
    public void test5() {
        Assert.assertEquals((app.homePage.buylists() - 1), app.homePage.deleteList().buylists());
    }

}
