import java.util.*;
public class PRIME_FACTORIZATION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int div =2; div*div<=a; div++){
            while(a%div ==0){
                a = a/div;
                System.out.print(div + " ");
            }
        }
        if(a != 1){
            System.out.print(a);
        }
    }
}