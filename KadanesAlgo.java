import java.util.Scanner;

public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size, i;
        int start = 0, end = 0, j=0;
        System.out.print("Enter size of array : ");
        size = s.nextInt();

        int[]array = new int[size];
        System.out.println("Enter array elements : ");
        for (i=0; i<size; i++){
            array[i] = s.nextInt();
        }

        int max_so_far = Integer.MIN_VALUE;
        int max_end_here = 0;

        for (i=0; i<size; i++){
            max_end_here = max_end_here + array[i];
            if (max_end_here > max_so_far){
                max_so_far = max_end_here;
                start = j;
                end = i;
            }
            if (max_end_here < 0){
                max_end_here = 0;
                j = i+1;
            }
        }
        for(i=start;i<=end; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\tStart at : " + start + " \n\t" + "end at : " + end);
    }
}
