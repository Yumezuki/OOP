import java.util.*;
public class Bank {
    public static void main(String[] args) {
        double total, deposit;
        char account;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        deposit = sc.nextDouble();
        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        account = sc.next().charAt(0);

        if (account == 'A' | account == 'C') {
            total = deposit * 0.015;
        } else if (account == 'B') {
            total = deposit * 0.02;
        } else {
           total = deposit * 0.05;
        }
        System.out.print("Your total money in one year = ");
        System.out.println(deposit + total);
    }
}
