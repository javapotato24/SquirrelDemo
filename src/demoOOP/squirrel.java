package demoOOP;

public class squirrel {
    // instance variables - properties of the squirrle i.e colour, size, etc
    String Colour;
    String size;
    boolean alive; 


    //constructor 

    /**
     * Creates an instance of Squirrel 
     * @param newColour;
     * @param newSize;
     */

     public squirrel(String newColour,String newSize){
        this.alive = true;
        this.Colour = newColour;
        this.size = newSize; 
     }

     //instance methods
     public void run(){
        System.out.println(this.Colour + " squirrel is Running");
     }

     public void kill(){
        this.alive = false;
     }



}