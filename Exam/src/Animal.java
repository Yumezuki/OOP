public abstract class Animal {
    private int age;
    private String name;
    private int power;
    
    public Animal(){
        this("", 0, 0);
    }
    
    public Animal(String name, int power, int age){
        this.name = name;
        this.power = power;
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPower(){
        return this.power;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPower(int power){
        this.power = power;
    }
    
    public abstract void eat(Food f);
    
    public boolean equals(Animal a){
        return this.name.equals(a.name) && this.age == a.age;
    }
    
    @Override
    public String toString(){
        return "Animal : name = " + this.getName() + ", power = " + this.getPower() + ", age = "+ this.getAge();
    }
}
