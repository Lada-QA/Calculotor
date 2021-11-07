package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorDifferenceTest extends BaseTest {

    @Test(dataProvider = "Minus with correct number", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void CalculatorDifferenceCorrectTest(int result, int minusDigit) {
        Assert.assertEquals(result, minusDigit);
    }

    @Test(dataProvider = "Minus with in correct number", dataProviderClass = DataProviderTest.class,
            retryAnalyzer = Retry.class, groups = {"Smoke"}, description = "These tests should always failed")
    public void CalculatorDifferenceInCorrectNumberTest(int result, int minusDigit) {
        Assert.assertEquals(result, minusDigit);
    }

    @Test(dataProvider = "Minus with negative number", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void CalculatorDifferenceNegativeNumberTest(int result, int minusDigit) {
        Assert.assertEquals(result, minusDigit);
    }
}
