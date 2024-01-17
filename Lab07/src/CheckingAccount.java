public class CheckingAccount extends Account {
    private double credit;
    
    public CheckingAccount(){}
    
    public CheckingAccount(double balance, String name, double credit) {
        this.balance = balance;
        this.name = name;
        this.credit = credit;
    }
    
    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer");
        }
    }
    
    public double getCredit() {
        return credit;
    }
    
    @Override
    public void withdraw(double a) {
        
    }
    
    public void withdraw(String a) {
        
    }
    
    @Override
    public String toString() {
        return "";
    }
}
