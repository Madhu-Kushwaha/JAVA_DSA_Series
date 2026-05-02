import java.sql.SQLOutput;

public class Method {
static void Print2Table() {
   for(int i=1;i<=10;i++){
       int ans = 2*i;
       System.out.println("->" + ans);
   }
}
static void printSum(int x,int y){
    System.out.println("Sum:" + (x+y));
}

//static int add (int p,int q){
//    int ans1= p+q;
//    return ans1;
//}
//static int add (int p,int q,int r){
//        int ans2= p+q+r;
//        return ans2;
//    }

    static void solve(int num ){
        System.out.println("inside solve:" + num);
        num = num * 10;
        System.out.println("inside solve:" + num);

    }
    //Method and Varable scoping
    static void printMultiples(){
      int  value= 20;
      for (int i = 1; i<=10;i++){
          System.out.println(20*i);
      }
        System.out.println(value);


    }


    static void main() {
        printSum(2,8);
        printMultiples();
//        System.out.println(value);  this not comes under valiable scope thats why we called on where the method is defined
        // call by value - copy pass kr rhe h remember it
          int num = 5; // the copy is passed
        System.out.println("inside main:" + num);
        solve(num);
        System.out.println("inside main: "+num);  //thats why 5 is print instead of 50 becuse we pass copy of it
//        remeber this code parameter and argument matter for float and integer value as we are using same mathod name that is add
//        int ans1 = add(1,2);
//        int ans2 = add(1,2,3);
//
//        System.out.println("ans1:" + ans1);
//        System.out.println("ans2:" + ans2);

//        System.out.println("Hi");
//        Print2Table();
//        System.out.println("Bye");
    }
}

//If a particular block of code baar baar execute kr rha ho  usko simplify,  krne ke liye method use krenge which is also a function
//easy to debug
//reusable
//not messy

