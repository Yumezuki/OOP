public class Test {
    public static void main(String[] args) {
//        Account a1 = new Account(50000, "61070033");
//        a1.showAccount();
//        a1.deposit(500);
//        a1.showAccount();
//        a1.withdraw(40000);
//        a1.showAccount();

//        Account a1 = new CheckingAccount();
//        a1.setName("Nook");
//        System.out.println(a1);
//        ((CheckingAccount)a1).setCredit(1000);
//        System.out.println(a1);

        CheckingAccount a1 = new CheckingAccount(1000, "62070033", 500);
        Customer c1 = new Customer();
        Customer c2 = new Customer("Harry", "Potter");
        Customer c3 = new Customer("Harry", "Potter", a1);
        
        System.out.println(c1.equals(c2));
        System.out.println(c3.equals(c2));
    }
}