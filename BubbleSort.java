import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size ;
        int i, j;
        int temp;

        System.out.print("Enter size of array : ");
        size = s.nextInt();
        int [] array = new int[size];
        System.out.println("Enter array elements one after another ");
        for (i=0; i<size; i++){
            array[i] = s.nextInt();
        }

        for (i=0; i<size; i++){
            for (j=0; j<size-1; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array is ");
        for (i=0; i<size; i++){
            System.out.print(array[i] + " ");
        }

    }
}
