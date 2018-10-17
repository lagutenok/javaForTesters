package kl.jft.course.sandbox;

public class MyFirstProgram {
   public static void main(String[] args) {
      hello("World");
      hello("user");
      hello("Kate");


      Square s = new Square(5);

      System.out.println("the area of a square with side " + s.l + " = " + area(s));

      Rectangle rec = new Rectangle(5, 6);

      System.out.println("the area of a rectangle with sides " + rec.a + " and " + rec.b + " = " + area(rec));
   }

   public static void hello(String somebody) {
      System.out.println("Hello, " + somebody + "!");
   }

   public static double area(Square s) {
      return s.l * s.l;
   }


   public static double area(Rectangle rec)
   {
      return rec.a * rec.b;
   }
}