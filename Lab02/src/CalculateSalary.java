import java.util.*;
public class CalculateSalary {
    public static void main(String[] args) {
        double age, numDay1, numDay2, salary = 0, weight;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        name = sc.nextLine();
        System.out.print("Please insert your age : ");
        age = sc.nextDouble();
        System.out.print("Please insert number of working days : ");
        numDay1 = sc.nextDouble();
        System.out.print("Please insert number of absent days : ");
        numDay2 = sc.nextDouble();
        System.out.print("Please insert your body weight : ");
        weight = sc.nextDouble();
        
        if (age >= 21 & age <= 30) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        } else if (age >= 31 & age <= 40) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        } else if (age >= 41 & age <= 50) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        } else if (age >= 51 & age <= 60) {
            salary = (numDay1 * 3000);
        }
        
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        
        if (weight >= 10 & weight <= 60) {
            salary += 5000;
        } else if (weight >= 61 & weight <= 90) {
            salary += (5000 - ((weight - 60) * 10));
        } else {
            salary += 0;
        }
        
        System.out.println("Your salary and bonus is " + salary + " Baht");
    }
}
