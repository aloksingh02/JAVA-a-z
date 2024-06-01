import java.util.*;
public class Array {
    public static void main(String[] args) {
        int [] marks;  // DECLARING THE ARRAY
        marks = new int[7]; // ALLOCATING MEMORY TO ARRAY

        marks[0] =06;
        marks[1] =26;
        marks[2] =51;
        marks[3] =62;
        marks[4] =54;
        marks[5] =74;
//        marks[6] =82;
        //System.out.println(marks.length); // TO FIND THE LENGHT OF ARRAY
        for(int i = 0; i<= marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
