package LeapYear;

/**
 * Created by ueliton on 7/1/16.
 */
public abstract class LeapYear {
    public static boolean isLeapYear(int year) {

        if((year % 4 == 0) && !(year % 100 == 0))
            return true;
        else
            if(year % 400 == 0)
                return true;

        return false;
    }
}
