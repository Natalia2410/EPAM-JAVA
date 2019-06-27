package ProgrammingWithClasses.Task6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Time {
    private Calendar calendar;
    private int hour;
    private int minute;
    private int second;

    public Time() {
        Random random = new Random();
        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY, 25);
        calendar.set(Calendar.HOUR, random.nextInt(23));
        calendar.set(Calendar.MINUTE, random.nextInt(59));
        calendar.set(Calendar.SECOND, random.nextInt(59));
        this.calendar = calendar;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 60) {
            calendar.set(Calendar.SECOND, second);
        } else {
            calendar.set(Calendar.SECOND, 0);
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 60) {
            calendar.set(Calendar.MINUTE, minute);
        } else {
            calendar.set(Calendar.MINUTE, 0);
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 24) {
            calendar.set(Calendar.HOUR, hour);
        } else {
            calendar.set(Calendar.HOUR_OF_DAY, 0);
        }
    }

    public void increaseSecond(int second) {
        calendar.add(Calendar.SECOND, second);
    }

    public void increaseMinute(int minute) {
        calendar.add(Calendar.MINUTE, minute);
    }

    public void increaseHour(int hour) {
        calendar.add(Calendar.HOUR_OF_DAY, hour);
    }

    public void getCurrentTime() {
        System.out.println(calendar.getTime());
    }
}
