public class OddIndices {
    public int[] returnOddIndicesFromArray(int[] array) {
        if (array.length != 0) {

            int num = 0;
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0)
                    num++;
            }
            int[] oddIndices = new int[num];
            int num1 = 0;
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    oddIndices[num1] = array[i];
                    num1++;
                }

            }

            return oddIndices;
        }


        return new int[]{};
    }
}



