import java.util.Scanner;

public class SixTeenToTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        if(next.contains("0x")){
            System.out.println(Integer.parseInt(next.substring(2,next.length()), 16));
        }else{
            System.out.println(Integer.parseInt(next, 16));
        }
    }
}
