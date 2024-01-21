public class Player {
    private Houses houses;
    private int hp = 20;
    private int mana = 50;
    private final int attackDamage = 2;
    private final String name;
    
    public Player(String name){
        this.name = name;
    }
    
    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    
    public int getAttackDamage(){
        return attackDamage;
    }
    
    public int getHP(){
        return hp;
    }
    
    public Houses getHouses(){
        return houses;
    }
    
    public int getMana(){
        return mana;
    }
    
    public String getName(){
        return name;
    }
    
    public void setHp(int hp){
        if (hp > 0 && hp <= 20){
            this.hp = hp;
        } else if (hp > 20){
            this.hp = 20;
        } else {
            this.hp = 0;
        }
    }
    
    public void setHouses(Houses houses){
        this.houses = houses;
    }
    
    public void setMana(int mana){
        if (mana > 0 && mana <= 50){
            this.mana = mana;
        } else if (mana > 50){
            this.mana = 50;
        }else {
            this.mana = 0;
        }
    }
    
    public void attack(Player target, Spell spell){
        if (this.getHouses() instanceof Gryffindor) {
            ((Gryffindor)this.getHouses()).attackSpell(this, target, spell);
        } else if (this.getHouses() instanceof Hufflepuff) {
            ((Hufflepuff)this.getHouses()).attackSpell(this, target, spell);
        }
        if (target.getHP() == 0){
            System.out.println("DEAD: " + target.name + " was killed by " + name);
        }
    }
    
    public boolean equals(Player player){
        return (this.getName().equals(player.getName())) && (this.getHouses().equals(player.getHouses()));
    }
    
    public void protectFromPlayer(Player target){
        if (this.getHouses() instanceof Gryffindor) {
            ((Gryffindor)this.getHouses()).defense(this, target);
        } else if (this.getHouses() instanceof Hufflepuff) {
            ((Hufflepuff)this.getHouses()).defense(this, target);
        }
    }
    
    @Override
    public String toString(){
        return "Player : " + name + " HP: " + hp + " Mana: " + mana + " || " + houses;
    }
}
