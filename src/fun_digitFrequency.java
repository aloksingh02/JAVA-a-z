import java.util.*;
public class fun_digitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = fun_digitFrequency(n ,d);
        System.out.println(f);
    }

    public static int fun_digitFrequency(int n, int d) {
        int count = 0;
        while(n>0){
            int digit= n%10;
            n = n/10;

            if(digit == d){
                count++;
            }
        }
        return count;
    }
}
