import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExploreGivenNumbersTest {
    @Order(1)
    @Test
    public void testHappyPathIfANumberIsDividedByThreeAndFive () {

        int a = 15;
        String expectedResult = "Good number";

        ExploreGivenNumber egn = new ExploreGivenNumber();
        String actualResult = egn.describeTheGivenNumberAsDivisionByThreeAndFive(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(2)
    @Test
    public void testHappyPathIfANumberIsDividedByThreeOnly () {

        int a = 9;
        String expectedResult = "Bad number";

        ExploreGivenNumber egn = new ExploreGivenNumber();
        String actualResult = egn.describeTheGivenNumberAsDivisionByThreeAndFive(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(3)
    @Test
    public void testHappyPathIfANumberIsDividedByFiveOnly () {

        int a = -10;
        String expectedResult = "Poor number";

        ExploreGivenNumber egn = new ExploreGivenNumber();
        String actualResult = egn.describeTheGivenNumberAsDivisionByThreeAndFive(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(4)
    @Test
    public void testHappyPathIfANumberIsNotDividedByFiveAndThree () {

        int a = 8;
        String expectedResult = "-1";

        ExploreGivenNumber egn = new ExploreGivenNumber();
        String actualResult = egn.describeTheGivenNumberAsDivisionByThreeAndFive(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIfANumberIsZero () {

        int a = 0;
        String expectedResult = "Good number";

        ExploreGivenNumber egn = new ExploreGivenNumber();
        String actualResult = egn.describeTheGivenNumberAsDivisionByThreeAndFive(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }

}
