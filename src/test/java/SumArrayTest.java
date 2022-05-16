import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SumArrayTest {
    @Order(1)
    @Test
    public void SumArrayTestHappyPathGivenPositiveNumbers () {
        int [] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.returnSumOfAllNumbersInArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order (2)
    @Test
    public void SumArrayTestHappyPathGivenNegativeNumbers () {
        int [] array = {-7,-3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.returnSumOfAllNumbersInArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void SumArrayTestNegativeAndPositiveNumbers () {
        int [] array = {-2, 7,-3,0};
        int expectedResult = 2;

        SumArray sa = new SumArray();
        int actualResult = sa.returnSumOfAllNumbersInArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void SumArrayTestAllZeros () {
        int [] array = {0,0,0};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.returnSumOfAllNumbersInArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void SumArrayTestEmptyArray () {
        int [] array = {};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.returnSumOfAllNumbersInArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }





   // {-7, -3} → -10

}
