import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int size , i;
        boolean found = false;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        size = s.nextByte();

        int array[] = new int[size];
        System.out.println("Enter Array elements one by one : ");
        for(i=0; i<size; i++){
            array[i] = s.nextInt();
        }

        System.out.print("Enter value to search : ");
        int value = s.nextInt();

        for (i = 0; i < size; i++) {
            if (array[i] == value) {
                found = true;
                break;
            }
        }

        if (found == true){
            System.out.print("Element is found at location : " + i);
        }
        else {
            System.out.println("Element NOT found");
        }
    }
}
