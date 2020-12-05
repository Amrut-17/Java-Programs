import java.util.Scanner;

class Pallindrome{
    long reverse;
    Pallindrome(long number){
        long value = number;
        while (number != 0){
            long digit = number % 10;
            reverse = (reverse*10) + digit;
            number = number/10;
        }
        if (reverse == value){
            System.out.println("It is an PALLINDROME number");
        }
        else {
            System.out.println("Number is NOT an pallindrome number");
        }
    }
}
public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number : ");
        long num = s.nextInt();

        Pallindrome p = new Pallindrome(num);

    }
}
