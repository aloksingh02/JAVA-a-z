import java.util.Arrays;
import java.util.Scanner;
//public class PARA_ARGU {
//    //int a, int b is argument
//    static int sum(int a, int b){
//        int sum = a+b;
//        return sum;
//    }
//
//    public static void main(String[] args) {
////        this is parameter
//        int ans = sum(20,30);
//        System.out.println(ans);
//    }
//}




//public class PARA_ARGU {
//    public static void main(String[] args) {
//        int ans = sum(20,50 ,60);
//        System.out.println(ans);
//    }
//    static int sum(int a, int b ,int c){
////        int sum = a + b;
//        return a + b;
//    }
//}


//public class PARA_ARGU {
//    public static void main(String[] args) {
//        int a = 15;
//        int b = 20;
//
////        swapping the number
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a+" "+b);
//    }
//}

public class PARA_ARGU {
        static void change(int[] nums){
            nums[0] = 100;
        }

    public static void main(String[] args) {
        int arr[] = {54,15,46,55,36};
        change(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(nums);
    }
}
