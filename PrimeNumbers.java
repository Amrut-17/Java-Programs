import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter Number to check wether its Prime number or not");
        int number = s.nextInt();
        int half = number / 2;

        if(number == 0 || number == 1){
            System.out.println("Number is not Prime number");
        }
        else{
            for(int i=2; i<=half; i++){
                if (number % i == 0){
                    System.out.println(number + " NOT prime NUMBER");
                    count += 1;
                    break;
                }
            }
        }

        if (count == 0){
            System.out.println(number + " is PRIME number");
        }
    }
}
