package tests;

import org.testng.annotations.*;


@Listeners(TestListener.class)
public class BaseTest {
    CalculatorDivisionTest calculatorDivisionTest;
    CalculatorSumTest calculatorSumTest;
    CalculatorMultiplicationTest calculatorMultiplicationTest;
    CalculatorDifferenceTest calculatorDifferenceTest;


    @BeforeMethod
    public void initTest() {
        calculatorDifferenceTest = new CalculatorDifferenceTest();
        calculatorDivisionTest = new CalculatorDivisionTest();
        calculatorMultiplicationTest = new CalculatorMultiplicationTest();
        calculatorSumTest = new CalculatorSumTest();
    }


    @AfterMethod(alwaysRun = true)
    public void closeTest() {
        System.out.println("Close test");
    }
}
