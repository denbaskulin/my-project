package Denis04_conditional;

public class LeapYear {
    public static void main(String[] args) {
        // read source data
        var year = 2020;

        // processing
        boolean isLeap;
        /*if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }*/

        // processing 2
        /*if ((year % 400 == 0) || ((year % 100 != 0 && (year % 4 == 0)))) {
            isLeap = true;
        } else {
            isLeap = false;
        }*/

        // processing 3
        isLeap = (year % 400 == 0) || ((year % 100 != 0 && (year % 4 == 0)));

        // display results
        System.out.println(isLeap ? year + " is leap year" : year + " is not leap year");
    }
}
