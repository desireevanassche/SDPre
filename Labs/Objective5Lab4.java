import java.util.Scanner;

public class Objective5Lab4 {

  public static void main(String[] args) {
    //this program will determine if a number is odd or even

Scanner input = new Scanner(System.in);

System.out.println("Please enter a number: ");
int num1 = input.nextInt();

if (num1 % 2 == 0) {
  System.out.println("The number is even.");
}

if (num1 % 2 != 0) {
  System.out.println("The number is odd.");
}

input.close();
  }
}
