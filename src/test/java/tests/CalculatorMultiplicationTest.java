package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class CalculatorMultiplicationTest extends BaseTest {
    CalculatorPage multiply = new CalculatorPage();

    @Test(dataProvider = "Multiply correct number values", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void calculatorMultiplyWithCorrectNumberTest(double result, double a, double b) {
        Assert.assertEquals(multiply.multiply(a, b), result);
    }

    @Test(dataProvider = "Multiply double correct number values", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void calculatorMultiplicationDoubleTest(double result, double a, double b) {
        Assert.assertEquals(multiply.multiply(a, b), result);
    }

    @Test(dataProvider = "Multiply double incorrect number values", dataProviderClass = DataProviderTest.class,
            retryAnalyzer = Retry.class, groups = {"Smoke"}, description = "These tests should always failed")
    public void calculatorMultiplicationIncorrectDoubleTest(double result, double a, double b) {
        Assert.assertEquals(multiply.multiply(a, b), result);
    }
}
