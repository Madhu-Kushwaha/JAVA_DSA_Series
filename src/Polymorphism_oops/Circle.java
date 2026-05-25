package Polymorphism_oops;

public class Circle extends Shape {

    @Override
    //parent cass which is shape has already draw fuction
    public void draw() {
        System.out.println("Circle drawing");
    }
}
