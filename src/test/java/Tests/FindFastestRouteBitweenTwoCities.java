package Tests;

        import org.testng.Assert;
        import org.testng.annotations.Test;



public class FindFastestRouteBitweenTwoCities extends BaseTest {
    @Test(description = "FindFastestRouteBetweenTwoCities")
    public void test12()  {
        Assert.assertTrue(app.homePage.searchCity("Kharkiv").isGetTipsListContains("Kharkiv"));
        Assert.assertTrue(app.homePage.createRoute("kiev"));
    }
}
