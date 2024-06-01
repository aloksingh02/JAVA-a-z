import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=1;
        System.out.println("Enter the A number");
        double d1 = sc.nextDouble();
        System.out.println("Enter the B number");
        double d2 = sc.nextDouble();
        System.out.println("choose the operator");
        char o = sc.next().charAt(0);
        System.out.println(d1 + o + d2 + "=");
        
    }
}
