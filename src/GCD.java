import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1");
        int a = sc.nextInt();
        System.out.println("enter the number 2");
        int b = sc.nextInt();

        int oa = a;
        int ob = b;

        while(a%b !=0){
            int rem = a%b;
            a = b;
            b = rem;
        }

        int gcd = b;
        int lcm = (oa * ob) / gcd;

        System.out.println("GCD ="+ gcd);
        System.out.println("LCM ="+ lcm);
    }
}
