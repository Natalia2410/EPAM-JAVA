package BasicsOfOOP.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Calendar {
    private ArrayList<Day> days;

    public class Day {
        private Date name;
        private String isWeekend;
        private String isPublicHoliday;

        public Day(Date name, String isWeekend, String isPublicHoliday) {
            this.name = name;
            this.isWeekend = isWeekend;
            this.isPublicHoliday = isPublicHoliday;
        }

        public Date getName() {
            return name;
        }

        public String getIsWeekend() {
            return isWeekend;
        }

        public String getIsPublicHoliday() {
            return isPublicHoliday;
        }
    }

    public void setCalendar() throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many days do you want to add to the calendar?");
        int count = Integer.parseInt(reader.readLine());
        days = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("Input date in format yyyyMMdd:");
            String inputDate = reader.readLine();
            DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
            Date date = formatter.parse(inputDate);
            java.util.Calendar newCalendar = java.util.Calendar.getInstance();
            newCalendar.setTime(date);
            if (newCalendar.get(java.util.Calendar.MONTH) == java.util.Calendar.DECEMBER && newCalendar.get(java.util.Calendar.DAY_OF_MONTH) == 31 ||
                    newCalendar.get(java.util.Calendar.MONTH) == java.util.Calendar.MARCH && newCalendar.get(java.util.Calendar.DAY_OF_MONTH) == 8 ||
                    newCalendar.get(java.util.Calendar.MONTH) == java.util.Calendar.JULY && newCalendar.get(java.util.Calendar.DAY_OF_MONTH) == 4 ||
                    newCalendar.get(java.util.Calendar.MONTH) == java.util.Calendar.NOVEMBER && newCalendar.get(java.util.Calendar.DAY_OF_MONTH) == 7) {
                if (newCalendar.get(java.util.Calendar.DAY_OF_WEEK) == java.util.Calendar.SUNDAY) {
                    days.add(new Day(date, "is weekend", "public holiday"));
                } else if (newCalendar.get(java.util.Calendar.DAY_OF_WEEK) == java.util.Calendar.SATURDAY) {
                    days.add(new Day(date, "is weekend", "public holiday"));
                } else {
                    days.add(new Day(date, "is work day", "public holiday"));
                }
            } else {
                if (newCalendar.get(java.util.Calendar.DAY_OF_WEEK) == java.util.Calendar.SUNDAY) {
                    days.add(new Day(date, "is weekend", "not a holiday"));
                } else if (newCalendar.get(java.util.Calendar.DAY_OF_WEEK) == java.util.Calendar.SATURDAY) {
                    days.add(new Day(date, "is weekend", "not a holiday"));
                } else {
                    days.add(new Day(date, "is work day", "not a holiday"));
                }
            }
        }
    }

    public void printCalendar() {
        for (int i = 0; i < this.days.size(); i++) {
            System.out.println(i + 1 + " " + this.days.get(i).getName() + " | " + this.days.get(i).getIsWeekend() + " | " + this.days.get(i).getIsPublicHoliday());
        }
    }
}
