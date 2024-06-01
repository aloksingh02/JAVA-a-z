//import java.util.*;
//public class function_NPR {
//    public static void main(String[] args) {
//        //permutation
//        // here we want n and r
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int r = sc.nextInt();
//
//        int nfact = 1;
//        for(int i = 1; i<=n; i++){
//            nfact *= i;
//        }
//
//        int nrfact = 1;
//        for(int i = 1; i<=n-r; i++){
//            nrfact *= i;
//        }
//
//        int npr = nfact/nrfact;
//        System.out.println(n +"p"+r+"=" +npr);
//    }
//}


//AFTER APPLYING FUNCTION
//
//import java.util.*;
//public class function_NPR {
//    public static int fact(int x) {
//        int rv = 1;
//        for(int i=1; i<=x; i++){
//            rv = rv * i;
//        }
//        return rv;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int r = sc.nextInt();
//
//        int nfact = fact(n);
//        int nmrfact = fact(n -r);
//
//        int npr = nfact / nmrfact;
//        System.out.println(n +"p"+r+"=" +npr);
//    }
//}

// REVISION OF NPR
