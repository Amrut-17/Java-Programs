import java.util.Scanner;
class StringPalindrome{

    StringPalindrome(String strng){
        String temp = "";
        int len = strng.length();
        for (int i=len-1; i>=0; i--){
            temp = temp + strng.charAt(i);
        }
        if(temp.equals(strng)){
            System.out.println( strng + " is Palindrome ");
        }
        else {
            System.out.println(strng + " String is NOT palindrome ");
        }
    }
}
public class StringPalindromeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "";
        System.out.println("Enter String ");
        str = s.nextLine();

        StringPalindrome obj = new StringPalindrome(str);

    }
}

//OUTPUT :
//        "C:\Program Files\Java\jdk-14.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=51099:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\Desktop\Java\codes\out\production\codes StringPalindromeOrNot
//        Enter String
//        abcba
//        abcba is Palindrome
//
//        Process finished with exit code 0
//

//"C:\Program Files\Java\jdk-14.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=51112:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\Desktop\Java\codes\out\production\codes StringPalindromeOrNot
//        Enter String
//        amrut
//        amrut String is NOT palindrome
//
//        Process finished with exit code 0

