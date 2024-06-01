import java.util.*;
public class digitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int nod= 0;
        int temp = a;
        while(temp!=0){
            temp = temp/10;
            nod++;
        }
        int div = (int)Math.pow(10, nod-1);
        while(div!=0){
            int q = a/div;
            System.out.println(q);

            a =a%div;
            div = div/10;
        }
    }
}
