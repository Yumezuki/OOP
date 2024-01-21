public class Pigeous extends Bird{
    public Pigeous(){
        this("", 0);
        super.setPower(150);
    }
    
    public Pigeous(String name, int age){
        super(name, age);
        super.setPower(150);
    }
    
    @Override
    public void eat(Food f){
        super.setPower(super.getPower() + (f.getPower() * 2));
    }
    
    @Override
    public void fly(){
        System.out.println(super.getName() + " fly fly ....");
    }
    
    @Override
    public void wingAttack(Animal a){
        a.setPower(a.getPower() - 5);
    }
    
    public void wingAttack(Animal a, int times){
        for (int i = times; i > 0; i--) {
            a.setPower(a.getPower() - 5);
        }
    }
}
