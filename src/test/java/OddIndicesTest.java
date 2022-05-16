import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {
    @Order(1)
    @Test
    public void OddIndicesTestHappyPathGivenData () {
        int [] array = {-45, 590, 234, 985, 12, 68};
        //Expected Result =  {590, 985, 68}
        int [] expectedResult = {590, 985, 68};

        OddIndices oi = new OddIndices();
        int [] actualResult = oi.returnOddIndicesFromArray(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);


    }

    @Test
    public void OddIndicesTestMoreOddIndices() {
        int [] array = {-45, 590, 234, 985, 12, 68, 68, 69};
        int [] expectedResult = {590, 985, 68, 69};

        OddIndices oi = new OddIndices();
        int [] actualResult = oi.returnOddIndicesFromArray(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Test
    public void OddIndicesTestSevenGivenNumbers() {
        int [] array = {-45, 590, 234, 985, 12, 68, 68};
        int [] expectedResult = {590, 985, 68};

        OddIndices oi = new OddIndices();
        int [] actualResult = oi.returnOddIndicesFromArray(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Test
    public void OddIndicesAllZeros() {
        int [] array = {0,0,0,0,0};
        int [] expectedResult = {0,0};

        OddIndices oi = new OddIndices();
        int [] actualResult = oi.returnOddIndicesFromArray(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void OddIndicesOneNumber() {
        int [] array = {7};
        int [] expectedResult = {};

        OddIndices oi = new OddIndices();
        int [] actualResult = oi.returnOddIndicesFromArray(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void OddIndicesEmptyArray() {
        int [] array = {};
        int [] expectedResult = {};

        OddIndices oi = new OddIndices();
        int [] actualResult = oi.returnOddIndicesFromArray(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }


}
