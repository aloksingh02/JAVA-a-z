import java.util.*;
public class ptrn_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int space = a-1;
        int star = 1;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println();
        }
    }
}

