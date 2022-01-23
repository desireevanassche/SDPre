class Objective3Lab2 {

  public static void main(String[] args) {

    int side1 = 10;
    int side2 = 8;

      int aSquare = side1 * side1;
      int bSquare = side2 * side2;

    int cSquare = aSquare + bSquare;

    double hypotenuse = Math.sqrt(cSquare);

System.out.println("The hypotenuse of a triangle with sides of 10.0 and 8.0 is ");
System.out.println(hypotenuse);

}
}
