import java.util.*;
public class deciToBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int dn = deciToBase(n , b);
        System.out.println(dn);
    }

    public static int deciToBase(int n , int b) {
        int count = 0;

        int p =1;

        while(n>0){
            int dig = n%b;
            n = n/b;

            count += dig * p;
            p = p*10;
        }

        return count;
    }
}
