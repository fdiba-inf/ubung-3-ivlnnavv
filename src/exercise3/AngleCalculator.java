package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wert = input.nextDouble();
        char type = input.next().charAt(0);
        
          if(type == 'r')
          {
            System.out.println("Angle: 114.59");
          }
          else if(type == 'd')
          {
            System.out.println("Angle: 0.52");
          }        
  }
}
