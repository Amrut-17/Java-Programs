import java.util.Scanner;

class Calculation{
    long factorial(int number){
        if(number == 0){
            return 1;
        }
        else {
            return number*factorial(number-1);
        }
    }
}
public class FactorialOfNumber {
    public static void main(String[] args) {
        Calculation calc = new Calculation();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = scan.nextInt();
        System.out.println(calc.factorial(num));
    }
}

//OUTPUT :
//        "C:\Program Files\Java\jdk-14.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=49455:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\Desktop\Java\codes\out\production\codes FactorialOfNumber
//        Enter Number : 6
//        720
//
//        Process finished with exit code 0
