import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;

public class PrintSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int i = scanner.nextInt();
        for (int i1 = 0; i1 < i; i1++) {
            int number = scanner.nextInt();
            if(list.contains(number)){
                continue;
            }

            list.add(number);
        }
        scanner.close();
        System.out.println(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
