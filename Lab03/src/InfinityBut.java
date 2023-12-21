import java.util.*;
public class InfinityBut {
    public static void main(String[] args) {
        int num, count_odd = 0, count_even = 0;
        Scanner sc = new Scanner(System.in);
        do {
            num = sc.nextInt();
            if (num != -1) {
                if (num % 2 == 0) {
                    count_even++;
                } else {
                    count_odd++;
                }
            }
        } while (num != -1);
        System.out.println("Odd number = " + count_odd + " and Even number = " + count_even);
    }
}
