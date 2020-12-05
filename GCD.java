import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter first number : ");
        int a = s.nextInt();
        System.out.print("enter second number : ");
        int b = s.nextInt();
        int temp;
        do {
            temp = a % b;
            if (temp == 0) {
                System.out.print("GCD is : " + b);
            } else {
                a = b;
                b = temp;
            }
        }while (temp >0);
    }
}
