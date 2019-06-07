import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        for(Integer x : getFunction(-2,5,3)){
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> getFunction(int a, int b, int h) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                list.add(i);
            } else {
                list.add(-i);
            }
        }
        return list;
    }
}
