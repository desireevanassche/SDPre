import java.util.Scanner;

public class Objective5Lab3 {

  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

  System.out.println("Please enter a number: ");

  int num1 = scanner.nextInt();

  if (num1 < 0) {
    System.out.println(num1 + " is less than 0.");
  }

  else if (num1 > 0) {
    System.out.println(num1 + " is greater than 0.");
  }

  else if (num1 == 0) {
    System.out.println(num1 + "is equal to 0.");
  }

  scanner.close();


}
}
