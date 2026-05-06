import java.sql.SQLOutput;
import java.util.Scanner;

public class StringBasics {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the String Content: ");
        String str = sc.nextLine();

        System.out.println("Value of next line: " + str);
        System.out.println("Provide the String Content again: ");
        String str2 = sc.next();

        System.out.println("Value of next line: " + str2);

//        String name1 = "Love";
//        String name2 = "LOVE";
//
//        if(name1.equals(name2)){
//            System.out.println("Both Strings are euqal");
//        }
//        else {
//            System.out.println("Both Strings are not equal");
//        }
    }
}
