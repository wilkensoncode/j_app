package leap_year;

public class Leap {
    public static boolean leap(int year) {
        boolean isLeap = false;
        if (year % 4 == 0 && year % 100 == 0) {
            if (year % 400 == 0){
                isLeap = true;
            }
        } else if (year % 4 == 0 && year % 100 != 0 ) {
            isLeap = true;
        }
        return isLeap;
    }
}
