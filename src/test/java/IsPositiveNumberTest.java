import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {


    @Test
    public void testIfNumberIsPositiveHappyPathGivenDataPositive () {

        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.returnTrueIfItIsPositiveNumberOrZero(a);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testIfNumberIsNegativeHappyPathGivenDataNegative() {

        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.returnTrueIfItIsPositiveNumberOrZero(a);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testIfNumberIsNegativeHappyPathGivenDataZero() {


        int a = 0;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.returnTrueIfItIsPositiveNumberOrZero(a);

        Assertions.assertEquals(expectedResult,actualResult);

    }
}
