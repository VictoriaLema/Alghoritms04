import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {
    @Order(1)
    @Test
    public void OddEvenTestHappyPathNegativeOdd () {
        int number =-345;
        String expectedResult;
        expectedResult= "Odd";

        OddEven oe = new OddEven();
        String actualResult = oe.returnIfOddOrEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(2)
    @Test
    public void OddEvenTestHappyPathZero () {
        int number =0;
        String expectedResult;
        expectedResult= "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.returnIfOddOrEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(3)
    @Test
    public void OddEvenTestHappyPathPositiveNumbers () {
        int number =222222;
        String expectedResult;
        expectedResult= "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.returnIfOddOrEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(4)
    @Test
    public void OddEvenTestHappyPathUndefined () {
        int number =2147483647 + 1;
        String expectedResult;
        expectedResult= "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.returnIfOddOrEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void OddEvenTestInteger () {
        int number =2147483647;
        String expectedResult;
        expectedResult= "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.returnIfOddOrEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void OddEvenTestNegativeInteger () {
        int number = - 2147483648;
        String expectedResult;
        expectedResult= "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.returnIfOddOrEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void OddEvenTestNegativeLargerThanInteger () {
        int number = - 2147483648;
        String expectedResult;
        expectedResult= "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.returnIfOddOrEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void OddEvenTestAlmostInteger () {
        int number = - 2147483646;
        String expectedResult;
        expectedResult= "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.returnIfOddOrEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }


}
