public class ExploreGivenNumber {
    public String describeTheGivenNumberAsDivisionByThreeAndFive(int m) {
        if (m > Integer.MIN_VALUE && m < Integer.MAX_VALUE) {
            if (m % 3 == 0 && m % 5 == 0) {

                return "Good number";
            } else if (m % 3 == 0 && m % 5 != 0) {

                return "Bad number";
            } else if (m % 3 != 0 && m % 5 == 0) {

                return "Poor number";
            } else {
                return "-1";
            }
        }

        return "number is not correct";
    }

}

