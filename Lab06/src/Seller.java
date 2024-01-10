public class Seller extends Employee {
    public Food sell(Employee e) {
        Wallet who = e.getWallet();
        Wallet self = this.getWallet();
        Food f = new Food();
        
        if (who.getBalance() >= Food.getPrice()) {
            self.setBalance(self.getBalance() + Food.getPrice());
            who.setBalance(who.getBalance() - Food.getPrice());
            return f;
        } else {
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
