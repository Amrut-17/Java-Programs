import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i , size ;
        boolean found = false;

        System.out.print("Enter size of array : ");
        size = s.nextByte();

        int array[] = new int[size];
        System.out.println("Enter array elements ");
        for (i=0; i<size; i++){
            array[i] = s.nextInt();
        }

        System.out.print("Enter element to search in array : ");
        int element = s.nextInt();

        int first = 0;
        int last = size;

        while(first<=last){
            int middle = (first+last)/2;
            if(array[middle] == element){
                found = true;
                break;
            }
            else if (element < array[middle]){
                last = middle-1;
            }
            else {
                first = middle+1 ;
            }
        }

        if(found == true){
            System.out.println("Element found at location : " + i);
        }
        else {
            System.out.println("Element NOT found");
        }


    }
}
