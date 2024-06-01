import java.util.*;
public class reverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while(a!=0){
            int dig = a%10;
            a = a/10;
            System.out.print(dig);
        }
    }
}
