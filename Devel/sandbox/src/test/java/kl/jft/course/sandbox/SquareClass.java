package kl.jft.course.sandbox;

import org.testng.annotations.Test;

public class SquareClass {
   @Test
   public void testArea() {
      Square s = new Square(5);
      assert s.area() == 25;

   }
}
