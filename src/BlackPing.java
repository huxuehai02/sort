import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackPing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while(true){

            int num = scanner.nextInt();
            if(0 == num){
               break;
            }

            list.add( num);
        }
        for (Integer i : list) {
            Integer count = 0;
            dealKongPing(i,count);
        }
    }

    private static void dealKongPing(int i,Integer count) {
        if(i < 2){
            System.out.println(0);
        }
        int change = i / 3;
        int leave = i % 3;
        if(change + leave >= 3){
            dealKongPing(change+leave,count+change);
            return;
        }
        int second = change + leave;
        if(second == 2){
            System.out.println(count + change +1);
        }else {
            System.out.println(count + change);
        }
    }
}
