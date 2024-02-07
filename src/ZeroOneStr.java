import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZeroOneStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num  = scanner.nextInt();
        System.out.println("字符串的长度"+num);
        String next = scanner.next();
        int length = next.length();
        List<Integer> list = new ArrayList<>();
        int count0 = 0;
        int count1 = 0;
        for (int i = 0;i< length;i++ ) {
            int i1 = Integer.parseInt(String.valueOf(next.charAt(i)));
            list.add(i1);
            switch(i1){
                case 1:
                    count1++;
                    break;
                case 0:
                    count0++;
                    break;
                default:
                    break;
            }
        }
        if(count0 > count1){
            Iterator<Integer> iterator = list.iterator();
             while(iterator.hasNext()){
                 Integer next1 = iterator.next();
                 if(next1 ==1){
                     iterator.remove();
                 }
             }
            list.add(1);
        }

        if(count0 <= count1){
            Iterator<Integer> iterator = list.iterator();
            while(iterator.hasNext()){
                Integer next1 = iterator.next();
                if(next1 ==0){
                    iterator.remove();
                }
            }
            list.add(0);
        }
        System.out.println(list);
        int count = 0;
        int val = 0;
        for (int i = 1; i <= list.size(); i++) {
            if(i == 1) {
                count += i;
                val =1;
                continue;
            }
            if(!Objects.equals(list.get(i - 1), list.get(i - 2))){
                count += 1;
                val =1;
            }
            if(Objects.equals(list.get(i - 1), list.get(i - 2))){
                val = val+1;
                count += val;
            }
            System.out.println("count = " + count);
        }
        System.out.println(count);
    }
}