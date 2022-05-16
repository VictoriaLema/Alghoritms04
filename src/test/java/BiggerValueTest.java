import org.junit.jupiter.api.*;

import java.lang.reflect.Method;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {
    @Order(1)
    @Test
    public void testBiggerValueHappyPathWithPositiveNumbers () {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.returnBiggerValueOfTwo(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testBiggerValueWithNegativeNumbers () {
        int a = -200;
        int b = -350;
        int expectedResult = -200;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.returnBiggerValueOfTwo(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testBiggerValueWithOneZero () {
        int a = 0;
        int b = -350;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.returnBiggerValueOfTwo(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testBiggerValueWithSameNumbers () {
        int a = 7;
        int b = 7;
        int expectedResult = Integer.MIN_VALUE;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.returnBiggerValueOfTwo(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }


}
