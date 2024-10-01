package demoOOP;

public class Main {
    public static void main(String[] args){

        squirrel alvin;
        squirrel theodore;
        squirrel simon;
        squirrel roadkill; 

        alvin = new squirrel("red", "medium");
        theodore = new squirrel("green", "small");
        simon = new squirrel("blue","large");
        roadkill = new squirrel("black", "flat");

        simon.run();
        roadkill.kill();

        if(roadkill.alive == true){
            System.out.println("Alive!");
        }else{
            System.out.println("Dead!");
        }

        System.out.println("alvin is a " +  alvin.size + " squirrel who feels like P.Diddy with fur and is " + alvin.Colour);
        System.out.println("theodore is a " + theodore.size + "and he is " + theodore.Colour + "he enjoys sipping lemonade on P.Diddy's yacht");
    }
}
