package demoOOP;

public class Explorer {
    //instance variables
    private int height;
    private int age;
    boolean alive;
     int friends; 
    private String backpack;

    
    //construcor
    public Explorer(int height, int age, boolean alive, int friends, String backpack){
        this.height = height;
        this.age = age;
        this.alive = true;
        this.friends = friends;
        this.setBackpack("items");
    }

    public String getBackpack() {
        return backpack;
        
    }

    public void setBackpack(String backpack) {
        this.backpack = backpack;
        
    }

    public void kill(){
        this.alive = false;
    }
    public void friends(){
        this.friends = 0;
    }
}
