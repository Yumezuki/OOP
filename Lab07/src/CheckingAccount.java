public class CheckingAccount extends Account {
    double credit;
    
    public CheckingAccount(){
        super(0.0, "");
    }
    
    public CheckingAccount(double balance, String name, double credit) {
        super(balance ,name);
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
        return this.credit;
    }
    
    @Override
    public void withdraw(double a) {
        boolean check = false;
        if (a > 0) {
            if (this.balance - a > 0) {
                this.balance -= a;
                check = true;
            } else if ((balance - a < 0) && ((balance - a) + credit > 0)) {
                this.balance = 0;
                this.credit -= a;
                check = true;
            }
        }
        if (check) {
            System.out.println(a + " baht is withdraw from " + this.getName() + " and your credit balance is " + this.getCredit() + ".");
        } else {
            System.out.println("Not enough money!");
        }
    }
    
    public void withdraw(String a) {
        this.withdraw(Double.parseDouble(a));
    }
    
    @Override
    public String toString() {
        return "The " + this.getName() + " account has " + this.getBalance() + " baht and " + this.getCredit() + " credits.";
    }
}
