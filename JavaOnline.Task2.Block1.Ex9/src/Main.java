import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n = 50;
        int[] array = new int[n];
        initialize(array, 100);
        print(array);
        System.out.println("");
        System.out.println(maxCount(array));
    }

    public static void initialize(int[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(range);
        }
    }

    public static void print(int[] array) {
        for (Integer x : array) {
            System.out.print(x + " ");
        }
    }

    public static int maxCount(int[] array) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            map.putIfAbsent(key, 0);
            map.put(key, map.get(key) + 1);
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            int key = pair.getKey();
            int value = pair.getValue();
            System.out.println(key + " " + value);
        }
        int max = Collections.max(map.values());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (max == pair.getValue()) {
                arrayList.add(pair.getKey());
            }
        }

        if ((arrayList.size() > 1)) {
            return Collections.min(arrayList);
        } else {
            return arrayList.get(0);
        }
    }
}
