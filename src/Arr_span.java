//span of an array = Maximum number - Minimum number

//import java.util.*;
//public class Arr_span {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int [] arr = new int[a]; // DECLARING THE ARRAY AND ASSIGNING "A" VALUE
//
//        for(int i = 0; i<=arr.length; i++){
//            arr[i] = sc.nextInt();  //giving input in array for comparison
//        }
//
//        int max = arr[0];
//        int min = arr[0];
//        for(int i=1; i<= arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        int span = max - min;
//        System.out.println(span);
//    }
//}


//--------------------------------------------------------------------------

import java.util.*;
public class Arr_span{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];

        for(int i=0; i<=arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int min = 0;
        for(int i=1; i<=arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int span = max-min;
        System.out.println(span);
    }
}
