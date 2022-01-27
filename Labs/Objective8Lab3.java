public class Objective8Lab3 {

  public static void main(String[] args) {

    for (int i=1; i<=20; i+=1) {
      //this is the initalize statment and ternimation condition
      System.out.print(i);

      if (i % 2 == 0) {
        System.out.println(" is even.");
      }
      //if we divide a number by 2 and there is nothing left, we can deduce that it is even
      if (i % 2 != 0) {
        System.out.println(" is odd.");
      }
      //if we divide a number by 2 and there is a remaining int, we can deduce that it is odd

      }
    }
  }
