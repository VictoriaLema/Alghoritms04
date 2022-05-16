public class OddEven {

    public String returnIfOddOrEven(int number) {
        if (number > Integer.MIN_VALUE && number < Integer.MAX_VALUE) {
            if (number % 2 != 0) {
                return "Odd";
            } else {

                return "Even";
           }
        }

        return "Undefined";
    }
}