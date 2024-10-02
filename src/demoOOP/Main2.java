package demoOOP;

public class Main2 {
    public static void main(String[] args) {
        Explorer simon;
        simon = new Explorer(2, 60, true, 5, "map");

        if(simon.friends == 5){
            System.out.println("5 friends");
        }
        
        if(simon.alive == false){
            System.out.println("dead");
        }else{
            System.out.println("alive");
        }

    }
}
