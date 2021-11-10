package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class CalculatorDifferenceTest extends BaseTest {
    CalculatorPage minus = new CalculatorPage();

    @Test(dataProvider = "Minus with correct number", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void calculatorDifferenceCorrectTest(int result, int a, int b) {
        Assert.assertEquals(minus.minus(a, b), result);
    }

    @Test(dataProvider = "Minus with incorrect number", dataProviderClass = DataProviderTest.class,
            retryAnalyzer = Retry.class, groups = {"Smoke"}, description = "These tests should always failed")
    public void calculatorDifferenceIncorrectNumberTest(int result, int a, int b) {
        Assert.assertEquals(minus.minus(a, b), result);
    }

    @Test(dataProvider = "Minus with negative number", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void calculatorDifferenceNegativeNumberTest(int result, int a, int b) {
        Assert.assertEquals(minus.minus(a, b), result);
    }
}
