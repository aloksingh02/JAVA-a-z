// about question = in this first element is given same no. element given we have to find element
//

import java.util.*;
public class Arr_findElement {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int[] arr = new int[a];

       for(int i=0; i<=arr.length; i++){
           arr[i] = sc.nextInt();
       }

       int data = sc.nextInt();

       int idx = -1;
       for(int i=0; i<=arr.length; i++){
           if(arr[i] == data){
               idx = 1;
               break;
           }
       }
        System.out.println(idx);
    }
}
