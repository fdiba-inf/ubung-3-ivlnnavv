package exercise3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int number=input.nextInt ();
        boolean wat = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(number % i == 0)
            {
                wat = true;
                break;
            }
        }

        if (!wat)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}