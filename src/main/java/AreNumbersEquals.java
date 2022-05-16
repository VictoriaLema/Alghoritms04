public class AreNumbersEquals<c> {

    public int returnZeroIfNumbersEqualsAnOneIfTheFirstIsBigger (int a,int b) {
       if (a == b) {
           return 0;
       } else if (a>b) {
           return 1;
       } else {
           return  -1;
       }
    }

}
