//import java.util.Scanner;
//public class FUNCTION {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        System.out.println("Enter number 1:");
//        int a = sc.nextInt();
//        System.out.println("Enter number 2:");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("sum is:" + sum);
//    }
//}


//import java.util.Scanner;
//public class FUNCTION {
//    public static void main(String[] args) {
//        sum();
//    }
//    static void sum(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number 1");
//        int a = sc.nextInt();
//        System.out.println("enter number 2");
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.println(sum);
//    }
//}

import java.util.Scanner;
public class FUNCTION {
//    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        static String greet (){
            String greeting = "my name is alok singh";
            return greeting;
    }
//    static String greet (){
//        String greeting = "my name is alok singh";
//        return greeting;
        public static void main(String[] args) {
            String message = greet();
            System.out.println(message);
    }
}