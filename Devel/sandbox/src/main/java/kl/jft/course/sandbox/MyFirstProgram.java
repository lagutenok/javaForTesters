package kl.jft.course.sandbox;

public class MyFirstProgram {
   public static void main(String[] args) {
      hello("World");
      hello("user");
      hello("Kate");


      Square s = new Square(5);

      System.out.println("the area of a square with side " + s.l + " = " + s.area());

      Rectangle rec = new Rectangle(5, 6);

      System.out.println("the area of a rectangle with sides " + rec.a + " and " + rec.b + " = " + rec.area());
   }

   public static void hello(String somebody) {
      System.out.println("Hello, " + somebody + "!");
   }

}