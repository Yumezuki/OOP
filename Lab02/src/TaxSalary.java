import java.util.*;
public class TaxSalary {
    public static void main(String[] args) {
        int salary;
        Scanner sc = new Scanner(System.in);
        salary = sc.nextInt();
        if (salary > 50000.00) {
            System.out.println(salary * 0.1);
        }
        else {
            System.out.println(salary * 0.05);
        }
    }
}
