import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

//        int inv = 0;
//        int op=1;
//        while(a!=0){
//            //od = original digit
//            //op = original place
//            //id = inverse digit
//            //ip = inverse place
//            int od= a%10;
//            int ip = od;
//            int id = op;
//
//            inv = inv +id * (int)Math.pow(10, ip-1);
//             a = a/10;
//             op++;
//        }
//        System.out.println(inv);
        int inv= 0;
        int op = 1;
        while(a!=0){
            int od = a%10;
            int ip = od;
            int id = op;

            inv = inv + id * (int)Math.pow(10, ip-1);

            a =a/10;
            op++;
        }
        System.out.println(inv);
    }
}