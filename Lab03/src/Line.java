import java.util.*;
public class Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Please insert a number : ");
        num = sc.nextInt();
        for (int i = 1; i <= num; ++i) {
            if (i % 5 == 0) {
                System.out.print("/");
            } else {
                System.out.print("|");
            }
        }
    }
}
