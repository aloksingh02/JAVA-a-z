//public class bitmanipulation {
//    public static void main(String[] args) {
//        int a=3;
//        int b=6;
//        System.out.println(a&b);
//        System.out.println(a|b);
//        System.out.println(a^b);
//    }
//}


//public class bitmanipulation {
//    public static void main(String[] args) {
//        int a=3;
//        System.out.println(~a);
//    }
//}


//public class bitmanipulation {
//    public static void main(String[] args) {
//        int a=3;
//        System.out.println(a<<1);
//        System.out.println(a<<2);
//
//    }
//}


public class bitmanipulation{
    static int setkthBit(int n,int k) {
        int new_num=n>>(k-1);
        return(new_num & 1);
    }

    public static void main(String[] args) {
        int n=10;
        int k=2;
        if(setkthBit(n,k) == 1){
            System.out.println("set");
        }
        else{
            System.out.println("unset");
        }
    }
}