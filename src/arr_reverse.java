public class arr_reverse {
    static int reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
        return i;
    }

    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        reverse(arr);
        for(int num : arr){
            System.out.print(num + "");
        }
    }
}
