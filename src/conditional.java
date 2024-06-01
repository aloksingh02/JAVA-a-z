//import java.util.*;
//public class conditional {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int marks = sc.nextInt();
//        if(marks>90){
//            System.out.println("excellent");
//        }
//        else if (marks>80){
//            System.out.println("very good");
//        }
//        else if(marks>70){
//            System.out.println("good");
//        }
//        else if(marks>60){
//            System.out.println("fair");
//        }
//        else{
//            System.out.println("below par");
//        }
//    }
//}
//--------------------------------------------------------------------------------
//
//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the num1");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the num2");
//        int num2 = sc.nextInt();
//        if(num1>num2){
//            System.out.println("num1 is greater");
//        }
//        else if(num2 > num1){
//            System.out.println("num2 is greater");
//        }
//        else{
//            System.out.println("both are equal");
//        }
//    }
//}

//-----------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter num1");
//        int num1 = sc.nextInt();
//        System.out.println("enter num2");
//        int num2 = sc.nextInt();
//        System.out.println("enter num3");
//        int num3 = sc.nextInt();
//
//        if(num1>num2 && num1>num3){
//            System.out.println("num1 is greater");
//        }
//        else if(num2>num1 && num2>num3){
//            System.out.println("num2 is greater");
//        }
//        else{
//            System.out.println("num3 is greater");
//        }
//    }
//}

//-----------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the num");
//        int num = sc.nextInt();
//        if(num>0){
//            System.out.println("it is positive");
//        }
//        else if(num<0){
//            System.out.println("it is negative");
//        }
//        else{
//            System.out.println("it is zero");
//        }
//    }
//}

//-----------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int number = sc.nextInt();
//        if(number%5 == 0 && number% 11 ==0){
//            System.out.println("divisible by 5 and 11");
//        }
//        else{
//            System.out.println("not divisible");
//        }
//    }
//}

//-----------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int number = sc.nextInt();
//        if(number%2==0){
//            System.out.println("it is even");
//        }
//        else{
//            System.out.println("it is odd");
//        }
//    }
//}

//-----------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the year");
//        int year = sc.nextInt();
//        if((year%4==0 && year%100!=0) || (year%400 == 0)){
//            System.out.println("it is leap year");
//        }
//        else{
//            System.out.println("it is not leap year");
//        }
//    }
//}

//-----------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the char");
//        char ch = sc.next().charAt(0);
//        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
//            System.out.println("it is alphabet");
//        }
//        else{
//            System.out.println("it is not alphabet");
//        }
//    }
//}

//-----------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the char");
//        char ch = sc.next().charAt(0);
//
//        if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u' || ch =='A' || ch =='E' || ch=='I' || ch=='O' || ch=='U'){
//            System.out.println("it is vowel");
//        }
//        else{
//            System.out.println("it is consonant");
//        }
//    }
//}

//-------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the something");
//        char ch = sc.next().charAt(0);
//
//        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
//            System.out.println("it is alphabet");
//        }
//        else if (ch>='0' && ch<='9'){
//            System.out.println("it is digit");
//        }
//        else{
//            System.out.println("it is special character");
//        }
//    }
//}

//-------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the something");
//        char ch = sc.next().charAt(0);
//
//        if(ch>='a' && ch<='z'){
//            System.out.println("it is lower case");
//        }
//        else if (ch>='A' && ch<='Z'){
//            System.out.println("it is digit");
//        }
//        else{
//            System.out.println("Please input character");
//        }
//    }
//}

//-------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the week number");
//        int num = sc.nextInt();
//
//        if(num == 1){
//            System.out.println("it is Monday");
//        }
//        else if (num == 2){
//            System.out.println("it is tuesday");
//        }
//        else if(num == 3){
//            System.out.println("it is wednesday");
//        }
//        else if(num == 4){
//            System.out.println("it is thrusday");
//        }
//        else if(num == 5){
//            System.out.println("it is friday");
//        }
//        else if(num == 6){
//            System.out.println("it is saturday");
//        }
//        else{
//            System.out.println("it is sunday");
//        }
//    }
//}

