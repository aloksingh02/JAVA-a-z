import java.util.*;
public class benjamin_bulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //isme 1 se 100 tk bulb hai jisme fluctutation aata hai aur bulb togal
        // kate hai mtlb ON toh OFF ya OFF toh ON
        //i.e if 2 bulb then multiple of 2 all togal

        // solution = bas perfect square wale hi jalte rahenge humesha
        int a = sc.nextInt();
        for(int i = 1; i*i>=a; i++){
            System.out.println(i*i);
        }
    }
}
