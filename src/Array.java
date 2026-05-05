import java.util.Scanner;

public class Array {

    static void main() {
 // solution : 1
//        int arr[] ={10,20,30,40,50};
//        int sum =0;
//
//        int n = arr.length;
//
//        for(int i=0; i<=n-1; i++) {
//            int value = arr[i];
//            sum = sum + value;
//        }
        //sum is ready to print
//        System.out.println(sum);
//solution : 2
//        int arr[] = {2,3,5,4,6};
//        int ans = 1;
//        int n = arr.length;
//
//        for(int i=0;i<=n-1; i++) {
//            int value = arr[i];
//
//            ans = ans * value;
//        }
//        //multiplited value is ready to print
//        System.out.println(ans);
// solution : 3

//        int arr[] = {5, 6, 7, 8,9};
//        int max = arr[0];
//
//        int n = arr.length;
//
//        for(int i=0; i<=n-1; i++){
//           if(arr[i] > max){
//               max = arr[i];
//           }
//        }
//        System.out.println("Print max value:" +  max);

//Solution: 4
//        int arr[] = {5, 6, 2, 8,9};
//        int min = arr[0];
//
//        int n = arr.length;
//
//        for(int i=0; i<=n-1; i++){
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println("Print min value:" +  min);
//Solution : 5
//        int arr[] = new int[5];
//
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for(int i=0; i<=n-1; i++){
//            System.out.println("Print input for index " + i);
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("array contains: " );
//        for (int val:arr){
//            System.out.println(val);
//        }

//solution : 6
     // declaration
    //    int arr[];

        //alocation
//        arr = new int[5];
//
//        //initializtion
//        int brr[] = {10,20,30};
//
//        int n= brr.length;
////        for(int val:brr){
////            System.out.println(val);
////        }
//
//        for(int index=0;index<=n-1;index++){
//            System.out.println(brr[index]);
//        }
//        System.out.println("value at index 0:"  + brr[0]);
//
//        System.out.println("value at index 1:"  + brr[1]);

        ////////////////////////////////// 2 -D Array //////////////////////////////////

// Solution : 6

        //declaration
        int [][] arr;

        //allocation

        arr = new int[3][4];

        //initialization
//        int [][]brr = {
//                {1,2},
//                {3,4},
//                {5,6},
//                {7,8}
//        };
        int [][]brr = {
                {1,2},
                {3,4,7,8,9},
                {5,6,5,2},
                {7,8}
        };

        int rowLength = brr.length;
//        int colLength = brr[0].length;

        for(int rowIndex=0; rowIndex<=rowLength-1;rowIndex++){
            //jaise hi main kisi new row me aayi same point pr maine uss row ka colLength findout krlia
            //current row -> brr[rowIndex]
            //isme kitne columns  -> int colLength = brr[rowIndex].length;
            int colLength = brr[rowIndex].length;
            for(int colIndex=0; colIndex<=colLength-1;colIndex++){
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }



    }
}
