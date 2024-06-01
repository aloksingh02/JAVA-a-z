import java.util.*;
public class IsPrimeNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a= sc.nextInt();

       for(int i=0; i<a; i++){
           int b=sc.nextInt();

           int count =0;
           for(int div=2; div*div <= b; div++){
               if(b%div==0){
                   count++;
                   break;
               }
           }
           if(count == 0){
               System.out.println("prime");
           }
           else{
               System.out.println("not prime");
           }
       }
    }
}
