package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorMultiplicationTest extends BaseTest {
    @Test(dataProvider = "Multiply correct number values", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void CalculatorMultiplyWithCorrectNumberTest(double result, double multiplyDigit) {
        Assert.assertEquals(result,multiplyDigit);
    }

    @Test(dataProvider = "Multiply double correct number values", dataProviderClass = DataProviderTest.class,
            groups = {"Regression"})
    public void CalculatorMultiplicationDoubleTest(double result, double multiplyDigit){
        Assert.assertEquals(result, multiplyDigit);
    }

    @Test(dataProvider = "Multiply double in correct number values", dataProviderClass = DataProviderTest.class,
            retryAnalyzer = Retry.class, groups = {"Smoke"}, description = "These tests should always failed")
    public void CalculatorMultiplicationInCorrectDoubleTest(double result, double multiplyDigit){
        Assert.assertEquals(result, multiplyDigit);
    }
}
