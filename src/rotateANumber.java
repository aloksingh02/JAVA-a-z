//import java.util.*;
//public class rotateANumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();//jisko rotate kar rhe hai
//        int b = sc.nextInt();// jitne se rotate kar rhe hai
//
//
//        //way to find number of digit
//        int temp = a;
//        int nod = 0;
//        while(temp > 0){
//            temp = temp /10;
//            nod++;
//        }
//        //
//
//
//        int div =1;
//        int mult = 1;
//        for(int i = 1; i<=nod; i++){
//            if(i <= b){
//                div = div * 10;
//            }
//            else{
//                mult = mult * 10;
//            }
//        }
//
//        int quot = a / 10;
//        int rem = a % 10;
//
//        int rem = rem * mult + quot;
//
//    }
//}
