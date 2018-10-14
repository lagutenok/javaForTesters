package kl.jft.course.sandbox;

public class MyFirstProgram {
   public static void main(String[] args) {
      hello("World");
      hello("user");
      hello("Kate");

      double l = 5;
      System.out.println("the area of a square with side " + l + " = " + area(l));

      double a = 5;
      double b = 6;
      System.out.println("the area of a rectangle with sides " + a + " and " + b + " = " + area(a, b));
   }
   public static void hello(String somebody){

      System.out.println("Hello, " + somebody + "!");
   }

   public static double area(double len){
      return len * len;
   }

   public static double area(double a, double b){
      return a * b;
   }
}