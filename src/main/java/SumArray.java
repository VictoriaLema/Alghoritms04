public class SumArray {
    public int returnSumOfAllNumbersInArray (int [] array) {
        int number = 0;
        if (array.length !=0 ) {
            for (int i = 0; i < array.length; i++) {
                number = number + array[i];
            }

            return number;
        }

        return number;
    }
}
