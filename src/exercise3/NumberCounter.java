package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       double sum=0;
       int Positive=0;
       int Negative=0;
       int number=input.nextInt ();

       while (number!=0)
       {
         if(number > 0)
         {
           Positive++;
         }
         else
         {
           Negative++;
          }
          sum+= number ;
          number = input.nextInt();
       }
          double Average= 0.0 + sum/ (Positive + Negative );
          System.out.println ("Positive: " + Positive);
          System.out.println(" Negative:"+ Negative);
           System.out.println(" Sum "+ sum);
            System.out.println(" Average "+ Average);

    }
}