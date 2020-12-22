import java.util.Scanner;

public class MinimumNumberToMakeSumEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size;
        int sum = 0;
        System.out.println("Enter array Size ");
        size = s.nextInt();

        int [] array = new int[size];
        System.out.println("Enter Array elements ");
        for (int i=0; i<size; i++){
            array[i] = s.nextInt();
        }

        for (int i=0; i<size ; i++){
            sum = sum + array[i];
        }
        System.out.print("Sum of array elements is : " + sum + "\n");

        if (sum%2 == 0){
            System.out.print("nearest Even number : " + (sum+2));
        }
        else {
            System.out.println("nearest Even number : " + (sum+1));
        }
    }
}
