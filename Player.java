package pio_2;

import java.util.Random;

public class Player {
    
     Random brain = new Random();
     
     String name = "Michała";
     
    public int guess(){
        
        return  brain.nextInt(6) + 1;
    }
    
   
    
}
