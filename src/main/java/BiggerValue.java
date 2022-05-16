public class BiggerValue {

    public int returnBiggerValueOfTwo (int a, int b) {
        if (a > Integer.MIN_VALUE && b > Integer.MIN_VALUE && a < Integer.MAX_VALUE && b < Integer.MAX_VALUE) {
            if (a == b) {
                return Integer.MIN_VALUE;
            } else if (b > a) {
                return b;
            } else {
                return a;
            }

        } else {
            return Integer.MAX_VALUE;
        }

    }


}
