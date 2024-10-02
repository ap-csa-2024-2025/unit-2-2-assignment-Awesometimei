import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
    Shopping();
    Quote();
    Rabbit();
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
    System.out.println(itemQuantity + " " + itemType + " at " + itemWeight + " pounds each will weight " + (itemWeight*itemQuantity) + " pounds");
  }

  public static void Quote()
  {
    System.out.println("\"That brain of mine is something more than merely mortal; as time will show\" \nAda Lovelace\nThe first computer programmer");
  }

  public static void Rabbit()
  {
    System.out.println("(\\(\\");
    System.out.println("( - -)");
    System.out.println("((\')(\')");
  }
}

