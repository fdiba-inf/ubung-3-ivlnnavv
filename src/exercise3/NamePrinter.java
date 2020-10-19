package exercise3;
import java.util.Scanner;

public class NamePrinter
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();
   

    for (int count = 0; count < name.length(); count++)
    {
      char letter = name.charAt(count);
      System.out.println("* " + letter + " *");
    }
  }
}