import jdk.dynalink.Operation;
import java.util.Scanner;
class Operations {
    int sum = 0;
    int product = 1;
    void calculation (int number){
        int value = number;
        while (number != 0) {
            int temp = number % 10;
            sum = sum + temp;
            product = product * temp;
            number = number/10;
        }
        if (sum == product){
            System.out.println("SPY number");
        }
        else{
            System.out.println("NOT spy number ");
        }
    }
}
public class SpyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = scan.nextInt();

        Operations o = new Operations();
        o.calculation(num);
    }
}
