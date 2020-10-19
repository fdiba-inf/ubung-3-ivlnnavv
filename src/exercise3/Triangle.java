package exercise3;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String type;

        while(true)
        {
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

          if(a <= 0 || b <= 0 || c <= 0 || a+b<=c || b+c<=a || a+c<=b){
            System.out.print("Values are not correct!");
            break;
          }
          double p = (a + b + c) / 2;
          double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
          if(a == b && b == c && a == c)
          {
          type = "equilateral";
          }
          else if((a == b && a != c) || (a == c && a != b) || (b == c && a != b))
          {
            type = "isosceles";
          }
          else
          {
            type = "scalene";
          }
          System.out.println("Area: " + area);
          System.out.println("Triangle: " + type);
        }
   }
}