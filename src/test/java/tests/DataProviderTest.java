package tests;

import org.testng.annotations.DataProvider;
import pages.CalculatorDifferencePage;
import pages.CalculatorDivisionPage;
import pages.CalculatorMultiplicationPage;
import pages.CalculatorSumPage;

public class DataProviderTest {

    private CalculatorSumPage sum = new CalculatorSumPage();
    private CalculatorDifferencePage minus = new CalculatorDifferencePage();
    private CalculatorDivisionPage divide = new CalculatorDivisionPage();
    private CalculatorMultiplicationPage mult = new CalculatorMultiplicationPage();

    @DataProvider(name = "Sum with correct number values")
    public Object[][] SumCorrectNumbers() {
        return new Object[][]{
                {1, sum.sum(0, 1)},
                {0, sum.sum(0, 0)},
                {10, sum.sum(5, 5)}
        };
    }

    @DataProvider(name = "Sum with in correct number values")
    public Object[][] SumInCorrectNumbers() {
        return new Object[][]{
                {-1, sum.sum(0, 8)},
                {10, sum.sum(9, 2)},
                {5, sum.sum(3, 3)}
        };
    }

    @DataProvider(name = "Sum with negative correct number values")
    public Object[][] SumNegativeCorrectNumbers() {
        return new Object[][]{
                {1, sum.sum(-5, 6)},
                {6, sum.sum(-2, 8)},
                {-1, sum.sum(-1, 0)}
        };
    }

    @DataProvider(name = "Minus with correct number")
    public Object[][] MinusCorrectNumbers() {
        return new Object[][]{
                {0, minus.minus(2, 2)},
                {1, minus.minus(3, 2)},
                {9, minus.minus(11, 2)}
        };
    }

    @DataProvider(name = "Minus with in correct number")
    public Object[][] MinusInCorrectNumbers() {
        return new Object[][]{
                {-1, minus.minus(3, 2)},
                {8, minus.minus(10, 4)},
                {5, minus.minus(13, 5)}
        };
    }

    @DataProvider(name = "Minus with negative number")
    public Object[][] MinusNegativeCorrectNumbers() {
        return new Object[][]{
                {-1, minus.minus(-1, 0)},
                {-10, minus.minus(-5, 5)},
                {-12, minus.minus(-10, 2)}
        };
    }

    @DataProvider(name = "Divide with correct number values")
    public Object[][] DivideNumbersCorrect() {
        return new Object[][]{
                {10, divide.div(30, 3)},
                {3, divide.div(9, 3)},
                {5, divide.div(25, 5)}
        };
    }


    @DataProvider(name = "Divide with in Correct number values")
    public Object[][] DivideNumbersInCorrect() {
        return new Object[][]{
                {24, divide.div(55, 5)},
                {8, divide.div(506, 8)},
                {15, divide.div(25, 5)}
        };
    }
    @DataProvider(name = "Divide with negative number values")
    public Object[][] DivideWithNegativeNumber() {
        return new Object[][]{
                {-2, divide.div(-6, 3)},
                {-17, divide.div(-85, 5)},
                {-49, divide.div(-196, 4)}
        };
    }
    @DataProvider(name = "Multiply correct number values")
    public Object[][] MultiplyWithCorrectNumber() {
        return new Object[][]{
                {1, mult.multiply(1, 1)},
                {0, mult.multiply(1, 0)},
                {9, mult.multiply(3, 3)}
        };
    }
    @DataProvider(name = "Multiply double correct number values")
    public Object[][] MultiplyWithDoubleCorrectNumber() {
        return new Object[][]{
                {8.75, mult.multiply(2.5, 3.5)},
                {11.55, mult.multiply(1.1, 10.5)},
                {5.66, mult.multiply(11.32, 0.5)}
        };
    }

    @DataProvider(name = "Multiply double in correct number values")
    public Object[][] MultiplyWithDoubleInCorrectNumber() {
        return new Object[][]{
                {0.0, mult.multiply(1.5, 3.1)},
                {3.0, mult.multiply(3.0, 3.1)},
                {9.5, mult.multiply(9.4, 4.8)}
        };
    }
}

