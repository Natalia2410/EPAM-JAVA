package ProgrammingWithClasses.Block1.Task5;

import java.util.Random;

public class Counter {
    private int current;
    private int max;
    private int min;

    public Counter() {
        this.current = 0;
        this.max = 100;
        this.min = 0;
    }

    public Counter(int min, int max) {
        this.max = max;
        this.min = min;
        Random random = new Random();
        int diff = max - min;
        this.current = random.nextInt(diff + 1);
        this.current += min;
    }

    public int getCurrent() {
        return current;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void increase() throws Exception {
        current++;
        if (current > max) {
            throw new Exception("you have exceeded the allowable value");
        }
    }

    public void decrease() throws Exception {
        current--;
        if (current < min) {
            throw new Exception("you have exceeded the allowable value");
        }
    }
}
