public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    public Customer() {}
    
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = null;
    }
    
    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }
    
    public CheckingAccount getAcct() {
        return acct;
    }
    
    @Override
    public String toString() {
        if (acct == null) {
            return firstName + lastName + " doesn’t have account.";
        } else {
            return "The " + this.getFirstName() + " account has " + this.getAcct().getBalance() + " baht and " + this.getAcct().getCredit() + " credits.";
        }
    }
    
    public boolean equals(Customer c) {
        return (this.getFirstName() + " " + this.getLastName()).equals(c.getFirstName() + " " + c.getLastName());
    }
}
