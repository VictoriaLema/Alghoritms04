import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualsTest {
    @Order(1)
    @Test
   // @RepeatedTest(10)
    public void testIfNumbersAreEqualsHappyPathPositiveEquals () {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEquals  ane = new AreNumbersEquals();
        int actualResult = ane.returnZeroIfNumbersEqualsAnOneIfTheFirstIsBigger(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Order(2)
    @Test
    public void testIfNumbersAreEqualsHappyPathFirstSmaller () {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEquals  ane = new AreNumbersEquals();
        int actualResult = ane.returnZeroIfNumbersEqualsAnOneIfTheFirstIsBigger(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Order(3)
    @Test
    public void testIfNumbersAreEqualsHappyPathFirstBigger () {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEquals  ane = new AreNumbersEquals();
        int actualResult = ane.returnZeroIfNumbersEqualsAnOneIfTheFirstIsBigger(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testIfNumbersAreEqualsTwoZeros () {
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        AreNumbersEquals ane = new AreNumbersEquals();
        int actualResult = ane.returnZeroIfNumbersEqualsAnOneIfTheFirstIsBigger(a,b);

        Assertions.assertEquals(a,b);


    }

}
