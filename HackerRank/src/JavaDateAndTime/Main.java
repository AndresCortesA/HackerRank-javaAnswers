package JavaDateAndTime;

import java.util.Calendar;

public class Main {
    public static String findDay(int month, int day, int year) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(year, month-1, day);

        int days = calendario.get(Calendar.DAY_OF_WEEK);

        String[] dayOfWeek = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY",};
        return dayOfWeek[days];
    }

    public static void main(String[] args) {
        System.out.println(findDay(8 ,5,2015));
    }
}
