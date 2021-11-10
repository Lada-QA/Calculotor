package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;


public class CalculatorDivisionTest extends BaseTest {
    CalculatorPage div = new CalculatorPage();

    @Test(dataProvider = "Divide with correct number values", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void calculatorDivideCorrectTest(int result, int a, int b) {
        Assert.assertEquals(div.div(a, b), result);
    }

    @Test(dataProvider = "Divide with incorrect number values", dataProviderClass = DataProviderTest.class,
            retryAnalyzer = Retry.class, groups = {"Smoke"}, description = "These tests should always failed")
    public void calculatorDivideIncorrectTest(int result, int a, int b) {
        Assert.assertEquals(div.div(a, b), result);
    }

    @Test(dataProvider = "Divide with negative number values", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void calculatorDivideWithNegativeNumberTest(int result, int a, int b) {
        Assert.assertEquals(div.div(a, b), result);
    }
}
