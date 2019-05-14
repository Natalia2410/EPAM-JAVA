public class Main {
    static final int ATTEMPTS = 1000;
    public static void main(String[] args) {
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < ATTEMPTS; i++) {
            if (random(2) == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        System.out.println("орел " + count1 + "," + "решка " + count0);
    }

    public static int random(int range) {
        return (int) (Math.random() * range);
    }
}