package Polymorphism_oops;

public class Main {
   public static void main(String[] args) {
//        calculator c = new calculator();
//       System.out.println(c.add(1,2));
//       System.out.println(c.add(4,6,7));
//       System.out.println(c.add(2,4,6,4.6));

//       Runtime Polymorphism
       //Upcasting
               Circle c = new Circle();
//               c.draw();
               doDrawing(c);

               Rect r = new Rect();
//               r.draw();
                 doDrawing(r);

                Shape s = new Shape();
//               r.draw();
                 doDrawing(s);

    }
    public static void doDrawing(Shape s) {
//        s.draw();  polymorphic// Upcasting - means Runtime pe relevant method ko dispath kr rhe
    }
}
