package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorDivisionTest extends BaseTest {

    @Test(dataProvider = "Divide with correct number values", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void CalculatorDivideCorrectTest(int result, int divDigit) {
        Assert.assertEquals(result, divDigit);
    }

    @Test(dataProvider = "Divide with in Correct number values", dataProviderClass = DataProviderTest.class,
            retryAnalyzer = Retry.class, groups = {"Smoke"}, description = "These tests should always failed")
    public void CalculatorDivideInCorrectTest(int result, int divDigit) {
        Assert.assertEquals(result, divDigit);
    }

    @Test(dataProvider = "Divide with negative number values", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void CalculatorDivideWithNegativeNumberTest(int result, int divDigit) {
        Assert.assertEquals(result, divDigit);
    }
}
