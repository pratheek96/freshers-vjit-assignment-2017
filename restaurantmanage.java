import java.util.*;

class Fun

 {
   
   void greetings()

    {
 
        System.out.println("hello");

    }
   
   void allotment(int vacancy)
   
    {
 
       if(vacancy==0)
 
       System.out.println("waiting");
 
       else
 
       System.out.println("table alloted");
 
     }
 
   
}

public class MyClass 
 {
 
   public static void main(String args[])

    {
 
       Fun entry=new Fun();

        Fun seat=new Fun();

        entry.greetings();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number of vacant seats : ");

        int vacancy=sc.nextInt();

        seat.allotment(vacancy);

     }

}
