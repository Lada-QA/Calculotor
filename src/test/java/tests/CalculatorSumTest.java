package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class CalculatorSumTest extends BaseTest {

    CalculatorPage sum = new CalculatorPage();

    @Test(dataProvider = "Sum with correct number values", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void calculatorSumCorrectNumberTest(int result, int a, int b) {
        Assert.assertEquals(sum.sum(a, b), result);
    }

    @Test(dataProvider = "Sum with incorrect number values", dataProviderClass = DataProviderTest.class,
            retryAnalyzer = Retry.class, groups = {"Smoke"}, description = "These tests should always failed")
    public void calculatorSumIncorrectNumberTest(int result, int a, int b) {
        Assert.assertEquals(sum.sum(a, b), result);
    }

    @Test(dataProvider = "Sum with negative correct number values", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void calculatorSumNegativeNumberTest(int result, int a, int b) {
        Assert.assertEquals(sum.sum(a, b), result);
    }
}

