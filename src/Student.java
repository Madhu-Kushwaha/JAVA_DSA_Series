import java.sql.SQLOutput;

public class Student {
    //Attributes
//    public int id;
//    public int age;
//    public String name;
//    public int nos;
//    private String gf;

//   Perfecatly encapsulation
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

  //a layer through we can access the data
    public String getName () {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int a){
       //extra layer of authentication
        if(age<100)
            this.age = a;
        return;
    }

    //Default ctor  /// attr -> garbage
    public Student() {
        System.out.println("Student Default ctor called");
    }

    //Parametrized ctor
    public Student(int id,int age, String name,int nos,String gf){
        System.out.println("Student Parametrized ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf=gf;
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
    private void gfChatting(){
        System.out.println(name + "gfChatting");
    }
}
