/*  Q. GIVEN A LIST OF NON-NEGATIVE INTEGERS , ARRANGE THEM SUCH THAT,
        THEY FORM THE LARGEST NUMBER*/

import java.util.Scanner;
import static java.lang.Long.parseLong;

public class LargestNumber {
    // 3 30 45 5 9 ---> 9545330
    // 5 3 30 34 5 9
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long temp;
        System.out.println("Enter size of array : ");
        int  size = s.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){arr[i] = s.nextInt();}

        for (int i=0; i<size-1; i++){
            for (int j=0; j<size-1; j++){
                String current = String.valueOf(arr[j]);
                String next = String.valueOf(arr[j+1]);
                String n1 = current+next;
                String n2 = next+current;
                long a = parseLong(n1);
                long b = parseLong(n2);
                if (b>a){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = (int) temp;
                }
            }
        }
        System.out.println("Longest Number is : " );
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+"");
        }

    }
}
