import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = "";
        String reverse = "";

        System.out.print("Enter String : ");
        str = s.nextLine();

        int len = str.length();
        for(int i=len-1 ; i>=0 ; i--){
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse String is : " + reverse);

    }
}
//
//OUTPUT :
//        "C:\Program Files\Java\jdk-14.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=51130:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\Desktop\Java\codes\out\production\codes ReverseString
//        Enter String : abc
//        Reverse String is : cba
//
//        Process finished with exit code 0

//"C:\Program Files\Java\jdk-14.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=51135:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\Desktop\Java\codes\out\production\codes ReverseString
//        Enter String : amrut
//        Reverse String is : turma
//
//        Process finished with exit code 0

