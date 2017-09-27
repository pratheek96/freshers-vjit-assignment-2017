package com.rubiconred.restaurant_management_system;
import java.util.Scanner; 
public class Dinein {
    void greetings()
    {
        System.out.println("welcome to the restaurant");
    }
    void seatallotment(double vacancy)
    {
        if(vacancy==0)
            System.out.println("Please wait for a while");
        else
            System.out.println("You can have your seat");
    }
    
}
class Restaurant {
    public static void main(String[] args){
        Dinein entry= new Dinein();
        entry.greetings();
        Dinein allotment= new Dinein();
        System.out.println("Enter the number of vacant tables: ");
        Scanner seat= new Scanner(System.in);
        Takeaway entry_t= new Takeaway(); 
        
    }
}


