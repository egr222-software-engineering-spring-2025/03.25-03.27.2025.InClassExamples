package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalendarDateClient {

    public static void main(String[] args) {
        //Declare and define list of comparable.CalendarDate.TimeSpan objects
        List<CalendarDate> calendarDateList = new ArrayList<>();
        calendarDateList.add(new CalendarDate(2024, 2, 28));
        calendarDateList.add(new CalendarDate(1979, 9, 19));
        calendarDateList.add(new CalendarDate(1981, 5, 8));
        calendarDateList.add(new CalendarDate(1950, 7, 11));
        calendarDateList.add(new CalendarDate(1950, 7, 11));

        System.out.println("Sorting " + calendarDateList);
        Collections.sort(calendarDateList);
        System.out.println("   result " + calendarDateList);
    }
}