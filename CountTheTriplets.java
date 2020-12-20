import java.util.*;
public class CountTheTriplate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int size ;
        System.out.print("Enter array size : ");
        size = s.nextInt();

        int [] array = new int[size];
        System.out.println("Enter array elements ");
        for (int i=0; i<size; i++){
            array[i] = s.nextInt();
        }

        for (int i=0; i<size ; i++){
            for (int j=i+1; j<size ; j++){
                int k = 0;
                int key = i;
                sum = sum + array[key] + array[j];
                while (k<size){
                    if (sum == array[k]){
                        System.out.println("Triplet is : " + array[i] + " " + array[j]);
                        count += 1;
                    }
                    k += 1;
                }
                sum = 0;
            }

        }
        if (count > 0){
            System.out.println("Number of Triplets : " + count);
        }
        else {
            System.out.println("Number of Triplets : " + count);
        }
    }
}
