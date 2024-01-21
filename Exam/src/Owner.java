public class Owner{
    protected Animal animal;
    protected final String name;
    
    public Owner(){
        this.name = null;
    }
    
    public Owner(Animal animal){
        this.animal = animal;
        this.name = null;
    }
    
    public Owner(String name){
        this.name = name;
    }
    
    public Owner(String name, Animal animal){
        this.name = name;
        this.animal = animal;
    }
    
    public Animal getAnimal(){
        return this.animal;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    
    public void feedFood(Food f){
        animal.eat(f);
    }
    
    public void protectOwnerFrom(Animal a){
        Animal p = new Pigeous(a.getName(), a.getAge());
        Animal d = new Dog(a.getName(), a.getAge());
        if(a instanceof Pigeous) {
            ((Pigeous)p).wingAttack(a);
        } else if (a instanceof Dog){
            ((Dog)d).kick(a);
        }
    }
    
    @Override
    public String toString(){
        return "Owner : name = " + this.name + ", Animal : name = " + animal.getName() + ", power = " + animal.getPower() + ", age = " + animal.getAge();
    }
}
