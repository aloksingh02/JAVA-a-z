// EXPLANATION = issme array mein jitne number rahenge utne star banane hai bar chart ki tarah
// example [4,2,5,0,7]
//         *
//         *
//     *   *
// *   *   *
// *   *   *
// * * *   *
// * * *   *

import java.util.*;
public class Arr_barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];

        for(int i=0; i<=arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i = 1; i<=arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int floor = max; floor>=max; floor--){
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= floor){
                    System.out.println("*\t");
                }
                else{
                    System.out.println("\t");
                }
            }
            System.out.println();
        }
    }
}
