import java.util.Scanner;

public class TwoDArray {


    //need to check
    static void main() {

        int arr[][] = { {1,11,3},{5,9,7}};
        int maxValue = arr[0][0];

//        int sum = 0;
//        int ans = 1;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++ ) {
                int value = arr[i][j];
//                sum = sum + value;
//                  ans = ans * value;
                if(arr[i][j]>maxValue){
                    maxValue = arr[i][j];
                }
            }
        }
//        System.out.println(ans);
        System.out.println("Print max value:" +  maxValue);
//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//       //input
//        for(int i = 0;i<=arr.length-1 ; i++){
//            for(int j = 0;j<=arr[i].length-1 ; j++){
//                System.out.println("Provide value for row = " +i + "and column =" + j );
//                arr[i][j] = sc.nextInt();
//
//            }
//        }
//      // Print
//        for(int rowIndex=0; rowIndex<=arr.length-1;rowIndex++){
//            for(int colIndex=0;colIndex<=arr[rowIndex].length-1;colIndex++){
//                System.out.print(arr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }



    }
}
