public class Method {
static void Print2Table() {
   for(int i=1;i<=10;i++){
       int ans = 2*i;
       System.out.println("->" + ans);
   }
}
    static void main() {
        System.out.println("Hi");
        Print2Table();
        System.out.println("Bye");
    }
}
