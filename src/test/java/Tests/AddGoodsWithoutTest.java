package Tests;

import Pages.AllPages;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AddGoodsWithoutTest extends BaseTest {

    @Test(description = "Add in the list goods without comment, price, amount, category")
    public void test6() {

        Assert.assertTrue(app.homePage.createNewList("Sunday", "")
                .addNewProductToList("Iron", "")
                .addNewProductToList("Gold", "")
                .backButtonTwiceZ()
                .isContainList("Sunday"));
        app.homePage.deleteList();


    }

}
