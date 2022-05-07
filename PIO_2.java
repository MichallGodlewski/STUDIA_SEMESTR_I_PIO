package pio_2;

import java.util.Random;

public class PIO_2 {

   
    public static void main(String[] args) {
     
        Player player = new Player();
        
        Random kostka = new Random();   
        int liczba;
        int gracz;
        
        do{   
        liczba = kostka.nextInt(6) + 1;
        System.out.println("Liczba na kostce: " + liczba);
        
        gracz = player.guess();
        System.out.println("Liczba wybrana przez " + player.name + ": " + gracz);
        
        if(liczba == gracz){
            System.out.println("Gratuacje! Udało ci się!");          
        } else {
            System.out.println("Niestety nie udało ci sie odgadnąć :(");              
        }
        
        
        }while(liczba != gracz); 
    }
    
}
