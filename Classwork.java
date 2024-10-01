import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
    Shopping();
  }

  public static void Shopping()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("What type of item are you buying?");
    String itemType = sc.nextLine();
    System.out.println("How many are you buying?");
    int itemQuantity = sc.nextInt();
    System.out.println("How much do each weigh?");
    double itemWeight = sc.nextDouble();
  }

  public static void Quote()
  {
    System.out.println("\"That brain")
  }

}

