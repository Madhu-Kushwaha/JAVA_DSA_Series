public class App {
   public static void main(String[] args) {
        //Default constructor

//       Student A = new Student();
//       A.id = 1;
//       A.age = 18;
//       A.name = "Madhu";
//       A.nos =3;
//
//       System.out.println(A.name);
//       System.out.println(A.id);
//       System.out.println(A.nos);
//       System.out.println(A.age);
//
//       A.bunk();
//       A.sleep();
//       A.study();

       //Parmetrized constructor

       Student A = new Student(1,18,"Rahul",3,"Tina");

//       System.out.println(A.id);
//       System.out.println(A.age);
//       System.out.println(A.name);
//       System.out.println(A.nos);
//       System.out.println(A.gf);  private data encapsulation

//       System.out.println(A.getName());
       System.out.println(A.getAge());
       A.setAge(67);
       System.out.println(A.getAge());
//       A.bunk();
//       A.sleep();
//       A.study();
//       A.gfChatting();
    }
}