//-------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the amt");
//        int amt = sc.nextInt();
//        int n500, n200, n100, n50, n20, n10, n5, n2, n1;
//        n500 = n200 = n100 = n50 = n20 = n10 = n5= n2 = n1 =0;
//        if(amt>=500)
//            n500 = amt/500;
//            amt -= n500*500;
//        if(amt>=500)
//            n500 = amt/500;
//        amt -= n500*500;
//        if(amt>=500)
//            n500 = amt/500;
//        amt -= n500*500;
//        if(amt>=500)
//            n500 = amt/500;
//        amt -= n500*500;
//    }
//}

//-------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the angle");
//        int angle1 = sc.nextInt();
//        int angle2 = sc.nextInt();
//        int angle3 = sc.nextInt();
//        int n = angle1 + angle2 + angle3;
//        if(n == 180 && angle1>0 && angle2>0 && angle3>0){
//            System.out.println("it is trianle");
//        }
//        else{
//            System.out.println("it is not a triangle");
//        }
//    }
//}

//-------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the angle");
//        int angle1 = sc.nextInt();
//        int angle2 = sc.nextInt();
//        int angle3 = sc.nextInt();
//        int n = angle1 + angle2 + angle3;
//        if(n == 180 && angle1>0 && angle2>0 && angle3>0){
//            System.out.println("it is trianle");
//        }
//        else{
//            System.out.println("it is not a triangle");
//        }
//    }
//}

//-------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the angle");
//        int angle1 = sc.nextInt();
//        int angle2 = sc.nextInt();
//        int angle3 = sc.nextInt();
//        int n = angle1 + angle2 + angle3;
//        if(n == 180){
//            System.out.println("it is triangle");
//        }
//         if(angle1 == angle2 && angle2 == angle3){
//            System.out.println("it is equilateral trianle");
//        }
//        else if(angle1 == angle2 || angle1 == angle3 || angle2 == angle3){
//            System.out.println("it is isolated triangle");
//        }
//        else{
//            System.out.println("it is scalene triangle");
//        }
//    }
//}

//---------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the cost price");
//        int cp = sc.nextInt();
//        System.out.println("enter the selling price");
//        int sp = sc.nextInt();
//        int p,l;
//        if(sp>cp){
//            p = sp-cp;
//            System.out.println("profit :"+p);
//        }
//        else if(cp>sp){
//            l = cp-sp;
//            System.out.println("loss :"+l);
//        }
//        else{
//            System.out.println("no profit no loss");
//        }
//    }
//}

//---------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the cost price");
//        int m1 = sc.nextInt();
//        int m2 = sc.nextInt();
//        int m3 = sc.nextInt();
//        int m4 = sc.nextInt();
//        int m5 = sc.nextInt();
//        int n = m1+m2+m3+m4+m5;
//        float f = n/5;
//        System.out.println("total :" +n);
//        System.out.println("percentage :" +f);
//        if(f>=90){
//            System.out.println("grade A");
//        }
//        else if(f>=80){
//            System.out.println("grade B");
//        }
//        else if(f>=70){
//            System.out.println("grade C");
//        }
//        else if(f>=60){
//            System.out.println("grade D");
//        }
//        else if(f>=50){
//            System.out.println("grade E");
//        }
//        else if(f>=40){
//            System.out.println("grade F");
//        }
//    }
//}

//--------------------------------------------------------------------------

//import java.util.*;
//public class conditional{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num = sc.nextInt();
//        int rem, sum = 0 ,a = num;
//        while(num > 0){
//            rem = num%10;
//            sum =(sum*10)+rem;
//            num = num/10;
//        }
//        if(a == sum){
//            System.out.println("it is equal");
//        }
//        else{
//            System.out.println("no it is not equal656");
//        }
//    }
//}