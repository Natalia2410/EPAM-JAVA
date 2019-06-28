package ProgrammingWithClasses.Block1.Task6;

public class Main {
    public static void main(String[] args) {
        Time currentTime = new Time();
        currentTime.getCurrentTime();
        currentTime.setSecond(45);
        currentTime.getCurrentTime();
        currentTime.setMinute(65);
        currentTime.getCurrentTime();
        currentTime.setHour(32);
        currentTime.getCurrentTime();
        currentTime.increaseSecond(65);
        currentTime.getCurrentTime();
        currentTime.increaseMinute(59);
        currentTime.getCurrentTime();
        currentTime.increaseHour(25);
        currentTime.getCurrentTime();
    }
}
