import java.util.Scanner;

class Amstrong{
    int product = 1;
    int sum = 0;
//    Use of CONSTRUCTOR
    Amstrong(int number){

        int value = number;
        while (number != 0){
            int digit = number % 10;
            sum = sum +(digit*digit*digit);
            number = number/10;
        }
        if (sum == value){
            System.out.println("Amstrong Number");
        }
        else {
            System.out.println("Not an Amstrong number");
        }
    }
}
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = scan.nextInt();

        Amstrong a = new Amstrong(num);

    }
}
