public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    public Customer() {}
    
    public Customer(String firstName, String lastName) {
    
    }
    
    public Customer(String firstName, String lastName, CheckingAccount acct) {
    
    }
    
    public void setFirstName(String firstName) {
        
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setAcct(CheckingAccount acct) {
        
    }
    
    public CheckingAccount getAcct() {
        return acct;
    }
    
    @Override
    public String toString() {
        return "";
    }
    
    public boolean equals(Customer c) {
        return false;
    }
}
