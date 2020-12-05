import java.util.Scanner;
class Palindrome{
    long reverse;
    Palindrome(long num){
        long value = num;
        while (num != 0){
            long digit = num % 10;
            reverse = (reverse*10) + digit;
            num = num/10;
        }
        if (reverse == value){
            System.out.println( value +" is PALINDROME number");
        }
        else {
            System.out.println( value + " is NOT palindrome number");
        }
    }
}

public class IntegerPalindromeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number : ");
        long number = s.nextLong();

        Palindrome p = new Palindrome(number);

    }
}

//OUTPUT :
//        "C:\Program Files\Java\jdk-14.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=49470:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\Desktop\Java\codes\out\production\codes IntegerPalindromeOrNot
//        Enter number : 123321
//        123321 is PALINDROME number
//
//        Process finished with exit code 0
