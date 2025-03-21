package comparable;

// Represents a calendar date using year, month, and day.

//Make this code implement Comparable interface
public class CalendarDate implements Comparable<CalendarDate> {
    private int year;
    private int month;
    private int day;

    public CalendarDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        String result = year + "/";
        if (month < 10) {
            result += "0";
        }
        result += month + "/";
        if (day < 10) {
            result += "0";
        }
        result += day;
        return result;
    }

    @Override
    public int compareTo(CalendarDate o) {
        if (this.year == o.year) {
            // years are the same
            if (this.month == o.month) {
                // year and month are the same
                return this.day - o.day;
            }
            return this.month - o.month;
        }
        return this.year - o.year;
    }

}