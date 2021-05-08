package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class PrintTheLeftElement {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        long size = s.nextLong();
        long[] arr = new long[(int)size];
        for (int i=0; i<size; i++){
            arr[i] = s.nextLong();
        }
        Arrays.sort(arr);
        if (size % 2 == 0){
            System.out.println(arr[(int)(size/2)-1]);
        }else{
            System.out.println(arr[(int)(Math.floor(size/2))]);
        }
    }
}
