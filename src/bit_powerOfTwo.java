public class bit_powerOfTwo {
    static boolean isPow2(int n) {
        if(n==0)
            return false;
        return ((n&(n-1))==0);
    }

    public static void main(String[] args) {
        if(isPow2(31))
            System.out.println("yes");
        else
            System.out.println("No");

        if(isPow2(64))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
