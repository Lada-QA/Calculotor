package tests;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @DataProvider(name = "Sum with correct number values")
    public Object[][] SumCorrectNumbers() {
        return new Object[][]{
                {1, 0, 1},
                {0, 0, 0},
                {10, 5, 5}
        };
    }

    @DataProvider(name = "Sum with incorrect number values")
    public Object[][] SumIncorrectNumbers() {
        return new Object[][]{
                {-1, 0, 8},
                {10, 9, 2},
                {5, 3, 3}
        };
    }

    @DataProvider(name = "Sum with negative correct number values")
    public Object[][] SumNegativeCorrectNumbers() {
        return new Object[][]{
                {1, -5, 6},
                {6, -2, 8},
                {-1, -1, 0}
        };
    }

    @DataProvider(name = "Minus with correct number")
    public Object[][] MinusCorrectNumbers() {
        return new Object[][]{
                {0, 2, 2},
                {1, 3, 2},
                {9, 11, 2}
        };
    }

    @DataProvider(name = "Minus with incorrect number")
    public Object[][] MinusInCorrectNumbers() {
        return new Object[][]{
                {-1, 3, 2},
                {8, 10, 4},
                {5, 13, 5}
        };
    }

    @DataProvider(name = "Minus with negative number")
    public Object[][] MinusNegativeCorrectNumbers() {
        return new Object[][]{
                {-1, -1, 0},
                {-10, -5, 5},
                {-12, -10, 2}
        };
    }

    @DataProvider(name = "Divide with correct number values")
    public Object[][] DivideNumbersCorrect() {
        return new Object[][]{
                {10, 30, 3},
                {3, 9, 3},
                {5, 25, 5}
        };
    }


    @DataProvider(name = "Divide with incorrect number values")
    public Object[][] DivideNumbersInCorrect() {
        return new Object[][]{
                {24, 55, 5},
                {8, 506, 8},
                {15, 25, 5}
        };
    }

    @DataProvider(name = "Divide with negative number values")
    public Object[][] DivideWithNegativeNumber() {
        return new Object[][]{
                {-2, -6, 3},
                {-17, -85, 5},
                {-49, -196, 4}
        };
    }

    @DataProvider(name = "Multiply correct number values")
    public Object[][] MultiplyWithCorrectNumber() {
        return new Object[][]{
                {1, 1, 1},
                {0, 1, 0},
                {9, 3, 3}
        };
    }

    @DataProvider(name = "Multiply double correct number values")
    public Object[][] MultiplyWithDoubleCorrectNumber() {
        return new Object[][]{
                {8.75, 2.5, 3.5},
                {11.55, 1.1, 10.5},
                {5.66, 11.32, 0.5}
        };
    }

    @DataProvider(name = "Multiply double incorrect number values")
    public Object[][] MultiplyWithDoubleInCorrectNumber() {
        return new Object[][]{
                {0.0, 1.5, 3.1},
                {3.0, 3.0, 3.1},
                {9.5, 9.4, 4.8}
        };
    }
}

