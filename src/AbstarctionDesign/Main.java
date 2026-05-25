//package AbstarctionDesign;
//
//
////interface
//abstract class Bird {
//    abstract void fly();
//    abstract void eat();
//
//    public void sleep(){
//        System.out.println("Bird is sleepig");
//    }
//
//}
//
//
////implementation
//class Sparrow extends Bird {
//     @Override
//    void fly(){
//         System.out.println("Sparrow flying");
//     }
//     @Override
//     void eat(){
//         System.out.println("Sparrow eating");
//     }
//}
//class Crow extends Bird {
//    @Override
//    void fly(){
//        System.out.println("Crow flying");
//    }
//    @Override
//    void eat(){
//        System.out.println("Crow eating");
//    }
//}
//public class Main {
//
//    public static void doBirdStuff(Bird b){
//        b.eat();
//        b.fly();
//        b.sleep();
//    }
//    public static void main(String[] args) {
////        Bird b = new Sparrow();
////        b.eat();
////        b.fly();
////
////        b = new Crow();
////        b.eat();
////        b.fly();
//
//        doBirdStuff(new Sparrow());
//        doBirdStuff(new Crow());
//    }
//}

//// this is called abstarction
//above one is old idea

package AbstarctionDesign;


//interface
//abstract class Bird {
//    abstract void fly();
//    abstract void eat();
//}
interface Bird {
    void fly();

    void eat();

    default void sleep(){
        System.out.println("Bird sleeping");
    }
}
interface Walk {
    int legs =4;
    void walking();
}


//implementation
class Sparrow implements Bird,Walk {
    @Override
    public void fly(){
        System.out.println("Sparrow flying");
        System.out.println("Sparrow flying rrr");

    }
    @Override
    public void eat(){
        System.out.println("Sparrow eating");
    }
    @Override
    public void walking(){
        int a = Walk.legs;
        System.out.println("Sparrow walking");
    }
}
class Crow implements Bird {
    @Override
    public void fly(){
        System.out.println("Crow flying");
    }
    @Override
    public void eat(){
        System.out.println("Crow eating");
    }
//    @Override
//    public void walking(){
//        System.out.println("crow walking");
//    }
}
public class Main {

    public static void doBirdStuff(Bird b){
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.sleep();
//        b.walking();
    }
    public static void main(String[] args) {
//        Bird b = new Sparrow();
//        b.eat();
//        b.fly();
//
//        b = new Crow();
//        b.eat();
//        b.fly();

        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());

    }
}

// this is called abstarction

