public class Mage extends Player {
    public Mage() {
        this.setHP(10);
        this.setMP(20);
        this.setATK(5);
    }
    
    public void addEquipment(Item i) {
        i.use(this);
    }
    
    @Override
    public void attack(Player p) {
        p.setHP(p.getHP() - (2.5 * this.getATK()));
        this.setMP(this.getMP() - 5);
    }
    
    @Override
    public void attacked(double n) {
        this.setHP(this.getHP() - n);
    }
}
