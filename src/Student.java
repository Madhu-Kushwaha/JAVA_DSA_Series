public class Student {
    //Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //Default ctor  /// attr -> garbage
    public Student() {
        System.out.println("Student Default ctor called");
    }

    //Parametrized ctor
    public Student(int id,int age, String name,int nos){
        System.out.println("Student Parametrized ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }
    public void study() {
        System.out.println(name +" Studying");
    }
    public void sleep() {
        System.out.println(name +" sleeping");
    }
    public void bunk() {
        System.out.println(name +" bunk");
    }
}
