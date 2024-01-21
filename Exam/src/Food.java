public abstract class Food {
    protected String name;
    
    public Food(){}
    
    public String getName(){
        return name;
    }
    
    public abstract int getPower();
    
    public void setName(String name){
        this.name = name;
    }
}
