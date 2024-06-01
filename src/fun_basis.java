//import java.util.*;
//public class fun_basis {
//    public static void printMyName(String name) {
//        System.out.println(name);
//        return;
//    }
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        printMyName(name);
//    }
//}

//--------------------------------------------------------------------------

import java.util.*;
public class fun_basis {
    public static int calculateProduct(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("product of number is:" + calculateProduct(a, b));
    }
}