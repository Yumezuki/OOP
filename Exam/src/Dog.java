public class Dog extends Animal{
    public Dog(String name, int age){
        this.setName(name);
        this.setAge(age);
        super.setPower(200);
    }
    
    @Override
    public void eat(Food f){
        super.setPower(super.getPower() + f.getPower());
    }
    
    public void kick(Animal a){
        a.setPower(a.getPower() - 5);
    }
}
