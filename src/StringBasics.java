import java.sql.SQLOutput;
import java.util.Scanner;

public class StringBasics {

    static void main() {

        // split -> output -> string array

        String input = "My, name , is , Mk";
        String[] words = input.split(",");
        for(String str3: words){
            System.out.println(str3);
        }
        String name5 = "Kushwaha";
        char[] crr = name5.toCharArray();

        //print the char Array
        for(char ch: crr){
            System.out.println("Value of char:" + ch);
        }
        String name4 = "manku Love Madhu";
        System.out.println(name4.startsWith("manku"));
        System.out.println(name4.endsWith("dhu"));

        int num = 5123;
        String str3 = String.valueOf(num);
        System.out.println(num+1);
        System.out.println(str3 + 1);

        String str2 = "I Live in Uttar Pradesh";
        System.out.println(str2.substring(2,6));
        System.out.println(str2.contains("in"));

// beginIndex -> 3 -> inclusive
// endIndex -> 6 -> Exclusive
// empty -> length = 0
// blank -> empty or space

        //Empty Blank
        String str1 = " ";
        System.out.println(str1.length());
        System.out.println(str1.isEmpty());
        System.out.println(str1.isBlank());

        String name1 = " Love  ";
        System.out.println(name1.length());
        name1 = name1.trim();
        System.out.println(name1.length());


        String str = "MADHURI";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        String name = "Madhu";
        System.out.println(str.equals(name));
        System.out.println(str.equalsIgnoreCase(name));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide the String Content: ");
//        String str = sc.nextLine();
//
//        System.out.println("Value of next line: " + str);
//        System.out.println("Provide the String Content again: ");
//        String str2 = sc.next();
//
//        System.out.println("Value of next line: " + str2);

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
