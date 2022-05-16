import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {
    @Order(1)
    @Test
    public void testMinMaxAveAlgorithmHappyPathPositiveNumbersAllIndexes () {
        int index1 = 0;
        int index2 = 4;
        int [] array = {1,2,3,4,5};
        int [] expectedResult = {1,5,3};

        MinMaxAve mma= new MinMaxAve ();
        int [] actualResult = mma.minMaxAverageOfArrayAlgorhytms(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testMinMaxAveAlgorithmHappyPathPositiveNumbersChosenIndexes () {
        int index1 = 2;
        int index2 = 4;
        int [] array = {1,2,3,4,5};
        int [] expectedResult = {3,5,4};

        MinMaxAve mma= new MinMaxAve ();
        int [] actualResult = mma.minMaxAverageOfArrayAlgorhytms(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testMinMaxAveAlgorithmHappyPathNegativeNumbersChosenIndexes () {
        int index1 = 2;
        int index2 = 3;
        int [] array = {-7,-3,-4,-1};
        int [] expectedResult = {-4,-1,-2};

        MinMaxAve mma= new MinMaxAve ();
        int [] actualResult = mma.minMaxAverageOfArrayAlgorhytms(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testMinMaxAveAlgorithmHappyPathNumbersWithZero () {
        int index1 = 1;
        int index2 = 3;
        int [] array = {0,0,0,0};
        int [] expectedResult = {0,0,0};

        MinMaxAve mma= new MinMaxAve ();
        int [] actualResult = mma.minMaxAverageOfArrayAlgorhytms(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void testMinMaxAveAlgorithmEmptyArray () {
        int index1 = 0;
        int index2 = 0;
        int [] array = {};
        int [] expectedResult = {};

        MinMaxAve mma= new MinMaxAve ();
        int [] actualResult = mma.minMaxAverageOfArrayAlgorhytms(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }


}
