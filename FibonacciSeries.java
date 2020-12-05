import java.util.Scanner;
class Fabonacci{
    Fabonacci(int value){
        int n1 = 0;
        int n2 = 1;
        System.out.println("Fabonacci Series : ");
        System.out.print(n1 + " " + n2);
        for (int i=1 ; i<value-1; i++){
            int n3 = n1 + n2;
            System.out.print(" " + n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number up to which fabonacci series you want");
        int number = s.nextInt();
        Fabonacci obj = new Fabonacci(number);
    }
}

//OUTPUT :
//"C:\Program Files\Java\jdk-14.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=49435:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\Desktop\Java\codes\out\production\codes FibonacciSeries
//        Enter number up to which fabonacci series you want
//        8
//        Fabonacci Series :
//        0 1 1  2  3  5  8  13
//        Process finished with exit code 0