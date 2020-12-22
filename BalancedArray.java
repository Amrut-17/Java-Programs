import java.util.Scanner;

public class BalancedArray {
    long minValueToBalance(long a[] ,int n){
        int len;
        long sum1 = 0;
        long sum2 = 0;
        len = a.length/2;
        for (int i=0; i<len; i++){
            sum1 = sum1 + a[i];
        }
        for (int i=len; i<n; i++){
            sum2 = sum2 + a[i];
        }

        long total = sum1 - sum2;
        if (total < 0){
            return (total*(-1));
        }
        else {
            return total;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size ;
        System.out.println("Enter Size of array");
        size = s.nextInt();

        if (size > 1) {
            long[] arr = new long[size];
            System.out.println("Enter array elements ");
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
            }
            BalancedArray obj = new BalancedArray();
            System.out.println( obj.minValueToBalance(arr, size));
        }
        else {
            System.out.println("Size of array must be grater than 1");
        }




    }
}
