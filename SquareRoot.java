import java.util.*;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = s.nextInt();

        double squareRootOfNumber = Math.sqrt(number);
        System.out.println("Square root of " + number + " is : " + squareRootOfNumber);
    }
}
