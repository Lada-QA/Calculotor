package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSumTest extends BaseTest {


    @Test(dataProvider = "Sum with correct number values", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void CalculatorSumCorrectNumberTest(int result, int sumDigit) {
        Assert.assertEquals(result, sumDigit);
    }

    @Test(dataProvider = "Sum with in correct number values", dataProviderClass = DataProviderTest.class,
            retryAnalyzer = Retry.class, groups = {"Smoke"}, description = "These tests should always failed")
    public void CalculatorSumInCorrectNumberTest(int result, int sumDigit) {
        Assert.assertEquals(result, sumDigit);
    }

    @Test(dataProvider = "Sum with negative correct number values", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void CalculatorSumNegativeNumberTest(int result, int sumDigit) {
        Assert.assertEquals(result, sumDigit);
    }
}

