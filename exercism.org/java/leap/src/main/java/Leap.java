import java.time.Year;

class Leap {
    boolean isLeapYear(int year) {
//        if (year % 400 == 0) return true;
//        else if (year % 100 == 0) return false;
//        else if (year % 4 == 0) return true;
//        else return false;

//        return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));

        return Year.of(year).isLeap();
    }
}
